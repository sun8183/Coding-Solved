import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int K;
    static int[] nums;
    static int answer;
    static int total;
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        K = Integer.parseInt(s.split(" ")[1]);
        nums = new int[N];

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 참조 값을 바꾸는 것은 가능하나 참조 자체를 변경할 수는 없음
        margeSort(nums, 0, N-1);

        if(total < K) answer = -1;
        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static void margeSort(int[]A, int left, int right){
        if(left == right) return;
        int q = (left+right)/2;
        // 절반으로 분할(홀수인 경우 left쪽의 원소 개수가 1개 더 많음)
        margeSort(A, left, q);
        margeSort(A, q+1, right);
        marge(A, left, q, right);
    }

    public static void marge(int[]A, int left, int mid, int right){
        int i = left;
        int j = mid+1;
        int t = 0;
        int[] tmp = new int[right - left + 1];  // 병합 정렬 시 정렬되는 배열은 분할된 크기만큼 선언

        while(i<= mid&& j <= right){
            if(A[i]<= A[j]){
                tmp[t++] = A[i++];
            }else{
                tmp[t++] = A[j++];
            }
        }

        for (int k = i; k <= mid; k++) {
            tmp[t++] = A[k];
        }
        for (int k = j; k <= right; k++) {
            tmp[t++] = A[k];
        }

        for (int k = 0; k < tmp.length; k++) {
            A[left + k] = tmp[k];
            total++;
            if(total == K) answer = tmp[k];
        }

    }
}
