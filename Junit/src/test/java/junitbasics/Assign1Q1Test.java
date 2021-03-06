package junitbasics;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Assign1Q1Test {
	

	@Test
	@DisplayName("Array Testing")
	public void test() {
		Assign1Q1 m = new Assign1Q1();
		int []k = {56, 34, 7,3, 54, 3, 34, 34, 53};
		int []l = {3,56};
		
		int []k1 = {15,18,25,3,48,9,6,10};
		int []l1 = {3,48};
		
		int []k2 = {2,4,6,7,9,52,34,15,40};
		int []l2 = {2,52};
		
 		assertAll(
 				()->assertArrayEquals(l,m.MinMaxFinder(k),"returns same "),
 				()->assertArrayEquals(l1,m.MinMaxFinder(k1),"returns same "),
 				()->assertArrayEquals(l2,m.MinMaxFinder(k2),"returns same ")
 				);
	}
}
