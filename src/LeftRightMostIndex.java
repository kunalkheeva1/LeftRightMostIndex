public class LeftRightMostIndex {

    static class Pair{
       static long first, second;
        Pair(long data, long data2){
            this.first = data;
            this.second = data2;
        }
    }


    public static Pair rightLeftMostIndex(long arr [], long n){
        int low = 0;
        int high = arr.length-1;


        Pair pair = new Pair(-1,-1);

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

        low = 0;
        high = arr.length -1;
        while(low<= high){
            int mid = (low +high)/2;

            if(arr[mid]== n){
                pair.second = mid;
                low = mid +1;
            }
            else if(arr[mid]< n){
                low= mid+1;
            }
            else{
                high = mid-1;
            }
        }return pair;


    }

        public static void main(String[] args) {

        }

}
