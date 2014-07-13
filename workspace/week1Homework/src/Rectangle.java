public class Rectangle 
{
	int length;
	int width;
	
	public Rectangle(int x, int y)
	{
		length = x;
		width = y;
	}
	
	/*
	 * returns Rectangle length
	 */
	public int getLength(){
		return length;
	}
	
	/*
	 * returns Rectangle width
	 */
	public int getWidth(){
		return width;
	}
	
    /*
    * toString - returns a string representation of Rectangle 
    * of the form "length x width".
    */
	public String toString() {
        return length + " x " + width;
    }
	
}