package com.leng.oldass.favorites.service;

import com.leng.oldass.favorites.entity.FavoritesList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 收藏列表(FavoritesList)表服务接口
 *
 * @author xzmb
 * @since 2022-07-17 16:27:51
 */
public interface FavoritesListService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FavoritesList queryById(Long id);

    /**
     * 分页查询
     *
     * @param favoritesList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<FavoritesList> queryByPage(FavoritesList favoritesList, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param favoritesList 实例对象
     * @return 实例对象
     */
    FavoritesList insert(FavoritesList favoritesList);

    /**
     * 修改数据
     *
     * @param favoritesList 实例对象
     * @return 实例对象
     */
    FavoritesList update(FavoritesList favoritesList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
