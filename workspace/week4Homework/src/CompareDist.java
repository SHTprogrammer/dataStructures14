import java.util.Comparator;

public class CompareDist implements Comparator<Vertex>{
        public int compare(Vertex a1, Vertex a2) {
        	int result = 0;
        	if( a1.dist < a2.dist )
        		result = -1;
        	if( a1.dist == a2.dist )
        		result = 0;
        	if( a1.dist > a2.dist )
        		result =  1;
        	return result;
        }
}
	
