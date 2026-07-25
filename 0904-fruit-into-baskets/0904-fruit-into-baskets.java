class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<fruits.length;i++)
        {
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2)
            {
                int c=map.get(fruits[left]);
                if(c>1)
                {
                    map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
                }
                else
                {
                    map.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}