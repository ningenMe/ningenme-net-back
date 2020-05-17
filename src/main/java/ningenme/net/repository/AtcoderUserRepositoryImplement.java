package ningenme.net.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import ningenme.net.domain.AtcoderUserDomain;
import ningenme.net.mybatis.AtcoderUserMapper;

@Repository
public class AtcoderUserRepositoryImplement implements AtcoderUserRepositoryInterface {

    private final SqlSessionTemplate sqlSessionTemplate;
    public AtcoderUserRepositoryImplement(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public AtcoderUserDomain get(String atcoderId) {
        AtcoderUserDomain atcoderUserDomain = this.sqlSessionTemplate.getMapper(AtcoderUserMapper.class).select(atcoderId);
        return atcoderUserDomain;
    }
}