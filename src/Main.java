import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalAgency rentalAgency = new RentalAgency();

        Vehicle car = new Car("C110", "Honda Civic", 90);
        Vehicle car1 = new Car("C111", "Toyota Camry", 85);
        Vehicle motorcycle = new Motorcycle("MC40", "BMW", 70);
        Vehicle motorcycle1 = new Motorcycle("MC41", "Honda CBR500R", 70);
        Vehicle truck = new Truck("TR5063", "Toyota", 110);
        Vehicle truck1 = new Truck("TR5064", "Tata 1412 LPT", 110);

        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(motorcycle1);
        rentalAgency.addVehicle(truck);
        rentalAgency.addVehicle(truck1);

        System.out.println("Please enter your name: ");
        String customerName = scanner.nextLine();
        System.out.println("Please enter your ID: ");
        String customerID = scanner.next();
        Customer customer = new Customer(customerID, customerName);

        System.out.println("");
        System.out.println("Hi! " + customerName + " welcome to Paps' Rental Company.");
        System.out.println("Select" + "\n1.For Car rental" + "\n2.For Motorcycle rental" + "\n3.For Truck rental");
        int customerChoiceForVehicles = scanner.nextInt();
        if (customerChoiceForVehicles == 1) {
            System.out.println("Available cars for rent are:" + "\n1." + car + "\n2." + car1 + "\n" + "Please select the car you want to rent");
            int carChoice = scanner.nextInt();
            if (carChoice == 1) {
                System.out.println("How many days are you willing to rent for?");
                int carChoiceDays = scanner.nextInt();
                System.out.println("Your rental Cost will be $" + car.calculateRentalCost(carChoiceDays));
                car.setAvailable(false);
                customer.addVehicleRentalToHistory("C110");
                RentalTransaction rentalTransactionForCar = new RentalTransaction(customer,car,carChoiceDays);
                System.out.println("\n" + "Choose your method of payment"+"\n1.Momo" +"\n2.Visa/Mastercard");
                int paymentMethod = scanner.nextInt();
                if (paymentMethod ==1){
                    System.out.println("Please enter your momo number;");
                    int momoNumber = scanner.nextInt();
                    System.out.println("Please enter amount;");
                    double amount = scanner.nextDouble();
                        while(amount < car.calculateRentalCost(carChoiceDays)){
                            System.out.println("Please enter a valid amount");
                            double amount1 = scanner.nextDouble();
                            break;
                        }
                    System.out.println("Please enter your pin;");
                    int momoPin = scanner.nextInt();
                    System.out.println("Your rental was successful");
                }else {
                    System.out.println("Card Number;");
                    String cardNumber = scanner.next();
                    System.out.println("Expires;");
                    String expires = scanner.next();
                    System.out.println("CVV;");
                    int cvvCode = scanner.nextInt();
                    System.out.println("Your rental was successful");
                    System.out.println(rentalTransactionForCar);
                }
            } else {
                System.out.println("How many days are you willing to rent for?");
                int carChoiceDays = scanner.nextInt();
                System.out.println("Your rental Cost will be $" + car.calculateRentalCost(carChoiceDays));
                car1.setAvailable(false);
                customer.addVehicleRentalToHistory("C111");
                RentalTransaction rentalTransactionForCar1 = new RentalTransaction(customer,car1,carChoiceDays);
                System.out.println("\n" + "Choose your method of payment"+"\n1.Momo" +"\n2.Visa/Mastercard");
                int paymentMethod = scanner.nextInt();
                if (paymentMethod ==1){
                    System.out.println("Please enter your momo number;");
                    int momoNumber = scanner.nextInt();
                    System.out.println("Please enter amount;");
                    double amount = scanner.nextDouble();
                    while(amount < car1.calculateRentalCost(carChoiceDays)){
                        System.out.println("Please enter a valid amount");
                        double amount1 = scanner.nextDouble();
                        break;
                    }
                    System.out.println("Please enter your pin;");
                    int momoPin = scanner.nextInt();
                    System.out.println("Your rental was successful");
                }else {
                    System.out.println("Card Number;");
                    String cardNumber = scanner.next();
                    System.out.println("Expires;");
                    String expires = scanner.next();
                    System.out.println("CVV;");
                    int cvvCode = scanner.nextInt();
                    System.out.println("Your rental was successful");
                    System.out.println(rentalTransactionForCar1);
                }
            }
        } else if (customerChoiceForVehicles == 2) {
            System.out.println("Available Motorcycles for rent are:" + "\n1." + motorcycle + "\n1." + motorcycle1);
            int motorcycleChoice = scanner.nextInt();
            if (motorcycleChoice == 1) {
                System.out.println("How many days are you willing to rent for?");
                int motorcycleChoiceDays = scanner.nextInt();
                System.out.println("Your rental Cost will be $" + car.calculateRentalCost(motorcycleChoiceDays));
                motorcycle.setAvailable(false);
                customer.addVehicleRentalToHistory("MC40");
                RentalTransaction rentalTransactionForMotorcycle = new RentalTransaction(customer,motorcycle,motorcycleChoiceDays);
                System.out.println("\n" + "Choose your method of payment"+"\n1.Momo" +"\n2.Visa/Mastercard");
                int paymentMethod = scanner.nextInt();
                if (paymentMethod ==1){
                    System.out.println("Please enter your momo number;");
                    int momoNumber = scanner.nextInt();
                    System.out.println("Please enter amount;");
                    double amount = scanner.nextDouble();
                    while(amount < motorcycle.calculateRentalCost(motorcycleChoiceDays)){
                        System.out.println("Please enter a valid amount");
                        double amount1 = scanner.nextDouble();
                        break;
                    }
                    System.out.println("Please enter your pin;");
                    int momoPin = scanner.nextInt();
                    System.out.println("Your rental was successful");
                }else {
                    System.out.println("Card Number;");
                    String cardNumber = scanner.next();
                    System.out.println("Expires;");
                    String expires = scanner.next();
                    System.out.println("CVV;");
                    int cvvCode = scanner.nextInt();
                    System.out.println("Your rental was successful");
                    System.out.println(rentalTransactionForMotorcycle);
                }
            } else {
                System.out.println("How many days are you willing to rent for?");
                int motorcycleChoiceDays = scanner.nextInt();
                System.out.println("Your rental Cost will be $" + car.calculateRentalCost(motorcycleChoiceDays));
                motorcycle1.setAvailable(false);
                customer.addVehicleRentalToHistory("MC41");
                RentalTransaction rentalTransactionForMotorcycle1 = new RentalTransaction(customer,motorcycle1,motorcycleChoiceDays);
                System.out.println("\n" + "Choose your method of payment"+"\n1.Momo" +"\n2.Visa/Mastercard");
                int paymentMethod = scanner.nextInt();
                if (paymentMethod ==1){
                    System.out.println("Please enter your momo number;");
                    int momoNumber = scanner.nextInt();
                    System.out.println("Please enter amount;");
                    double amount = scanner.nextDouble();
                    while(amount < motorcycle1.calculateRentalCost(motorcycleChoiceDays)){
                        System.out.println("Please enter a valid amount");
                        double amount1 = scanner.nextDouble();
                        break;
                    }
                    System.out.println("Please enter your pin;");
                    int momoPin = scanner.nextInt();
                    System.out.println("Your rental was successful");
                }else {
                    System.out.println("Card Number;");
                    String cardNumber = scanner.next();
                    System.out.println("Expires;");
                    String expires = scanner.next();
                    System.out.println("CVV;");
                    int cvvCode = scanner.nextInt();
                    System.out.println("Your rental was successful");
                    System.out.println(rentalTransactionForMotorcycle1);
                }
            }
        } else {
            System.out.println("Available Trucks for rent are:" + "\n1." + truck + "\n2." + truck1);
            int truckChoice = scanner.nextInt();
            if (truckChoice == 1) {
                System.out.println("How many days are you willing to rent for?");
                int truckChoiceDays = scanner.nextInt();
                System.out.println("Your rental Cost will be $" + car.calculateRentalCost(truckChoiceDays));
                truck.setAvailable(false);
                customer.addVehicleRentalToHistory("TR5063");
                RentalTransaction rentalTransactionForTruck = new RentalTransaction(customer,truck,truckChoiceDays);
                System.out.println("\n" + "Choose your method of payment"+"\n1.Momo" +"\n2.Visa/Mastercard");
                int paymentMethod = scanner.nextInt();
                if (paymentMethod ==1){
                    System.out.println("Please enter your momo number;");
                    int momoNumber = scanner.nextInt();
                    System.out.println("Please enter amount;");
                    double amount = scanner.nextDouble();
                    while(amount < truck.calculateRentalCost(truckChoiceDays)){
                        System.out.println("Please enter a valid amount");
                        double amount1 = scanner.nextDouble();
                        break;
                    }
                    System.out.println("Please enter your pin;");
                    int momoPin = scanner.nextInt();
                    System.out.println("Your rental was successful");
                }else {
                    System.out.println("Card Number;");
                    String cardNumber = scanner.next();
                    System.out.println("Expires;");
                    String expires = scanner.next();
                    System.out.println("CVV;");
                    int cvvCode = scanner.nextInt();
                    System.out.println("Your rental was successful");
                    System.out.println(rentalTransactionForTruck);
                }
            } else {
                System.out.println("How many days are you willing to rent for?");
                int truckChoiceDays = scanner.nextInt();
                System.out.println("Your rental Cost will be $" + car.calculateRentalCost(truckChoiceDays));
                truck1.setAvailable(false);
                customer.addVehicleRentalToHistory("TR5064");
                RentalTransaction rentalTransactionForTruck1= new RentalTransaction(customer,truck1,truckChoiceDays);
                System.out.println("\n" + "Choose your method of payment"+"\n1.Momo" +"\n2.Visa/Mastercard");
                int paymentMethod = scanner.nextInt();
                if (paymentMethod ==1){
                    System.out.println("Please enter your momo number;");
                    int momoNumber = scanner.nextInt();
                    System.out.println("Please enter amount;");
                    double amount = scanner.nextDouble();
                    while(amount < truck1.calculateRentalCost(truckChoiceDays)){
                        System.out.println("Please enter a valid amount");
                        double amount1 = scanner.nextDouble();
                        break;
                    }
                    System.out.println("Please enter your pin;");
                    int momoPin = scanner.nextInt();
                    System.out.println("Your rental was successful");
                }else {
                    System.out.println("Card Number;");
                    String cardNumber = scanner.next();
                    System.out.println("Expires;");
                    String expires = scanner.next();
                    System.out.println("CVV;");
                    int cvvCode = scanner.nextInt();
                    System.out.println("Your rental was successful");
                    System.out.println(rentalTransactionForTruck1);
                }
            }
        }

    }
}