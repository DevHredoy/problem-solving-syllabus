package syllabusProblems;

////✔✔


//sum up until n
public class SumOfDigits {
    // in this block the main function



   // first approach is calling the function and the return statement in different
    //statement
    static int returnSum(int n)
    {
        if(n==1)
            return n;

        else {

       int sum=n+returnSum(n-1);
          return sum;
        }
    }

   // sum(n)=n+sum(n-1)





    // approach 2:
  /*  static int sumOfDigits(int n)
    {
        if(n==1)
            return n;

        else {

            return n+sumOfDigits(n-1);
        }




    }
*/
    public static void main(String[] args) {
       // code for second approach
       /* int input=4;
        int output=sumOfDigits(input);

        System.out.println(output);*/


        // code for first approach
        int input=3;
        int output=returnSum(3);
        System.out.println(output);


    }


}
