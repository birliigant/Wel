package com.sipc.welgame.pojo.domain.Answer;

import com.sipc.welgame.utils.AnswersUtil;

import java.util.ArrayList;
import java.util.List;

public class Backend {
    public static final String BACKEND_ANSWER_ONE = "SQL";
    public static final List<String> BACKEND_ANSWER_TWO = new ArrayList<>();
    public static final String BACKEND_ANSWER_THREE = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJCYWNrZW5kIjp7Imlubm92YXRpb24iOnRydWUsInBhc3Npb24iOnRydWUsImNvb3BlcmF0aW9uIjp0cnVlfX0.glu6zlKFvj_NQUQHkceMKtMrQiYy_IMdskP-egBREjM";
    public static final String BACKEND_ANSWER_FOUR = "innovation passion cooperation Welcome to SIPC115 !!!";
    static {
        BACKEND_ANSWER_TWO.add("1升,3降,4降");
        BACKEND_ANSWER_TWO.add("1升,3降,2降");
        BACKEND_ANSWER_TWO.add("1升,4降");
        BACKEND_ANSWER_TWO.add("3降,2降");
        BACKEND_ANSWER_TWO.add("3降,1升,2降");
        BACKEND_ANSWER_TWO.add("3降,1升,4降");

        //TODO:加个中文逗号感觉
        BACKEND_ANSWER_TWO.add("1升，3降，4降");
        BACKEND_ANSWER_TWO.add("1升，3降，2降");
        BACKEND_ANSWER_TWO.add("1升，4降");
        BACKEND_ANSWER_TWO.add("3降，2降");
        BACKEND_ANSWER_TWO.add("3降，1升，2降");
        BACKEND_ANSWER_TWO.add("3降，1升，4降");
    }

    public static boolean verifyQuestionOne(String answer) {
        return AnswersUtil.verifyAnswerTwo(BACKEND_ANSWER_TWO, answer);
    }

}
