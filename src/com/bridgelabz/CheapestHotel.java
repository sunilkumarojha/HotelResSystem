import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    List<Hotel> hotels = new ArrayList<>();

    public boolean addHotel(Hotel hotel) {

        return hotels.add(hotel);
    }

    public int findCheapestHotel(){
        int lakeWoodRate = 110; int bridgeWoodRate = 160; int ridgewoodRate = 220;
        int cheapestHotel = (lakeWoodRate<bridgeWoodRate) ?
                (lakeWoodRate<ridgewoodRate ? lakeWoodRate : ridgewoodRate) :
                (bridgeWoodRate<ridgewoodRate ? bridgeWoodRate : ridgewoodRate) ;
        System.out.println("The cheapest Hotel is " +cheapestHotel);
        return cheapestHotel;
    }
}