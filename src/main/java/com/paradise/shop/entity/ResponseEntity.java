package com.paradise.shop.entity;

import lombok.Data;

/**
 * @author :  冒蓝火的加特林   哒~哒~哒~
 * @Description :
 * @CreateDate :  2020/2/24 17:45
 */
@Data
public class ResponseEntity<E> {
    public static final String SUCCESS = "sucess";
    public Integer code;
    public E data;
    public String message;

    public ResponseEntity(Integer code, E data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
}
