package chap06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Egg> myList = new ArrayList<Egg>();
        Egg s = new Egg();
        myList.add(s);

        Egg b = new Egg();
        myList.add(b);

        int theSize = myList.size();
        System.out.println(theSize);

        boolean isIn = myList.contains(s);
        System.out.println(isIn);

        int idx = myList.indexOf(b);
        System.out.println(idx);

        boolean empty = myList.isEmpty();
        System.out.println(empty);

        myList.remove(s);
        System.out.println(myList.toString());
    }
}

class Egg {

}
