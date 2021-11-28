package com.leng.oldass.dao;

import com.leng.oldass.entity.UserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * user_role表(UserRole)表数据库访问层
 *
 * @author lengzq
 * @since 2021-11-24 15:52:42
 */
public interface UserRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserRole queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userRole 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<UserRole> queryAllByLimit(UserRole userRole, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param userRole 查询条件
     * @return 总行数
     */
    long count(UserRole userRole);

    /**
     * 新增数据
     *
     * @param userRole 实例对象
     * @return 影响行数
     */
    int insert(UserRole userRole);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserRole> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserRole> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserRole> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserRole> entities);

    /**
     * 修改数据
     *
     * @param userRole 实例对象
     * @return 影响行数
     */
    int update(UserRole userRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 根据用户id删除数据
     * @param userid
     */
    void deleteByUserId(Integer userid);

    /**
     * 为用户添加角色
     * @param userid 用户id
     * @param roleIds  角色id
     * @return
     */
    Integer addRole(@Param("userid") Integer userid, @Param("roleIds") Integer[] roleIds);
}

