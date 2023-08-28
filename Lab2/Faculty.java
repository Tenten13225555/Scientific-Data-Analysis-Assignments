// This is declaring the child class to "Person".
class Faculty extends Person {

    String rank;
// This is storing instances under the "rank" string.
    
   

// Declaring the constructor of the sub class 
   public Faculty (String name, String address, String phoneNumber,String email, String rank) {

    // The constructor that is a child of the parent class person must call super 
    super(name, address, phoneNumber, email);

    this.rank = rank;
   }

// This is returning the instance variables, including the ones from the parent clas
   public String toString() {
    
// returning the elements of the parent class and child class.
    return super.toString() + " Rank: " + rank;
}

} 