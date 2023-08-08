package syllabusProblems;

public class TwoDArrDemo {
    static void printArray(int[][] arr)
    {

        for(int[] a:arr)
        {
            for(int b:a)

            {
                System.out.println(b);


            }

        }




    }



    //sum of each the array


    static void modifiedArr(int[][] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[j].length;j++)

            {
               if(1<=j)
               {    int word=arr[j];
                   arr[j]=arr[j-1]+arr[j];


               }


            }

        }




    }






    public static void main(String[] args) {


        int[][] z=new int[][]{{11,22,33,44},{11,22,33,44}};
        printArray(z);

    }





}
