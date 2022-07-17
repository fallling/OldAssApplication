package com.leng.oldass.favorites.controller;

import com.leng.oldass.favorites.entity.FavoritesList;
import com.leng.oldass.favorites.service.FavoritesListService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 收藏列表(FavoritesList)表控制层
 *
 * @author makejava
 * @since 2022-07-17 16:27:51
 */
@RestController
@RequestMapping("favoritesList")
public class FavoritesListController {
    /**
     * 服务对象
     */
    @Resource
    private FavoritesListService favoritesListService;

    /**
     * 分页查询
     *
     * @param favoritesList 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<FavoritesList>> queryByPage(FavoritesList favoritesList, PageRequest pageRequest) {
        return ResponseEntity.ok(this.favoritesListService.queryByPage(favoritesList, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<FavoritesList> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.favoritesListService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param favoritesList 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<FavoritesList> add(FavoritesList favoritesList) {
        return ResponseEntity.ok(this.favoritesListService.insert(favoritesList));
    }

    /**
     * 编辑数据
     *
     * @param favoritesList 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<FavoritesList> edit(FavoritesList favoritesList) {
        return ResponseEntity.ok(this.favoritesListService.update(favoritesList));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.favoritesListService.deleteById(id));
    }

}

