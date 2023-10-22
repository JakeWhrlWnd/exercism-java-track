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
        return this.birdsPerDay;
    }

    /**
     * Method to check the count for today
     * Using a ternary operator to condense the use of an if-else statement
     * @return today's count
     */
    public int getToday() {
        return size == 0 ? 0 : birdsPerDay[size - 1];
    }
}
