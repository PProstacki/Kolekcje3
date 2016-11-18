package kolekcje3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Kolekcje3 {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        long start = 0,end = 0, arrayTime = 0, linkedTime = 0;
        
        for(int i = 0;i < 100;i++){
         arrayList.add("Test prędkości");
         linkedList.add("Test prędkości");
        }
        
        start = System.nanoTime();
        arrayList.set(0, "Test prędkości");
        end = System.nanoTime();
        arrayTime = end - start;
        
        start = System.nanoTime();
        linkedList.set(0, "Test prędkości");
        end = System.nanoTime();
        linkedTime = end - start;
        
        System.out.print("Wstawianie na 1 pozycje listy:     ");
        comparison(arrayTime, linkedTime);
        
        
        
        start = System.nanoTime();
        arrayList.set(50, "Test prędkości");
        end = System.nanoTime();
        arrayTime = end - start;
        
        start = System.nanoTime();
        linkedList.set(50, "Test prędkości");
        end = System.nanoTime();
        linkedTime = end - start;
        
        System.out.print("Wstawianie na 50 pozycje listy ze 100 mozliwych:     ");
        comparison(arrayTime, linkedTime);
        
        
        
        start = System.nanoTime();
        arrayList.set(99, "Test prędkości");
        end = System.nanoTime();
        arrayTime = end - start;
        
        start = System.nanoTime();
        linkedList.set(99, "Test prędkości");
        end = System.nanoTime();
        linkedTime = end - start;
        
        System.out.print("Wstawianie na 100 pozycje listy ze 100 mozliwych:     ");
        comparison(arrayTime, linkedTime);
        
        
        
        start = System.nanoTime();
        arrayList.remove(0);
        end = System.nanoTime();
        arrayTime = end - start;
        
        start = System.nanoTime();
        linkedList.remove(0);
        end = System.nanoTime();
        linkedTime = end - start;
        
        System.out.print("Usuwanie elementu z 1 pozycji listy:     ");
        comparison(arrayTime, linkedTime);
        
        
        
        start = System.nanoTime();
        arrayList.remove(50);
        end = System.nanoTime();
        arrayTime = end - start;
        
        start = System.nanoTime();
        linkedList.remove(50);
        end = System.nanoTime();
        linkedTime = end - start;
        
        System.out.print("Usuwanie elementu z 50 pozycji listy ze 97 mozliwych:     ");
        comparison(arrayTime, linkedTime);
        
        
        
        start = System.nanoTime();
        arrayList.remove(97);
        end = System.nanoTime();
        arrayTime = end - start;
        
        start = System.nanoTime();
        linkedList.remove(97);
        end = System.nanoTime();
        linkedTime = end - start;
        
        System.out.print("Usuwanie elementu z 97 pozycji listy ze 97 mozliwych:     ");
        comparison(arrayTime, linkedTime);
        
        
        
        start = System.nanoTime();
        arrayList.get(0);
        end = System.nanoTime();
        arrayTime = end - start;
        
        start = System.nanoTime();
        linkedList.get(0);
        end = System.nanoTime();
        linkedTime = end - start;
        
        System.out.print("Zwrocenie elementu z 1 pozycji listy:     ");
        comparison(arrayTime, linkedTime);
        
        
        
        start = System.nanoTime();
        arrayList.get(50);
        end = System.nanoTime();
        arrayTime = end - start;
        
        start = System.nanoTime();
        linkedList.get(50);
        end = System.nanoTime();
        linkedTime = end - start;
        
        System.out.print("Zwrocenie elementu z 50 pozycji listy ze 96 mozliwych:     ");
        comparison(arrayTime, linkedTime);
        
        
        
        start = System.nanoTime();
        arrayList.get(96);
        end = System.nanoTime();
        arrayTime = end - start;
        
        start = System.nanoTime();
        linkedList.get(96);
        end = System.nanoTime();
        linkedTime = end - start;
        
        System.out.print("Zwrocenie elementu z 96 pozycji listy ze 96 mozliwych:     ");
        comparison(arrayTime, linkedTime);
        
    }
    
    static void comparison(long arrayTime, long linkedTime){
        if(arrayTime > linkedTime){
            System.out.println("LinkedList jest szybsze o " + (arrayTime - linkedTime + " nanosekund"));
        }else if(linkedTime > arrayTime){
            System.out.println("ArrayList jest szybsze o " + (linkedTime - arrayTime) + " nanosekund");
        }else if(arrayTime == linkedTime){
            System.out.println("Remis!!!");
        }
    }
}
