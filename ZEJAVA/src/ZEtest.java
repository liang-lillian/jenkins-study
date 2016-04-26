import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ZEtest {
	public static void main(String[] args)
	{
		int[] A = {1,2,1,4,5,8,3,2,1,6};
		//int x = 0;
		//assert (x > 0): "The assertion failed";
		testNumber(A);
		System.out.println("Success testNumber");
		
		int[] B = {};
		testZero(B);
		System.out.println("Success testZero");		

		int[] C = {0,0,0,0};
		testOne(C);
		System.out.println("Success testOne");	
	}

	@Test
	public static void testNumber(int[] N) {
		assertEquals(7, ZE.findlong(N));
	}
	@Test
	public static void testZero(int[] N) {
		assertEquals(0, ZE.findlong(N));
	}	
	@Test
	public static void testOne(int[] N) {
		assertEquals(1, ZE.findlong(N));
	}	
	
	
	
	
}