package Work2.Num5;

public class Dog {
    private String name;
    private int age;
    Dog(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int convertAge(){
        return this.age * 7;
    }

    @Override
    public String toString() {
        return this.getName() + " " + Integer.toString(this.getAge());
    }
}
