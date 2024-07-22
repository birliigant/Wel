package com.sipc.welgame.pojo.domain.Answer;

import com.sipc.welgame.utils.AnswersUtil;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static final List<String> GAME_ANSWER_ONE = new ArrayList<>();
    public static final List<String> GAME_ANSWER_TWO = new ArrayList<>();
    public static final List<String> GAME_ANSWER_THREE = new ArrayList<>();
    static {
        GAME_ANSWER_ONE.add("unity");
        GAME_ANSWER_ONE.add("Unity");
        GAME_ANSWER_ONE.add("虚幻");
        GAME_ANSWER_ONE.add("虚幻5");
        GAME_ANSWER_ONE.add("unreal");
        GAME_ANSWER_ONE.add("ue");
        GAME_ANSWER_ONE.add("Ue");
        GAME_ANSWER_ONE.add("UE");
        GAME_ANSWER_ONE.add("GameMaker");
        GAME_ANSWER_ONE.add("Gamemaker");
        GAME_ANSWER_ONE.add("gamemaker");
        GAME_ANSWER_ONE.add("Godot");
        GAME_ANSWER_ONE.add("godot");
        GAME_ANSWER_ONE.add("Cocos");
        GAME_ANSWER_ONE.add("cocos");

        GAME_ANSWER_TWO.add("Trigger");
        GAME_ANSWER_TWO.add("trigger");
        GAME_ANSWER_TWO.add("触发器");

        GAME_ANSWER_THREE.add("Object");
        GAME_ANSWER_THREE.add("UnityEngine.Object");
    }
    public static boolean verifyQuestionOne(String answer) {
        return AnswersUtil.verifyAnswerTwo(GAME_ANSWER_ONE, answer);
    }

    public static boolean verifyQuestionTwo(String answer) {
        return AnswersUtil.verifyAnswerTwo(GAME_ANSWER_TWO, answer);
    }

    public static boolean verifyQuestionThree(String answer) {
        return AnswersUtil.verifyAnswerTwo(GAME_ANSWER_THREE, answer);
    }
}
