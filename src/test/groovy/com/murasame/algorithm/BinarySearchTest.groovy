package com.murasame.algorithm

import org.junit.Test
import org.junit.rules.Stopwatch

class BinarySearchTest {

    BinarySearch bs = new BinarySearch()

    @Test
    void binarySearchWithHundred() {
        List subject = randomArray(1000)
        int selectedIndex = Math.random() * 999
        int selectedSubject = subject.get(selectedIndex)

        subject.sort()

        println(subject)

        println(selectedSubject)

        int foundSubject = bs.findElementInArray(selectedSubject, subject)

        assert selectedSubject == foundSubject

    }

    private List randomArray(int n) {

        List list = []

        for (int i=1; i<n; i++) {
            list.add(new Integer(i))
        }


        return list

    }

}
