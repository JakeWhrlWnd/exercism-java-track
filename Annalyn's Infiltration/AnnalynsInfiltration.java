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

    /**
     * Can spy if 1 of the characters is awake
     *
     * @param knightIsAwake - boolean
     * @param archerIsAwake - boolean
     * @param prisonerIsAwake - boolean
     * @return if you can spy - boolean
     */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
}
