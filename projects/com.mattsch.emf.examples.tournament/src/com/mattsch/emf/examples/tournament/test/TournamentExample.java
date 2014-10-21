package com.mattsch.emf.examples.tournament.test;

import java.util.Date;
import java.util.List;

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
