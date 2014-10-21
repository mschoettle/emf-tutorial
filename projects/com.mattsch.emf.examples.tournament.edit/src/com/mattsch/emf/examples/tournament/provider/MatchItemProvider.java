/**
 */
package com.mattsch.emf.examples.tournament.provider;


import com.mattsch.emf.examples.tournament.Group;
import com.mattsch.emf.examples.tournament.Match;
import com.mattsch.emf.examples.tournament.Team;
import com.mattsch.emf.examples.tournament.TournamentPackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.mattsch.emf.examples.tournament.Match} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchItemProvider 
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addGroupPropertyDescriptor(object);
            addHomeTeamPropertyDescriptor(object);
            addGuestTeamPropertyDescriptor(object);
            addDatePropertyDescriptor(object);
            addLocationPropertyDescriptor(object);
            addKindPropertyDescriptor(object);
            addResultPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroupPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Match_group_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Match_group_feature", "_UI_Match_type"),
                 TournamentPackage.Literals.MATCH__GROUP,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Home Team feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    protected void addHomeTeamPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Match_homeTeam_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Match_homeTeam_feature", "_UI_Match_type"),
                 TournamentPackage.Literals.MATCH__HOME_TEAM,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null) {
                
                @Override
                public Collection<?> getChoiceOfValues(Object object) {
                    Match match = (Match) object;
                    
                    if (match.getGroup() != null) {
                        return getGroupTeams(match.getGroup(), match.getGuestTeam());
                    }
                    
                    return super.getChoiceOfValues(object);
                }
                
            });
    }

    /**
     * This adds a property descriptor for the Guest Team feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    protected void addGuestTeamPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Match_guestTeam_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Match_guestTeam_feature", "_UI_Match_type"),
                 TournamentPackage.Literals.MATCH__GUEST_TEAM,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null) {
                
                @Override
                public Collection<?> getChoiceOfValues(Object object) {
                    Match match = (Match) object;
                    
                    if (match.getGroup() != null) {
                        return getGroupTeams(match.getGroup(), match.getHomeTeam());
                    }
                    
                    return super.getChoiceOfValues(object);
                }
                
            });
    }
    
    /**
     * Returns a list of teams belonging to a group, but without the opposite team, if it exists.
     * The list also contains null.
     * 
     * @param group the group
     * @param oppositeTeam the opposite team, null if not set
     * @return a list of teams
     */
    private List<Team> getGroupTeams(Group group, Team oppositeTeam) {
        List<Team> result = new ArrayList<Team>();
        
        // Add all teams of the group, but remove the opposite team (if set).
        result.addAll(group.getTeams());
        result.remove(oppositeTeam);
        // The editor also provides a null value to unset the property.
        result.add(null);
        
        return result;
    }

    /**
     * This adds a property descriptor for the Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Match_date_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Match_date_feature", "_UI_Match_type"),
                 TournamentPackage.Literals.MATCH__DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Location feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Match_location_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Match_location_feature", "_UI_Match_type"),
                 TournamentPackage.Literals.MATCH__LOCATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKindPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Match_kind_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Match_kind_feature", "_UI_Match_type"),
                 TournamentPackage.Literals.MATCH__KIND,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Result feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResultPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Match_result_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Match_result_feature", "_UI_Match_type"),
                 TournamentPackage.Literals.MATCH__RESULT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns Match.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Match"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        Date labelValue = ((Match)object).getDate();
        String label = labelValue == null ? null : new SimpleDateFormat("dd.MM.yyyy").format(labelValue);
        return label == null || label.length() == 0 ?
            getString("_UI_Match_type") :
            getString("_UI_Match_type") + " " + label;
    }
    

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Match.class)) {
            case TournamentPackage.MATCH__DATE:
            case TournamentPackage.MATCH__LOCATION:
            case TournamentPackage.MATCH__KIND:
            case TournamentPackage.MATCH__RESULT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return TournamentEditPlugin.INSTANCE;
    }

}
