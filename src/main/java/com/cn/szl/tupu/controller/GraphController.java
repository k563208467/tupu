package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.entity.EntityNode;
import com.cn.szl.tupu.servive.EntityNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entity")
public class GraphController {
    @Autowired
    private EntityNodeService entityNodeService;

    @GetMapping("/all")
    public Iterable<EntityNode> findAll(){
        return entityNodeService.findAll();
    }

    @GetMapping("/add")
    public int add(){
        EntityNode node1 = new EntityNode();
        node1.setName("wrj");
        node1.setNodeId(1);
        return entityNodeService.addUser(node1);
    }

    @GetMapping("/getAll")
    public Iterable<EntityNode> getAll(){
        Iterable<EntityNode> nodes = entityNodeService.findAll();
        if(nodes != null) {
            return nodes;
        }
        return null;

    }

    @GetMapping("/get")
    public EntityNode get(@RequestParam(value="name") String name){
        return entityNodeService.findByName(name);
    }


}
