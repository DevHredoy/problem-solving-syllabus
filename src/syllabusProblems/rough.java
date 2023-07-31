package syllabusProblems;

public class rough {


    // the first method will find the right place for the pivot
    // then place the pivot in the place at the end of the function
    // this method shall return the position of the pivot
   static int findPosForPivot(int[] arr,int high,int low) {


        // the i initially will be less than low and j will be low initially
        //low=0 initially, once a number is less than pivot at first the i will
        //be increased then the position of i will be exchange with j.
        // after each iteration of for loop the value will be automatically increased
        // the condition is it would go toward pivot before index and not cross any more.
        //once j reaches side by side to pivot , the loop will end and it will return the posi
        // tion of the pivot
        //
        int pivot=arr[high-1];
        int i=low-1;


        for(int j=0;j<high-2;j++)
        {

            if(arr[j]<pivot)
            {
                i++;

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }



        }

           int var=arr[i+1];
        arr[i+1]=pivot;
        arr[arr.length-1]=var;

       return i+1;
    }


        //recursive function


   static void sortManager(int[] arr,int high,int low)
        {

            // at first it shall find the position of pivot by findposforpivot
            //then it will determine new high low and call findposforpivot
            // this method will be continued if low is lower than high.once not everything will be broken.
         //1.first it will determine the pivot by calling the function once


            //all the code will be inside a condition which is low<high

            int initPivotPosition=findPosForPivot(arr,high,low);
            if(low<high)
            {
                sortManager(arr,initPivotPosition-1,low);


            }



        }

       static    void printArray(int[] arr)
            {
                for(int i:arr)
                {
                    System.out.println(i);
                }

            }

    public static void main(String[] args) {

        int[] array=new int[]{34,5,83,5,56,8,99,12,45,67,72,2,190};
        sortManager(array,array.length-1,0);
        printArray(array);


    }


    }




}
