package com.cn.szl.tupu.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "EntityRelation")
public class EntityRelation {
    @GraphId
    private Long id;

    @StartNode
    private EntityNode startNode;

    @EndNode
    private EntityNode endNode;
}
