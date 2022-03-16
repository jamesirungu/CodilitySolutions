package com.java;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MaximumArrayDisplacementFrogs {
	int maxDisplacement = 0;
	int rightSource = 0;
	int leftSource = 0;
	int rightTarget = 0;
	int leftmostPossiblePointer = 0;

	public int solution(int[] blocks) {
		int maxDisp = 0;

		for (int i = 0; i < blocks.length; i++) {
			if (i == 0) {
				rightTarget = 1;
			} else if (i == blocks.length - 1) {
				rightTarget = blocks.length - 1;
				if (blocks[i] < blocks[i - 1]) {
					leftSource = leftmostPossiblePointer;
				}
			}

			else {
				if (blocks[i] > blocks[i - 1]) {
					leftmostPossiblePointer = i;
				}
				if (blocks[i] < blocks[i - 1]) {
					leftSource = leftmostPossiblePointer;
				}
				if (blocks[i] <= blocks[i + 1]) {
					rightTarget = i + 1;
				}
			}

			maxDisp = rightTarget - leftSource + 1;
			if (maxDisp > maxDisplacement) {
				maxDisplacement = maxDisp;
			}

		}

		return maxDisplacement;
	}
}
