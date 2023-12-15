class Node {

    int data;
    Node link;

    Node(int data1, Node link1) {

        this.data = data1;
        this.link = link1;
    }

    Node(int data1) {

        this.data = data1;
        this.link = null;
    }

}

class LinkedList {
    public static Node convertLL(int arr[]) {

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i]);
            mover.link = temp;
            mover = mover.link;

        }

        return head;
    }

    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.link;
        }
        return count;
    }

    public static void main(String args[]) {

        int[] arr = { 23, 3, 22, 112, 223 };
        // Node y = new Node(arr[2]);
        // System.out.println(y.data);

        // converting array into linked list
        Node head = convertLL(arr);
        System.out.print(head.data);

        // traversal of ll
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }

        // Length of LL
        System.out.println("length of the ll :" + lengthOfLL(head));

    }
}