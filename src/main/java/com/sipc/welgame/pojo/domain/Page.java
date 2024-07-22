package com.sipc.welgame.pojo.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Page {
    public static final String COLLEGE_PAGE = "ApplyPage";
    public static final String END_PAGE = "FinalPage";
    public static final Map<String,Map<Integer,String>> SELECT_PAGE = new HashMap<>();
    public static final Map<Integer,String> MAIN_PAGE = new HashMap<>();
    public static final Map<Integer,String> BACKEND_PAGE = new HashMap<>();
    public static final Map<Integer,String> FRONTEND_PAGE = new HashMap<>();
    public static final Map<Integer,String> GAME_PAGE = new HashMap<>();
    public static final Map<Integer,String> ALGORITHM_PAGE = new HashMap<>();
    public static final Map<Integer,String> PRODUCT_PAGE = new HashMap<>();
    public static final Map<Integer,String> IOT_PAGE = new HashMap<>();
    public static final Map<Integer,String> SECURE_PAGE = new HashMap<>();
    static {
        MAIN_PAGE.put(0,"StartPage1");
        MAIN_PAGE.put(1,"StartPage2");
        MAIN_PAGE.put(2,"Question1");
        MAIN_PAGE.put(3,"Question2");
        MAIN_PAGE.put(4, COLLEGE_PAGE);

        BACKEND_PAGE.put(1,"BackendQuestion1");
        BACKEND_PAGE.put(2,"BackendQuestion2");
        BACKEND_PAGE.put(3,"BackendQuestion3");
        BACKEND_PAGE.put(4,"BackendQuestion4");
        BACKEND_PAGE.put(5, END_PAGE);

        FRONTEND_PAGE.put(1,"FrontendQuestion1");
        FRONTEND_PAGE.put(2,"FrontendQuestion2");
        FRONTEND_PAGE.put(3,"FrontendQuestion3");
        FRONTEND_PAGE.put(4,"FrontendQuestion4");
        FRONTEND_PAGE.put(5, END_PAGE);

        PRODUCT_PAGE.put(1,"ProductQuestion1");
        PRODUCT_PAGE.put(2,"ProductQuestion2");
        PRODUCT_PAGE.put(3,"ProductQuestion3");
        PRODUCT_PAGE.put(4, END_PAGE);

        SECURE_PAGE.put(0,"SecurityQuestion1");
        SECURE_PAGE.put(1,"SecurityStart");
        SECURE_PAGE.put(2,"SecurityQuestion2");
        SECURE_PAGE.put(3,"SecurityQuestion3");
        SECURE_PAGE.put(4,"SecurityQuestion4");
        SECURE_PAGE.put(5,"SecurityQuestion5");
        SECURE_PAGE.put(6, END_PAGE);

        GAME_PAGE.put(1,"GamingQuestion1");
        GAME_PAGE.put(2,"GamingQuestion2");
        GAME_PAGE.put(3,"GamingQuestion3");
        GAME_PAGE.put(4, END_PAGE);

        IOT_PAGE.put(1,"IoTQuestion1");
        IOT_PAGE.put(2,"IoTQuestion2");
        IOT_PAGE.put(3,"IoTQuestion3");
        IOT_PAGE.put(4, END_PAGE);

        ALGORITHM_PAGE.put(1,"AlgorithmQuestion1");
        ALGORITHM_PAGE.put(2,"AlgorithmQuestion2");
        ALGORITHM_PAGE.put(3,"AlgorithmQuestion3");
        ALGORITHM_PAGE.put(4, END_PAGE);

        SELECT_PAGE.put("Backend", BACKEND_PAGE);
        SELECT_PAGE.put("Frontend", FRONTEND_PAGE);
        SELECT_PAGE.put("Secure", SECURE_PAGE);
        SELECT_PAGE.put("Algorithm", ALGORITHM_PAGE);
        SELECT_PAGE.put("Game", GAME_PAGE);
        SELECT_PAGE.put("IoT", IOT_PAGE);
        SELECT_PAGE.put("Product", PRODUCT_PAGE);
    }
}
