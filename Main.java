import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        knapsack_greedy[]item={
                new knapsack_greedy(18,25),
                new knapsack_greedy(15,24),
                new knapsack_greedy(10,15)
        };
        int capacity=20;
        double max=getmaxprofit(item,capacity);
        System.out.println("Maximum profit: "+max);
    }
    public static double getmaxprofit(knapsack_greedy[]item,int capacity){
        int size= item.length;
        double pwRatio[]=new double[size];
        for(int i=0;i<size;i++){
            pwRatio[i]=item[i].profit/item[i].weight;
        }
        Arrays.sort(item,(a,b)->Double.compare((double)b.profit/b.weight,(double)a.profit/a.weight));
        double totalProfit=0;
        for(int i=0;i<size;i++){
            if(capacity>0 && item[i].weight<=capacity){
                capacity-=item[i].weight;
                totalProfit+=item[i].profit;
            }
            else {
                if (capacity > 0) {
                    totalProfit += item[i].profit * ((double) capacity / item[i].weight);
                    capacity = 0;
                }
                 break;
            }
        }
        return totalProfit;
    }

}
class knapsack_greedy {
    int profit;
    int weight;
    knapsack_greedy(int weight,int profit) {
        this.weight = weight;
        this.profit = profit;
    }
}