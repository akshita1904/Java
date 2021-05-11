import java.util.*;
class TheFind
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        String w="";
        int c=0;
        for(int i=0; i<s.length(); i++){
            while(s.charAt(i)!=' '){
                w+=s.charAt(i);
                i++;
                if(w.equalsIgnoreCase("The")){
                    ++c;
                }
                if(i>=s.length()){
                    break;
                }
            }
            if(w.equalsIgnoreCase("The")){
                ++c;
            }
            w="";
        }
        System.out.println("There are "+c+" THE's in the sentence entered");
    }
}