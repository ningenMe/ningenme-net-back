package ningenme.net.mybatis;

import org.apache.ibatis.annotations.Mapper;

import ningenme.net.domain.AtcoderUserDomain;

@Mapper
public interface AtcoderUserMapper {
    AtcoderUserDomain select(String atcoderId);
}