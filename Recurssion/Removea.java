package Recurssion;

public class Removea {
    public static void main(String[] args) {
        String s = "apple is nonfriendly as  non app";
        String skip ="non";
        String not = "nonfriendly";
        System.out.println(skip3(s,skip,not));

    }
    public static String Helper(String s){
        return Set2(s,0).toString();
    }
    public static StringBuilder Set(String s,StringBuilder str,int i){
        if(i>=s.length()){
            return str;
        }
        if(s.charAt(i)!='a'){
            str.append(s.charAt(i));
        }
        return Set(s,str,i+1);
    }
    public static StringBuilder Set2(String s,int i){
        StringBuilder str = new StringBuilder();
        if(i>=s.length()){
            return str;
        }
        if(s.charAt(i)!='a'){
           str.append(s.charAt(i));

        }
        str.append(Set2(s,i+1));

        return str;
    }

    public static String SkipSen(String s,String skip,int i){
      if(i>=s.length()-skip.length()){
          return s.substring(i,i+skip.length());
      }
      String c =s.substring(i,i+skip.length());
      if(!c.equals(skip)){
          return s.charAt(i)+""+SkipSen(s,skip,i+1);
      }
      else{
          return SkipSen(s,skip,i+skip.length());
      }
    }
    public static String skip2(String s,String skip){
        if(s.length()<skip.length()){
            if(s.substring(0).equals(skip)){
                return "";
            }else{
                return s.substring(0);
            }

        }
        String ans = s.substring(0,skip.length());
        if(!ans.equals(skip)){
            return s.charAt(0)+""+skip2(s.substring(1),skip);
        }
        else {
            return skip2(s.substring(skip.length()),skip);
        }
    }
    public static String skip3(String s, String skip,String notSkip){
        if(s.length()<=skip.length()){
            if(s.substring(0,skip.length()).equals(skip)){

                    return s.substring(skip.length());
            }else{
                return s;
            }
        }
        if(!s.startsWith(notSkip)){
            if(s.substring(0,skip.length()).equals(skip)){
                return skip3(s.substring(skip.length()),skip,notSkip);
            }
        }
            return s.charAt(0)+""+skip3(s.substring(1),skip,notSkip);

    }
}
