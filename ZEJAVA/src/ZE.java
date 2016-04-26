import java.util.HashSet;

public class ZE {
	public static void main(String[] args) {
		try {
			// badMethod();
			// System.out.print("A");
			// for (int i = 1; i <= 100; i++) {
			// System.out.println(printFizzBuzz(i));
			// }
			int[] A = { 1, 9, 2, 8, 9, 2, 0, 2, 1, 10 };
			int B = findlong(A);
			System.out.println("HII " + String.valueOf(B));

		} catch (RuntimeException ex) /* Line 10 */
		{
			System.out.print("B");
		} catch (Exception ex1) {
			System.out.print("C");
		} finally {
			System.out.print("DHAHA");
		}
		System.out.print("E");
	}

	public static void badMethod() {
		throw new RuntimeException();
	}

	public static String printFizzBuzz(int i) {

		if (i % 15 == 0) {
			return "fizzbuzz";
		} else if (i % 3 == 0) {
			return "fizz";
		} else if (i % 5 == 0) {
			return "buzz";
		} else {
			return String.valueOf(i);
		}
	}

	public static int findlong(int[] A) {
		int max = 0;
		for (int i = 0; i < A.length; i++) { // runs A.length times
			int cur = 0;
			HashSet<Integer> hash = new HashSet<Integer>();
			for (int j = i; j < A.length; j++) { // Start at each index find the
				// longest starting at each
				// index
				if (hash.contains(A[j])) {
					if (cur > max) {
						max = cur;
					}
					break;
	
				} else {
	
					hash.add(A[j]);
					cur++;
				}
			}
			max = Math.max(max, cur);
		}
		return max;

	}

}