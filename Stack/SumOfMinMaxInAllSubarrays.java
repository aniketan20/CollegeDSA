/*
 * {1 5 2}
 *               max    min     diff
 * 1              1      1       0
 * 1 5            5      1       4
 * 1 5 2          5      1       4
 * 5              5      5       0
 * 5 2            5      2       3
 * 2              2      2       0
 * 
 * Using contribution technique
 * 
 * 4*5 - 5*1 = 15 : it means 5 is max for 5 subarrays and 5 is min for only 1 subarray
 * 1*1 - 3*1 = -2
 * 
 * (i-leftMax)*(rightMax-i) * arr[i] - (i-leftMin)*(rightMin-i)*arr[i]
 */

/**
 * SumOfMinMaxInAllSubarrays
 */
