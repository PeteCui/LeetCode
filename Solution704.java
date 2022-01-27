class Solution704 {
    //Binary Search
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            int num = nums[mid];
            if(num == target){
                return mid;
            }else if(num > target){
                //because the mid is exclude, so we need to minus 1
                right = mid - 1;
            }else{
                //as same as above
                left = mid + 1;
            }
        }
        return -1;
    }
}