import java.util.*;
public class CeaserCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();          
        int position= sc.nextInt() % 26;
        
        int len=s.length();
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            
            if(Character.isLowerCase(ch)){
                if(ch + position > 'z'){
                    ans.append((char)(ch + position - 26));
                }else{
                    ans.append((char)(ch + position));
                }
            }
            else if(Character.isUpperCase(ch)){
                if(ch + position > 'Z'){
                    ans.append((char)(ch + position - 26));
                }else{
                    ans.append((char)(ch + position));
                }
            }
            
        }
        
        System.out.print(ans);
    }
}
