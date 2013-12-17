/**This class implements Stack in Array based implementation
 * 
 * @author william
 *
 * @param <E> Genesic implementation from the Stack interface.
 */
public class ArrayStack<E> implements Stack<E>{
	private int N;//The length of the array.
	private E A[];//The array that used to implement stack
	private int n=0;//varaible used to show the size of an stack
	
	/**The constructor of the class
	 * 
	 * @param arrayLength the array length that user used to define the size of array A
	 */
	public ArrayStack(int arrayLength){
		N=arrayLength;	//assign arrayLength to N.
		A=(E[])new Object[N];//declare the size of Array A and casting it to type E from type Object 
	}

	/**This is a method that returns the size of the Stack
	 * 
	 */
	public int size() {
		return n;//return the size n.
	}

	/**This is a method that add one element to the end of the stack
	 * 
	 */
	public E pop() throws StackIsEmpty {
		if(n==0)throw new StackIsEmpty();//if the stack is empty throw the exception
		
		else{
			E temp=(E)new Object();//declare a temp variable in type Object and cast it to type E.
			temp=A[n-1];//assign the value stored in A[n-1] to temp
			A[n-1]=null;//then assign the A[n-1] to null since we don't need it anymore.
			n--;//decrement of the size
			return temp;//return the element that A[n-1]used to store.
		}
	}

	/**This method return the last element in the stack and assign it to null after that operation
	 * If the stack size is equal to the array size, then double the array size .
	 *  @param object the object that you want to push it into the stack.
	 */
	public E push(E object) {
		if(n==N){//if the stack size reach the array size
			E temp[]=(E[])new Object[N*2];//define a new array with type E which is doubled the size of array A.
			System.arraycopy(A, 0, temp, 0, N);//copy all the elements to the new array.
			A=(E[])new Object[N*2];//double the size of array A.
			System.arraycopy(temp, 0, A, 0, N);//copy all the elements back to array A.
			A[n++]=object;//store the object in A[n] and then increment the size of stack by n++.
		}
		
		else{
			A[n++]=object;//if the stack size is still smaller than the array size. assign the object to A[n] and then increment the size of stack by n++.
		}
		
		return object;//return object.
	}

	/**This method returns a boolean value to show if the stack is empty or not.
	 * 
	 */
	public boolean isEmpty() {
		return n==0;//return true if it's empty, false if it's not.
	}

	/**This method returns the top element in the stack.
	 * 
	 */
	public E top() throws StackIsEmpty {
		if(n==0) throw new StackIsEmpty();//if it's an empty stack, throw the exception
		else{
			return A[n-1];//return the element stored at the end of the stack.
		}

	}
	/**This is a method that output all the elements in the array.
	 * 
	 */
	public String toString() { 
        String out = "[" + n + "] "; 
        for (int i=0; i<A.length; i++) { //loop that track the whole array.
            out += A[i] + " "; 
        } 
        return out; //return variable that stored all elements in the array.
    } 


}
