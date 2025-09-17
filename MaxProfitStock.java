package com.tka;

	/* you are given a array price where price [i] is the price of given stock on ith day .
	 * you want to maximize your profit by choosing a single day to buy one stock and choosing a 
	 * different day in future to sell the stock . return a maximum profite you can achieve from this 
	 * transaction . If you cannot achieve any profit then return 0 .
	 */
	public class MaxProfitStock {
	    public static int maxProfit(int[] prices) {
	        int min = prices[0];    // assume first price is min
	        int profit = 0;

	        for (int i = 1; i < prices.length; i++) {
	            // check profit if sold today
	            profit = Math.max(profit, prices[i] - min);
	            // update min if today's price is smaller
	            min = Math.min(min, prices[i]);
	        }
	        return profit;
	    }

	    public static void main(String[] args) {
	        int[] prices = {7, 1, 5, 3, 6, 4};
	        System.out.println(maxProfit(prices)); // Output: 5
	    }
	}



