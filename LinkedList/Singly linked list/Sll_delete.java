class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Main {
    Node head;

    public void insertAtBeg(int x) {
        Node n = new Node(x);
        n.next = head;
        head = n;
    }

    public void insertAtEnd(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public int count() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public void deleteAtBeg() {
        if (head == null)
            return;
        else {
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (head == null)
            return;
        else {
            Node temp = head;
            if (temp.next == null) {
                head = null;
            } else {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public void deleteAtPos(int pos) {
        if (head == null)
            return;
        else {
            if (head.next == null) {
                if (pos != 1) {
                    System.out.println("Invalid position");
                }
                else head = null;
            } else {
                int c = 1;
                if (pos > count())
                    System.out.println("Invalid position");
                else {
                    Node temp = head;
                    while (temp != null) {
                        if (c == pos - 1) {
                            break;
                        }
                        c++;
                        temp = temp.next;
                    }
                    temp.next = temp.next.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Node n1 = new Node(10);
        obj.head = n1;
        Node n2 = new Node(20);
        n1.next = n2;
        Node n3 = new Node(30);
        n2.next = n3;
    }
}