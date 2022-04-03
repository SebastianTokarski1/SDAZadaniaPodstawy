package pl.sdacademy.java.basic.day2;

public class DummyStringBuilder {

    public static void main(String[] args) {
        String str = "ala";
        str = str.concat("kot"); // tworzymy nowy obiekt
        System.out.println(str);

        StringBuilder sb = new StringBuilder("ala");
        sb.append("kota"); // nie tworzymy nowego obiektu
        System.out.println(sb);
    }
}
