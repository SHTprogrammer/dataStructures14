import java.util.LinkedList;


public class spellCheckTest {
	
	public static void main(String[] args){
		
		spellChecker check1 = new spellChecker();
//		check1.dictRead("words.txt");
		
		check1.dictRead("500Words.txt");

//		
//		check1.printDict();
		LinkedList<String> fileResults = 
			check1.checkFile("opheliaGoesNuts.txt");
		
//		LinkedList<String> testList = new LinkedList<>();
//		testList.add("  This is a list of test words do't on’t");
//		testList.add("   including these weird ones wod ya si");
//		testList.add("  Oph.  Indeed, la, without an oath I'll make an end on’t");
//		
//		LinkedList<String> fileResults = 
//		check1.checkFile(testList);	
		
		for (int i=0; i<fileResults.size(); i++){
			System.out.println(fileResults.get(i));
		}
		
//		System.out.println(check1.wordPermute("ben"));
//		System.out.println(check1.wordPermute("tof"));
//		System.out.println(check1.wordPermute("thsi"));
		System.out.println(check1.wordPermute(" on't"));

		
	}
	
	
	

}
