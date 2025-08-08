package Heima.Algorithm;

public class Tobinarystring {
    public static void main(String[] args) {
        String binaryString = tobinarystring(123);
        System.out.println(binaryString);
    }
    public static String tobinarystring(int number){
        StringBuilder sb = new StringBuilder();
        while(true){
            if(number == 0){
                break;
            }
            int remainder = number % 2;
            //每次插入的新数据都在第一位,实现倒序放置
            sb.insert(0, remainder);//前者指定插入的索引位置,后者指定插入的数据
            number /= 2;
        }
        return sb.toString();
    }
}
