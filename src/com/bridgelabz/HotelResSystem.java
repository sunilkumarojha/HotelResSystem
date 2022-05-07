import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    List<Hotel> hotels = new ArrayList<>();

    public boolean addHotel(Hotel hotel) {

        return hotels.add(hotel);
    }
}
