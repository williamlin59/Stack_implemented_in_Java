/**This class implements Stack in Linked based implementation
 * 
 * @author william
 *
 * @param <E> the implementation of genesic in Stack.
 */


public class LinkedStack<E> implements Stack<E> {
	/**This is a inner class that define the class Node for using 
	 * in the Linkedlist.
	 * 
	 * @author william
	 *
	 */
	public class Node {
		E element;//the element that will stored in the Node
		Node next;// Node typed vairable that will point to the next node
		/** The constructor of Node class
		 * 
		 * @param element this is used to initialize the element
		 */
		public Node(E element) {
			this.element = element;//initialize the element
		}
		/**This is the method that used to output the the element that stored in the node by type string.
		 * 
		 */
		public String toString() {
			return element.toString();//return the element that stored in the node by type string
		}
	}
    private int size;// the size of the stack
    private Node top;//the top node of the stack

    /**This is the constructor of this class
     * 
     */
	public LinkedStack(){
		int size =0;//initialize size as 0.
		top=null;//assign the top node as null.
	}
	/**This is a method that returns the size of a stack
	 * 
	 */
	public int size() {
		return size;//return size
	}

	/**This is a method that add one element to the end of the stack
	 * 
	 */
	public E pop() throws StackIsEmpty {
		if(size==0)throw new StackIsEmpty();//if the stack is empty throw the exception
		else{
			Node p=top.next;//link node p to top.next.
			E temp=top.element;//assign the element value that stored in top.element to temp
			top.next=null;//assign top.next to null.
			top=p;//point top node to node p
			size--;//decrement of the size
			return temp;//return variable temp
		}
	
	}

	/**This method return the last element in the stack 
	 *  @param object the object that you want to push it into the stack.
	 */
	public E push(E object) {
		Node node=new Node(object);//define a node to hold the object
		node.next=top;//point node.next to top
		top=node;//point top to node
		size++;//increment of size.
		return node.element;//return the element stored in node
	}

	/**This method returns a boolean value to show if the stack is empty or not.
	 * 
	 */
	public boolean isEmpty() {
		return size==0;//return true if it's empty, false if it's not.
	}

	/**This method returns the top element in the stack.
	 * 
	 */
	public E top() throws StackIsEmpty {
		if(size==0)throw new StackIsEmpty();//if it's an empty stack, throw the exception
		else{
			return top.element;//return the element stored at the end of the stack.
		}
		
	}
	/**This is a method that output all the elements in the array.
	 * 
	 */
	public String toString(){
		Node temp=top;//define a temp node and assign it as top.
		String out = "[" + size + "] "; 
		 while(temp!=null){ //the loop that tracking the entire array
            out += temp.element + " "; //assign all element's value to a string variable.
            temp=temp.next;//move on to the next node.
        } 
        return out; //return the out variable.
	}

}
