/**
 */
package com.mattsch.emf.examples.tournament.provider;


import com.mattsch.emf.examples.tournament.Team;
import com.mattsch.emf.examples.tournament.TournamentPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.mattsch.emf.examples.tournament.Team} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TeamItemProvider extends NamedElementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TeamItemProvider(AdapterFactory adapterFactory) {
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
                 getString("_UI_Team_group_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Team_group_feature", "_UI_Team_type"),
                 TournamentPackage.Literals.TEAM__GROUP,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns Team.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Team"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Team)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Team_type") :
            getString("_UI_Team_type") + " " + label;
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

}
