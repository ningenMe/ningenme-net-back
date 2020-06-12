package ningenme.net.repository;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import ningenme.net.domain.AtcoderUserContestDomain;
import ningenme.net.mybatis.AtcoderUserContestMapper;

@Repository
public class AtcoderUserContestRepositoryImplement implements AtcoderUserContestRepositoryInterface {

    private final SqlSessionTemplate sqlSessionTemplate;
    public AtcoderUserContestRepositoryImplement(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<AtcoderUserContestDomain> get(String atcoderId, String contestType){
        return this.sqlSessionTemplate.getMapper(AtcoderUserContestMapper.class).select(atcoderId,contestType);
    }

}