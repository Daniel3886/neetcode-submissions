// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        if (pairs.size() <= 1) return pairs;

        int end = pairs.size() - 1;
        Pair pivot = pairs.get(end);
        int left = 0;

        // 5,2,1,0
        // pivot - 0
        // i - 2
        // left - 5
        for(int i = 0; i < end; i++){
            if(pairs.get(i).key < pivot.key){
                Pair temp = pairs.get(left); // 5
                pairs.set(left, pairs.get(i));// 2...
                pairs.set(i, temp); // ... 5, 2, 1, 0 
                left++; // left - 2
            }
        }

        pairs.set(end, pairs.get(left)); // swap pivot with arr left
        pairs.set(left, pivot); // set left to pivot so at the middle

        quickSort(pairs.subList(0, left)); // left side subarray
        quickSort(pairs.subList(left + 1, pairs.size())); // right side subarray

        return pairs;
    }
}
