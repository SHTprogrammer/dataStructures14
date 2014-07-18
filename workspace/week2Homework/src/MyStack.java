import java.util.LinkedList;

public class MyStack<T>
{
	LinkedList<T> stackList = new LinkedList<T>();
	
	public MyStack()
	{	
	}
	
//	adds object to front of stack
	public void push(T newObject)
	{
		stackList.add(0, newObject);
	}
	
//	removes object from front of stack
	public T pop()
	{
//		if (stackList.size() == 0)
//			return Exception;
					
		T poppedItem = stackList.get(0);
		stackList.remove(0);
		return poppedItem;
	}
	
	public String toString()
	{
		return stackList.toString();
	}
}