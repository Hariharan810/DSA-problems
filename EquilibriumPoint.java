class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        int leftSum=0;
        int rightSum=0;
        
        for(int i=0;i<n;i++){
            rightSum+=arr[i];
        }
        for(int j=0;j<n;j++){
            rightSum-=arr[j];
            if(leftSum==rightSum){
                return j+1;
            }
            leftSum+=arr[j];
        }
        return -1;
    }
}
