package com.cn.szl.tupu.dao;

import com.cn.szl.tupu.entity.Patent;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户DAO接口
 */
@Component
public interface PatentDao {
    @Select("select * from papers_predict_label where id = #{id}")
    Patent getById(int id);

    void insert(Patent patent);

    void deleteById(int id);

    void updateById(int id);

    List<Patent> listPatemt(@Param("label") String label, @Param("page") int page, @Param("pageSize") int pageSize);

    List<Patent> findByLabel(String label);

    @Select("select title,author,keywords,date,label,id from patent where summary or title like CONCAT('%',#{key},'%')")
    List<Patent> findByKeyword(String keyword);

    void saveAndFlush(Patent patent);
}
