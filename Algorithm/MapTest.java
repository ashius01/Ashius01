package Heima.Algorithm;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //创建Map对象,为键值对,其中左键(唯一)右值
        Map<String, String> map = new HashMap<>();
        //put方法添加成功时的返回值是null,覆盖时返回被覆盖的值
        map.put("01", "张三");
        map.put("02", "李四");
        map.put("03", "王五");
        //键一样时put方法会用新值覆盖旧值,并返回旧值
        //只是更新键值对的值,其他的没变
        System.out.println(map.put("03", "赵六"));

        //根据键删除对应的键值对
        //map.remove("03");

        //根据键获取值
        System.out.println(map.get("01"));

        //获取所有键的集合
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + ":" + map.get(key));
        }

        //获取所有值的集合
        Collection<String> values = map.values();
        for(String value : values){
            System.out.print(value + " ");
        }
        System.out.println();

        //获取所有键值对对象的集合,集合名为entrySets
        Set<Map.Entry<String,String>> entrySets = map.entrySet();
        //遍历所有键值对对象,拿出每一个对象中的键和值
        for(Map.Entry<String,String> entrySet : entrySets){
            System.out.println(entrySet.getKey() + ":" + entrySet.getValue());
        }
        //使用迭代器
        Iterator<Map.Entry<String,String>> iterator = entrySets.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entrySet = iterator.next();
            System.out.println(entrySet.getKey() + ":" + entrySet.getValue());
        }
        //lambad
        entrySets.forEach(entrySet -> System.out.println(entrySet.getKey() + ":" + entrySet.getValue()));

        System.out.println(map);
    }
}
