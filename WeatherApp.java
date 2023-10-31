import java.util.ArrayList;
import java.util.List;
public class WeatherApp {
    public static void main(String[] args) {
        // Create a Weather Station using the Factory Pattern
        WeatherStationFactory factory = new SimpleWeatherStationFactory();
        WeatherStation weatherStation = factory.createWeatherStation();

        // Create Weather Display Observers
        WeatherDisplay display1 = new WeatherDisplay("Display 1");
        WeatherDisplay display2 = new WeatherDisplay("Display 2");

        // Register Observers with the Weather Station
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        // Simulate weather changes
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");

        // Unregister an Observer
        weatherStation.removeObserver(display1);

        // Simulate weather change again
        weatherStation.setWeather("Cloudy");
    }
}
