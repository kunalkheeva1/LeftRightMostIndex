public class LeftRightMostIndex {

    static class pair{
       static long first, second;
        pair(long data, long data2){
            this.first = data;
            this.second = data2;
        }
    }


    public static pair rightLeftMostIndex(long arr [], long n){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]== n){
                pair.first = mid;
                high = mid-1;
            }else if (arr[mid]<n){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }


    }

        public static void main(String[] args) {

        }

}
