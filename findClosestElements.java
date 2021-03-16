// Time Complexity : O(nlog(n-k))
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> findClosestElements(int[] A, int k, int x) {
        int left = 0, right = A.length - k;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x - A[mid] > A[mid + k] - x)
                left = mid + 1;
            else
                right = mid;
        }
    
        List<Integer> ans = new ArrayList();
        int end = left +k;
        while(left < end)
            ans.add(A[left++]);
    
        return ans;
    }
}
