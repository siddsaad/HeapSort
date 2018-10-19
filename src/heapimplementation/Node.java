package heapimplementation;

public class Node {

	private int key;
	private String name;

	public Node(int key, String name) {
		this.key = key;
		this.name = name;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	public String getName(){
		return name;
	}
	
}
