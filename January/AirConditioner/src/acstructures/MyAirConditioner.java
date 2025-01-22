package acstructures;

public class MyAirConditioner {
    private boolean isOn = false;
    private boolean isOff = false;
    private int temperature;
    private boolean isIncreased = false;
    private boolean isDecreased = false;
    private final int MAX_TEMPERATURE = 30;
    private final int MIN_TEMPERATURE = 16;


    public MyAirConditioner() {
    }

    public boolean isOff() {
        this.isOff = true;
        return isOff;
    }
    public boolean isOn() {
        this.isOn = true;
        return isOn;
    }

    public boolean isIncreased() {
        this.isIncreased = true;
        return isIncreased;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int increaseTemperature() {
        this.isOn = true;
        if (this.temperature >= 16 && this.temperature <= 30) {
            temperature += 1;
            isIncreased = true;
        }
        return this.temperature;
    }
    public boolean isDecreased() {
        this.isDecreased = true;
        return isDecreased;
    }
    public int decreaseTemperature() {
        if (this.temperature >= 16 && this.temperature <= 30) {
            temperature -= 1;
            isDecreased = true;
        }
        return this.temperature;
    }

    public int increaseTemperatureBeyondThirty(int maxTemperature) {
        if (this.temperature >= 16 && this.temperature <= 30) {
            temperature += 1;
            if (maxTemperature > MAX_TEMPERATURE) {
                temperature = MAX_TEMPERATURE;
                isIncreased = true;
            }
        }
        return temperature;
    }

    public int decreaseTemperatureBelow16(int minTemperature) {
        if (this.temperature >= 16 && this.temperature <= 30) {
            temperature -= 1;
            if (minTemperature < MIN_TEMPERATURE) {
                temperature = MIN_TEMPERATURE;
                isDecreased = true;
            }

        }
        return temperature;
    }
}
