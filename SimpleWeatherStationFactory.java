class SimpleWeatherStationFactory implements WeatherStationFactory {
    @Override
    public WeatherStation createWeatherStation() {
        return new WeatherStation();
    }
}