import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Antrian<Integer> ant=new Array<>();
        E daftar;

        boolean status=true;
        while (status==true){
            System.out.println("Selamat datang di aplikasi antrian");
            System.out.println("Silakan pilih menu");
            System.out.println("1. Daftar \n2. Panggil \n3. Keluar");
            System.out.print("Pilihan Anda : 1");
            String pilihan=inp.nextLine();

            if (pilihan.equals("1")){
                System.out.print("\nMasukan nama : ");
                daftar=inp.nextLine();
                ant.enqueue(daftar);
                System.out.println(daftar+", antrian anda bernomor "+ant.size()+"\n");
            }

            if (pilihan.equals("2")){
                if (ant.size()>0){
                    System.out.println("\nNomor antrian "+ant.size()+", silakan masuk");
                    ant.dequeue();
                    System.out.println();
                }
                else{
                    System.out.println("Tidak ada antrian dalam sistem\n");
                }
            }

            if (pilihan.equals("3")){
                if (ant.size()>0){
                    System.out.println("\nMasih ada antrian dalam sistem\n");
                }
                else{
                    status=false;
                    System.out.println("Terima kasih telah menggunakan program ini.");
                }
            }

            else{
                System.out.println("Pilihan tidak ada dalam sistem, masukan angka sesuai yang tertera\n");
            }
        }
    }
}