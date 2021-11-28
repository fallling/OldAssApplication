package com.leng.oldass.service;

import com.leng.oldass.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * menu表(Menu)表服务接口
 *
 * @author lengzq
 * @since 2021-11-23 15:50:47
 */
public interface MenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Menu queryById(Integer id);

    /**
     * 分页查询
     *
     * @param menu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Menu> queryByPage(Menu menu, PageRequest pageRequest);

    /**
     * 查询所有菜单
     *
     * @return List
     */
    List<Menu> queryAll();

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu insert(Menu menu);

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu update(Menu menu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


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
