/*
If a string has equal number of every vowels in it, then it is voWstring.
Example "aioeu", "aeoui" "aaoouuiiee" , "usaeio", "", "d" are voWstrings.
Given a string of lowercase letters (a-z), output the non-empty voWstring substrings of the given
string.
*/
import java.util.*;



class Q4
{
    
    static boolean findvow(String sub) 
    {
        int n=sub.length();
   int a1=0,e1=0,i1=0,o1=0,u1=0;
        for(int i=0;i<n;i++)
        {
          if(sub.charAt(i)=='a') {
              a1++;
          } else if(sub.charAt(i)=='e') {
              e1++;
          } else if(sub.charAt(i)=='i') {
              i1++;
          } else if(sub.charAt(i)=='o') {
              o1++;
          } else if(sub.charAt(i)=='u') {
              u1++;
          }   
        }
        
        if(a1==e1 && e1==i1 && o1==u1)
        {
            return true;
        }else{
            return false;
        }
            
        
       
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String vow=sc.nextLine();
        String sub ="";
        String db="";
        ArrayList<String> finalone = new ArrayList<String>();
        int  k=0;
        boolean bool=false;
        
        for(int i=0;i<vow.length();i++)
        {
           
           
            if(vow.charAt(i)=='a'|| vow.charAt(i)=='e'|| vow.charAt(i)=='i'||vow.charAt(i)=='o'||vow.charAt(i)=='u')
            {
                sub=sub+vow.charAt(i);
            }
            else{
                if(sub.length()%5==0)
                {
                    String a=sub;
                    bool=findvow(sub);
                    if(bool==true){
                    if(k>0)
                    {
                       String b=db.concat(a);
                       finalone.add(b);
                       
                    }else{
                     finalone.add(a);   
                    }}
                    
                }
                else{
                    k=i;
                    db=sub;
                    if(k>k+1)
                    {
                        db="";
                        k=0;
                    }
                    sub="";
                    continue;
                }
            }
           
                
        }
        
        System.out.println(finalone);
        
       
    }
}