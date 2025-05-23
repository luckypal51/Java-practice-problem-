package Practice;

public class Luckydraw {
        public static void main(String[] args) {
            int [] arr = {3,2,1};
            System.out.println(Seq(arr));

        }
        public static int Seq(int[]arr){
            int max =0;
            for(int i =0;i< arr.length;i++){
                for(int j= arr.length-1;j>0;j--){
                    int temp = arr[0];
                    arr[0] = arr[j];
                    arr[j] = temp;
                }
//            System.out.println(Arrays.toString(arr));
                int sum =0;
                int pre =arr[0];
                int count =0;
                for(int j =1;j< arr.length;j++){
                    if(j== arr.length-1){
                        if(pre<arr[j]){
                            sum = sum+pre+arr[j];
                            count=count+2;
                        }
                        else{
                            sum =sum+pre;
                            count++;
                        }

                    }
                    else if(pre<arr[j]){
                        sum+=pre;
                        pre = arr[j];
                        count++;
                    }

                }
                max = Math.max(count,max);
            }
            return max;

        }
    }

