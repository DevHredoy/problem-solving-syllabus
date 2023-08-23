package syllabusProblems;

public class MaxMeeting {




    // a two dimentional array will be taken
    // shall sort the array in terms of the ascending order of ending time

    static int[][] sort2DArray(int[][] a)
    {

        for(int g=1;g<=a.length;g++)
        {

            for(int h=1;h<=a.length-g;h++)
            {
                if(a[g-1][1]>a[g][1])
                {
                    int temp=a[g-1][1];
                    a[g-1][1]=a[g][1];
                    a[g][1]=temp;

                }


            }

        }
        return a;
    }


   static void print2dArray(int[][] ar)
   {
       for(int[] g:ar)
       {
           for(int f:g)
           {

               System.out.println(f);
           }

       }


   }


    public static void main(String[] args) {
        int[][] b=new int[][]{{7,4,2},{8,5,3}};
        print2dArray(sort2DArray(b));

    }


}
