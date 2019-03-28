package com.cn.szl.tupu.dao;

import com.cn.szl.tupu.entity.EntityNode;
import org.springframework.data.repository.query.Param;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface EntityNodeDao extends Neo4jRepository<EntityNode,String >{
    EntityNode findByName(@Param("Name") String Name);

//    Collection<EntityNode> findByfirstNameLike(@Param("Name") String Name);

    @Query("MATCH (n:EntityNode) RETURN n ")
    Iterable<EntityNode> findAll();

    @Query("create (n:EntityNode{id:{id},name:{name}}) RETURN n ")
    List<EntityNode> addNodeList(@Param("name") String name,@Param("id")Long id);



}
