public class Node <T>{
	
	private T value;
	
	public int pos;
	
	private Node<T> next;
	
	private Node<T> prev;
	
	
	public Node(T value){
		
	this.value=value;
	
	}
	
	
	public  T getvalue(){
		
	return value;
	
	}
	
	
	public String toString() {	
		
		return value.toString();
		
	}
	
	
	public void setNextNode(Node<T> next){
		
		this.next = next;
		
	}
	
	public void setPreviousNode(Node<T> previous){
		
		this.prev = previous;	
		
	}
	
	public Node<T> getNextNode(){
		
		return this.next;
	}
	
	
	public Node<T> getPreviousNode(){
		
		return this.prev;
		
	}
	
	public T getValue(){
		
		return this.value;	
		
	}
	
	public int getpos(){
		
		return this.pos;	
		
	}
}
