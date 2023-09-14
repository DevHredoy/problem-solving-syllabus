package syllabusProblems;

import java.util.*;
import java.io.*;
//  ✔✔
public class ArrayProb5 {

  /*  Given an array with N distinct elements, convert the given array to a form where
   all elements are in the range from 0 to N-1. The order of elements is the same,
   i.e., 0 is placed in the place of the smallest element,
   1 is placed for the second smallest element, … N-1 is placed for the largest element.

        Input:  arr[] = {10, 40, 20}
    Output: arr[] = {0, 2, 1}

    Input:  arr[] = {5, 10, 40, 30, 20}
    Output: arr[] = {0, 1, 4, 3, 2}*/

//[58,33,12,90,1,30,2,88]
//naive approach: we shall find each




    static int[] convert(int[] arr)
        {
            int n = arr.length;
            int[] result = new int[n];
            int currPos = 0;
            // Iterate over the array
            for (int i = 0; i < n; i++) {
                int minn = Integer.MAX_VALUE;
                int idx = -1;

                // Find the minimum element and keep
                // its position of occurrence
                for (int j = 0; j < n; j++) {
                    if (minn > arr[j]) {
                        minn = arr[j];
                        idx = j;
                    }
                }

                // Update the result at minimum index element
                // with new Position

               //in the result array in the position of the minimum
                // element 0 is stored
                result[idx] = currPos;

                // Increment the new position
                currPos++;

                // Update the original element at current
                // minimum element with maximum value possible,
                // so that it won't be minimum in further
                // iteration
                arr[idx] = Integer.MAX_VALUE;
            }

            // Return the result
            return result;
        }

        static void printArr(int[] arr)
        {
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

        public static void main(String[] args)
        {
            int[] arr = { 10, 20, 15, 12, 11, 50 };
            int n = arr.length;

            System.out.println("Given Array is");
            printArr(arr);

            int[] result = convert(arr);

            System.out.println("\n\nConverted Array is");
            printArr(result);
            printArr(arr);
        }
    }


