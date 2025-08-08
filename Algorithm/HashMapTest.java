package Heima.Algorithm;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //创建HashMap对象
        //键位置是自定义对象时需要重写hashCode()和equals()方法
        HashMap<Student,String> hashMap = new HashMap<>();
        //创建Student对象
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 20);
        Student s3 = new Student("wangwu", 19);
        //添加键值对到HashMap对象中
        hashMap.put(s1, "北京");
        hashMap.put(s2, "湖北");
        hashMap.put(s3, "上海");
        //将所有键值对对象放入Set集合中
        Set<HashMap.Entry<Student, String>> entrySet = hashMap.entrySet();
        for(HashMap.Entry<Student, String> entry : entrySet){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
