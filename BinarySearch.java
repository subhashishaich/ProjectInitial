/* This program implements the most basic Binary search algorithm
inserting second command line */
public class BinarySearch {
        public static int binarySearch (int arr[], int x) {
          int start = 0;
          int end = arr.length -1;
          int mid =0;
          while (start <= end) {
              mid = (start+end)/2;
              if (arr[mid] == x) {
                  return mid;
              }
              if (arr[mid] > x) {
                  end = mid -1;
              }
              if (arr[mid] < x) {
                  start = mid + 1;
              }
          }
          return -1;
        }


        public static void main (String args[]) {
            int[] arr1 = {2, 4, 6, 8, 10, 12, 14, 16};
            int x = 14;
            System.out.println( x + " Found in array at position " + binarySearch(arr1, x));
            int[] arr2 = {6,34,78,123,432,900};
            x = 432;
            System.out.println( x + " Found in array at position " + binarySearch(arr2, x));

        }


}
