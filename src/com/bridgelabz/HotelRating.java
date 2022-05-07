import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelReservationSystem {
    List<Hotel> hotels = new ArrayList<>();
    String hotel;

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

    public void findCheapestHotel_Weekday_Weekend() {
        String hotel = null;
        int totalLakeWoodCost = 0;
        int totalBridgeWoodCost = 0;
        int totalRidgeWoodCost = 0;

        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            totalLakeWoodCost = (weekday_rate + weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            totalBridgeWoodCost = (weekday_rate + weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            totalRidgeWoodCost = (weekday_rate + weekend_rate);
        }
        if (totalLakeWoodCost <= totalBridgeWoodCost && totalLakeWoodCost < totalRidgeWoodCost) {
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (totalBridgeWoodCost <= totalLakeWoodCost && totalBridgeWoodCost < totalRidgeWoodCost) {
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (totalRidgeWoodCost < totalLakeWoodCost && totalRidgeWoodCost < totalBridgeWoodCost) {
            System.out.println("RidgeWood with total rates $370.");
        }
    }

    public void findCheapestBestRatedHotel() {
        int totalLakeWoodCost = 0, totalBridgeWoodCost = 0, totalRidgeWoodCost= 0;
        int LakeWood_Rate = 3, BridgeWood_Rate = 4, RidgeWood_Rate = 5;
        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            totalLakeWoodCost = (totalLakeWoodCost + weekday_rate + weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            totalBridgeWoodCost = (totalBridgeWoodCost + weekday_rate + weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            totalRidgeWoodCost = (totalRidgeWoodCost + weekday_rate + weekend_rate);
        }
        if ((totalBridgeWoodCost <= totalLakeWoodCost && totalBridgeWoodCost < totalRidgeWoodCost) && (totalLakeWoodCost < totalBridgeWoodCost && totalBridgeWoodCost < totalRidgeWoodCost)) {
            System.out.println("BridgeWood");
            System.out.println("Rating:" + BridgeWood_Rate);
            System.out.println("Total Rates: $" + totalBridgeWoodCost );
        }
    }

    public static void main(String[] args) throws Exception {
        Hotel hotel1 = new Hotel("LakeWood","Regular", 110,90, 3);
        Hotel hotel2 = new Hotel("BridgeWood","Regular", 150, 50, 4);
        Hotel hotel3 = new Hotel("RidgeWood","Regular", 220, 150, 5);
        String sDate1="10-09-2020";
        String sDate2="11-09-2020";
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);
        HotelReservationSystem hotel = new HotelReservationSystem();
        hotel.findCheapestHotel();
        hotel.findCheapestHotel_Weekday_Weekend();
        hotel.findCheapestBestRatedHotel();
    }
}