package level1;

public class ProfitPercentage {

    public static void main(String[] args) {

        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice);
        System.out.println("The Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit);
        System.out.println("The Profit Percentage is " + profitPercentage + "%");

    }
}
