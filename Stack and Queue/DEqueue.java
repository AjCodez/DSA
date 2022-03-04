class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class DEqueue {
    static Node head;
    static Node tail;

    public static boolean isEmpty() {
        Node temp = head;
        if (temp == null)
            return true;
        else
            return false;
    }

    public static void insertFront(int x) {
        Node n = new Node(x);
        if(head == null){
            head=n;
            tail=n;
        }
        else{
            n.next = head;
            head = n;
        }
    }

    public static void insertRear(int a) {
        Node n = new Node(a);
        if (head == null){
            head = n;
            tail=n;
        }
        else {
            tail.next=n;
            tail=tail.next;
        }
    }

    public static void deleteFront() {
        Node temp = head;
        if (temp == null)
            return;
        else {
            head = head.next;
        }
    }

    public static void deleteRear() {
        Node temp = head;
        if (temp == null)
            return;
        else if (temp.next == null)
            head = null;
        else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            tail=temp;
            temp.next = null;
        }
    }

    public static int getRear() {
        Node temp = head;
        if (temp == null)
            return -1;
        else {
            return tail.data;
        }
    }

    public static int getFront() {
        if (head == null)
            return -1;
        else
            return head.data;
    }

    public static void main(String[] args) {
        isEmpty();
        insertFront(5);
        insertRear(6);
        insertFront(7);
        insertRear(8);
        deleteFront();
        deleteRear();
        System.out.println(getFront());
        System.out.println(getRear());
    }
}
