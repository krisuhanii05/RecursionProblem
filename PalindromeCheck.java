public class PalindromeCheck{
    public static boolean check(String str){
        int start = 0;
        int end = str.length()-1;
        return checking(str , start , end);
    }
    public static boolean checking(String str , int start , int end){
        if(start>= end)return true;
        if(str.charAt(start)!= str.charAt(end))return false;
        return checking(str , start+1 , end -1);
    }
    public static void main(String[] args){
        System.out.println(check("Suhani"));
          System.out.println(check("mom"));
    }
} 