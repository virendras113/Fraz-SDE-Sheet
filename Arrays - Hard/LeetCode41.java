// 41. First Missing Positive

// Approach - Storing present values in hashSet.
          //  Then traversing through each number from 1 to Maximum present element.

class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> hset = new HashSet<>();

        int maxPre = Integer.MIN_VALUE;

        for(int num : nums){
            maxPre = Math.max(maxPre, num);
            hset.add(num);
        }

        for(int i=1; i<=maxPre; i++){

            if(!hset.contains(i)){
                return i;
            }

        }

        return maxPre < 0 ? 1 : maxPre + 1;
        
    }
}
