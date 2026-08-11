import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotelService service = new HotelService();

        // 1. All hotels presented in the database
        System.out.println("\n------------All Hotels------------");
        List<Hotel> allHotels = service.getHotels();
        allHotels.forEach(System.out::println);

        // 2. Hotels with price <= 3000
        System.out.println("\n\n------------HOTELS BELOW 3000------------");
        List<Hotel> affordableHotels = service.filterHotels(hotel -> hotel.getPricePerNight() <= 3000);
        affordableHotels.forEach(System.out::println);

        // 3. Hotel with five star
        System.out.println("\n\n------------FIVE STAR HOTELS------------");
        List<Hotel> fiveStarHotels = service.filterHotels(
                hotel -> hotel.getHotelType() == HotelType.FIVE_STAR);
        fiveStarHotels.forEach(System.out::println);

        // 4. Hotels with rating more than 4
        System.out.println("\n\n------------HOTELS WITH RATING------------");
        List<Hotel> highlyRatedHotels = service.filterHotels(
                hotel -> hotel.getRating() >= 4);
        highlyRatedHotels.forEach(System.out::println);

        // 5. Hotels with price <= 5000 AND rating >= 4
        System.out.println("\n\n------------AFFORDABLE + HIGH RATING------------");

        List<Hotel> bestValueHotels = service.filterHotels(
                hotel -> hotel.getPricePerNight() <= 5000
                        && hotel.getRating() >= 4);
        bestValueHotels.forEach(System.out::println);

        // 6. Hotels with price > 5000
        System.out.println("\n\n------------EXPENSIVE HOTELS------------");

        List<Hotel> expensiveHotels = service.filterHotels(
                hotel -> hotel.getPricePerNight() > 5000);
        expensiveHotels.forEach(System.out::println);

        // 7. Hotels whose name starts with "S"
        System.out.println("\n\n------------HOTELS STARTING WITH S\n\n------------");

        List<Hotel> sHotels = service.filterHotels(
                hotel -> hotel.getName().startsWith("S"));
        sHotels.forEach(System.out::println);

        // 8. Five-star hotels with rating 5
        System.out.println("\n\n------------5 STAR + RATING 5\n\n------------");

        List<Hotel> luxuryHotels = service.filterHotels(
                hotel -> hotel.getHotelType() == HotelType.FIVE_STAR
                        && hotel.getRating() == 5);
        luxuryHotels.forEach(System.out::println);
    }
}
