public class Lasagna {
    /**
     * Method to define the expected oven time in minutes
     *
     * @return int value of 40
     */
    public int expectedMinutesInOven() {
        return 40;
    }

    /**
     * Method to calculate the remaining oven time in minutes
     * Subtract the given minutes from the expectedMinutesInOven() - 40
     *
     * @param minutes int
     * @return result of the equation (40 - minutes)
     */
    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }

    /**
     * Method to calculate the preparation time in minutes
     * Each layer takes 2 minutes to prepare
     * Multiply the given layers by 2
     *
     * @param layers int
     * @return result of the equation (layers * 2)
     */
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    /**
     * Method to calculate the total working time in minutes
     * Total Time refers to prep time + current cooking time
     * Add preparationTimeInMinutes to minutes
     *
     * @param layers int
     * @param minutes int
     * @return result of the equation
     */
    public int totalTimeInMinutes(int layers, int minutes) {
        return minutes + preparationTimeInMinutes(layers);
    }
}
