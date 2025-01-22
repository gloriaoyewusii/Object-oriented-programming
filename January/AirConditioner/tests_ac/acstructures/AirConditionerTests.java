package acstructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTests {

    @Test
    public void testThatAirConditionerIsOn(){
        MyAirConditioner myAirConditioner = new MyAirConditioner();
        assertTrue(myAirConditioner.isOff());

        myAirConditioner.isOn();
        assertTrue(myAirConditioner.isOn());
    }
    @Test
    public void testThatAirConditionerIsOff(){
        MyAirConditioner myAirConditioner = new MyAirConditioner();
        assertTrue(myAirConditioner.isOn());

        myAirConditioner.isOff();
        assertTrue(myAirConditioner.isOff());
    }
    @Test
    public void testThat_myAcIsOn_temperatureIs18_iIncreaseTemperature_temperatureIsNow19(){
        MyAirConditioner myAirConditioner = new MyAirConditioner();
        assertTrue(myAirConditioner.isOn());
        int temperature = 18;
        myAirConditioner.setTemperature(temperature);
        assertEquals(19, myAirConditioner.increaseTemperature());
        assertTrue(myAirConditioner.isIncreased());
    }
    @Test
    public void testThat_myAcIsOn_temperatureIs18_iDecreaseTemperature_temperatureIsNow17(){
        MyAirConditioner myAirConditioner = new MyAirConditioner();
        assertTrue(myAirConditioner.isOn());
        int temperature = 18;
        myAirConditioner.setTemperature(temperature);
        assertEquals(17, myAirConditioner.decreaseTemperature());
        assertTrue(myAirConditioner.isDecreased());
    }
    @Test
    public void testThat_myAcIsOn_temperatureIs20_iIncreaseTemperatureBeyond30_temperatureRemains30(){
        MyAirConditioner myAirConditioner = new MyAirConditioner();
        assertTrue(myAirConditioner.isOn());
        int temperature = 20;
        myAirConditioner.setTemperature(temperature);
        assertEquals(30, myAirConditioner.increaseTemperatureBeyondThirty(40));
        assertTrue(myAirConditioner.isIncreased());
    }
    @Test
    public void testThat_myAcIsOn_temperatureIs20_iDecreaseTemperatureBeyond16_temperatureRemains16(){
        MyAirConditioner myAirConditioner = new MyAirConditioner();
        assertTrue(myAirConditioner.isOn());
        int temperature = 20;
        myAirConditioner.setTemperature(temperature);
        assertEquals(16, myAirConditioner.decreaseTemperatureBelow16(-5));
        assertTrue(myAirConditioner.isDecreased());
    }
}
