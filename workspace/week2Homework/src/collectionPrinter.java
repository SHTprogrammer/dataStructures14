import java.util.ArrayList;
import java.util.ListIterator;

public class collectionPrinter<T> {

	ArrayList<T> fullList;
	ArrayList<Integer> targetList;
	ArrayList<T> resultList = new ArrayList<T>();
	
	public collectionPrinter(){
	}
	
	public ArrayList<T> printLots(ArrayList<T> L, ArrayList<Integer> P) {	
		fullList = L;
		targetList = P;
		
		ListIterator<Integer> iterTarget = targetList.listIterator();
		ListIterator<T> iterFull = fullList.listIterator();
		
		int i = 0;
		int targetIndex = iterTarget.next();
		while (iterFull.hasNext() && i<= targetIndex)
		{
			T element = iterFull.next();
			if (i == targetIndex) {
				resultList.add(element);
			    targetIndex = iterTarget.next();
			}
			
			else if (iterTarget.hasNext() == false)
				return resultList;
			
			else {
			}
			i++;		
		}
		return resultList;
    }
}