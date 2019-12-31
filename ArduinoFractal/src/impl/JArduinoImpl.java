package impl;

import bc.chouaib.arduino.JArduino;
import interfaces.JArduinoControle;

public class JArduinoImpl implements JArduinoControle {

	private JArduino arduino;

	public JArduinoImpl() {
		arduino = new JArduino("COM4");
	}

	public int analogRead(int pin) {
		return arduino.analogRead(pin);
	}

	public void analogWrite(int pin, int value) {
		arduino.analogWrite(pin, value);

	}

	public int digitalRead(int pin) {
		return arduino.digitalRead(pin);
	}

	public void digitalWrite(int pin, int value) {
		arduino.digitalWrite(pin, value);

	}

	public void pinMode(int pin, int mode) {
		arduino.pinMode(pin, mode);

	}

}
