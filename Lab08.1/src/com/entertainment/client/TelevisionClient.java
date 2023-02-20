/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionClient {
  
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 65, DisplayType.LED);
        System.out.println(tv);

        System.out.println(tv.getCurrentChannel());
        tv.changeChannel("bananaPants");
        System.out.println(tv.getCurrentChannel());

        
        System.out.println(tv);
    }
}