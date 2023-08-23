package syllabusProblems;

public class rough {

   //  arrayProb5
static int[]  modifyList(int[] array)


    {

        int[] newArray=new int[array.length];
        int maxNumber=12222333;
        int levelOfNum=0;




             int u=0;
                      for(int j=0;j<array.length;j++) {
                          int assumedsmall=maxNumber;
                          for (int i = 0; i < array.length; i++) {
                              if (array[i] < assumedsmall) {

                                  assumedsmall = array[i];
                                    u=i;
                              }

                          }
                          newArray[u] = levelOfNum;
                          array[u] = maxNumber;
                          levelOfNum++;

                          //in u position levelOfNumbersvalue will be place
                          // the lowest will be replaced with maxnumber
                          //the level will be incremented by one
                      }
   return newArray;

    }






    static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

    public static void main(String[] args) {


            int[] array=new int[]{11,1,56,8,19,60,20};
             printArray(modifyList(array));







    }
    }





