package syllabusProblems;

public class rough {

    public static void main(String[] args) {
        int[] list=new int[10];
        for(int i=0;i<6;i++)
        {
            list[i]=i+2;


        }





        System.out.println(list.length);


        for(int i=0;i<list.length;i++)
        {

            if(list[i]==0)
            {
                System.out.println("non zero elements are present" +
                        " untill "+(i-1));
                break;

            }


        }
    }




    }





