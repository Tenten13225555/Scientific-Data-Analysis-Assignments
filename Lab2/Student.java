// This is declaring the child class to "Person".
class Student extends Person {

    String status;

// This is storing instances under the "rank" string.
    

// Declaring the constructor of the sub class 
   public Student (String name, String address, String phoneNumber, String email, String status)
    {
// The constructor that is a child of the parent class person must call super 
    super(name, address, phoneNumber, email);
    
this.status = status;    }

//    This is returning the instance variables, including the ones from the parent class
 
public String toString () {

// returning the elements of the parent class and child class.
return super.toString() + status; 
}
}


