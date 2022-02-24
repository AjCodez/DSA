class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SLL {
    static Node head;

    public static void insertAtBeg(int x) {
        Node n = new Node(x);
        n.next = head;
        head = n;
    }

    public static void insertAtEnd(int a) {
        Node n = new Node(a);
        if (head == null)
            head = n;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void insertAtAnyPos(int x, int y) {
        Node n = new Node(y);
        if (head == null) {
            if (x > 1) {
                System.out.println("Invalid Position");
                System.exit(0);
            } else
                head = n;
        } else {
            if (x == 1) {
                n.next = head;
                head = n;
            } else if (x > count() + 1) {
                System.out.println("Invalid Position");
                System.exit(0);
            } else {
                Node temp = head;
                int c = 1;
                while (temp.next != null) {
                    if (c == x - 1)
                        break;
                    c++;
                    temp = temp.next;

                }
                n.next = temp.next;
                temp.next = n;
            }
        }
    }

    public void deleteAtBeg() {
        if (head == null)
            return;
        else {
            head = head.next;
        }
    }

    public static void deleteFromEnd() {
        Node temp = head;
        if (temp == null)
            return;
        else if (temp.next == null)
            head = null;
        else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;

        }
    }

    public static int count() {
        int c = 1;
        Node temp = head;
        while (temp.next != null) {
            ++c;
            temp = temp.next;
        }
        return c;
    }

    public static void deleteFromPos(int pos) {
        if (head == null)
            return;
        else {
            if (head.next == null) {
                if (pos != 1) {
                    System.out.println("Invalid Position");
                    System.exit(0);
                } else
                    head = null;
            } else if (pos == 1)
                head = head.next;
            else {
                int c = 1;
                if (pos > count()) {
                    System.out.println("Invalid Position");
                    System.exit(0);
                } else {
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

    public void find(int a) {
        Node temp = head;
        int f = 0;
        while (temp != null) {
            if (temp.data == a) {
                System.out.print("Yes");
                f++;
                break;
            }
            temp = temp.next;
        }
        if (f == 0)
            System.out.println("No");
    }

    public void findMid(int n) {
        Node temp = head;
        int c = 0;
        if (n % 2 == 0)
            n = n / 2 - 1;
        else
            n = (n / 2);
        while (temp != null) {
            if (n == c)
                System.out.println(temp.data);
            temp = temp.next;
            c++;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
