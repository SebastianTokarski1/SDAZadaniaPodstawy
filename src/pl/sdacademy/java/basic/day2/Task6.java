package pl.sdacademy.java.basic.day2;

public class Task6 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        char letter = 'a';
        System.out.println(getIndex(input, letter));

        letter = 'z';
        System.out.println(getIndex(input, letter));
    }

    private static int getIndex(String input, char searchedCharacter) {
        if(StringHelper.isValid(input)) {
            return input.indexOf(searchedCharacter);
        }
//        if(StringHelper.isValid(input) && input.contains(String.valueOf(searchedCharacter))) {
//            for(int i = 0; i < input.length(); i++) {
//                if(input.charAt(i) == searchedCharacter){
//                    return i;
//                }
//            }
//        }
        return -1;
    }
}
