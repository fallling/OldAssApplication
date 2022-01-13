package com.leng.oldass.dao;

import com.leng.oldass.entity.Role;
import com.leng.oldass.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * user表(User)表数据库访问层
 *
 * @author lengzq
 * @since 2021-11-23 14:37:08
 */
public interface UserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 通过userName查询单条数据
     *
     * @param username 用户名
     * @return User
     */
    User loadUserByUserName(String username);

    /**
     * 通过邮箱查询单条数据
     * @param email
     * @return
     */
    User loadUserByEmail(String email);
    /**
     * 查询指定行数据
     *
     * @param user 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<User> queryAllByLimit(User user, @Param("pageable") Pageable pageable);

    /**
     * 获取用户角色
     *
     * @param id userid
     * @return 角色列表
     */
    List<Role> getUserRolesById(Integer id);

    /**
     * 查询所有用户
     *
     * @param userid 用户id
     * @param keywords 关键字
     * @return 用户列表
     */
    List<User> getAllUsers(@Param("userid") Integer userid, @Param("keywords") String keywords);

    /**
     * 获取除当前用户外的所有用户
     *
     * @param id 当前用户id
     * @return 用户列表
     */
    List<User> getAllUsersExceptCurrentUser(Integer id);

    /**
     * 修改密码
     *
     * @param userid 用户id
     * @param encodePass 编码通行证
     * @return 影响行数
     */
    Integer updatePassword(@Param("userid") Integer userid, @Param("encodePass") String encodePass);

    /**
     * 修改用户头像
     *
     * @param url 头像url
     * @param id 用户id
     * @return 影响行数
     */
    Integer updateUserFace(@Param("url") String url, @Param("id") Integer id);

    /**
     * 统计总行数
     *
     * @param user 查询条件
     * @return 总行数
     */
    long count(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<User> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<User> entities);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

