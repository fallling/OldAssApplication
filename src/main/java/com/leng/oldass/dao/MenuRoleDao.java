package com.leng.oldass.dao;

import com.leng.oldass.entity.MenuRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * menu_role表(MenuRole)表数据库访问层
 *
 * @author lengzq
 * @since 2021-11-24 15:52:03
 */
public interface MenuRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MenuRole queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param menuRole 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MenuRole> queryAllByLimit(MenuRole menuRole, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param menuRole 查询条件
     * @return 总行数
     */
    long count(MenuRole menuRole);

    /**
     * 新增数据
     *
     * @param menuRole 实例对象
     * @return 影响行数
     */
    int insert(MenuRole menuRole);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MenuRole> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MenuRole> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MenuRole> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MenuRole> entities);

    /**
     * 修改数据
     *
     * @param menuRole 实例对象
     * @return 影响行数
     */
    int update(MenuRole menuRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 根据角色id删除数据
     *
     * @param roleId 角色id
     */
    void deleteByRoleId(Integer roleId);

    /**
     * 插入数据
     *
     * @param roleId 角色id
     * @param menuIds 菜单id
     * @return 影响行数
     */
    Integer insertRecord(@Param("roleId") Integer roleId, @Param("menuIds") Integer[] menuIds);
}

