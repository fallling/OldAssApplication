package com.leng.oldass.favorites.service.impl;

import com.leng.oldass.favorites.entity.FavoritesList;
import com.leng.oldass.favorites.dao.FavoritesListDao;
import com.leng.oldass.favorites.service.FavoritesListService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 收藏列表(FavoritesList)表服务实现类
 *
 * @author xzmb
 * @since 2022-07-17 16:27:51
 */
@Service("favoritesListService")
public class FavoritesListServiceImpl implements FavoritesListService {
    @Resource
    private FavoritesListDao favoritesListDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FavoritesList queryById(Long id) {
        return this.favoritesListDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param favoritesList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<FavoritesList> queryByPage(FavoritesList favoritesList, PageRequest pageRequest) {
        long total = this.favoritesListDao.count(favoritesList);
        return new PageImpl<>(this.favoritesListDao.queryAllByLimit(favoritesList, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param favoritesList 实例对象
     * @return 实例对象
     */
    @Override
    public FavoritesList insert(FavoritesList favoritesList) {
        this.favoritesListDao.insert(favoritesList);
        return favoritesList;
    }

    /**
     * 修改数据
     *
     * @param favoritesList 实例对象
     * @return 实例对象
     */
    @Override
    public FavoritesList update(FavoritesList favoritesList) {
        this.favoritesListDao.update(favoritesList);
        return this.queryById(favoritesList.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.favoritesListDao.deleteById(id) > 0;
    }
}
