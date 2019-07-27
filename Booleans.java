
package booleans;

public class Booleans {
String s1;
String s2;
String s3;
boolean b1;
boolean b2;

   
    public static void main(String[] args) {
       String s1 = new String();
       String s2 = new String();
       String s3 = new String();
        
        int x,y;
        boolean a,b,c,d,e,f;
        x=5;
        y=2;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
       
         
       
       
            s1.equals(s2);
            s2.compareTo(s3);
            s3.compareTo(s1);
           
    } 
        //< means less than
        //> means greater than
        //== means equal
        //!= means not equal
        //>= means greater than or equal to 
        //<= means less than or equal to 
        
        public Booleans(){
            this.s1 = "Good morning!";
            this.s2 = "Hi there!";
            this.s3 = "Howdy, partner!";
            this.b1 = true;
            this.b2 = false;
            System.out.println("True and not true:" + (b1 &&!b1));
        }
        }
    
    
    
    

