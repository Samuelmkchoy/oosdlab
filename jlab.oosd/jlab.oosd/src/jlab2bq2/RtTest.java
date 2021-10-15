package jlab2bq2;

public class RtTest 
{
    public static void main(String[] args)
    {
    	Rectangle boxA = new Rectangle();
    	
    	boxA.setLength(5);
    	boxA.setWidth(10);
    	
    	System.out.println("Length: "+ boxA.getLength()+", Width: "+ boxA.getWidth());
    	System.out.println("Permeter: "+ boxA.getPerimeter()+", Area: "+boxA.getArea());
    }
}
