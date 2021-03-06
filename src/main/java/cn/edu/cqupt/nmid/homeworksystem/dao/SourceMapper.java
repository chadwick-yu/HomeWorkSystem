package cn.edu.cqupt.nmid.homeworksystem.dao;

import cn.edu.cqupt.nmid.homeworksystem.po.Source;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Source record);

    int insertSelective(Source record);

    Source selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Source record);

    int updateByPrimaryKey(Source record);
}