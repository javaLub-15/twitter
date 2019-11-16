package pl.sda.persistance.util;

public class EnvironmentVariableUtil {

    public static String getVariable(String key) {
        return System.getenv(key.replace('.', '_'));
    }
}
