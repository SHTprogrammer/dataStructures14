public class Point{
	Integer x;
	Integer y;
	
	public Point(Integer x,Integer y){
		this.x = x;
		this.y = y;		
	}
	
	public String toString(){
		return ("("+x.toString()+","+y.toString()+")");
	}
	    
}