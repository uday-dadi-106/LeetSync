class Solution {
    public int maxProductDifference(int[] nums) {
     Arrays.sort(nums);
     int firestmax=nums[nums.length-1];
     int secondmax=nums[nums.length-2];
     int firestmin=nums[0];
     int secondmin=nums[1];
     return (firestmax*secondmax)-(firestmin*secondmin);
    }
}