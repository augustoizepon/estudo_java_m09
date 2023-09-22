// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    casting();

    }

    public static void casting(){
        int num = 25;
        short s = (short) num;
        byte b = (byte) s;
        double d = b;
        long l = (long) d;
        System.out.println(l);
    }

}