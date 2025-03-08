import java.io.*;

public class Main {
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        bw.write("The world says hello!");
        bw.flush();
    }
}
