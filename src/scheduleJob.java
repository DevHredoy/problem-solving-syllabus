import java.sql.SQLOutput;

public class scheduleJob {
// this program will be able to work if the slots are sorted based on which slot will end earlier that will come first in the array.

    static int  findTotalNumberofJobs(int[] a,int[] b){
        int totalSchedules=1;



        boolean flag=true;


        // if we find a new schdule which is not over lapping then i will be that elements index means i=j,no of job++
        //if a schedule overlap s j++
        int i=0;
        int j=1;

        System.out.println(" from " +a[i]+
                "to" +
                b[i]);


        while(flag)
        {
            if(i==a.length || j==a.length)
            {
                break;


            }


            if(b[j]-b[i]>b[j]-a[j])
            {
                //not overlaping


                System.out.println(" from " +a[i]+
                        "to" +
                        b[i]);

                totalSchedules++;
                i=j;

                System.out.println("now i is :"+i);
                System.out.println("newly added slot is "+a[j]+"-"+b[j]);
                j++;

                System.out.println("and j is :"+j);
                System.out.println(totalSchedules);


            }
            else{

                j++;
            }




        }
        return totalSchedules;
    }

    public static void main(String[] args) {


        int[] startingTimes=new int[]{4,1,7,12,15};
        int[] endingTimes=new int[] {6,13,13,14,19};


        System.out.println(findTotalNumberofJobs(startingTimes,endingTimes));




    }
}
