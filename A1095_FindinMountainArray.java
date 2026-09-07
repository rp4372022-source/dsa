/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
//dont look at red line the question is like that :)
class Solution {
    int peek(MountainArray mountainArr){

        int left = 0, right = mountainArr.length()-1;
        while(left<right){
            int mid = left + (right-left)/2;
            
            if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }

    int binarySearchAsc(int target, MountainArray mountainArr, int left, int right){
        while(left <= right){
            int mid = left + (right-left)/2;
            int midEle = mountainArr.get(mid);

            if(midEle == target) return mid;
            
            if(midEle < target) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }
    int binarySearchDsc(int target, MountainArray mountainArr, int left, int right){
        while(left <= right){
            int mid = left + (right-left)/2;
            int midEle = mountainArr.get(mid);

            if(midEle == target) return mid;
            
            if(midEle > target) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //find peek ele index
        int mid = peek(mountainArr);
        //search in asc order (find the order)
        if(mid == mountainArr.length()-1){
            //search in left half
            return binarySearchAsc(target, mountainArr, 0, mountainArr.length()-1);
        } else if(mid == 0){
            //search in right half
            return binarySearchDsc(target, mountainArr, 0, mountainArr.length()-1);
        }
        else{
            //search in 0 to mid-1 and mid to right
            //left side always ascending and right side always decending

            int res = binarySearchAsc(target, mountainArr, 0, mid);

            if(res == -1){
                res = binarySearchDsc(target, mountainArr, mid+1, mountainArr.length()-1);
            }

            return res;
        }
    }
}