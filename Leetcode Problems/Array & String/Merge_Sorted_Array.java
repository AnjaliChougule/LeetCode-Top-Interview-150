class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;
        for (int j=0; j<n; j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
     public static void main(String[] args){
        int []nums1 =  {1, 2, 3, 0, 0, 0}
        int []nums1 =  {2, 4, 5}
        merge(nums1, num2)
        System.out.println(nums1)
        System.out.println(nums2)
    }
}

