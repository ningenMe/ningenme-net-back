package ningenme.net.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ningenme.net.domain.AtcoderUserContestDomain;
import ningenme.net.domain.AtcoderUserDomain;
import ningenme.net.repository.AtcoderUserRepositoryInterface;

@Service
public class AtcoderUserServiceImplement implements AtcoderUserServiceInterface {
    private final AtcoderUserRepositoryInterface atcoderUserRepositoryInterface;
    public AtcoderUserServiceImplement(AtcoderUserRepositoryInterface atcoderUserRepositoryInterface) {
        this.atcoderUserRepositoryInterface = atcoderUserRepositoryInterface;
    }
    @Override
    public AtcoderUserDomain get(String atcoderId) {
        return this.atcoderUserRepositoryInterface.get(atcoderId);
    } 
    @Override
    public List<AtcoderUserContestDomain> getBingo(String atcoderId, String contestType){
        List<AtcoderUserContestDomain> atcoderUserContestDomains = new ArrayList<>();
        for(int i = 0; i < 25; i += 1) {
            atcoderUserContestDomains.add(new AtcoderUserContestDomain());            
        }
        atcoderUserContestDomains.get(0).setAtcoderId("hoge");
        atcoderUserContestDomains.get(1).setAtcoderId("fuga");
        return atcoderUserContestDomains;
    }
}