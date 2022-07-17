package com.leng.oldass.favorites.controller;

import com.leng.oldass.favorites.entity.Favorites;
import com.leng.oldass.favorites.service.FavoritesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 收藏表(Favorites)表控制层
 *
 * @author xzmb
 * @since 2022-07-17 16:05:07
 */
@RestController
@RequestMapping("favorites")
public class FavoritesController {
    /**
     * 服务对象
     */
    @Resource
    private FavoritesService favoritesService;

    /**
     * 分页查询
     *
     * @param favorites 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Favorites>> queryByPage(Favorites favorites, PageRequest pageRequest) {
        return ResponseEntity.ok(this.favoritesService.queryByPage(favorites, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Favorites> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.favoritesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param favorites 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<Favorites> add(Favorites favorites) {
        return ResponseEntity.ok(this.favoritesService.insert(favorites));
    }

    /**
     * 编辑数据
     *
     * @param favorites 实体
     * @return 编辑结果
     */
    @PutMapping("/update")
    public ResponseEntity<Favorites> edit(Favorites favorites) {
        return ResponseEntity.ok(this.favoritesService.update(favorites));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.favoritesService.deleteById(id));
    }

}

