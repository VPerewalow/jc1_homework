package lesson16;

import java.io.Serializable;
import java.util.Objects;

public class CoffeeBean implements Serializable {

    private String sort;

    private int weight;

    private String color;

    private  String origin;

    private double humidity;

    private boolean isFried;

    public CoffeeBean() {
    }

    public String getSoft() {
        return sort;
    }

    public void setSort(String soft) {
        this.sort = soft;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public boolean isFried() {
        return isFried;
    }

    public void setFried(boolean fried) {
        isFried = fried;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoffeeBean that = (CoffeeBean) o;

        if (weight != that.weight) return false;
        if (Double.compare(that.humidity, humidity) != 0) return false;
        if (isFried != that.isFried) return false;
        if (!Objects.equals(sort, that.sort)) return false;
        if (!Objects.equals(color, that.color)) return false;
        return Objects.equals(origin, that.origin);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = sort != null ? sort.hashCode() : 0;
        result = 31 * result + weight;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        temp = Double.doubleToLongBits(humidity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isFried ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CoffeeBean{" +
                "soft='" + sort + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", origin='" + origin + '\'' +
                ", humidity=" + humidity +
                ", isFried=" + isFried +
                '}';
    }
}
