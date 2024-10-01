
public class DepthFirstSearch {
	Node root;
	
	public DepthFirstSearch() {
		System.out.println("Call DFS with root node to do a Depth First Search.");
	}
	
	public void DFS(Node node) {
		if(node == null) { //INCLUDING AN IF STATEMENT TO
	        //SEE IF THE NODE IS A LEAF
			return;
		}
		System.out.println(node.getData());
		
		DFS(node.getlChild());  //AND TWO RECURSIVE CALLS TO THE CHILDREN
		DFS(node.getrChild());
	}
	
	public int numNodes(Node node) {
		if(node == null) {
			return 0;
		}
		int left = numNodes(node.getlChild());
		int right = numNodes(node.getrChild());
		return 1 + left + right;
	}

}
