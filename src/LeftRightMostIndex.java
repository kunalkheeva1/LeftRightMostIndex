
// condition is the array should be sorted

public class LeftRightMostIndex {
// get a pair calass to store the right and left most elements
    static class Pair{
       static long first, second;
        Pair(long data, long data2){
            this.first = data;
            this.second = data2;
        }
    }

// method to return that pair
    public static Pair rightLeftMostIndex(long arr [], long n){

        // two pointers
        int low = 0;
        int high = arr.length-1;

        //pair is empty at first
        Pair pair = new Pair(-1,-1);

    //loop for the left most element
        while(low <= high){
            //get a mid pointer
            int mid = (low + high)/2;
            // if the match is found then store it in first, and then change the high
            // to check again for another match and loop back
            if(arr[mid]== n){
                pair.first = mid;
                high = mid-1;
            }
            //otherwise if element is smaller and greater update the pointers accordingly
            else if (arr[mid]<n){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        // update the pointers again
        low = 0;
        high = arr.length -1;
        // now for the right most element
        while(low<= high){
            int mid = (low +high)/2;
            // if match found then, check the right half again to update the pair.second again
            //run the loop again until conditions reache

            if(arr[mid]== n){
                pair.second = mid;
                low = mid +1;
            }
            else if(arr[mid]< n){
                low= mid+1;
            }
            else {
                high = mid - 1;
            }

            // return it
        }return pair;


    }

        public static void main(String[] args) {

        }

}
