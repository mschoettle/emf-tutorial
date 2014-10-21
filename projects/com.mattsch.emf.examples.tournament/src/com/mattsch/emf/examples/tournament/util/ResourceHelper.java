package com.mattsch.emf.examples.tournament.util;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ResourceHelper {
    
    public final static ResourceHelper INSTANCE = new ResourceHelper();
    
    private ResourceSet resourceSet;
    
    private ResourceHelper() {
        initializeResourceSet();
    }
    
    private void initializeResourceSet() {
        resourceSet = new ResourceSetImpl();
        
        /**
         * Register XMI factory implementation for any extension.
         * Requires bundle org.eclipse.emf.ecore.xmi.
         */
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
    }
    
    public Resource loadResource(String file) {
        Resource resource = resourceSet.getResource(URI.createFileURI(file), true);
        
        return resource;
    }
    
    public void saveResource(EObject model, String file) {
        Resource resource = resourceSet.createResource(URI.createFileURI(file));
        resource.getContents().add(model);
        
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            System.err.println("Error saving model: " + e.getLocalizedMessage());
        }
    }

}
