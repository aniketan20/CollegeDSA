/**
 * KnapSackProblem
 * ---------------
 * Types:
 * 1. KnapSack with max profit
 * 2. KnapSack with max weight
 * 3. KnapSack with max profit and max weight - Only in this ratio is calculated
 * 
 * Given Inputs:
 * Pro,Wei
 * arr[][] = {{120,17},{100,13},{60,8}}
 * W = 20
 * 
 * Logics
 * ------
 * (Max Profit)
 * Sort arr in descending order according to there price
 * Profit: (120,100,60)
 * Add Profit: 120,17
 * Remaining Weight: 3
 * Add Profit: (Remaining Weight * Current Profit / Current Weight)
 * 3 * 100 / 13 = 23.07
 * Total Profit: 120 + 23.07 = 143.07
 * 
 * (Max Weight)
 * Sort arr in ascending order according to there weight
 * Weight: (8,13,17)
 * Add Profit: 60,8
 * Remaining Weight: 12
 * Add Profit: (Remaining Weight * Current Profit / Current Weight)
 * 12 * 100 / 13 = 92.30
 * Total Profit: 60 + 92.30 = 152.30
 * 
 * (Max Profit and Max Weight: Fractional KnapSack Problem)
 * Calculate Ratio : (Price/Weight)
 * Ratio : 120/7 = 7.05, 100/13 = 7.69, 60/8 = 7.50
 * Sort according to ratio in descending order
 * Ratio: (7.69,7.50,7.05)
 * Add Profit: 100,13
 * Remaining Weight: 7
 * Add Profit: (Remaining Weight * Current Profit / Current Weight)
 * 7 * 60 / 8 = 52.50
 * Total Profit: 100 + 52.50 = 152.50
 * 
 * Algorithm for Fractional Knap Sack
 * 
 * 1. Calculate ratio of each item i.e., Price/Weight
 * 2. Sort the item on the basis of ratio in decreasing order
 * 3. Initialize res = 0, curr_cap = given_cap
 * 4. Do following for each item in sorted order
 * a. If wieght of current item is less than or equal to remaining capacity, add
 * it into result
 * b. Else add the current item as much as we can and break the loop
 * 5. Return res
 * 
 * Time Complexity:
 * Ration: O(n)
 * Sorting: O(n logn)
 * Adding items in sack: O(n)
 * Since all the operations are operated at the same array, complexity will be
 * eqaul to the one with max complexity
 * i.e. O(n logn)
 * Hence, Time Complexity for KnapSack: O(n logn)
 * 
 * Note: If the operations would have done for different new array(s), it would
 * have been the sum of all complexities.
 */


//Not using 2-d array, storing prices and wieghts in different arrays
// public class FractionalKnapSackProblem {

// 	public static void sort(double r[], double p[], int w[], int n) {
// 		for (int i = 0; i < n; i++) {
// 			for (int j = i + 1; j < n; j++) {
// 				if (r[i] < r[j]) {
// 					double temp1 = r[i];
// 					r[i] = r[j];
// 					r[j] = temp1;

// 					temp1 = p[i];
// 					p[i] = p[j];
// 					p[j] = temp1;

// 					int temp2 = w[i];
// 					w[i] = w[j];
// 					w[j] = temp2;
// 				}
// 			}
// 		}
// 	}

// 	public static double calculatePro(double prices[], int weights[], int knapsack) {
// 		int n = prices.length;
// 		double ratio[] = new double[n];
// 		for (int i = 0; i < n; i++)
// 			ratio[i] = prices[i] / weights[i];

// 		sort(ratio, prices, weights, n);

// 		double maxPro = 0;
// 		for (int i = 0; i < n; i++) {
// 			if (weights[i] <= knapsack) {
// 				maxPro += prices[i];
// 				knapsack -= weights[i];
// 			} else {
// 				maxPro += knapsack * prices[i] / weights[i];
// 				break;
// 			}
// 		}
// 		return maxPro;
// 	}

// 	public static void main(String[] args) {
// 		double prices[] = { 120, 100, 60 };
// 		int weights[] = { 17, 13, 8 };
// 		int knapsack = 20;
// 		System.out.println("Max Profit : " + calculatePro(prices, weights, knapsack));
// 	}
// }

// Using 2-D array to store data of items i.e. there prices and wieghts

import java.util.*;

public class FractionalKnapSackProblem {

	public static void sort(double[][] items){	
		Arrays.sort(items, (items1,items2) -> Double.compare(items2[0]/items2[1],items1[0]/items1[1]));
	}

	public static double calculatePro(double[][] items,double knapsack){
		sort(items);	
		double maxPro = 0;
		for(int i = 0 ; i < items.length ; i++){
			double cp = items[i][0];
			double cw = items[i][1];
			if(cw <= knapsack){
				maxPro += cp;
				knapsack -= cw;
			}	
			else{
				maxPro += knapsack * cp / cw;
				break;
			}
		}
		return maxPro;
	} 

	public static void main(String[] args) {
		double[][] items = {
			{120, 17},
			{100, 13},
			{60, 8}
		};
		double knapsack = 20;
		System.out.println("Max Profit : " + calculatePro(items, knapsack));
	}
}
