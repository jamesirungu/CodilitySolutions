package com.java;

class CoinChange {
    //2d array. rows = coins.length, columns= amount+1

    public int coinChange(int[] coins, int amount) {
        int[][] coinsGrid= new int[coins.length+1][amount+1];
        
        for(int i=0; i<=coins.length; i++){
            
            for(int j=1; j<amount+1;j++){
                if(i==0){
                    coinsGrid[i][j]=Integer.MAX_VALUE;
                }                
                else{
                    if(j<coins[i-1]||coinsGrid[i][j-coins[i-1]]==Integer.MAX_VALUE){
                        coinsGrid[i][j]=coinsGrid[i-1][j];
                    }
                    else{
                     coinsGrid[i][j]=Math.min(coinsGrid[i-1][j],coinsGrid[i][j-coins[i-1]]+1);
                    }
                }
            }
        }
        
        return coinsGrid[coinsGrid.length-1][amount]==Integer.MAX_VALUE?-1:coinsGrid[coinsGrid.length-1][amount];
        
    }
}