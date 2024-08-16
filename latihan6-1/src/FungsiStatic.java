public class FungsiStatic {
    // Fungsi non-static
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }

    // fungsi static
    static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }

    // fungsi main
    public static void main(String[] args) {

        // pemanggilan fungsi static
        minum("Kopi");

        // mambuat instansiasi objek saya dari class FungsiStatic
        FungsiStatic budi = new FungsiStatic();
        // pemanggilan fungsi non-static
        budi.makan("Nasi Goreng");

    }

}
