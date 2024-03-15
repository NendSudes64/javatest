public class javacode {
    public static void main(String[] args) {
        while (true){
        System.out.println("Hello, World!");
        try {
            Thread.sleep(5000); // Wait for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}
//ayo
