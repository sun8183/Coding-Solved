import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int stamps;
    static int price, answer;

    public static void main(String[] args) throws IOException {
        stamps = Integer.parseInt(br.readLine());
        price = Integer.parseInt(br.readLine());
        
        int discount = 0;
        
        if (stamps >= 20) {
            discount = Math.max(discount, (int) (price * 0.25));
        }
        if (stamps >= 15) {
            discount = Math.max(discount, 2000); 
        }
        if (stamps >= 10) {
            discount = Math.max(discount, (int) (price * 0.1));
        }
        if (stamps >= 5) {
            discount = Math.max(discount, 500);
        }

        int finalPrice = price - discount;
        
        if (finalPrice < 0) {
            finalPrice = 0;
        }

        bw.write(String.valueOf(finalPrice));
        bw.flush();
    }
}












