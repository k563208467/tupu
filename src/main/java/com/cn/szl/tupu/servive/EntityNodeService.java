package com.cn.szl.tupu.servive;

import com.cn.szl.tupu.dao.EntityNodeDao;
import com.cn.szl.tupu.entity.EntityNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class EntityNodeService {
    @Autowired
    private EntityNodeDao entityNodeDao;

    @Transactional(readOnly = true)
    public EntityNode findByName(String name){
        return entityNodeDao.findByName(name);
    }

//    @Transactional(readOnly = true)
//    public Collection<EntityNode> findByNameLike(String firstName){
//        return entityNodeDao.findByfirstNameLike(firstName);
//    }

    public Iterable<EntityNode> findAll(){
        return entityNodeDao.findAll();
    }

    public int addUser(EntityNode node) {
        entityNodeDao.addNodeList(node.getName(),node.getNodeId());
        return 1;
    }


}
