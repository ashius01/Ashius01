package Heima.Algorithm;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {
    }
    public static<E> void addAll(ArrayList<E> list, E...e){
        for(E element : e){
            list.add(element);
        }
    }
}
