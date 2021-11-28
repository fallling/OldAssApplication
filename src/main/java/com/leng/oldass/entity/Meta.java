package com.leng.oldass.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lengzq
 * @since 2021/11/24 23:26
 */

@Data
public class Meta implements Serializable {

    private Boolean keepAlive;

    private Boolean requireAuth;

}
