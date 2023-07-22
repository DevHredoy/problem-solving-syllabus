package syllabusProblems;
// finding maximum and minimum element in an array
public class problem4 {

// finding maximum

  static int findmaxValue(int[] arr)
  {
// 3,5,6,89
  // untill the length of the array the
         for(int i=0;i<=arr.length-1;i++)
         {

             if(arr[i]>arr[i+1])
             {
                 int temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
             }


         }
              return arr[arr.length-1];

  }

    public static void main(String[] args) {
      int[] array=new int[]{3,77,13,30};
      System.out.println(findmaxValue(array));
    }



}
