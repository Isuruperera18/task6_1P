package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "S223182277";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Isuru Perera";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
    @Test
    public void testFalseNumberIsEven() {
        // Test with odd numbers to ensure they return false
        Assert.assertFalse(WeatherAndMathUtils.isEven(1)); // 1 is odd
        Assert.assertFalse(WeatherAndMathUtils.isEven(3)); // 3 is odd
        Assert.assertFalse(WeatherAndMathUtils.isEven(5)); // 5 is odd
    }
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testWeatherAdviceAllClear() {
        // Test normal conditions with wind speed and precipitation below the concerning threshold
        String advice = WeatherAndMathUtils.weatherAdvice(40, 3);
        Assert.assertEquals("ALL CLEAR", advice);
    }

    @Test
    public void testWeatherAdviceWarning() {
        // Test conditions with wind speed or precipitation just above the concerning threshold
        String advice1 = WeatherAndMathUtils.weatherAdvice(50, 3); // Wind speed above 45
        String advice2 = WeatherAndMathUtils.weatherAdvice(40, 5); // Precipitation above 4
        Assert.assertEquals("WARN", advice1);
        Assert.assertEquals("WARN", advice2);
    }

    @Test
    public void testWeatherAdviceCancel() {
        // Test conditions where it should cancel due to dangerous weather
        String advice1 = WeatherAndMathUtils.weatherAdvice(71, 3); // Dangerous wind speed
        String advice2 = WeatherAndMathUtils.weatherAdvice(40, 7); // Dangerous rainfall
        String advice3 = WeatherAndMathUtils.weatherAdvice(46, 5); // Both concerning
        Assert.assertEquals("CANCEL", advice1);
        Assert.assertEquals("CANCEL", advice2);
        Assert.assertEquals("CANCEL", advice3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeatherAdviceInvalidInputs() {
        // Test invalid negative wind speed
        WeatherAndMathUtils.weatherAdvice(-1, 3);
    }

    @Test
    public void testIsEven() {
        // Test even and odd numbers
        Assert.assertTrue(WeatherAndMathUtils.isEven(2));
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testIsPrime() {
        // Test for prime numbers
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2)); // Prime number
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4)); // Not prime
    }
}
