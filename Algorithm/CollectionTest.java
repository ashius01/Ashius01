package Heima.Algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("javaee");

        //获取迭代器对象it,此指针默认指向0索引
        Iterator<String> it = c.iterator();
        //判断是否含有元素
         while (it.hasNext()) {
            //获取元素后移动指针,此next方法一次循环使用一次
            String s = it.next();
            if("java".equals(s)){
                //移除此时指向的元素
                it.remove();
                continue;
            }
            System.out.println(s);
        }
         //迭代器遍历时不能用集合的方法删除或者修改元素
         //迭代器遍历完毕后指针不会复位

        //增强for遍历
        //格式 : for(集合/数组中元素的数据类型 变量名 : 集合/数组名)
        for(String s : c){
            System.out.println(s);
        }

        //lambda表达式遍历
        c.forEach(s -> System.out.println(s));

    }
}
