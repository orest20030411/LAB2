package task2;

public class main {
    public static void main(final String[] args) {

        final LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);



        System.out.println("Stack: ");
        for (final int value: list) {
            System.out.println(value);
        }
    }
}
