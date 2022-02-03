class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Cll {
    Node head;

    public void cinsertAtBeg(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            n.next = head;
        } else {
            Node temp = head;
            n.next = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = n;
            head = n;
        }
    }

    public void cinsertAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            n.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }

    public int count() {
        Node temp = head;
        if (head == null)
            return 0;
        else {
            int c = 1;
            while (temp.next != head) {
                c++;
                temp = temp.next;
            }
            return c;
        }
    }

    public void cinsertAtPos(int pos, int data) {
        Node n = new Node(data);
        if (head == null) {
            if (pos != 1)
                System.out.println("Invalid Position");
            else {
                head = n;
                n.next = head;
            }
        } else {
            if (pos == 1) {
                Node temp = head;
                n.next = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = n;
                head = n;
            } else if (pos > count() + 1) {
                System.out.println("Invalid Position");
            } else {
                Node temp = head;
                int c = 1;
                while (temp.next != head) {
                    if (pos - 1 == c)
                        break;
                    c++;
                    temp = temp.next;
                }
                n.next = temp.next;
                temp.next = n;
            }
        }
    }

    public void cdeleteAtBeg() {
        if (head == null)
            return;
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }

    public void cdeleteAtEnd() {
        if (head == null) {
            return;
        } else {
            if (head.next == head)
                head = null;
            else {
                Node temp = head;
                while (temp.next.next != head) {
                    temp = temp.next;
                }
                temp.next = head;
            }
        }
    }

    public void cdeleteAtPos(int pos) {
        if (head == null)
            return;
        else {
            if (pos == 1) {
                if (head.next == head) {
                    head = null;
                } else {
                    Node temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    temp.next = head.next;
                    head = head.next;
                }
            } else if (pos > count()) {
                System.out.println("Invalid Position");
            } else {
                Node temp = head;
                int c = 1;
                while (temp.next != head) {
                    if (pos - 1 == c)
                        break;
                    c++;
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }
    }

    public void print() {
        if (head == null)
            return;
        else {
            Node temp = head;
            while (temp.next != head) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }

    public static void main(String[] args) {
        Cll obj = new Cll();
        obj.cinsertAtBeg(10);
        obj.cinsertAtBeg(20);
        obj.cinsertAtBeg(30);
        obj.cinsertAtEnd(40);
        obj.cdeleteAtBeg();
        obj.cdeleteAtEnd();
        obj.print();
    }
}