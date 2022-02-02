public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf("]") + 2).trim();
    }

    public static String logLevel(String logLine) {
        int indiceInicio = logLine.indexOf("[");
        int indiceFim = logLine.indexOf("]");
        return logLine.substring(indiceInicio + 1, indiceFim).toLowerCase();
    }

    public static String reformat(String logLine) {
        String logLevel = logLevel(logLine);
        String message = message(logLine);
        return String.format("%s (%s)", message, logLevel);
    }
}
