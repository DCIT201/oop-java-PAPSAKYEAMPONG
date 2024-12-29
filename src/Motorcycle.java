public class Motorcycle extends Vehicle {


    private static final double MotorcycleRate = 1.0;

    public Motorcycle(String vehicleId, String model, double baseRentalRate){
        super(vehicleId,model,baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * MotorcycleRate * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
