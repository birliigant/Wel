package com.sipc.welgame.utils;

import java.util.*;


public class AnswersUtil {

    public static boolean verifyAnswerOne(List<String> keywords, String answer){
        for (String keyword : keywords) {
            if (!answer.contains(keyword)) {
                return false;
            }
        }
        return true;
    }
    public static boolean verifyAnswerTwo(List<String> keywords,String answer){
        for (String keyword : keywords) {
            if (keyword.equals(answer)){
                return true;
            }
        }
        return false;
    }
}
