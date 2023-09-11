package Work2.Num4;

public class Shop {
    String[] komputers;
    String[] temp;
    int num = 0;
    public void addPC(String str){
        temp = new String[num+1];
        for (int i = 0; i < num; i++){
            temp[i] = komputers[i];
        }
        temp[num] = str;
        komputers = temp;
        num++;
    }
    public void delPC(String name){
        int pos = findPC(name);
        if (pos == -1) return;
        temp = new String[num-1];
        for (int i = 0; i < pos; i++){
            temp[i] = komputers[i];
        }
        for (int i = pos + 1; i < num; i++){
            temp[i-1] = komputers[i];
        }
        komputers = temp;
        num--;
    }
    public int findPC(String name){
        for (int i = 0; i < num; i++){
            if (komputers[i].equals(name)) return i;
        }
        return -1;
    }
}
