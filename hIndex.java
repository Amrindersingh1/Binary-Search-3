// Time Complexity : O(logn)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
  public int hIndex(int[] citations) {
    int idx = 0, n = citations.length;
    int pivot, left = 0, right = n - 1;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (citations[pivot] == n - pivot) return n - pivot;
      else if (citations[pivot] < n - pivot) left = pivot + 1;
      else right = pivot - 1;
    }
    return n - left;
  }
}
