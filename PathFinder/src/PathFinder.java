import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PathFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node surfaceNode = new Node();
		surfaceNode.setNodeName("Surface");
		surfaceNode.setSurfaceNode(true);
		
		
		treeMaker(surfaceNode);

	}
	
	
	public static void treeMaker(Node initialNode) {
		
		Node currentNode = new Node();
		
		currentNode = initialNode;
		
		Scanner scan = new Scanner(System.in);
		
		boolean quit = false;
		
		while(!quit) {
			
			String input = scan.nextLine();
			
			String[] userInputs = input.split(" ");
			
			ArrayList<String> userInputsList = new ArrayList<>(Arrays.asList(userInputs));
			
			String actualNodeName = "";
			
			for(int i = 1; i < userInputsList.size(); i++) {
				
				actualNodeName += userInputsList.get(i);
				
				if(i != userInputsList.size() - 1) {
					actualNodeName += " ";
				}
				
			}
			
			switch (userInputsList.get(0)) {
			
			case "DIG":
				
				if(actualNodeName.equals("")) {
					actualNodeName = " ";
				}
				
				Node newNode = new Node();
				newNode.setNodeName(actualNodeName);
				newNode.setParentNode(currentNode);
				currentNode.addToChildNode(newNode);
				currentNode = newNode;
				break;
				
			case "ASCEND":
				
				if(currentNode.getNodeName().equals("Surface")) {
					
					System.out.println("You are on the Root Node \"Surface\".");
					
				} else {
				
					currentNode = currentNode.getParentNode();
					System.out.println(currentNode.getNodeName());
				
				}
				break;
				
			case "DESCEND":
				
				if(actualNodeName.equals("")) {
					
					actualNodeName = " ";
					
				}
				
				if(!currentNode.hasNoChildren()) {
					
					for(Node eachNode : currentNode.getChildNodes()) {
						
						if(eachNode.getNodeName().equals(actualNodeName)) {
							
							currentNode = eachNode;
							System.out.println(currentNode.getNodeName());
							break;
							
						} 
						
					}
					
					if(!currentNode.getNodeName().equals(actualNodeName)) {
						
						System.out.println("Sorry! there is no such node.");
						
					}
					
				} else {
				
					System.out.println("BAD INPUT");
				
				}
				break;
				
			case "LOOK":
				
				if(!currentNode.hasNoChildren()) {
				
					for(Node eachNode : currentNode.getChildNodes()) {
						
						System.out.println("Path: " + eachNode.getChildNodes().size()
								+ " - "+ eachNode.getNodeName());
						
					}
				
				}
				break;
				
			case "LOOKBACK":
				
				if(currentNode.getNodeName().equals("Surface")) {
					
					System.out.println("You are already on the Root Node.");
				
				} else {
					
					System.out.println(currentNode.getParentNode().getNodeName());
					
				}
				break;
				
			case "QUIT":
				quit = true;
				break;
				
			default:
				System.out.println("BAD INPUT");
				break;
				
			}
			
		}
		
		scan.close();
		
		
	}

}
