package heapimplementation;

public class App {
	
	public static void main(String[] args){
		
		Heap newHeap = new Heap(10);
		newHeap.insert(1, "Saad");
		newHeap.insert(9, "Ahmed");
		newHeap.insert(5, "Haider");
		newHeap.insert(2, "Kamran");
		newHeap.insert(4, "Shariq");
		newHeap.insert(6, "Noman");
		newHeap.insert(7, "Isa");
		newHeap.insert(3, "Bobby");
		
		
		newHeap.displayHeap();
		
	}

}
