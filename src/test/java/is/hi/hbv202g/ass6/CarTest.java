package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public static final String BEETLE = "Beetle";
    private Car beetle;

    @Before
    public void setUp() throws Exception {
        beetle = new Car(BEETLE);
    }

    @Test
    public void getNameOfCar() {
        Car car = beetle;
        assertEquals("Beetle", car.getName());
    }

}
