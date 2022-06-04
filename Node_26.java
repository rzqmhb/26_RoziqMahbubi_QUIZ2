public class Node_26 {
    Pembeli pembeli;
    int antrian;
    Node_26 prev, next;

    Node_26(Node_26 prev, Pembeli pembeli, Node_26 next){
        this.prev=prev;
        this.pembeli=pembeli;
        this.next=next;
    }
}
