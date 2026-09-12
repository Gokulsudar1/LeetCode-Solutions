class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n = arr.length;

        for(int i=0;i<n;i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]%2!=0 && arr[j+1]%2==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap =true;
                }
            }
            if(!swap) break;
        }
        return arr;
    }
}