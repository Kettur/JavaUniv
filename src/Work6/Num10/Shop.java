package Work6.Num10;

public class Shop {
    Computer[] computers;
    Computer[] temp;
    int num = 0;
    public void addPC(Computer pc){
        temp = new Computer[num+1];
        for (int i = 0; i < num; i++){
            temp[i] = computers[i];
        }
        temp[num] = pc;
        computers = temp;
        num++;
    }
    public void delPC(String name){
        int pos = findPC(name);
        if (pos == -1) return;
        temp = new Computer[num-1];
        for (int i = 0; i < pos; i++){
            temp[i] = computers[i];
        }
        for (int i = pos + 1; i < num; i++){
            temp[i-1] = computers[i];
        }
        computers = temp;
        num--;
    }
    public int findPC(String name){
        for (int i = 0; i < num; i++){
            if (computers[i].getName().equals(name)) return i;
        }
        return -1;
    }
}
