package pl.sdacademy.java.basic.day2;

public class Task5 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        char letter = 'z';
        System.out.println(countLetter(input, letter));
    }

    private static int countLetter(String input, char searchedCharacter) {
        int counter = 0;
        if(StringHelper.isValid(input) && input.contains(String.valueOf(searchedCharacter))) {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == searchedCharacter) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
