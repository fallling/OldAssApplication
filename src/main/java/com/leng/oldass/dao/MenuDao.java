package com.leng.oldass.dao;

import com.leng.oldass.entity.Menu;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * menu表(Menu)表数据库访问层
 *
 * @author lengzq
 * @since 2021-11-23 15:50:47
 */
public interface MenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Menu queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param menu 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Menu> queryAllByLimit(Menu menu, @Param("pageable") Pageable pageable);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<Menu> queryAll();

    /**
     * 统计总行数
     *
     * @param menu 查询条件
     * @return 总行数
     */
    long count(Menu menu);

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 影响行数
     */
    int insert(Menu menu);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Menu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Menu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Menu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Menu> entities);

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 影响行数
     */
    int update(Menu menu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 根据用户id查询菜单
     *
     * @param userid 用户id
     * @return 菜单列表
     */
    List<Menu> getMenuByUserId(Integer userid);

    /**
     * 获取该角色的所有菜单
     *
     * @return 菜单列表
     */
    List<Menu> getAllMenusWithRole();

    /**
     * 获取所有菜单
     *
     * @return 菜单列表
     */
    List<Menu> getAllMenus();

    /**
     * 根据角色id查找所有菜单列表
     *
     * @param roleId 角色id
     * @return 菜单列表
     */
    List<Integer> getMenuIdsByRoleId(Integer roleId);
}

