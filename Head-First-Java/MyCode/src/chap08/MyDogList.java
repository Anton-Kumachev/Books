package chap08;

public class MyDogList {
    private static Dog[] dogs = new Dog[5];
    private static int nextindex = 0;

    public static void main(String[] args) {
        Dog d = new Dog();
        add(d);
        add(d);
        add(d);
        add(d);
        add(d);
    }

    public static void add(Dog d) {
        if (nextindex < dogs.length) {
            dogs[nextindex] = d;
            System.out.println("Dog добавлен в ячейку " + nextindex);
            nextindex++;
        }
    }
}
