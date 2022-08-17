package com.yk.content.service.impl;

import com.yk.content.model.dto.ShareDto;
import com.yk.content.model.dto.UserDto;
import com.yk.content.model.entity.Share;
import com.yk.content.mapper.ShareMapper;
import com.yk.content.service.ShareService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 分享表 服务实现类
 * </p>
 *
 * @author yangk
 * @since 2022-08-16
 */
@Service
public class ShareServiceImpl extends ServiceImpl<ShareMapper, Share> implements ShareService {

    @Autowired
    private ShareMapper shareMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ShareDto findById(Integer id) {
        Share share = shareMapper.selectById(id);

        // 发布人Id
        Integer userId = share.getUserId();

        String url = "http://localhost:8080/user/{userId}";
        UserDto userDto = restTemplate.getForObject(url, UserDto.class, userId);

        ShareDto shareDto = new ShareDto();
        BeanUtils.copyProperties(share, shareDto);
        shareDto.setWxNickName(userDto.getWxNickname());

        return shareDto;
    }
}
