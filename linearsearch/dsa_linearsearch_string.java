import java.util.Arrays;

public class dsa_linearsearch_string {
//linear search in the string arays;
    public static void main(String[] args) {
        String name = "Lucky";
        char target = 'c';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));//converting string into array  
    }
    static boolean search(String name,char target){
        if (name.length()==0) {
            return false;
        }
      else{
        for (int i = 0; i < name.length(); i++) {
           if(target== name.charAt(i)){
            return true;
           }
      
        }
      }
        return false;
    }
    
    static boolean search2(String name , char target){

    if(name.length()==0){
        return false;
    }
    for(char ch : name.toCharArray()){//for each loop runing
        if (ch==target) {
            return true;
        }
    }
    return false;}
}