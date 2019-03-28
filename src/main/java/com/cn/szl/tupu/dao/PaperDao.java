package com.cn.szl.tupu.dao;


import com.cn.szl.tupu.entity.Knowledge;
import com.cn.szl.tupu.entity.Paper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 论文DAO接口
 */
@Component
public interface PaperDao{

    @Select("select * from papers_predict_label where id = #{id}")
    Paper getById(int id);

    void insert(Paper paper);

    void deleteById(int id);

    void updateById(int id);

    List<Paper> listPaper(@Param("label") String label, @Param("page") int page, @Param("pageSize") int pageSize);

    List<Paper> findByLabel(String label);

    @Select("select title,author,keywords,date,label,id from papers_predict_label where keywords or title like CONCAT('%',#{key},'%')")
    List<Paper> findByKeyword(String keyword);


}
