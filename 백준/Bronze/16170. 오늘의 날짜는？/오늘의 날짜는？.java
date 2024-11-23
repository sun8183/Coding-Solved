import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        LocalDateTime now = LocalDateTime.now();

        String s = formatter.format(now);
        st = new StringTokenizer(s, "-");

        bw.write(st.nextToken()+"\n");
        bw.write(st.nextToken()+"\n");
        bw.write(st.nextToken());
        bw.flush();
    }
}
