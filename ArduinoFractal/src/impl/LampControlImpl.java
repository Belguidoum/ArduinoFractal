package impl;

import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.objectweb.fractal.api.control.IllegalLifeCycleException;

import bc.chouaib.arduino.JArduino;

import interfaces.JArduinoControle;
import interfaces.LampControl;

public class LampControlImpl implements LampControl, BindingController {

	private final int lapmPin = 13;
	private JArduinoControle arduinoControle;

	public LampControlImpl() {
		System.out.println("init Lamp pin");
	}

	public void lampOFF() {
		arduinoControle.digitalWrite(lapmPin, JArduino.LOW);
		System.out.println("Lamp OFF");
	}

	public void lampON() {
		arduinoControle.digitalWrite(lapmPin, JArduino.HIGH);
		System.out.println("Lamp ON");
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
