import org.w3c.dom.NamedNodeMap;

public class DoubleLinkedLists {
    Node_26 head;
    int size;

    DoubleLinkedLists(){
        head=null;
        size=0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Pembeli pem, Pesanan pes){
        if (isEmpty()) {
            head = new Node_26(null, pem, null);
            head.antrian = 1;
        }
        size++;
    }

    public void addLast(Pembeli pem, Pesanan pes){
        if (isEmpty()) {
            addFirst(pem, pes);
        } else {
            Node_26 current = head;
            while(current.next != null){
                current = current.next;
            }
            Node_26 newNode = new Node_26(current, pem, null);
            current.next = newNode;
            newNode.antrian = current.antrian + 1;
            size++;
        }
    }

    public void print(){
        if (!isEmpty()) {
            Node_26 tmp = head;
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t\t|Nama Customer\t\t\t|No HP");
            while(tmp != null){
                System.out.println("|"+tmp.antrian+"\t\t|"+tmp.pembeli.namaPembeli+"\t\t\t|"+tmp.pembeli.noHp);
                tmp = tmp.next;
            }
            System.out.println("Total Antrian\t: " + size);
        } else {
            System.out.println("Antrian Kosong !");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Antrian Masih Kosong !");
        } else if (size == 1){
            head = null;
            System.out.println(head.pembeli.namaPembeli+" Telah Memesan Menu");
        } else {
            head = head.next;
            head.prev = null;
            Node_26 current = head;
            while(current.next != null){
                current.antrian -=1;
                current = current.next;
            }
            size--;
        }
    }

    public int getLast(){
        Node_26 current = head;
            while(current.next != null){
                current = current.next;
        }
        return current.antrian;
    }
}
