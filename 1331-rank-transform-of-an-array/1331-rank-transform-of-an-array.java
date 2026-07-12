class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a=new int[arr.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
        }
        Arrays.sort(a);
        int x=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i],x++);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            a[i]=map.get(arr[i]);
        }

        return a;
    }
}