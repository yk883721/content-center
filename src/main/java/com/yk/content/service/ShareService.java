package com.yk.content.service;

import com.yk.content.model.dto.ShareDto;
import com.yk.content.model.entity.Share;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 分享表 服务类
 * </p>
 *
 * @author yangk
 * @since 2022-08-16
 */
public interface ShareService extends IService<Share> {

    ShareDto findById(Integer id);

}
