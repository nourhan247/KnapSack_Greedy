# KnapSack_Greedy

The Fractional Knapsack problem is solved using a greedy approach, where items are sorted by their profit-to-weight ratio, and we iteratively pick items (or fractions of them) to maximize total profit.
Greedy Selection of Items

We iterate through the sorted items:

If the item fits completely in the remaining capacity, we take it.

Otherwise, we take only a fraction of the item to fill the knapsack.

The process stops when the knapsack is full.


Sorting the Items → O(nlogn)
Iterating Through Items → O(n)
Total Time Complexity:O(nlogn)+O(n)=O(nlogn)
Total Space Complexity: O(n)
