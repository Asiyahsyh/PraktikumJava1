import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String namaDepan = "Asiyah";
        int usia = 18;
        int targetTahunKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean cantik = true;
        
        System.out.println("Nama depan : " + namaDepan);
        namaDepan = JOptionPane.showInputDialog("Nama Depan : ");
        System.out.println("Usia : " + usia);
        System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
        System.out.println("IPK : " + ipk);
        System.out.println("Nilai PBO : " + nilaiAbjad );
        System.err.println("Cantik : " + cantik);

        System.out.println("======OUTPUT======");
        System.out.println("Nama depan : " + namaDepan);
        System.out.println("Usia : " + usia);
        System.out.println("Target Kuliah : " + targetTahunKuliah + "tahun");
        System.out.println("Ipk : " + ipk);
        System.out.println("Cantik : " + cantik);

        JOptionPane.showMessageDialog(null,"Hai, " + namaDepan);
        
    }
}
