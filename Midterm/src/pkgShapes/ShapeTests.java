package pkgShapes;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgShapes.Rectangle;
import pkgShapes.Cuboid;
import pkgShapes.Cuboid.SortByArea;
import pkgShapes.Cuboid.SortByVolume;

public class ShapeTests {
	
	@Test
	public void rectConstructorTest()
	{
		int tWidth = 2;
		int tLength = 5;
		Rectangle r = new Rectangle(tWidth,tLength);
		
		assertEquals(tWidth, r.getiWidth());
		assertEquals(tLength, r.getiLength());
	}
	
	@Test
	public void rectGetTests()
	{
		int tWidth = 2;
		int tLength = 5;
		Rectangle r = new Rectangle(tWidth,tLength);
		
		assertEquals(tWidth, r.getiWidth());
		assertEquals(tLength, r.getiLength());
	}
	
	@Test
	public void rectSetTests()
	{
		int tWidth = 2;
		int tLength = 5;
		Rectangle r = new Rectangle(tWidth,tLength);
		
		r.setiWidth(0);
		r.setiLength(0);
		assertEquals(0,r.getiWidth());
		assertEquals(0,r.getiLength());
	}
	
	@Test
	public void rectAreaTest()
	{
		int tWidth = 2;
		int tLength = 5;
		Rectangle r = new Rectangle(tWidth,tLength);
		
		assertEquals(10,r.area(),0);
	}
	
	@Test
	public void rectPerimeterTest() throws Exception
	{
		int tWidth = 2;
		int tLength = 5;
		Rectangle r = new Rectangle(tWidth,tLength);
		
		assertEquals(14,r.perimeter(),0);
	}
	
	@Test
	public void rectCompareToTest()
	{
		int tWidth1 = 2;
		int tLength1 = 2;
		Rectangle r1 = new Rectangle(tWidth1,tLength1);
		
		int tWidth2 = 2;
		int tLength2 = 5;
		Rectangle r2 = new Rectangle(tWidth2,tLength2);
		
		Rectangle r3 = new Rectangle(tWidth1,tLength1);
		
		assertEquals(-1,r1.compareTo(r2));
		assertEquals(1,r2.compareTo(r1));
		assertEquals(0,r1.compareTo(r3));
	}
	
	@Test
	public void cubConstructorTest()
	{
		int tWidth = 2;
		int tLength = 3;
		int tDepth = 4;
		Cuboid c = new Cuboid(tWidth,tLength,tDepth);
		
		assertEquals(tWidth,c.getiWidth());
		assertEquals(tLength,c.getiLength());
		assertEquals(tDepth,c.getiDepth());
	}
	
	@Test
	public void cubGetTests()
	{
		int tWidth = 2;
		int tLength = 3;
		int tDepth = 4;
		Cuboid c = new Cuboid(tWidth,tLength,tDepth);
		
		assertEquals(tWidth,c.getiWidth());
		assertEquals(tLength,c.getiLength());
		assertEquals(tDepth,c.getiDepth());
	}
	
	@Test
	public void cubSetTests()
	{
		int tWidth = 2;
		int tLength = 3;
		int tDepth = 4;
		Cuboid c = new Cuboid(tWidth,tLength,tDepth);
		
		c.setiWidth(0);
		c.setiLength(0);
		c.setiDepth(0);
		
		assertEquals(0,c.getiWidth());
		assertEquals(0,c.getiLength());
		assertEquals(0,c.getiDepth());
	}
	
	@Test
	public void cubVolumeTest()
	{
		int tWidth = 2;
		int tLength = 3;
		int tDepth = 4;
		Cuboid c = new Cuboid(tWidth,tLength,tDepth);
		
		assertEquals(2*3*4,c.volume(),0);
	}
	
	
	//creates a cuboid and tries to run perimeter
	//if perimeter didn't throw an exception, it would try to assertTrue on false, which would return an error (because we don't want it to get there)
	//if perimeter did throw an exception we had assertTrue on true, because it would return a successful run, and we want it to send that exception
	@Test
	public void cubPerimeterTest()
	{
		try
		{
			int tWidth = 2;
			int tLength = 3;
			int tDepth = 4;
			Cuboid c = new Cuboid(tWidth,tLength,tDepth);
			c.perimeter();
			assertTrue(false);
		}
		catch (Exception e)
		{
			assertTrue(true);
		}
	}
	
	@Test
	public void cubAreaTest()
	{
		int tWidth = 2;
		int tLength = 3;
		int tDepth = 4;
		Cuboid c = new Cuboid(tWidth,tLength,tDepth);
		
		assertEquals(52,c.area(),0);
	}
	
	@Test
	public void cubByAreaTests()
	{
		Cuboid c1 = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid(4,5,6);
		SortByArea s = c1.new SortByArea();
		
		assertEquals(-1,s.compare(c1, c2),0);
		assertEquals(1,s.compare(c2, c1),0);
		assertEquals(0,s.compare(c1, c1),0);
	}
	
	@Test
	public void cubByVolTests()
	{
		Cuboid c1 = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid(4,5,6);
		SortByVolume s = c1.new SortByVolume();
		
		assertEquals(-1,s.compare(c1, c2),0);
		assertEquals(1,s.compare(c2, c1),0);
		assertEquals(0,s.compare(c1, c1),0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}