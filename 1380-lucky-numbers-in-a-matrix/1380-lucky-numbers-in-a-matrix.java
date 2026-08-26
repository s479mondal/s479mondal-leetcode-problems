class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int minRow=Integer.MAX_VALUE;
        int maxCol=Integer.MIN_VALUE;
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            minRow=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                minRow=Math.min(minRow,matrix[i][j]);
            }
            System.out.print(minRow);
            set.add(minRow);
        }
        int ans=0;
        for(int i=0;i<matrix[0].length;i++)
        {
            maxCol=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++)
            {
                maxCol=Math.max(maxCol,matrix[j][i]);
            }
            System.out.print(maxCol);
            if(set.contains(maxCol))
            {
                list.add(maxCol);
            }
        }
        return list;
    }
}