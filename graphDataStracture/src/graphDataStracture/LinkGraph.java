package graphDataStracture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinkGraph {
	private LinkedList<Integer>[] ad;
	private int E;
	private int V;
	
	public LinkGraph(int node) {
		this.V=node;
		this.E=0;
		this.ad=new LinkedList[node];
		for(int i=0;i<V;i++) {
		ad[i]=new LinkedList<>();
		}
	}
	public void edgeAdd(int u,int  v) {
		ad[u].add(v);
		ad[v].add(u);
		E++;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(V+"vertex "+E+"edge"+"\n");
		for(int i=0;i<V;i++) {
			sb.append(i+": ");
			for(int c:ad[i]) {
				sb.append(c+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public void Bfs(int s) {
		boolean[] visited=new boolean[V];
		
		Queue<Integer> q=new LinkedList<>();
		visited[s]=true;
		q.add(s);
		
		while(!q.isEmpty()) {
			int u=q.poll();
			System.out.print(u+" ");
			for(int c:ad[u]) {
				if(!visited[c]) {
					visited[c]=true;
					q.add(c);
				}
			}
		}
	}
	public void Dfs(int s) {
		boolean[] visited=new  boolean[V];
		Stack<Integer>stack=new Stack<>();
		stack.push(s);
		while(!stack.isEmpty()) {
			int u=stack.pop();
			if(!visited[u]) {
				visited[u]=true;
				System.out.print(u+" ");
				for(int v:ad[u]) {
					if(!visited[v]) {
						stack.push(v);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		LinkGraph g=new LinkGraph(5);
		g.edgeAdd(0, 1);
		g.edgeAdd(1, 2);
		g.edgeAdd(2, 3);
		g.edgeAdd(3, 0);
		g.edgeAdd(2, 4);
		System.out.println(g);
		g.Dfs(0);
		System.out.println();
		g.Bfs(0);
	}

}
