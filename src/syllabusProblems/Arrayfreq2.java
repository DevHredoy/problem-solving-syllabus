package syllabusProblems;
import java.util.TreeSet;

/*Geek hosted a coding competition, some of the questions were easy and some of them were hard. You are given an array arr of positive integers of size N and an integer K, arr[i] represents the hardness of each problem of geeks' contest. Among those N numbers, your task is to find the numbers which appear more than K times and print them in increasing order. If no number appears more than K times then print -1.

        Example:

        Input:
        3
        3 1
        5 5 6
        6 1
        2 2 3 3 4 4
        4 2
        1 2 2 3

        Output:
        5
        2 3 4
        -1*/
public class Arrayfreq2 {



    static int[] buildArray(int[] a, int p, int maxNum)
    {
        int[] c=new int[p];

        for(int k:a)
        {   int f=k;
            c[f-1]=c[f-1]+1;

        }

        // the switch case will be created dynamically

        TreeSet<Integer> numbers=new TreeSet<>();




        for(int l=0;l<c.length;l++)
        {
            if(maxNum<c[l])
            {
               //in the line below we have to take the index of c array like c[i],take i then add one with i then adding in Treeset
                l=l+1;
                // this member will be pushed in the structure
                numbers.add(l);
                System.out.println(l);
            }

        }


        //int[] numbersArray=numbers.toArray(new int[numbers.size()]);
        // there is a scope to reduce the code block through
        int[] intArray = new int[numbers.size()];
        int index = 0;
        for (int num : numbers) {
            intArray[index++] = num; // Unboxing
        }
        return intArray;
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] inputArray={4,4,2,1,4,9,3,8,4,3};

        printArray(buildArray(inputArray,9,3));


    }

}
