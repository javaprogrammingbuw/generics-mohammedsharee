	
public class Compile {	
	
		public static void main(String[] args) {

				Node<String> S = new Node<>(new String("String"));
				
				DCList<String> x =new DCList<>();
				
				x.add(S);
				
				x.add(new Node<>(new String("S")));

				x.add(new Node<>(new String("H")));

				x.add(new Node<>(new String("A")));

				x.add(new Node<>(new String("R")));

				x.add(new Node<>(new String("E")));

				x.add(new Node<>(new String("E")));

				x.add(new Node<>(new String("F")));
				
				System.out.println(x.size());
				
				x.display();
				
				System.out.println("Last: " + x.getLast().getValue());
				
				x.removeLast();
				
				System.out.println("Last removed");
				
				x.display();
				
				x.removeFirst();
				
				System.out.println("First removed");
				
				x.display();
				
				
		}
		}

