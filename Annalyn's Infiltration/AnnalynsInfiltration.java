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
    /**
     * Can signal prisoner if the prisoner is awake and the archer is sleeping
     *
     * @param archerIsAwake - negated boolean
     * @param prisonerIsAwake - boolean
     * @return if you can free the prisoner - boolean
     */
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }
    /**
     * Two options for a solution - use of ||(OR) operator
     * First option - Both the knight and archer are sleeping, and the prisoner is sneaky
     * Second option - Archer is asleep and her dog is with her (The knight is scared of the dog)
     *
     * @param knightIsAwake - negated boolean
     * @param archerIsAwake - negated boolean
     * @param prisonerIsAwake - boolean
     * @param petDogIsPresent - boolean
     * @return If Annalyn can free the prisoner - boolean
     */
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
}
