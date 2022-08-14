package JdbcSqlConnector;

public class Garage {
    private String transport;
    private int passengers;
    private double price;
    private String color;

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Garage{" +
               "transport ='" + transport + '\'' +
                ", passengers='" + passengers +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
