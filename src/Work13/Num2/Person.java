package Work13.Num2;

public class Person {
    String name ="";
    String surname="";
    String patronymic="";
    Person(String surname){
        this.surname = surname;
    }
    Person(String name, String surname){
        this(surname);
        this.name = name;
    }
    Person(String name, String surname, String patronymic){
        this(name, surname);
        this.patronymic = patronymic;
    }
    public void out(){
        System.out.println(name + " " + surname + " " + patronymic);
    }
}
