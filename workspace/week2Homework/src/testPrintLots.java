import java.util.ArrayList;

public class testPrintLots {
	
	public static void main( String[] args) {
		ArrayList<String> bigList = new ArrayList<String>();
		
		bigList.add("cat");
		bigList.add("another cat");
		bigList.add("parakeet");
		bigList.add("Cthulu");
		
		ArrayList<Integer> smallList = new ArrayList<Integer>();
		smallList.add(0);
		smallList.add(2);
		smallList.add(3);
		smallList.add(5);
		
		collectionPrinter<String> printer1 = new collectionPrinter<>();
		System.out.println(printer1.printLots(bigList,smallList).toString());	
	}
}