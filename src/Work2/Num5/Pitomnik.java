package Work2.Num5;

public class Pitomnik {
    Dog[] dogs;
    Dog[] temp;
    int num = 0;
    public void addDog(Dog dog){
        temp = new Dog[num + 1];
        for (int i = 0; i < num; i++){
            temp[i] = dogs[i];
        }
        temp[num] = dog;
        dogs = temp;
        num++;
    }
}
