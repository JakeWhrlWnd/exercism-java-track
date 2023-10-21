/**
 * Implementation of the quest logic for a RPG game
 *
 */
public class AnnalynsInfiltration {
    /**
     * Fast attack is only available when the knight is sleeping
     *
     * @param knightIsAwake - negated boolean
     * @return If you can execute a fast attack - boolean
     */
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

}
