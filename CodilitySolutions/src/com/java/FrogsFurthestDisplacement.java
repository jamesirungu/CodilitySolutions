package com.java;

// you can also use imports, for example:
//import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class FrogsFurthestDisplacement {
	public int solution(int[] blocks) {
		long maxDistance = 0;
		long maxRightNavigationsFromPoint[] = new long[blocks.length];
		long maxLeftNavigationsFromPoint[] = new long[blocks.length];
		for (int i = 0; i < blocks.length; i++) {
			if (i == 0 && blocks.length > 0) {
				maxLeftNavigationsFromPoint[i] = 0;
				maxRightNavigationsFromPoint[i] = i + checkRightNavigation(blocks, i, 0);
			} else if (i == blocks.length) {
				maxLeftNavigationsFromPoint[i] = checkLeftNavigation(blocks, i, 0);
				maxRightNavigationsFromPoint[i] = blocks.length - 1;
			} else {
				maxLeftNavigationsFromPoint[i] = checkLeftNavigation(blocks, i, 0);
				maxRightNavigationsFromPoint[i] = checkRightNavigation(blocks, i, 0);
			}
		}
		for (int i = 0; i < blocks.length; i++) {
			long currentDistance = 1 + Math.abs(maxRightNavigationsFromPoint[i] - maxLeftNavigationsFromPoint[i]);
			if (currentDistance > maxDistance) {maxDistance = currentDistance;}
		}
		return (int) maxDistance;
	}
	private int checkLeftNavigation(int[] A, int i, int currentHops) {
		int maxhops = currentHops;
		if (i == 0) {return maxhops;} else if (A[i - 1] < A[i]) {return maxhops;} 
		else {maxhops++;return checkLeftNavigation(A, (--i), (maxhops));}
	}
	private int checkRightNavigation(int[] A, int i, int currentHops) {
		int maxhops = currentHops;
		if (i == A.length - 1) {return maxhops;	} 
		else if (A[i + 1] < A[i]) {return maxhops;} 
		else {maxhops++;return checkRightNavigation(A, (++i), (maxhops));}
	}
}
