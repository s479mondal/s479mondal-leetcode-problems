class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] a=strs[i].toCharArray();
            Arrays.sort(a);
            String s=new String(a);
            if(!map.containsKey(s))
            {
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}