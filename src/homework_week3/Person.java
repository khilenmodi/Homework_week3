package homework_week3;

/**
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 */

public class Person {

        String FirstName;
        String LastName ;
        int Age ;
        public String getFirstName(){

            return FirstName;
        }
        public String getLastName(){

            return LastName;
        }
        public int getAge(){

            return Age;
        }
        public void setFirstName(String firstName ){
            this.FirstName = firstName;
            //FirstName = "John";
        }
        public void setLastName (String lastName){

            this.LastName = lastName;
           // LastName = "smith";
        }
        public void setAge (int age){
            if (age>0 && age<=100){
                this.Age = age;
            }else {
                this.Age=0;
            }
        }
        public boolean isTeen (){
            if (Age >12 && Age <20){
                return true;
            }else {
                return false;
            }
        }
        public String getFullName (){
            FirstName = "John";
            LastName = "smith";
            if (FirstName.isEmpty()) {
                return LastName;
            } else if (FirstName.isEmpty() || LastName.isEmpty()) {
                return "  ";

            }else {
                return FirstName + " " + LastName;
            }
        }

    public static void main(String[] args) {
        Person person = new Person();
        person.getFirstName();
        person.getLastName();
        person.getAge();
        System.out.println("FullName = ");
        System.out.println("Teen  = " + person.isTeen());
        person.setFirstName("john");
        person.setAge(18);
        System.out.println("Full name = "+person.getFirstName());
        System.out.println("Teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("Full Name  =" + person.getFullName());
        }

    }



