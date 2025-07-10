package classes;

import java.util.Arrays;

class IpAddress {
    public static void main(String[] args) {
        System.out.println(checkIp("172.0.0.0"));
    }
    public static boolean checkIp(String s){
        String[] arr = s.split("\\.");
        if (arr.length<4){
            return false;
        }
        System.out.println(Arrays.toString(arr));
        for(String a:arr){
            System.out.println(a.charAt(0));
            if(a.length()>1&& a.charAt(0)=='0'){
                  return false;
                }
             else{
                int x =Integer.parseInt(a);
                if(x<0||x>255){
                    return false;}
            }
        }
        return true;
    }
}
