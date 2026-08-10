import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15);

        System.out.println(list);
        System.out.println(list.get(2));

        list.set(2, 50);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(50));
        System.out.println(list.isEmpty());
        System.out.println(list.toString());
    }
}