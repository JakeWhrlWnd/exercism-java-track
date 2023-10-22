public class LogLevels {
    /**
     * Method to get message from a log line
     * Split the String into an Array at the "]: "
     * Trim the leading and trailing whitespce
     *
     * @param logLine - String
     * @return trimmed second element [1] of the String Array
     */
    public static String message(String logLine) {
        return logLine.split("]: ")[1].trim();
    }

    /**
     * Method to get log level from log line
     * Split the String into an Array at the "]: "
     *
     * @param logLine - String
     * @return lowercase version of the log level starting at index 1 of the string
     */
    public static String logLevel(String logLine) {
        return logLine.split("]: ")[0].substring(1).toLowerCase();
    }

    /**
     * Method to reformat a log line
     * Concatenate the message() and logLevel() methods
     *
     * @param logLine - String
     * @return concatenated String that include () around the log level
     */
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
