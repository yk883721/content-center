package com.yk.content.controller;


import com.yk.content.model.dto.ShareDto;
import com.yk.content.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 分享表 前端控制器
 * </p>
 *
 * @author yangk
 * @since 2022-08-16
 */
@RestController
@RequestMapping("/shares")
public class ShareController {

    @Autowired
    private ShareService shareService;

    @GetMapping("/{id}")
    public ShareDto findById(@PathVariable Integer id) {
        return shareService.findById(id);
    }



}

