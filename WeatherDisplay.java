class WeatherDisplay implements Observer {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(String weather) {
        System.out.println("Weather Display " + name + " updated with weather: " + weather);
    }
}
