public class PeakIndexMountainArray {
  public static void main(String[] args) {
    int[] arr = { 0, 10, 5, 2 };
    System.out.println(peakIndexMountainArray(arr));
  }

  public static int peakIndexMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) { // continue until start == end
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) { // if mid is greater than the next element, peak is in the left half
        // you are in dec part of array
        // this may be the ans, but look at left
        // this is why end != mid - 1
        end = mid;
      } else {
        // you are in asc part of array
        start = mid + 1; // because we know that mid+1 element > mid element
      }
    }
    // int the end, start == end and pointing to the largest number because of the 2
    // checks above
    // start and end are always trying to find max element in the above 2 checks
    // hence, when they are pointing to just one element, that is the max one
    // because that is what the check say
    // more elaboration: at every point of time for start and end, they have the
    // best possible ans till that time
    // and if we are saying that only one item is remaining, hence cuz of above line
    // that is the best possible ans
    return start; // or return end as both are = at peak index
  }
}
