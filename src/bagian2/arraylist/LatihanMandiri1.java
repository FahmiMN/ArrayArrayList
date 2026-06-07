package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Telur");
        belanja.add("Minyak");
        belanja.add("Gula");

        belanja.remove(1);   

        System.out.println("Isi list : " + belanja);
        System.out.println("Jumlah   : " + belanja.size());
    }
}