
public class Hotel {
    private String name;
    private int rating;
    private int pricePerNight;
    private HotelType hotelType;

    public Hotel(String name, int rating, int pricePerNight, HotelType hotelType) {
        this.name = name;
        this.rating = rating;
        this.pricePerNight = pricePerNight;
        this.hotelType = hotelType;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", rating=" + rating +
                ", hotelType=" + hotelType +
                '}';
    }
}
