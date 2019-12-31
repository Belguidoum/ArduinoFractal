package impl;

import interfaces.LampControl;
import interfaces.LuminSensor;

import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.objectweb.fractal.api.control.IllegalLifeCycleException;

public class ControlSys implements Runnable, BindingController {

	private LuminSensor luminSensor;
	private LampControl lampControl;

	public void run() {
		while (true) {
			luminSensor.getLuminValue();

		}

	}

	public void bindFc(String arg0, Object arg1)
			throws NoSuchInterfaceException, IllegalBindingException,
			IllegalLifeCycleException {
		if (arg0.equals("S")) {
			luminSensor = (LuminSensor) arg1;
		} else if (arg0.equals("L")) {
			lampControl = (LampControl) arg1;
		}

	}

	public String[] listFc() {
		return new String[] { "S", "L" };
	}

	public Object lookupFc(String arg0) throws NoSuchInterfaceException {
		if (arg0.equals("S")) {
			return luminSensor;
		} else if (arg0.equals("L")) {
			return lampControl;
		}
		return null;
	}

	public void unbindFc(String arg0) throws NoSuchInterfaceException,
			IllegalBindingException, IllegalLifeCycleException {
		if (arg0.equals("S")) {
			luminSensor = null;
		} else if (arg0.equals("L")) {
			lampControl = null;
		}

	}

}
