class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int m = matrix[0].length;
        int n = matrix.length;

        int[] height = new int[m];
        int maxArea = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1') {
                    height[j]+=1;
                }else{
                    height[j]=0;
                }
            }
            maxArea = Math.max(maxArea,largestRectangleArea(height));
        }
        return maxArea;
    }
    public int largestRectangleArea(int[] height){
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int maxArea = 0;

        for(int i=0;i<=n;i++){
            int currheight = (i==n) ? 0:height[i];

            while(!stack.isEmpty() && currheight < height[stack.peek()]) {
                int heights = height[stack.pop()];
                int right = i;
                int left = stack.isEmpty() ? -1:stack.peek();

                int width = right - left - 1;
                maxArea = Math.max(maxArea,heights*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
