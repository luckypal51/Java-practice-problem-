package PracticeDsa;

public class Stringbuilder1 {
    public static void main(String[] args) {
        String name = "Lucky";
        String surname =" Pal";
        StringBuilder str = new StringBuilder(name);
        str.append(surname);
        str.delete(5, 9);
        System.out.println(str);
    }
}
