package com.hoan.algo2025.playground.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class DFSExample {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("노드 개수: ");
        int n = sc.nextInt();
        System.out.println("간선 개수: ");
        int m = sc.nextInt();

        // 그래프 초기화
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 입력
        System.out.println("간선 입력 (노드1 노드2): ");
        for(int i=0; i<m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 방문 배열 초기화
        visited = new boolean[n+1];

        // DFS 시작
        System.out.println("시작 노드: ");
        int start = sc.nextInt();
        System.out.println("DFS 방문 순서:");
        dfs(start);



    }

    private static void dfs(int node) {
        visited[node] = true;
        System.out.println(node + " ");

        for(int next: graph.get(node)) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}
