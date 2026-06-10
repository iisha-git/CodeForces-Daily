public class quickSort {
    public static void quickSort(int []nums,int start,int end){
        //base case
        if(start>=end){
            return;
        }

        //partition
        int pivot = partition(nums,start,end);

        //pivot
        quickSort(nums,start,pivot-1);
        quickSort(nums, pivot+1, end);
    }

    public static int partition(int []nums,int start,int end){
        int pivot = nums[end];
        int i = start;

        for (int j = start; j < end; j++) {
            if(nums[j]<pivot){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;

                i=i+1;
            }
        }
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end]=temp;
            return i;
    }
}
