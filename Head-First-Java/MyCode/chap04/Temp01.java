public class Temp01 {

    public static void main(String[] args) {
        Temp01 t = new Temp01();
        t.takeTwo(12, 34);
    }

    void takeTwo (int x, int y) {
        int z = x + y;
        System.out.println("Сумма равна " + z);
    }
}
