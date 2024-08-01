package SuperClassic;
/* Question - Best time to buy and sell stock
 *  Description - Leetcode 121. Best Time to Buy and Sell Stock
 * Intution - take profit as 0 and buyprice as arr[0]; noww find max profit and min buyprice using a for loop
 */
public class Q1 {
    static int maximum(int[] arr){
        int profit = 0;
        int buyPrice = arr[0];
        for(int i = 1; i<arr.length; i++){
            profit = Math.max(profit, arr[i]-buyPrice);
            buyPrice = Math.min(arr[i], buyPrice);
        }
        return profit;
    }
    public static void main(String[] args){
        int [] arr = {7,1,5,3,6,4};
        int result = maximum(arr);
        System.out.println(result); 
    }
}
