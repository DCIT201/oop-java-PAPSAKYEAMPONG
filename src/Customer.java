import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<String> rentHistory;

    public Customer(String customerId, String name){
        this.customerId = customerId;
        this.name = name;
        this.rentHistory = new ArrayList<>();
    }

    public void addVehicleRentalToHistory(String vehicleId){
        rentHistory.add(vehicleId);
    }

    public boolean isEligibleForRental(){
        return rentHistory.size() < 5;
    }

    public String toString(){
        return  "CustomerID:" + customerId +"\n" + "Name:" + name;
    }

}
