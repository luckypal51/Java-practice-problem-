public class evennumber {
    public static void main(String[] args) {
        int [] arr ={1000,2,33,45,1};
        System.out.println(findeven(arr));
    }
    static int findeven(int[]arr){
       int count =0;
       for (int i : arr) {
        if (even(i)) {
            count++;
        }
       }
       return count;
    }
    // function to check wheathere the function contains even digits aur not
    static boolean even(int i){
        int check = count(i);
        if (check%2==0) {
            return true;
        }
        return false;
    }
    static int count(int i){
        if (i<0) {
            i = i*-1;
        }
        int value =0;
        while (i>0) {
            value++;
            i = i/10;
        }
        return value;
    }
}
