public class  Truck extends Vehicle{

    private static final double TruckRate = 2.0;

    public Truck(String vehicleId, String model, double baseRentalRate){
        super(vehicleId,model,baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * TruckRate * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
