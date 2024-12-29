import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle>  fleet;
    private  List<RentalTransaction> transactions;

    public RentalAgency(){
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        fleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String model){
        for (Vehicle vehicle : fleet){
            if (vehicle.getModel().equals(model) && vehicle.isAvailable()){
                return vehicle;
            }
        }
        return null;
    }

    public void rentVehicle(Customer customer,  String model, int days){
        Vehicle vehicle = findAvailableVehicle(model);
        if (vehicle != null && customer.isEligibleForRental()){
          vehicle.setAvailable(false);
          RentalTransaction transaction = new RentalTransaction(customer ,vehicle ,days);
          transactions.add(transaction);
          customer.addVehicleRentalToHistory(vehicle.getVehicleId());
        }
        else {
            System.out.println("Car not available");
        }
    }
}
