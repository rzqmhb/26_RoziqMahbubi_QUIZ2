public class NodePesanan {
    Pesanan pesanan;
    int antri;
    NodePesanan prev, next;

    NodePesanan(Pesanan pesanan, int antri){
        this.pesanan = pesanan;
        this.antri=antri;
    }
}
