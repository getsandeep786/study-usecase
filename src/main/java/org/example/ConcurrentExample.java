package org.example;

public class ConcurrentExample extends AbstractClassExample {

    public static void main(String ar[]) {
//        Map<Integer, String> mp = new HashMap<>();
//        mp.put(1, null);
//        mp.put(2, "two");
//        mp.put(3, "three");
//        Iterator<Integer> it1 = mp.keySet().iterator();
//        while(it1.hasNext()){
//            Integer key = it1.next();
//            mp.put(3, "five");
//        }
        ConcurrentExample com1 = new ConcurrentExample();
        com1.SandeepCheck();
    }


    @Override
    void log() {

    }
}
