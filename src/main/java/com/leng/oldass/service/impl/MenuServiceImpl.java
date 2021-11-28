package com.leng.oldass.service.impl;

import com.leng.oldass.entity.Menu;
import com.leng.oldass.dao.MenuDao;
import com.leng.oldass.service.MenuService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * menu表(Menu)表服务实现类
 *
 * @author lengzq
 * @since 2021-11-23 15:50:47
 */
@Service("menuService")
@Transactional
@CacheConfig(cacheNames = "menus_cache")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Menu queryById(Integer id) {
        return this.menuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param menu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Menu> queryByPage(Menu menu, PageRequest pageRequest) {
        long total = this.menuDao.count(menu);
        return new PageImpl<>(this.menuDao.queryAllByLimit(menu, pageRequest), pageRequest, total);
    }

    /**
     * 查询所有菜单
     *
     * @return List
     */
    @Cacheable(key = "#root.methodName")
    @Override
    public List<Menu> queryAll() {
        return menuDao.queryAll();
    }

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu insert(Menu menu) {
        this.menuDao.insert(menu);
        return menu;
    }

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu update(Menu menu) {
        this.menuDao.update(menu);
        return this.queryById(menu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.menuDao.deleteById(id) > 0;
    }

    /**
     * 根据用户id查询菜单
     *
     * @param userid 用户id
     * @return 菜单列表
     */
    @Override
    public List<Menu> getMenuByUserId(Integer userid) {
        return this.menuDao.getMenuByUserId(userid);
    }

    /**
     * 获取该角色的所有菜单
     *
     * @return 菜单列表
     */
    @Override
    public List<Menu> getAllMenusWithRole() {
        return this.menuDao.getAllMenusWithRole();
    }

    /**
     * 获取所有菜单
     *
     * @return 菜单列表
     */
    @Override
    public List<Menu> getAllMenus() {
        return this.menuDao.getAllMenus();
    }

    /**
     * 根据角色id查找所有菜单列表
     *
     * @param roleId 角色id
     * @return 菜单列表
     */
    @Override
    public List<Integer> getMenuIdsByRoleId(Integer roleId) {
        return this.menuDao.getMenuIdsByRoleId(roleId);
    }
}
