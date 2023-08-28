public class Driver {

    public static void main (String args[]) 

    { 
        Person persons[] = new Person[] {
            new Student("Steve Jobs", "71 Simcoe Road", "111-111-1111", "steve@uoit.ca", "Freshman"), 
            new Student("BilL Gates", "100 College Creek", "111-121-1221", "bill@uoit.ca", "Sophomore"), 
            new Student("Elon Musk", "120 Simcoe Avenue", "786-111-7789", "elon@uoit.ca", "Freshman"), 
            new Student("Mark Wood", "2041 Davis Drive", "888-121-4111", "mark@uoit.ca", "Jnuior"), 
            new Student("Jack Ma", "68 Markham Road", "333-111-4444", "jack@uoit.ca", "Senior"), 
            new Student("Muhammad Khan", "29 Richmod Crescent", "111-000-2511", "muhammad@uoit.ca", "Freshman"), 
            new Student("Aleena Shah", "51 Simcoe Road", "666-777-8888", "aleena@uoit.ca", "Senior"), 
            new Student("Shakira Kin", "29 Toronto Road", "888-111-7771", "shakira@uoit.ca", "Junior"), 
            new Student("Laura Tim", "100 Prince Road", "999-000-1111", "laura@uoit.ca", "Freshman"), 
            new Faculty("Jasson Wood", "Davis Drive", "121-000-2222", "jasson@uoit.ca", "Assistant Professor"), 
            new Faculty("Tim David", "81 Toronto Yard", "121-222-8882", "tim@uoit.ca", "Associate Professor"), 
            new Faculty("Louis James", "131 James Avenue", "444-5552-4522", "louis@uoit.ca", "Assistant Professor"), 
            new Faculty("Tony Greg", "3331 King Avenue", "662-111-2999", "tony@uoit.ca", "Professor"), 
            new Faculty("Lizzy King", "881 Wilson Street", "777-666-0000", "lizzy@uoit.ca", "Associate Professor"), 
            new Faculty("Paula James", "101 Golden Road", "777-111-2000", "paula@uoit.ca", "Professor") 
        
        };

        display(persons); 
        getCount(persons); 
    }

 // Creating a for-loop to print out variables that match the toString from the Person class
    public static void display(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
    } 

    public static void getCount(Person[] persons) {
    // initialize variables of the Faculty and Student arrays
        int studentCount = 0;
        int facultyCount = 0;
    // Creating an additional for-loop to count the arrays in the Student and faculty arrays
           for (int i = 0; i < persons.length; i++) {
                if (persons[i].getClass() != Student.class) {
                    facultyCount++;
                } else {
                    studentCount++;
                }
           }
    // print Student count and Faculty count
           System.out.printf("Student Count: %d\nFaculty Count: %d", studentCount, facultyCount);
    }
}
    


    
     

