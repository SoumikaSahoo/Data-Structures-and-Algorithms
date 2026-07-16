class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd=nums[0];
        for(int num:nums){
            gcd=gcd(num,gcd);
        
        if(gcd==1){
            return true;
        }
        }
        return false;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}