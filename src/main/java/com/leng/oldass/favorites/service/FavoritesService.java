package com.leng.oldass.favorites.service;

import com.leng.oldass.favorites.entity.Favorites;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * 收藏表(Favorites)表服务接口
 *
 * @author xzmb
 * @since 2022-07-17 16:05:13
 */
public interface FavoritesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Favorites queryById(Long id);

    /**
     * 分页查询
     *
     * @param favorites 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Favorites> queryByPage(Favorites favorites, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param favorites 实例对象
     * @return 实例对象
     */
    Favorites insert(Favorites favorites);

    /**
     * 修改数据
     *
     * @param favorites 实例对象
     * @return 实例对象
     */
    Favorites update(Favorites favorites);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
