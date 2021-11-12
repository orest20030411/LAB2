package task2;
    import java.util.Iterator;

    public class LinkedList implements Stack, Iterable<Integer> {
        private Node head;

        public LinkedList(final Node head) {
            this.head = head;
        }

        public LinkedList() {
        }

        @Override
        public void add(final int a) {
            final Node node = new Node();
            node.setValue(a);

            node.setNext(head);
            head = node;
        }

        @Override
        public int size() {
            int size = 0;

            if (head == null) {
                return size;
            }

            Node headPointer = head;

            while (headPointer != null) {
                ++size;
                headPointer = headPointer.getNext();
            }

            return size;
        }

        @Override
        public int get() {
            final Node headPointer = head;

            if (head == null) {
                return 0;
            }

            if (headPointer.getNext() != null) {
                head = head.getNext();
            }

            return headPointer.getValue();
        }


        public void display() {
            if (head == null) {
                return;
            }

            Node headPointer = head;

            while (headPointer != null) {
                System.out.println(headPointer.getValue());
                headPointer = headPointer.getNext();
            }

        }

        @Override
        public Iterator<Integer> iterator() {
            return new CustomIterator();
        }

        private class CustomIterator implements Iterator<Integer> {
            Node next = head;

            @Override
            public boolean hasNext() {
                return next != null;
            }

            @Override
            public Integer next() {
                final int value = next.getValue();
                next = next.getNext();
                return value;
            }
        }
    }

