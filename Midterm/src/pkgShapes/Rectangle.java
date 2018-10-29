package pkgShapes;

public class Rectangle extends Shape implements Comparable<Object> {
	
	private int iWidth;
	
	private int iLength;
	
	public Rectangle(int iWidth, int iLength)
	{
		this.iWidth = iWidth;
		this.iLength = iLength;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		return iWidth * iLength;
	}

	@Override
	public double perimeter() throws Exception {
		return (2*iWidth) + (2*iLength);
	}
	
	
	//If the two rectangles are equal, it returns 0
	//If the current rectangle is larger than the input, then it returns 1
	//If the current rectangle is smaller than the input, then it returns -1
	@Override
	public int compareTo(Object rect)
	{
		if(area() == ((Rectangle) rect).area())
		{
			return 0;
		}
		else if(area() > ((Rectangle) rect).area())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	
	

}
