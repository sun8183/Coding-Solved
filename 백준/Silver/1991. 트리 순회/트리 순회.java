import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] Left;
    static int[] Right;
    static HashMap<Integer, Integer> alpha = new HashMap<>();

    static final int ROOT = 65; // 문제에서 항상 A가 루트노드

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        Left = new int[N];
        Right = new int[N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            char node = st.nextToken().charAt(0);
            alpha.put((int)node, i);

            char a1 = st.nextToken().charAt(0);
            char a2 = st.nextToken().charAt(0);

            Left[i] = a1;
            Right[i] = a2;

            if(a1 == '.') Left[i] = -1;
            if(a2 == '.') Right[i] = -1;
        }

        Preorder(ROOT);
        bw.write("\n");
        Inorder(ROOT);
        bw.write("\n");
        Postorder(ROOT);

        bw.flush();
    }

    // 트리의 전위순회
    public static void Preorder(int current) throws IOException {
        if(current == -1) return;

        bw.write((char)current);
        Preorder(Left[alpha.get(current)]);
        Preorder(Right[alpha.get(current)]);
    }

    // 트리의 중위순회
    public static void Inorder(int current) throws IOException {
        if(current == -1) return;

        Inorder(Left[alpha.get(current)]);
        bw.write((char)current);
        Inorder(Right[alpha.get(current)]);
    }

    // 트리의 후위순회
    public static void Postorder(int current) throws IOException {
        if(current == -1) return;

        Postorder(Left[alpha.get(current)]);
        Postorder(Right[alpha.get(current)]);
        bw.write((char)current);
    }
}