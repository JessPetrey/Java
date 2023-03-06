public class CafeUtil {

    public int getStreakGoal() {
        //  get the sum of ints 1-10 : should result in 55
        int sum = 0;
        int count = 1;
        // while loop adds the ints together, using vars above
        while(count <= 10){
            // System.out.println("count :"+count);
            sum += count;
            // System.out.println("Sum : "+sum);
            count++;
        }
        return sum;
    }

    // 

}