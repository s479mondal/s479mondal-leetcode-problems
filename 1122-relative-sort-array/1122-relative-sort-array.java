class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] a=new int[arr1.length];
        int k=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            while(map.containsKey(arr2[i]))
            {
                a[k++]=arr2[i];
                map.put(arr2[i],map.getOrDefault(arr2[i],0)-1);
                if(map.get(arr2[i])==0)
                {
                    map.remove(arr2[i]);
                }
            }
        }

        ArrayList<Integer> list=new ArrayList<>();

        for(int n:map.keySet())
        {
            int count=map.get(n);
            while(count>0)
            {
                list.add(n);
                count--;
            }
        }
        Collections.sort(list);
        for(int n:list)
        {
            a[k++]=n;
        }
        return a;
    }
}