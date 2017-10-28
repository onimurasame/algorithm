package com.murasame.algorithm

import org.junit.Test
import org.junit.rules.Stopwatch

class BinarySearchTest {

    BinarySearch bs = new BinarySearch()

    @Test
    void binarySearchTestWithRandom() {
        List subjects = randomArray(1000)
        int selectedIndex = Math.random() * 999
        int selectedSubject = subjects.get(selectedIndex)

        subjects.sort()

        println(subjects)

        println(selectedSubject)

        int foundSubject = bs.findElementInArray(selectedSubject, subjects)

        assert selectedSubject == foundSubject

    }

    @Test
    void binarySearchComparison() {
        List subjects = randomArray(8_500_000)

        int selectedSubject = subjects.last()

        subjects.sort()

        long forLoopStart = System.currentTimeMillis()
        long forLoopEnd = 0
        for (int i = 0; i < subjects.size(); i ++) {
            if (subjects[i] == selectedSubject) {
                forLoopEnd = System.currentTimeMillis()
            }
        }

        long binaryStart = System.currentTimeMillis()
        bs.findElementInArray(selectedSubject, subjects)
        long binaryEnd = System.currentTimeMillis()

        println("For Loop took = ${(forLoopEnd - forLoopStart)} ms")
        println("Binary Search took = ${(binaryEnd - binaryStart)} ms")
    }

    private static List randomArray(long n) {

        List list = []

        for (int i=1; i<n; i++) {
            list.add(new Integer(i))
        }


        return list

    }

}
