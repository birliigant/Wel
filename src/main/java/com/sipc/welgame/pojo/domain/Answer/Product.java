package com.sipc.welgame.pojo.domain.Answer;

import com.sipc.welgame.utils.AnswersUtil;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public static final List<String> PRODUCT_ANSWER_ONE = new ArrayList<>();
    public static final List<String> PRODUCT_ANSWER_TWO = new ArrayList<>();
    public static final String PRODUCT_ANSWER_THREE = "1313ljj";

    static {
        PRODUCT_ANSWER_ONE.add("基本");
        PRODUCT_ANSWER_ONE.add("魅力");
        PRODUCT_ANSWER_ONE.add("期望");
        PRODUCT_ANSWER_ONE.add("无差异");
        PRODUCT_ANSWER_ONE.add("反向");

        PRODUCT_ANSWER_TWO.add("优势");
        PRODUCT_ANSWER_TWO.add("劣势");
        PRODUCT_ANSWER_TWO.add("机会");
        PRODUCT_ANSWER_TWO.add("威胁");
    }

    public static boolean verifyQuestionOne(String answer) {
        return AnswersUtil.verifyAnswerOne(PRODUCT_ANSWER_ONE, answer);
    }

    public static boolean verifyQuestionTwo(String answer) {
        return AnswersUtil.verifyAnswerOne(PRODUCT_ANSWER_TWO, answer);
    }
}
