package com.hoan.algo2025.gpt;

import java.util.ArrayList;
import java.util.List;

/**
 * 그래프는 사이클이 존재할 수 있으므로 visited 배열로 방문 여부를 체크
 */
public class GraphDFS {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;


    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int next : graph.get(v)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) {
        int n = 6; // 노드 개수 (0~5)
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 추가 (양방향 그래프)
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(5);

        visited = new boolean[n];
        dfs(0); // 출력: 0 1 3 4 2 5
    }
}
