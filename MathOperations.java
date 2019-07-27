package mathoperations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u,d,z;
          double a,b,c,h,j,y,w;
          String first, second, together;
 
          p = 8;
          q = 25;
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
         d = p -= 2;
         System.out.println( "p -= 2 is " + d);
         z = q += 2;
         System.out.println("q += 2 is " + z);
         
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         h = a * 3;
         System.out.println("a/3 is" + h );
         j = h / 4;
         System.out.println("h/4 is " +j);
         y = j * 6;
         System.out.println("j*6 is " +y);
         w = y / 2;
         System.out.println("y/2 is " + w );
         System.out.println();

         first = "peanut butter";
         second = " and jelly";
         together = first + second;
         System.out.println( together );
     }
}