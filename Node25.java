class Node25 {
    int data;
    int jarak; // New field for jarak
    Node25 prev;
    Node25 next;

    Node25(Node25 prev, int data, int jarak, Node25 next) {
        this.data = data;
        this.jarak = jarak; // Initialize jarak
        this.prev = prev;
        this.next = next;
    }
}
