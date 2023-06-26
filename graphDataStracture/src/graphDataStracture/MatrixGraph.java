package graphDataStracture;

public class MatrixGraph {
	private int E;
	private int V;
	private int[][] matrix;
	
	public MatrixGraph(int node) {
		this.E=0;
		this.V=node;
		this.matrix=new int[node][node];
	}
	public void addEdge(int u,int v) {
		matrix[u][v]=1;
		matrix[v][u]=1;
		E++;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(V+"vertex"+E+"edges"+"\n");
		for(int i=0;i<V;i++) {
			sb.append(i+":");
			for(int w:matrix[i]) {
				sb.append(w);
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		MatrixGraph g=new MatrixGraph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		System.out.println(g);
	}

}
