package pkgShapes;

public class Cuboid extends Rectangle implements Comparable<Object> {
	
	private int iDepth;

	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume()
	{
		return getiWidth() * getiLength() * iDepth;
	}
	
	//Surface Area
	@Override
	public double area()
	{
		return 2 * ((getiWidth() * getiLength()) + (getiWidth() * iDepth) + (getiLength() * iDepth));
	}
	
	@Override
	public double perimeter() throws Exception
	{
		throw new Exception("UnsupportedOperationException");
	}

	public int compareTo(Object cub)
	{
		if(volume() == ((Cuboid) cub).volume())
		{
			return 0;
		}
		else if(volume() > ((Cuboid) cub).volume())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public class SortByArea
	{
		SortByArea()
		{
			
		}
		
		public int compare(Cuboid a, Cuboid b)
		{
			if(a.area() == b.area())
				return 0;
			else if (a.area() > b.area())
				return 1;
			else
				return -1;
		}
		
	}
	
	public class SortByVolume
	{
		SortByVolume()
		{
			
		}
		
		public int compare(Cuboid a, Cuboid b)
		{
			if(a.volume() == b.volume())
				return 0;
			else if (a.volume() > b.volume())
				return 1;
			else
				return -1;
		}
	}
	
}































