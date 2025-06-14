public class Percobaan5 {

    public static void main(String[] args) {
        int bil = 10;

        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException e) {
            System.out.println("Pesan error:");
            System.out.println(e.getMessage()); // Menampilkan pesan error singkat
            System.out.println("Info stack trace:");
            e.printStackTrace();               // Menampilkan error lengkap ke stderr
            e.printStackTrace(System.out);     // Menampilkan error lengkap ke stdout
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}

