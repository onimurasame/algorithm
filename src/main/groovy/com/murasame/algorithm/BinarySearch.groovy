package com.murasame.algorithm

import groovy.util.logging.Slf4j

class BinarySearch {

    int findElementInArray(int element, List subject) {
        int middleIndex = obtainMiddleIndex(subject)

        if(subject.size() == 1) {
            return subject.get(0)
        }

        if(element < subject.get(middleIndex)) {
            return findElementInArray(element, subject.subList(0, middleIndex))
        } else if (element > subject.get(middleIndex)) {
            return findElementInArray(element, subject.subList(middleIndex + 1, subject.size()))
        } else {
            return subject.get(middleIndex)
        }

    }

    int obtainMiddleIndex(List currentSubject) {
        return (currentSubject.size() - 1) / 2
    }


}
