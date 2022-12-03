public class People {
    static String name, gender, colour;
    private static String age;



       public String getName() {
           return name;
       }

       public void setName(String name) {
           People.name = name;
       }

    public void setGender(String gender) {
           People.gender = gender;
    }

    public void setColour(String colour) {
        People.colour = colour;
    }

    public void setAge(String age) {
        People.age = age;
    }


    void display() {
           System.out.println(" Your name is " + People.name);
        System.out.println(" Your are  " + People.gender);
        System.out.println(" Your are " + People.age+ " years old and " + People.colour+ " in complexion");
    }

}
