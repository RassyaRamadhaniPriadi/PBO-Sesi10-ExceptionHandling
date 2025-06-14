public class Percobaan2 {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        String greetings[] = {
            "Hello World!",
            "No, I mean it!",
            "HELLO WORLD!"
        };

        while (count < 6) { // Batasi iterasi agar tidak infinite loop
            try {
                System.out.println(greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                i = 0;
            }
            count++;
        }
    }
}
