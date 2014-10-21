package com.mattsch.emf.examples.tournament.test;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

import com.mattsch.emf.examples.tournament.Group;
import com.mattsch.emf.examples.tournament.Match;
import com.mattsch.emf.examples.tournament.MatchKind;
import com.mattsch.emf.examples.tournament.Team;
import com.mattsch.emf.examples.tournament.Tournament;
import com.mattsch.emf.examples.tournament.TournamentFactory;
import com.mattsch.emf.examples.tournament.TournamentPackage;
import com.mattsch.emf.examples.tournament.util.ResourceHelper;
import com.mattsch.emf.examples.tournament.util.TournamentResourceFactoryImpl;

/**
 * Provides an example of how to create a model instance programmatically using the generated model code.
 * A subset of a tournament is created.
 * Also shows a small example of how to listen for notifications on the model, 
 * how to serialize/deserialize the model and how to access properties in a reflective way.
 * This example will serialize the example model to examples/WorldCup2014.tournament in the project folder.
 * 
 * @author Matthias Schoettle <mschoettle (at) cs.mcgill.ca>
 */
public class TournamentExample {

    public static void main(String[] args) {
        /**
         * Initialize tournament package.
         */
        TournamentPackage.eINSTANCE.eClass();
        
        /**
         * Create tournament.
         */
        Tournament tournament = TournamentFactory.eINSTANCE.createTournament();
        tournament.setName("FIFA World Cup 2014");
        
        /**
         * Get notified when the tournament is changed.
         * This would be in your UI or so.
         * Alternatively, the interface org.eclipse.emf.common.notify.Adapter can be used.
         */
        tournament.eAdapters().add(new AdapterImpl() {
            @Override
            public void notifyChanged(Notification notification) {
                if (notification.getFeature() == TournamentPackage.Literals.TOURNAMENT__MATCHES) {
                    switch (notification.getEventType()) {
                        case Notification.ADD:
                            System.out.println("Match added: " + notification.getNewValue());
                            break;
                        case Notification.REMOVE:
                            System.out.println("Match removed: " + notification.getOldValue());
                            break;
                    }
                }
            }
        });
        
        /**
         * Create an example group.
         */
        Group groupG = TournamentFactory.eINSTANCE.createGroup();
        groupG.setName("Group G");
        
        /**
         * Create some teams.
         */
        Team germany = TournamentFactory.eINSTANCE.createTeam();
        germany.setName("Germany");
        germany.setGroup(groupG);
        
        Team portugal = TournamentFactory.eINSTANCE.createTeam();
        portugal.setName("Portugal");
        portugal.setGroup(groupG);
        
        /**
         * Create an example match.        
         */
        Match match = TournamentFactory.eINSTANCE.createMatch();
        // Not necessary, because it is the default.
        match.setKind(MatchKind.GROUP);
        match.setLocation("Salvador");
        match.setDate((Date) EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDATE, "2014-06-16"));
        
        match.setHomeTeam(germany);
        match.setGuestTeam(portugal);
        
        /**
         * :-)
         */
        match.setResult("4:0");
        
        /**
         * Add everything to the tournament.
         */
        tournament.getGroups().add(groupG);
        tournament.getTeams().add(germany);
        tournament.getTeams().add(portugal);
        tournament.getMatches().add(match);
        
        /**
         * For tournament models the specific resource factory should be used instead, 
         * which will use the TournamentResourceImpl class for resources.
         * This resource uses UUIDs.
         */
        ResourceHelper.INSTANCE.addResourceFactory("tournament", new TournamentResourceFactoryImpl());
        
        /**
         * Save the model.
         */
        ResourceHelper.INSTANCE.saveResource(tournament, "examples/WorldCup2014.tournament");
        
        Resource resource = ResourceHelper.INSTANCE.loadResource("examples/WorldCup2014.tournament");
        
        /**
         * Get the root object.
         */
        Tournament savedTournament = (Tournament) resource.getContents().get(0);
        System.out.println(savedTournament.getName());
        
        /**
         * Use dynamic access to properties.
         */
        @SuppressWarnings("unchecked")
        List<Group> groups = (List<Group>) savedTournament.eGet(TournamentPackage.Literals.TOURNAMENT__GROUPS);
        
        EObject newGroup = TournamentFactory.eINSTANCE.create(TournamentPackage.Literals.GROUP);
        newGroup.eSet(TournamentPackage.Literals.NAMED_ELEMENT__NAME, "Group A");
        groups.add((Group) newGroup);
        System.out.println(groups.get(1).eGet(TournamentPackage.Literals.NAMED_ELEMENT__NAME));
    }

}
