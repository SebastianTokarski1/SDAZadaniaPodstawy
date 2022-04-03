package pl.sdacademy.java.basic.day2;

public class Task2 {

    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        boolean result = isWordContainsPrefix(input, prefix);
        System.out.println(result);

        result = isWordContainsPrefix(input, null);
        System.out.println(result);

        result = isWordContainsPrefix("", "");
        System.out.println(result);

        String suffix = "nie";
        result = ifWordContainsSuffix(input, suffix);
        System.out.println(result);
    }

    private static boolean isWordContainsPrefix(String input, String prefix) {
        if(StringHelper.isValid(input) && StringHelper.isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;
        //można jeszcze krócej
        //return StringHelper.isValid(input) && input.startsWith(prefix);
    }

    private static boolean ifWordContainsSuffix(String input, String suffix) {
        return StringHelper.isValid(input) && input.endsWith(suffix);
    }
}
