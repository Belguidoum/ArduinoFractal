package controlLamp;


import java.util.HashMap;

import org.objectweb.fractal.adl.Factory;
import org.objectweb.fractal.adl.FactoryFactory;
import org.objectweb.fractal.api.Component;
import org.objectweb.fractal.util.Fractal;

public class ControlLampMain {

	
	
	public static void main(String[] args) throws Exception  {
		 // ----------------------------------------------------------        
        // Load the ADL definition
        // ----------------------------------------------------------        
        Factory factory = 
            FactoryFactory.getFactory(FactoryFactory.FRACTAL_BACKEND);
        Component root = (Component)
            factory.newComponent("controlLamp.controlSystem",new HashMap());

        
        // ----------------------------------------------------------
        // Start the Root component
        // ----------------------------------------------------------
        Fractal.getLifeCycleController(root).startFc();

        // ----------------------------------------------------------
        // Call the entry point of the application
        // ----------------------------------------------------------
        ((java.lang.Runnable)root.getFcInterface("R")).run();

	}

}
