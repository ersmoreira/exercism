public class CarsAssemble {

    public static int miniumSpeed = 0;
    public static int maximumSpeed = 10;
    public static int carsPerHours = 221;

    public double productionRatePerHour(int speed) {
        int totalProduced = speed * carsPerHours;
        double taxa = 1;

        if (speed >= 5 && speed <= 8 ){
            taxa = 0.9;
        } else if (speed == 9){
            taxa =  0.8;
        } else if (speed == 10){
            taxa = 0.77;
        }

        return totalProduced * taxa;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
