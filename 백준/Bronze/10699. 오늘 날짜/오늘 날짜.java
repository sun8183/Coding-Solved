import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String s = simpleDateFormat.format(new Date());
        bw.write(s);
        bw.flush();
    }
}
