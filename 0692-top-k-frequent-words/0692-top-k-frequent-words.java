class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(String s:words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->
            {
                if(map.get(a).equals(map.get(b)))
                {
                    return b.compareTo(a);
                }
                return (map.get(a)-map.get(b));
            }
        );

        for(String n:map.keySet())
        {
            pq.offer(n);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        for(int i=0;i<k;i++)
        {
            list.add(pq.poll());
        }
        Collections.reverse(list);
        return list;
    }
}