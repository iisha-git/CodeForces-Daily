import java.util.*;

class sortColurs {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int mid = 0;
        int left = 0;
        int high = n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                mid++;
                left++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}