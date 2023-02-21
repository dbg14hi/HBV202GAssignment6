package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarOwnerTest {

    public static final String BEETLE = "Beetle";
    private Car beetle;

    @Before
    public void setUp() throws Exception {
        beetle = new Car(BEETLE);
    }

    @Test
    public void getName() {
        Car car = beetle;
        CarOwner carOwner = new CarOwner("John Doe", car);
        assertEquals("John Doe", carOwner.getName());
    }

}
