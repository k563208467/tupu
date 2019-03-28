package com.cn.szl.tupu.entity;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

@NodeEntity(label = "entity")
public class EntityNode {

    @Id
    @Property(name = "ID")
    private Long nodeId;

    @Getter
    @Setter
    @Property(name = "name")
    private String name;

    public void setName(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(long nodeId) {
        this.nodeId = nodeId;
    }
}
