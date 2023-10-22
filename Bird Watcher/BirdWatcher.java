/**
 * Create a class to keep track of how many birds have visited your garden in the last seven days
 * Using Arrays, for-each loops, and for loops
 * There are six tasks in this module
 */
public class BirdWatcher {
    private final int[] birdsPerDay; //Declaration of Array
    private int size;
    //Constructor for the BirdWatcher Class
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.size = this.birdsPerDay.length;
    }

    /**
     * Method to check the counts for last week
     * @return last week's count
     */
    public int[] getLastWeek() {
        return birdsPerDay;
    }

    /**
     * Method to check the count for today
     * Using a ternary operator to condense the use of an if-else statement
     * @return today's count
     */
    public int getToday() {
        return size == 0 ? 0 : birdsPerDay[size - 1];
    }

    /**
     * Method to increment today's count
     *
     */
    public void incrementTodaysCount() {
        ++birdsPerDay[size - 1];
    }

    /**
     * Method to check for days with 0 bird visits
     * @return true if the bird count is zero, false if the bird count is !0
     */
    public boolean hasDayWithoutBirds() {
        for (int zeroDay : birdsPerDay) {
            return zeroDay == 0;
        }
        return false;
    }

    /**
     * Method to calculate the number of visiting birds for the first number of days
     * @param numberOfDays - int
     * @return total number of visiting birds
     */
    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;

        if (numberOfDays > size) {
            numberOfDays = size;
        }
        for (int i = 0; i < numberOfDays; i++) {
            total += birdsPerDay[i];
        }

        return total;
    }

    /**
     * Method to calculate days that had 5 or more bird visitors
     * @return number of days with 5 or more sightings
     */
    public int getBusyDays() {
        int count = 0;

        for (int busyDays : birdsPerDay) {
            if (busyDays >= 5) {
                count++;
            }
        }
        return count;
    }
}
