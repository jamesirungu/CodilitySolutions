package com.java;
// Prints missing element in an array of consecutive numbers
public class PermMissingElem {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		System.out.println("The missing element is: "+PermMissingElem.solution(array));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int returnValue=0;
        long[] B =new long[A.length+2];
        for(int i=0;i<A.length;i++){
            B[A[i]]=A[i];
        }
        for(int j=0;j<B.length-1;j++){
            if(B[1]!=1){
                returnValue=1;
            }
            if(B[B.length-1]!=B.length-1){
                returnValue=B.length-1;
            }
            if((B[j]==0)&&(j>0)){
               returnValue=j;
            }
        }
        return returnValue;
        
    }

}
