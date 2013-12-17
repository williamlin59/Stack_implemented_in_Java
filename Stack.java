
public interface Stack<E> {
	public int size();
	public E pop()throws StackIsEmpty;
	public E push(E object);
	public boolean isEmpty();
	public E top()throws StackIsEmpty;

}
