package jlab2bq3;

public class RtTest 
{
    public static void main(String[] args)
    {
    	Rectangle boxA = new Rectangle();
    	
    	boxA.setLength(4);
    	boxA.setWidth(10);
    	
    	System.out.println("Length: "+ boxA.getLength()+", Width: "+ boxA.getWidth());
    	System.out.println("Permeter: "+ boxA.getPerimeter()+", Area: "+boxA.getArea());
    	boxA.printRectangle();
    }
}
