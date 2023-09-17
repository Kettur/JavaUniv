package Work7.Num5;

public class StringWork implements strWork{
    @Override
    public int countCh(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.toCharArray()[i] != ' '){
                c++;
            }
        }
        return c;
    }

    @Override
    public void strOut(String str) {
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.toCharArray()[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String reverse(String str) {
        String temp = "";
        for (int i = str.length() -1 ; i >= 0; i--){
            temp += str.toCharArray()[i];
        }
        str = temp;
        return temp;
    }
}
