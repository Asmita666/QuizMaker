
package person;

public class Person {
     int age;
 double height;        
 String firstName;     
 String lastName;
 boolean Astudent;
public static void main(String[] args) {
     
        Person p = new Person();
        
 
         System.out.println("My name is"+ " " + p.firstName + " " + p.lastName);
         System.out.println("I am" + " " + p.age + " " + "years old and"+ " " + p.height +" "+ "inches tall" );

    }

    public Person() {
        this.age = 16;
        this.height = 63;
     boolean isAstudent; 
     isAstudent = true;
     this.firstName= "Asmita";
     this.lastName= "Jalote";
    }

//    private class myString {
//
//             
//    }
    
}
