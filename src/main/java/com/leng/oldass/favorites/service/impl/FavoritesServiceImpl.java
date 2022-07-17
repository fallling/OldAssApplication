package com.leng.oldass.favorites.service.impl;

import com.leng.oldass.favorites.entity.Favorites;
import com.leng.oldass.favorites.dao.FavoritesDao;
import com.leng.oldass.favorites.service.FavoritesService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 收藏表(Favorites)表服务实现类
 *
 * @author xzmb
 * @since 2022-07-17 16:05:13
 */
@Service("favoritesService")
public class FavoritesServiceImpl implements FavoritesService {
    @Resource
    private FavoritesDao favoritesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Favorites queryById(Long id) {
        return this.favoritesDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param favorites 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Favorites> queryByPage(Favorites favorites, PageRequest pageRequest) {
        long total = this.favoritesDao.count(favorites);
        return new PageImpl<>(this.favoritesDao.queryAllByLimit(favorites, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param favorites 实例对象
     * @return 实例对象
     */
    @Override
    public Favorites insert(Favorites favorites) {
        this.favoritesDao.insert(favorites);
        return favorites;
    }

    /**
     * 修改数据
     *
     * @param favorites 实例对象
     * @return 实例对象
     */
    @Override
    public Favorites update(Favorites favorites) {
        this.favoritesDao.update(favorites);
        return this.queryById(favorites.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.favoritesDao.deleteById(id) > 0;
    }
}
