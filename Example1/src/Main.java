import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static  int[] twoSum(int[] nums,int target){
        int[] newArray=new int[2];
        for(int i=0;i< nums.length-1;i++){
                if(nums[i]+nums[i+1]==target) {
                    newArray[0] = i;
                    newArray[1] = i+1;
                    return newArray; //break;
                }
        }
  return newArray;
    }

    public static List<Integer> twoSum2(int[] nums,int target){
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


    public static void main(String[] args) {

     int[] a={2,5,6,1};

        System.out.println(Arrays.toString(twoSum(a,7)));
        System.out.println((twoSum2(a,7)));
        System.out.println(Arrays.toString(twoSum3(a,7)));

    }
}
