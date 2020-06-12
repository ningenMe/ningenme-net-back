package ningenme.net.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ningenme.net.domain.AtcoderUserContestDomain;

@Mapper
public interface AtcoderUserContestMapper {
    List<AtcoderUserContestDomain> select(String atcoderId, String contestType);
}