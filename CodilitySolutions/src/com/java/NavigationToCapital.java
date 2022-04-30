package com.java;

import java.util.Arrays;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class NavigationToCapital {
 public int[] solution(int[] T) {       
     int returnValue[]=new int[T.length];
     int capital=0;

     for (int i=0;i<T.length-1;i++){
         if(T[i]==i ){
             capital=i;
         }
     }
     for(int j=0;j<T.length;j++){            
         dfs(j,T,capital,0,returnValue);
         
     }            
     
     return returnValue;
 }

 public void dfs(int city, int[] T,  int capital, int pathSize,int[]returnValue){
     if(T.length==1){
         returnValue[0]=returnValue[0]++;
     }
     else if(city==capital && pathSize!=0){
    	 returnValue[pathSize-1]=returnValue[pathSize-1]+1;
     }   
     else{     
         int next=T[city];
         pathSize++;
         dfs(next,T,capital,pathSize,returnValue); 
     }
 }
}