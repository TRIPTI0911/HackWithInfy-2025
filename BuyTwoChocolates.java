package GreedyMethod;

public class BuyTwoChocolates {
	public static int main(String[] args) {
		int[] prices= {3, 2, 1, 4};
		int money=5;
		
		
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		for(int price: prices) {
			if(price<min1) {
				min2=min1;
				min1=price;
			}else if(price<min2) {
				min2=price;
			}
		}
		int total=min1+min2;
		
		if(total<=money) {
			return money-total;
		}else {
			return money;
		}
	}
}
