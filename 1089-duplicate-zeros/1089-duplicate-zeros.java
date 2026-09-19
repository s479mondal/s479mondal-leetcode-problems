class Solution {
    public void duplicateZeros(int[] arr) {
        int i=0;
        int zero=0;
        int n=arr.length;
        while(i<n && zero<n)
        {
            zero+=(arr[i]==0 ? 2 :1);
            i++;
        }
        int read=i-1;
        int write=n-1;
        if(arr[read]==0 && zero>n)
        {
            arr[write]=arr[read];
            read--;
            write--;
        }
        while(read>=0)
        {
            arr[write]=arr[read];
            write--;
            if(arr[read]==0)
            {
                arr[write]=0;
                write--;
            }
            read--;
        }
    }
}