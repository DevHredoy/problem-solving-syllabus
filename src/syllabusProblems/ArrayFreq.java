package syllabusProblems;

////✔✔



//N = 5
//        arr[] = {2, 3, 2, 3, 5}
//        P = 5
//        Output:
//        0 2 2 0 1
//        Explanation:
//        Counting frequencies of each array element
//        We have:
//        1 occurring 0 times.
//        2 occurring 2 times.
//        3 occurring 2 times.
//        4 occurring 0 times.
//        5 occurring 1 time.
public class ArrayFreq {



   static int[] buildArray(int[] a,int p)
   {
         int[] c=new int[p];

   for(int k:a)
   {
      c[k-1]=c[k-1]+1;

   }

       // the switch case will be created dynamically

return c;
   }

static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

   public static void main(String[] args) {
      int[] inputArray={4,5,8,3,5,2,9,4,3,5,2,6};

      printArray(buildArray(inputArray,9));
   }

}
