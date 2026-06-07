class mergeSort {
    //T : O(nlogn) S : O(n)
    public static void merge(int arr[],int start,int mid,int end){
        int temp[] = new int[end-start+1];

        int i = start;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }

        int x=0;
        int y=start;
        while(x<temp.length){
            arr[y++]=temp[x++];
        }
         
    }
    public static void mergeSort(int []arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;

        mergeSort(arr , start,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,start,mid,end);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public static void main(String[] args) {

    int nums[] = {5, 2, 3, 1, 8, 7};

    mergeSort(nums, 0, nums.length - 1);

    System.out.println("Sorted Array:");

    for (int num : nums) {
        System.out.print(num + " ");
    }
}
}