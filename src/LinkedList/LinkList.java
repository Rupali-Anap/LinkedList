package LinkedList;

public class LinkList {

        Node head;
        Node tail;

        void push(int data) {

            Node node = new Node(data);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head = node;
            }
        }

        void print() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }




    public static void main(String[] args) {

        LinkList linkedList = new LinkList();

        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.print();
    }
}