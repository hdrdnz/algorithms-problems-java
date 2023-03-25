import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    /**
     *  twosum ():Dizinin  içerisindeki iki elemanın toplamının verilen target değerine  eşit olma durumuna bakar.
     *
     *
     *
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]+nums[i+1]==target){
                result[0] = i;
                result[1] =i+1;
                break;
            }
        }
        return result;
    }

    /**
     *  twosum2 ():Listenin içerisindeki iki elemanın toplamının verilen target değerine  eşit olma durumuna bakar ve geriye liste döndürür.
     *
     *
     *
     */
    public static List<Integer> twoSum2(int[] nums, int target){
        List<Integer> newArray=new ArrayList<>();
        int a=nums.length;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(nums[i]+nums[j]==target){
                    newArray.add(i);
                    newArray.add(j);

                }
            }
            break;
        }
        return newArray;
    }

    /**
     *  twosum3 ():Dizinin içerisindeki  sondan iki elemanın toplamının verilen target değerine  eşit olma durumuna bakar ve geriye liste döndürür.
     *
     *
     *
     */
    public static int[] twoSum3(int[] nums,int target){
        int[] newArray=new int[2];
        int a=nums.length-1;
        for(int i=a;i>=0;i--){
            for(int j=a-1;j>=0;j--){
                if(nums[i]+nums[j]==target){
                    newArray[0]=j;
                    newArray[1]=i;
                }

            }
            break;
        }
        return newArray;
    }
}
