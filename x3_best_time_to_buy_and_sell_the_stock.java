/*
APPROACH:)

*/
public class x3_best_time_to_buy_and_sell_the_stock {

  public static void main(String[] args) {
    int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(prices));
  }

  public static int maxProfit(int[] prices) {
    int minprice = Integer.MAX_VALUE;
    int maxprofit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minprice)
        minprice = prices[i];
      else if (prices[i] - minprice > maxprofit)
        maxprofit = prices[i] - minprice;
    }
    return maxprofit;
  }

}
