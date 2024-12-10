import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_2606 {
    private static int n;
    private static int m;
    private static boolean[] visitedVertex;
    private static int[][] data;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine()); // 노드 갯수
        m = Integer.parseInt(br.readLine());
        visitedVertex = new boolean[n+1]; // 네트워크 상 연결되어 있는 컴퓨터 쌍의 수

        data = new int[n+1][n+1];

        for(int i=1; i<m; i++) {
            String[] list = br.readLine().split(" ");
            int a = Integer.parseInt(list[0]);
            int b = Integer.parseInt(list[1]);
            data[a][b] = 1;
            data[b][a] = 1;
        }
        dfs(1);
        System.out.println(count-1);
        // bfs(1);
    }

    public static void dfs(int node) {
        // 방문한 노드는 체크하기
        visitedVertex[node] = true;

        // System.out.print(node + " ");
        // 모든 노드의 번호를 다 탐색해야 하므로
        for(int i=1; i<=n; i++) {
            // 연결되어 있는 엣지가 있고 방문한 적이 있으면 방문하지 않도록 처리
            if(data[node][i] == 1 && !visitedVertex[i]) {
                // 연결되어 있는 노드를 계속 타고 들어가면서 탐색
                dfs(i);
                count++;
            }
        }
    }

    public static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visitedVertex[node] = true;

        while(!queue.isEmpty()) {
            int nodedata = queue.poll();
            // System.out.print(nodedata + " ");
            for(int i=1; i<=n; i++) {
                // 노드와 인접한 모든 탐색할 노드를 queue 에 넣기
                // => 엣지 설정이 되어있고, 방문하지 않은 노드
                if(data[nodedata][i] == 1 && !visitedVertex[i]) {
                    queue.add(i);
                    visitedVertex[i] = true;
                }
            }

        }
        System.out.println(count);
    }
}
