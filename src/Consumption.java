public class Consumption {
    private double kms;
    private double liters;
    private double vm;
    private double price;

    Consumption(double newKms, double newliters, double newVm, double newPrice) {
        kms = newKms;
        liters = newliters;
        vm = newVm;
        price = newPrice;
    }

    public double getTime() {
        return (kms/vm);
    }
    public double avarageConsumption(){
        return(liters/100);
    }
    public double avaragePrice(){
        return(price*100);
    }
}
