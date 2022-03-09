package com.java;
//devides and returns ceiling
//jamesirungu
public class FrogJmp {
	public static void main(String[] args) {
		System.out.println(FrogJmp.solution(10,85,30));
	}
	public static int solution(int X, int Y, int D) {
		
		int distance =Y-X;
		int stepCount=(int) Math.ceil((double)distance/D);
		return stepCount;
	}
}
