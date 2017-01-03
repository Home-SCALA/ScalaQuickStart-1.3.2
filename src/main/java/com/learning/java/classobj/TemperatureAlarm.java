package com.learning.java.classobj;

/* Это Java-класс который будет выглядеть одной строкой в Scala-классе */


public class TemperatureAlarm {

	private final double temp;

	public TemperatureAlarm(double temp) {
		this.temp = temp;
	}

	public double getTemp() {
		return temp;
	}

	@Override
	public String toString() {
		return "TemperatureAlarm [temp=" + temp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.temp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemperatureAlarm other = (TemperatureAlarm) obj;
		if (Double.doubleToLongBits(temp) != Double.doubleToLongBits(other.temp))
			return false;
		return true;
	}
}
