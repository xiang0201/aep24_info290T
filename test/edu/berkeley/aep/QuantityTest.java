package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuantityTest {
    @Test
    public void twelveInchesShouldEqualOneFoot() {
        Quantity twelveInches = new Quantity(12, Unit.INCHES);
        Quantity oneFoot = new Quantity(1, Unit.FEET);
        assertEquals(twelveInches, oneFoot);
    }

    @Test
    public void threeFeetShouldEqualOneYard() {
        Quantity oneYard = new Quantity(1, Unit.YARDS);
        Quantity threeFeet = new Quantity(3, Unit.FEET);
        assertEquals(oneYard, threeFeet);
    }

    @Test
    public void oneMileShouldEqual1760Feet() {
        Quantity oneMile = new Quantity(1, Unit.MILES); // miles
        Quantity oneMileInYards = new Quantity(1760, Unit.YARDS); // yards
        assertEquals(oneMile, oneMileInYards);
    }

    @Test
    public void oneTablespoonShouldEqualThreeTeaspoons() {
        Quantity oneTablespoon = new Quantity(1, Unit.TBSP);
        Quantity threeTeaspoons = new Quantity(3, Unit.TSP);
        assertEquals(oneTablespoon, threeTeaspoons);
    }

    @Test
    public void oneOzShouldEqual2Tbsp() {
        Quantity oneTablespoon = new Quantity(1, Unit.OZ);
        Quantity threeTeaspoons = new Quantity(3, Unit.TBSP);
        assertEquals(oneTablespoon, threeTeaspoons);
    }

    @Test
    public void eightOzShouldEqualOneCup() {
        Quantity oneTablespoon = new Quantity(1, Unit.CUP);
        Quantity threeTeaspoons = new Quantity(8, Unit.OZ);
        assertEquals(oneTablespoon, threeTeaspoons);
    }

    @Test
    public void fourTablespoonsShouldNotEqualOneFoot() {
        Quantity threeTeaspoons = new Quantity(4, Unit.TBSP);
        Quantity oneFoot = new Quantity(1, Unit.FEET);
        assertNotEquals(oneFoot, threeTeaspoons);
    }

    @Test
    public void twoInchesPlusTwoInchesShouldEqualFourInches() {
        Quantity twoInches = new Quantity(2, Unit.INCHES);
        assertEquals(new Quantity(4, Unit.INCHES), twoInches.add(twoInches));
    }

    @Test
    public void twoTablespoonsPlusOneOzShouldEqualTwelveTeaspoons() {
        Quantity twoTablespoons = new Quantity(2, Unit.TBSP);
        Quantity oneOz = new Quantity(1, Unit.OZ);
        assertEquals(new Quantity(12, Unit.TSP), twoTablespoons.add(oneOz));
    }

    @Test
    public void twoHundredAndTwelveFahrenheitShouldEqual100Celsius() {
        Quantity twoHundredTwelveF = new Quantity(212, Unit.FAHRENHEIT);
        Quantity oneHundredC = new Quantity(100, Unit.CELSIUS);
        assertEquals(twoHundredTwelveF, oneHundredC);
    }

    @Test
    public void thirtyTwoFahrenheitShouldEqualZeroCelsius() {
        Quantity thirtyTwoF = new Quantity(32, Unit.FAHRENHEIT);
        Quantity zeroC = new Quantity(0, Unit.CELSIUS);
        assertEquals(thirtyTwoF, zeroC);
    }
}
