package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor shortYoungVisitor;
    Visitor tallOldVisitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        shortYoungVisitor = new Visitor(12, 199.99, 10.00);
        tallOldVisitor = new Visitor(13, 200.01, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void priceIsDefaultForOneNineNinePointNineNine(){
        assertEquals(8.50, this.rollerCoaster.priceFor(shortYoungVisitor), 0.01);
    }

    @Test
    public void priceIsDoubleForTwoZeroZeroPointZeroOne(){
        assertEquals(17.00, this.rollerCoaster.priceFor(tallOldVisitor), 0.01);
    }

    @Test
    public void cantRideIfShort(){
        Visitor tooShortVisitor = new Visitor(13,144.99, 10.00);
        assertEquals(false, this.rollerCoaster.isAllowedTo(tooShortVisitor));
    }

    @Test
    public void cantRideIfYoung(){
        Visitor tooYoungVisitor = new Visitor(12,200.00, 10.00);
        assertEquals(false, this.rollerCoaster.isAllowedTo(tooYoungVisitor));
    }

    @Test
    public void canRideIfTallAndOld(){
        assertEquals(true, this.rollerCoaster.isAllowedTo(tallOldVisitor));
    }
}
