package impl;

import interfaces.JArduinoControle;
import interfaces.LuminSensor;

import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.objectweb.fractal.api.control.IllegalLifeCycleException;

public class LuminSensorImpl implements LuminSensor, BindingController {

	private final int sensorPin = 0;
	private JArduinoControle arduinoControle;

	public int getLuminValue() {
		int luminValue = arduinoControle.analogRead(sensorPin);
		System.out.println("Read lumin sensor : " + luminValue);
		return luminValue;

	}

	public void bindFc(String arg0, Object arg1)
			throws NoSuchInterfaceException, IllegalBindingException,
			IllegalLifeCycleException {
		if (arg0.equals("A")) {
			arduinoControle = (JArduinoControle) arg1;
		}

	}

	public String[] listFc() {
		return new String[] { "A" };
	}

	public Object lookupFc(String arg0) throws NoSuchInterfaceException {
		if (arg0.equals("A")) {
			return arduinoControle;
		}
		return null;
	}

	public void unbindFc(String arg0) throws NoSuchInterfaceException,
			IllegalBindingException, IllegalLifeCycleException {
		if (arg0.equals("A")) {
			arduinoControle = null;
		}

	}

}
