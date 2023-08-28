 // Declaring the parent class of the "Inheritance" file.
 class Person {

 // Declaring the variables.    
    String name;
    String address;
    String phoneNumber;
    String email;

// Declaring the constructor of the parent class 
    public Person (String name, String address, String phoneNumber, String email) 
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
// This is used to return all instance variables declared in a single string. Therefore, all the variables I just declared will be presented
public String toString() {

    return "Name: " + name + " Address: " + address + " Number: " + phoneNumber + " Email: " + email;

}

 }
