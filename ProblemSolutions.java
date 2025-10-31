/******************************************************************
 *
 *   PAMELA MENSAH / 002
 *
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

import java.util.*;

class ProblemSolutions {

    /**
     * Method: isSubset()
     *
     * Given two arrays of integers, A and B, return whether
     * array B is a subset if array A. Example:
     *      Input: [1,50,55,80,90], [55,90]
     *      Output: true
     *      Input: [1,50,55,80,90], [55,90, 99]
     *      Output: false
     *
     * The solution time complexity must NOT be worse than O(n).
     * For the solution, use a Hash Table.
     *
     * @param list1 - Input array A
     * @param list2 - input array B
     * @return      - returns boolean value B is a subset of A.
     */

    public boolean isSubset(int[] list1, int[] list2) {
        HashSet<Integer> set = new HashSet<>();

        // put all elements of list1 in a set
        for (int x : list1) set.add(x);
        
        // check if every element of list2 is in the set
        for (int y : list2) {
            if (!set.contains(y)) 
            return false;
        }
        return true;
    }

    /**
     * Method: findKthLargest
     *
     * Given an Array A and integer K, return the k-th maximum element in the array.
     * Example:
     *      Input: [1,7,3,10,34,5,8], 4
     *      Output: 7
     *
     * @param array - Array of integers
     * @param k     - the kth maximum element
     * @return      - the value in the array which is the kth maximum value
     */

    public int findKthLargest(int[] array, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // keep only k biggest elements in the heap

        for (int num : array) {
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }

        // smallest in the heap is the kth largest overall
        return pq.peek();
    }


    /**
     * Method: sort2Arrays
     *
     * Given two arrays A and B with n and m integers respectively, return
     * a single array of all the elements in A and B in sorted order. Example:
     *      Input: [4,1,5], [3,2]
     *      Output: 1 2 3 4 5
     *
     * @param array1    - Input array 1
     * @param array2    - Input array 2
     * @return          - Sorted array with all elements in A and B.
     */

    public int[] sort2Arrays(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];
        int i = 0;

        // add all elements from both arrays
        for (int x : a) result[i++] = x;
        for (int y : b) result[i++] = y;

        // sort final array
        Arrays.sort(result);
        return result;
    }

}