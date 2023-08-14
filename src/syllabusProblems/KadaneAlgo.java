package syllabusProblems;
/*Given an array Arr[] of N integers. Find the contiguous
        sub-array(containing at least one number)
        which has the maximum sum and return its sum.*/

//next job is to return the array.
public class KadaneAlgo {


  static int findBigSum(int[] digList)
   {

       // the list will be traversed and sums will be done left to right
       //by a variable (current sum) if the current sum once become
       // - we shall set it to zero


       //the maximum sum will be always saved in a var (maxNumber)

       int currentSum=0;
       int maxSum=0;
       for(int tWord:digList)
       {
           currentSum+=tWord;
           if(currentSum<0)
           {
               currentSum=0;
           }
            if(currentSum>maxSum)
            {
                maxSum=currentSum;
            }

       }




return maxSum;

     //  return
   }


    public static void main(String[] args) {
        int[] array=new int[]{12,-2,-5,11,4,-4,1,3};
         int result= findBigSum(array);

        System.out.println(result);
   }
}
