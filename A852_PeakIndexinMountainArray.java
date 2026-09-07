public class A852_PeakIndexinMountainArray {
    //using linear search
    public int peakIndexInMountainArray(int[] arr) {
        int peakEle = arr[0];
        int ptr = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > peakEle){
                ptr = i;
                peakEle = arr[i];
            }
            else {
                break;
            }
        }

        return ptr;
    }
    //using binary search
    public int peakIndexInMountainArray1(int[] arr) {

        int mid = arr[0];

        int left = 0, right = arr.length-1;
        while(left<=right){
            mid = left + (right-left)/2;
            if(mid == 0){
                if(arr[mid] < arr[mid+1]) left = mid+1;
                else return mid;
            }
            else if(mid == arr.length-1){
                if(arr[mid-1] > arr[mid]) right = mid-1;
                else return mid;
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid != 0 && arr[mid] < arr[mid-1]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return mid;
    }
}
