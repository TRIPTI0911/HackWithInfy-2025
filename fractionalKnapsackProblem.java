package GreedyMethod;

import java.util.*;

class Item{
	int profit, weight;
	public Item(int profit, int weight) {
	this.profit=profit;
	this.weight=weight;
	}
}
public class fractionalKnapsackProblem {
	public static double getMaxProfit(Item[] items, int capacity) {
		Arrays.sort(items, new Comparator<Item>(){
			public int compare(Item a, Item b) {
				double r1=(double)a.profit/a.weight;
				double r2=(double)b.profit/b.weight;
				return Double.compare(r2,r1);
			}
		});
		double totalProfit=0.0;
		int currentWeight=0;
		for(Item item: items) {
			if(currentWeight+item.weight<=capacity) {
				currentWeight+=item.weight;
				totalProfit+=item.profit;
			}else {
				int remaining=capacity-currentWeight;
				totalProfit+=(double)item.profit *remaining/item.weight;
				break;
			}
		}
		return totalProfit;
	}
	public static void main(String[] args) {
		Item[]  items= {
				new Item(60, 10),
				new Item(100, 20),
				new Item(120, 30)
		};
		int capacity=50;
	double maxProfit=getMaxProfit(items, capacity);
	System.out.println("Maximum Profit ="+ maxProfit);
}
}
