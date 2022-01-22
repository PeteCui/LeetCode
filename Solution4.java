class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        int lenTotal = len1 + len2;
        if(lenTotal % 2 == 1){
            int midIndex = lenTotal / 2;
            //index + 1 = th in array
            double median = getKthElement(nums1, nums2, midIndex + 1);
            return median;
        }else{
            int midIndex1 = lenTotal/2-1;
            int midIndex2 = lenTotal/2;
            //index + 1 = th in array
            // double median1 = getKthElement(nums1, nums2, midIndex1 + 1);
            // double median2 = getKthElement(nums1, nums2, midIndex2 + 1);
            double median = (getKthElement(nums1, nums2, midIndex1 + 1) + getKthElement(nums1, nums2, midIndex2 + 1))/2.0;
            return median;
        }
    }
    //pivot1 = nums1[k/2 - 1] and pivot2 = nums[k/2 -1]
    //the number of elements in nums1 that less than pivot1 is k/2-1
    //the number of elements in nums2 that less than pivot2 is k/2-1
    //pivot = min(pivot1, pivot2)
    //"delete" the corresponding elements in nums1 or nums2
    //update k
    public int getKthElement(int[] nums1, int[] nums2, int kth){
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        
        while(true){
            //boundary
            if(index1 == len1){
                return nums2[index2 + kth -1];
            }
            if(index2 == len2){
                return nums1[index1 + kth -1];
            }
            if(kth == 1){
                return Math.min(nums1[index1], nums2[index2]);
            }

            // new index is old index + k/2 - 1
            int half = kth/2;

            int halfKIndex1 = Math.min(index1 + half, len1) - 1;
            int halfKIndex2 = Math.min(index2 + half, len2) - 1;

            int pivot1 = nums1[halfKIndex1];
            int pivot2 = nums2[halfKIndex2];

            if(pivot1 <= pivot2){
                //delete the corresponding number of elements
                kth -= ((halfKIndex1 - index1) + 1);
                index1 = halfKIndex1 + 1;
            }else{
                kth -= ((halfKIndex2 - index2) + 1);
                index2 = halfKIndex2 + 1;
            }
        }
    }
    
}
