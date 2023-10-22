/**
 * Create a class to keep track of how many birds have visited your garden in the last seven days
 * Using Arrays, for-each loops, and for loops
 * There are six tasks in this module
 */
public class BirdWatcher {
    private final int[] birdsPerDay; //Declaration of Array
    //Constructor for the BirdWatcher Class
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    /**
     * Check what the counts were last week
     * @return last weeks count as an Array
     */
    public int[] getLastWeek() {
        return this.birdsPerDay;
    }
}
