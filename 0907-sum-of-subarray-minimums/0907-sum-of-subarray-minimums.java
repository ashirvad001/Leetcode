class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int n=arr.length;
        long mod=1000000007;

        int pse[]=new int[n];
        int nse[]=new int[n];

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=stack.peek();
            }
            stack.push(i);
        }
        stack.clear();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
          }
            if(stack.isEmpty()){
                nse[i]=n;
            }else{
                nse[i]=stack.peek();
            }
            stack.push(i);
    }
    long ans=0;

    for(int i=0;i<n;i++){
        long left=i-pse[i];
        long right=nse[i]-i;

        ans=(ans+(arr[i]*left*right)%mod)%mod;
    }
    return (int) ans;
}
}