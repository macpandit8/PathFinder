import java.util.ArrayList;

public class Node {
	
	private String nodeName;
	private ArrayList<Node> childNodes = new ArrayList<>();
	private Node parentNode;
	private boolean noChildren = true;
	private boolean isSurfaceNode = false;
	
	
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public ArrayList<Node> getChildNodes() {
		return childNodes;
	}
	public void setChildNodes(ArrayList<Node> childNodes) {
		this.childNodes = childNodes;
	}
	public Node getParentNode() {
		return parentNode;
	}
	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}
	public boolean isSurfaceNode() {
		return isSurfaceNode;
	}
	public void setSurfaceNode(boolean isSurfaceNode) {
		this.isSurfaceNode = isSurfaceNode;
	}
	public void addToChildNode(Node newNode) {
		
		this.childNodes.add(newNode);
		
	}
	public boolean hasNoChildren() {
		
		if(this.getChildNodes().size() > 0) {
			noChildren = false;
		}
		
		return noChildren;
		
	}
	
	

}
