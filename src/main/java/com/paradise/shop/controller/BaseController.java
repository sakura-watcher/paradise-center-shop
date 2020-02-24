package com.paradise.shop.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.paradise.shop.entity.ResponseEntity;
import com.paradise.shop.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :  冒蓝火的加特林   哒~哒~哒~
 * @Description :
 * @CreateDate :  2020/2/24 17:44
 */
@RequestMapping("/561385edd51e3e443ebe8684de6ea489")
@Slf4j
@RestController
public class BaseController {

    @Autowired
    private BaseService baseService;

    @GetMapping("/config/vipLevel")
    public ResponseEntity vipLevel(){
        return new ResponseEntity(0,0,ResponseEntity.SUCCESS);
    }

    @RequestMapping("/config/values")
    public ResponseEntity values(){
        JSONArray array = JSONObject.parseArray("[{\"key\":\"mallName\",\"remark\":\"商城名称\",\"value\":\"天使童装\"},{\"dateUpdate\":\"2019-06-04 16:54:12\",\"key\":\"ALLOW_SELF_COLLECTION\",\"remark\":\"是否开启到店自提\",\"value\":\"1\"},{\"dateUpdate\":\"2020-02-21 21:16:34\",\"key\":\"RECHARGE_OPEN\",\"remark\":\"方便审核，特设充值开关\",\"value\":\"1\"}]");
        return new ResponseEntity(0,array,ResponseEntity.SUCCESS);
    }

    @RequestMapping("/score/send/rule")
    public ResponseEntity rule(){
        return new ResponseEntity(700,0,"暂无数据");
    }

    @RequestMapping("/site/statistics")
    public ResponseEntity statistics(){
        Object parse = JSONObject.parse("{\"dfs\":{\"capacity\":0,\"capacityLeft\":0,\"capacityLeftStr\":\"0 B\",\"capacityStr\":\"0 B\",\"count\":0,\"id\":22233,\"isFixed\":true},\"wxAppid\":\"wxd9ae9a659188d7e0\",\"cmsArticle\":{\"comments\":0,\"numbers\":0,\"fav\":0,\"views\":0}}");
        return new ResponseEntity(0,parse,ResponseEntity.SUCCESS);
    }




}
