package com.cn.szl.tupu.dao;

import com.cn.szl.tupu.entity.EntityRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface EntityRelationDao  extends Neo4jRepository<EntityRelation,Long>{
//    List<EntityRelation> findByBusinesssystemId(String businesssystemId);

    //查询一个业务系统下所有have关系及开始、结束节点
    @Query("MATCH p=()-[r:have]->() WHERE r.BUSINESSSYSTEM_ID={businesssystemId} RETURN p")
    List<EntityRelation> findAllCascadeByBusinesssystemId(@Param("businesssystemId") String businesssystemId);

    //删除一个业务系统下所有have关系及开始、结束节点
    @Query("MATCH p=()-[r:have]->() DELETE p")
    List<EntityRelation> removeAllCascadeByBusinesssystemId(@Param("businesssystemId") String businesssystemId);


}
