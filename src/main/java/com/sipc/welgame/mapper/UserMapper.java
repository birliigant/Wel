package com.sipc.welgame.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sipc.welgame.pojo.domain.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper extends BaseMapper<UserInfo> {
    @Insert("INSERT INTO user (name,student_id) VALUES (#{name},#{studentId})")
    int insertUser(UserInfo userInfo);
    @Select("SELECT * FROM user  WHERE student_id = #{studentId}")
    UserInfo getByStudentId(Integer studentId);
    @Update("UPDATE user SET main_level = #{mainLevel}, total = #{total} WHERE student_id = #{studentId}")
    int updateMainLevelById(UserInfo userInfo);
    @Update("UPDATE user SET backend_level = #{backendLevel}, total = #{total} WHERE student_id = #{studentId}")
    int updateBackendLevelById(UserInfo userInfo);
    @Update("UPDATE user SET frontend_level = #{frontendLevel}, total = #{total} WHERE student_id = #{studentId}")
    int updateFrontendLevelById(UserInfo userInfo);
    @Update("UPDATE user SET secure_level = #{secureLevel}, total = #{total} WHERE student_id = #{studentId}")
    int updateSecureLevelById(UserInfo userInfo);
    @Update("UPDATE user SET algorithm_level = #{algorithmLevel}, total = #{total} WHERE student_id = #{studentId}")
    int updateAlgorithmLevelById(UserInfo userInfo);
    @Update("UPDATE user SET loT_level = #{loTLevel}, total = #{total} WHERE student_id = #{studentId}")
    int updateLoTLevelById(UserInfo userInfo);
    @Update("UPDATE user SET product_level = #{productLevel}, total = #{total} WHERE student_id = #{studentId}")
    int updateProductLevelById(UserInfo userInfo);
    @Update("UPDATE user SET game_level = #{gameLevel}, total = #{total} WHERE student_id = #{studentId}")
    int updateGameLevelById(UserInfo userInfo);
}
