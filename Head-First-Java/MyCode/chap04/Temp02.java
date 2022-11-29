public class Temp02 {
        static int foo = 7;
        static int bar = 3;

    public static void main(String[] args) {
        Temp02 t = new Temp02();
        t.takeTwo(foo, bar);
    }

    void takeTwo (int x, int y) {
        int z = x + y;
        System.out.println("Total is: " + z);
    }
}
