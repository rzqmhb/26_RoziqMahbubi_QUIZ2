import java.util.Scanner;
public class AntrianResto {
    public static void main(String[] args) throws Exception {
        System.out.println("====== QUIZ 2 PRAKTIKUM ASD TI - 1G ======");
        System.out.println("Dibuat Oleh\t: Roziq Mahbubi");
        System.out.println("NIM\t: 2142720086");
        System.out.println("Absen\t: 26");
        System.out.println("==========================================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        NodePesanan head=null;

        int i=0;
        while (i<1) {
            System.out.println("Menu :");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan By Nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");
            
            int pilih = sc.nextInt();
            sc.nextLine();
            if (pilih==1) {
                System.out.println("---------------------");
                System.out.println("Masukkan Data Pembeli");
                System.out.println("---------------------");
                System.out.println("Nomor Antrian : " + dll.getLast());
                System.out.print("Nama Costumer : ");
                String nama = input.nextLine();
                System.out.println("No HP : ");
                String noHp = input.nextLine();
                Pembeli pembeli = new Pembeli(nama, noHp);
                dll.addLast(pembeli, null);

            } else if (pilih==2){
                dll.print();

            } else if (pilih==3){
                System.out.println("-----------------------");
                System.out.println("Transaksi Input Pesanan");
                System.out.println("-----------------------");
                if (head==null) {
                    System.out.println("Nomor Pesanan : 1");
                    System.out.print("Pesanan :");
                    String namaPesanan = input.nextLine();
                    System.out.print("Harga : ");
                    int harga = sc.nextInt();
                    sc.nextLine();
                    Pesanan pesanan = new Pesanan(namaPesanan, harga);
                    head = new NodePesanan(pesanan, 1);
                } else {
                    NodePesanan current = head;
                    while(current.next != null){
                        current = current.next;
                    }
                    System.out.println("Nomor Pesanan : "+current.antri);
                    System.out.print("Pesanan :");
                    String namaPesanan = input.nextLine();
                    System.out.print("Harga : ");
                    int harga = sc.nextInt();
                    sc.nextLine();
                    Pesanan pesanan = new Pesanan(namaPesanan, harga);
                    head = new NodePesanan(pesanan, current.antri);
                }
                dll.removeFirst();
            } else if (pilih==4){
                System.out.println("saya tidak tahu cara sorting dengan linked list, maaf pak");
            } else if (pilih==5){
                System.out.println("++++++++++++++++++");
                System.out.println("TOTAL PENDAPATAN");
                System.out.println("++++++++++++++++++");
                int pendapatan=0;
                NodePesanan current = head;
                    while(current.next != null){
                        pendapatan += current.pesanan.harga;
                        current = current.next;
                    }
                System.out.println("Pendapatan Hari Ini : " + pendapatan);
            } else {
                i++;
            }
        }
    }
}
