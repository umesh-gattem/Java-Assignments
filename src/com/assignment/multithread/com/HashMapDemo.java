package com.assignment.multithread.com;

import java.util.*;

public class HashMapDemo {
   public static void main(String args[]) {
   // create hash map
   HashMap<Integer, String> newmap = new HashMap<Integer, String>();      
      
   // populate hash map
   newmap.put(1, "tutorials");
   newmap.put(2, "point");
   newmap.put(3, "is best");
   newmap.put(1, "waste");
   newmap.size();

      
   System.out.println("Size of the map: "+ newmap.size());
   }    
}