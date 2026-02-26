package Arrayssss;

public class KadaneAlgo {
    public static void Kadanes(int[]nums){
        int CurrSum = 0;
        int Max=Integer.MIN_VALUE;
         
        for(int i=0;i<nums.length;i++){
            CurrSum=CurrSum+nums[i];
            //now if the value is negative then we will consider the value as 0
            if(CurrSum<0){
                CurrSum=0;
            }
            
            Max=Math.max(Max,CurrSum);
        }
        System.out.println("The maximum subarray is : "+Max);
    }
    public static void main(String[]args){
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
                Kadanes(nums);
           
       }
}
