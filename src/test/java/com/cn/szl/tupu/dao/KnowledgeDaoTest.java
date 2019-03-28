package com.cn.szl.tupu.dao;

import com.cn.szl.tupu.entity.Knowledge;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledgeDaoTest {

    @Autowired
    KnowledgeDao dao;

    @Test
    public void insert() {

    String s = "无线网络知识\n" +
            "对抗装备\n" +
            "战场环境\n" +
            "指挥与效能评估知识";

//        String[] split = s.split("\n");
//        for (int i = 0 ; i < split.length ; i ++){
//            Knowledge knowledge = new Knowledge();
//            knowledge.setKnowledgeLevel("2");
//            knowledge.setKnowledgeName(split[i]);
//            dao.insert(knowledge);
//        }

    }
}