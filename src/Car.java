public class Car extends Vehicle{

    private static final double carRate = 2.0;

    public Car(String vehicleId, String model, double baseRentalRate){
        super(vehicleId,model,baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * carRate * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

}
