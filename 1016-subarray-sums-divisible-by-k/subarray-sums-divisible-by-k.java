class Solution {
    public int subarraysDivByK(int[] nums, int k) {
          HashMap<Integer, Integer> map = new HashMap<>();    
    map.put(0,1);
    int n=nums.length;
    int sum=0;
    int count=0;
    for(int num:nums){
        sum = sum+num;
        int rem=sum%k;
        if(rem < 0){
    rem += k;
}
    if (map.containsKey(rem)){
        count=count+map.get(rem);
    }
   map.put(rem,map.getOrDefault(rem,0)+1);
    }


return count;
}
}