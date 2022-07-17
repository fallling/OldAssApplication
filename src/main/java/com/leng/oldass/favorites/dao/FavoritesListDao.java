package com.leng.oldass.favorites.dao;

import com.leng.oldass.favorites.entity.FavoritesList;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 收藏列表(FavoritesList)表数据库访问层
 *
 * @author xzmb
 * @since 2022-07-17 16:27:51
 */
public interface FavoritesListDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FavoritesList queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param favoritesList 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<FavoritesList> queryAllByLimit(FavoritesList favoritesList, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param favoritesList 查询条件
     * @return 总行数
     */
    long count(FavoritesList favoritesList);

    /**
     * 新增数据
     *
     * @param favoritesList 实例对象
     * @return 影响行数
     */
    int insert(FavoritesList favoritesList);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FavoritesList> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FavoritesList> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FavoritesList> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<FavoritesList> entities);

    /**
     * 修改数据
     *
     * @param favoritesList 实例对象
     * @return 影响行数
     */
    int update(FavoritesList favoritesList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

