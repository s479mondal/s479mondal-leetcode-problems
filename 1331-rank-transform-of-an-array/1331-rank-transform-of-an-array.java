class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        Arrays.sort(a);
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i],count++);    
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            a[i]=map.get(arr[i]);
        }
        return a;
    }
}