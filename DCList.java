
public class DCList<T>{
			
		private Node<T> head;
		
		private Node<T> tail;
		
		private int size;
		
//		private Node list = new Node(T);
		
		private int h;
		
		private Node<T> p;
		
	
	public boolean isEmpty(){
		if (head==null){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display(){
		
		for(Node<T> i = head; i!=null; i=i.getNextNode()){
			
			System.out.println(i.toString());
		}	
	}	
				
	public void add(int pos, Node<T> value){	
		this.size++;
		
		if(value != null && pos<size() && pos >=0) {
			
			if(pos==0) {
				value.setNextNode(head);
				head.setPreviousNode(value);
				head = value;
			}
			
			else
				
			{
			Node<T> node = get(pos);
			node.getPreviousNode().setNextNode(value);
			value.setPreviousNode(node.getPreviousNode());
			node.setPreviousNode(value);
			value.setNextNode(node);
			value.pos= pos;
				for(Node<T> i =value.getNextNode(); i!=null; i=i.getNextNode()) {
				i.pos ++;
				}
			}
		}
	}			
		
	public void add(Node<T> value){		
		this.size++;
		
		if(head==null){
			head = value;
			tail = value;			
		}

		else
		{
			tail.setNextNode(value);
			value.setPreviousNode(tail);
			tail = value;
			tail.pos = size()-1;
		}	
	}
	
	
	public void remove(Node<T> value)	{
		
	if(value != null && value.pos>=0 && value.pos<size()-1  ) {

			value.getNextNode().setPreviousNode(value.getPreviousNode());

			value.getPreviousNode().setNextNode(value.getNextNode());

		}

	}
		

	
	  public void removeFirst(){
		  
		 
       head = head.getNextNode();

	       if(head!= null){

	            head.setPreviousNode(null);

	            for(Node<T> i=head; i!=null;i=i.getNextNode()) {

	                i.pos--;

	            }

	       }



	    }
	
	  public void removeLast(){
		  

        Node<T> last = get(size() - 1);

	        if(last!=null){

	            last.getPreviousNode().setNextNode(null);

	        }

	    }	
	
	
	public void clear(){		
		head = null;		
	}
	
	public Node<T> getFirst(){
		return head;
		
	}
	public Node<T> getLast(){
		return tail;
		
	}
	public Node<T> get(int pos){
		for(Node<T> i = head; i!=null; i=i.getNextNode()){
			if(i.pos == pos){	
				p=i;
			}
		}
		return p;		
	}
	
	public int find(T value){
		for(Node<T> i = head; i!=null; i=i.getNextNode())
			if(value == i){
				h = i.getpos()-1;
			}
		return h;	
	}
	
	public boolean contains(T value){
		
		for(Node<T> i = head; i!=null; i=i.getNextNode()){
				if(value == i){						
				return true;
				}
	   }
		return false;
	}
	public int size(){
			return this.size;		
	}
	}