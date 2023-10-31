import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private String weather;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }
}