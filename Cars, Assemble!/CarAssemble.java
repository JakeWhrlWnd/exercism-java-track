/**
 * Use code to analyze the production of an assembly line in a car factory.
 */
public class CarAssemble {
    /**
     * A method that considers the current assembly line's speed and calculates the production rate per hour
     * At its lowest speed(1), 221 cars are produced each hour
     *
     * @param speed - int
     * @return a double value that represents the Production Rate Per Hour
     */
    public double productionRatePerHour(int speed) {
        if (speed == 10) {
            //Speed 10 - 77% success rate
            return speed * (221 * 0.77);
        } else if (speed == 9) {
            //Speed 9 - 80% success rate
            return speed * (221 * 0.8);
        } else if (speed >= 5 && speed <= 8) {
            //Speed 5 to 8 - 90% success rate
            return speed * (221 * 0.9);
        } else {
            //Speed 1 to 4 - 100% success rate
            return speed * 221;
        }
    }
}
