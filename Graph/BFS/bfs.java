import java.util.*;

class bfs{
    // Adjacency List representation of the graph.
    private static List<List<Integer>> buildGraph(int[][] edges, int n){

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }

    private static int[] breathFirstSearch(int[][] edges, int n, int src){
        List<List<Integer>> graph = buildGraph(edges,n);

        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[n];
        int[] ans = new ans[n];

        que.add(src);
        visited[src] = true;

        
    }

    public static void main(String[] args) {
        
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 2}, {1, 3}, {1, 4}, {2, 5}, {3, 4}, {3, 5}};
        int n = 6;
        int src = 0;

        int[] bfsAnswer = breathFirstSearch(edges, n, src);

        for(int val: bfsAnswer){
            System.out.print( val + " ");
        }
        
        // for(int i=0;i<n;i++){
        //     System.out.print(i + " :");
        //     for(int val : graph.get(i)){
        //         System.out.print(val + " ");
        //     }
        //     System.out.println();
        // }
    }
}