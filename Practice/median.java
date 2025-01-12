package Practice;

public class median {
    public static void main(String[] args) {
        int []nums1 ={1,2};
        int []nums2 ={3,4};
        int  n = nums1.length;
        int m = nums2.length;
      int []arr=new int[m+n];
      float count=0;
      float med =0f;
      int f = 0;
      int s =0;
      int t =0;
      while(f<n&&s<m){
        if(nums1[f]<nums2[s]){
            arr[t++]= nums1[f++];
        }
        else{
            arr[t++] = nums2[s++];
        }
      }  
      while(f<n){
        arr[t++] = nums1[f++];
      }
      while(s<m){
        arr[t++] = nums2[s++];
      }
      for(int i=0 ;i<m+n;i++){
        count +=arr[i];
      }
      med = count/(n+m);
      System.out.println(med);
    }
}
