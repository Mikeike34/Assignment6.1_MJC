
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		System.out.println("Total number of nodes in this tree is: "+ aSearch.numNodes(root));
		System.out.println("The height of the tree searched is: " + aTree.getHeight());
	}
}
