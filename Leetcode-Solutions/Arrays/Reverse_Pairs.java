class Solution {
    public static int count=0;
    static void merge(int[] arr,int l,int mid,int right){
        int j=mid+1;

        for(int i=l;i<=mid;i++){
            while(j<=right && (long)arr[i] > 2L*arr[j]){
                j++;
            }

            count+=(j-(mid+1));
        }


        int p1=l;
        int p2=mid+1;

        List<Integer> list=new ArrayList<>();

        while(p1<=mid && p2<=right){
            if(arr[p1]<=arr[p2]){
                list.add(arr[p1]);
                p1++;
            }
            else if(arr[p1]>arr[p2]){
                list.add(arr[p2]);
                p2++;
            }
        }

        while(p1<=mid){
            list.add(arr[p1]);
            p1++;
        }
        while(p2<=right){
            list.add(arr[p2]);
            p2++;
        }

        for(int i=l;i<=right;i++){
            arr[i]=list.get(i-l);
        }
    }
    static void Mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            Mergesort(arr,l,mid);
            Mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public int reversePairs(int[] nums) {
        count=0;
        Mergesort(nums,0,nums.length-1);
        return count;
    }
}
