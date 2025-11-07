
// Q-10 from chatgpt --  easy
// Find the second largest element in an array

public class nd_largest {
  static int secondLargest(int[] arr) {
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > first) {
        second = first;
        first = arr[i];
      } else if (arr[i] > second && arr[i] != first) {
        second = arr[i];
      }
    }
    return second;
  }
}
