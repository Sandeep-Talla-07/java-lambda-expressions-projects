import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> hotels = new ArrayList<>();

    public HotelService() {
        hotels.add(new Hotel("Asritha Grand", 40000, 1, HotelType.FIVE_STAR));
        hotels.add(new Hotel("Sandeep Palace", 5000, 5, HotelType.FIVE_STAR));
        hotels.add(new Hotel("Royal Residency", 3500, 4, HotelType.FOUR_STAR));
        hotels.add(new Hotel("Ocean View", 8000, 5, HotelType.FIVE_STAR));
        hotels.add(new Hotel("City Comfort", 2500, 3, HotelType.THREE_STAR));
        hotels.add(new Hotel("Green Valley", 4500, 4, HotelType.FOUR_STAR));
        hotels.add(new Hotel("Luxury Stay", 12000, 5, HotelType.FIVE_STAR));
    }

    public List<Hotel> filterHotels(HotelCondition condition) {
        List<Hotel> ans = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (condition.test(hotel)) {
                ans.add(hotel);
            }
        }
        return ans;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }
}
