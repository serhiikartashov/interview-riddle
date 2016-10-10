package interview;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrafficLightServiceTest {

    private TrafficLightService service;

    @Before
    public void setUp() {
        service = new TrafficLightServiceImpl();
    }

    // red 10 sec
    @Test(timeout = 100)
    public void showRedLightFromTheBeginning() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.RED, light.getState());
    }

    @Test(timeout = 9900)
    public void showRedLightTenSeconds() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.RED, light.getState());
    }

    // red and yellow 3 sec
    @Test(timeout = 10100)
    public void showRedAndYellowLight() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.RED_YELLOW, light.getState());
    }

    @Test(timeout = 12900)
    public void showRedAndYellowLightThreeSeconds() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.RED_YELLOW, light.getState());
    }

    // green 15 sec
    @Test(timeout = 13100)
    public void showGreenLight() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.GREEN, light.getState());
    }

    @Test(timeout = 27100)
    public void showGreenLight15Seconds() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.GREEN, light.getState());
    }

    // yellow 3 sec
    @Test(timeout = 28100)
    public void showYellowLight() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.YELLOW, light.getState());
    }

    @Test(timeout = 30100)
    public void showYellowLightThreeSeconds() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.YELLOW, light.getState());
    }

    // red 10 sec
    @Test(timeout = 31100)
    public void showRedLightAgain() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.RED, light.getState());
    }

    @Test(timeout = 40100)
    public void showRedLightAgainTenSeconds() {
        Light light = service.showLight();
        Assert.assertEquals(Light.COLOR.RED, light.getState());
    }
}
