class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        if(n==1)
        {
            list.add(String.valueOf(1));
            return list;
        }
        if(n>=2)
        {
            list.add(String.valueOf(1));
            list.add(String.valueOf(2));
        }
        
        for(int i=3;i<=n;i++)
        {
            
            if(i%3==0 && i%5==0)
            {
                list.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                list.add("Fizz");
            }
            else if(i%5==0)
            {
                list.add("Buzz");
            }
            else
            {
                list.add(String.valueOf(i));
            }
        } 
        return list;
    }
}