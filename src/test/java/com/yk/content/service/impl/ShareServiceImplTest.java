package com.yk.content.service.impl;

import com.yk.content.service.ShareService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShareServiceImplTest {

    @Autowired
    private ShareService shareService;

    @Test
    public void test() {
        shareService.findById(1);
    }

}