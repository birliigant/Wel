package com.sipc.welgame.pojo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class UserInfo {
    private Integer id;
    private String name;
    @TableField("student_id")
    private int studentId;
    @TableField("main_level")
    private int mainLevel;
    @TableField("product_level")
    private int productLevel;
    @TableField("frontend_level")
    private int frontendLevel;
    @TableField("backend_level")
    private int backendLevel;
    @TableField("secure_level")
    private int secureLevel;
    @TableField("game_level")
    private int gameLevel;
    @TableField("algorithm_level")
    private int algorithmLevel;
    @TableField("ioT_level")
    private int ioTLevel;
    private int total;
    public void pack(Map<String,Integer> map){
        map.put("Backend",backendLevel);
        map.put("Frontend",frontendLevel);
        map.put("Product",productLevel);
        map.put("Secure",secureLevel);
        map.put("IoT",ioTLevel);
        map.put("Game",gameLevel);
        map.put("Algorithm",algorithmLevel);
        map.put("Total",total);
    }
}
