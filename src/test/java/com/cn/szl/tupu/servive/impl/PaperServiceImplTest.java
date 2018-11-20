package com.cn.szl.tupu.servive.impl;

import com.cn.szl.tupu.dao.PaperDao;
import com.cn.szl.tupu.entity.Paper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaperServiceImplTest {

    @Autowired
    PaperDao dao;

    @Test
    public void listPaper() {

        List<Paper> list = dao.listPaper("战术通信",0, 10 );

        System.out.println(list.size());
    }
}