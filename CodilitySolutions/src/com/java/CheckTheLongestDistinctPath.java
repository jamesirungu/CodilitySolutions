package com.java;

	// you can also use imports, for example:
	 import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");
	 class Tree {
		  public int x;
		  public Tree l;
		  public Tree r;
		}
	class CheckTheLongestDistinctPath {
	    
	    public int solution(Tree T) {   
	        Set<Integer> set = new HashSet<>();          
	        if(T==null){
	           return 0;         
	        }
	        else {
	            return getMaxDistinctPath(T,set);
	        }
	    }
	        public int getMaxDistinctPath(Tree node,Set<Integer> s){
	          if(node==null||s.contains(node.x)){
	           return s.size();  
	          }
	          else{
	        s.add(node.x);
	    int maxPath = Math.max(getMaxDistinctPath(node.l,s),getMaxDistinctPath(node.r,s));
	        s.remove(node.x);
	        return maxPath;
	          }
	        }
	    
	}


