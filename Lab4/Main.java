import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class MyList {
    private int value;
    private final int SIZE = 15;
    public List<Integer> list = new ArrayList<>();

    public MyList(int value) {
        this.value = value;
    }

    public void createList() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            list.add(random.nextInt(40));
        }
    }

    public void findValue() {
        int min, count = 0;
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            tempList.add(Math.abs(list.get(i) - value));
        }

        System.out.println("tempList");
        System.out.println(tempList);
        min = Collections.min(tempList);
        System.out.println("min = " + min);
        System.out.println("result = " + list.get(tempList.indexOf(min)));
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            if (min == tempList.get(i)) {
                count++;
                indexList.add(i);
            }
        }
        if (count > 1) {
            System.out.println("Таких значень більше одного");
            System.out.println(indexList);
        }

    }

    public void printList() {
        System.out.println("My list :");
        System.out.println(list);
    }
}

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(23);
        myList.createList();
        myList.printList();
        myList.findValue();
    }
}
