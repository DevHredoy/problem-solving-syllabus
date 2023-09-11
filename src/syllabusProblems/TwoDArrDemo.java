package syllabusProblems;
////✔✔
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
            for(int j=0;j<arr[i].length;j++)

            {
               if(1<=j)
               {
                   arr[i][j]=arr[i][j-1]+arr[i][j];
                   System.out.println(arr[i][j]);

               }
                 else{
                   System.out.println(arr[i][j]);

               }

            }

        }




    }






    public static void main(String[] args) {


        int[][] z=new int[][]{{11,22,33,44},{11,22,33,44}};
        modifiedArr(z);

    }





}
