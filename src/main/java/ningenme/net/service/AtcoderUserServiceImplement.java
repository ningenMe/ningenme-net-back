package ningenme.net.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ningenme.net.domain.AtcoderUserContestDomain;
import ningenme.net.domain.AtcoderUserDomain;
import ningenme.net.repository.AtcoderUserContestRepositoryInterface;
import ningenme.net.repository.AtcoderUserRepositoryInterface;

@Service
public class AtcoderUserServiceImplement implements AtcoderUserServiceInterface {
    private final AtcoderUserRepositoryInterface atcoderUserRepositoryInterface;
    private final AtcoderUserContestRepositoryInterface atcoderUserContestRepositoryInterface;
    public AtcoderUserServiceImplement(
        AtcoderUserRepositoryInterface atcoderUserRepositoryInterface,
        AtcoderUserContestRepositoryInterface atcoderUserContestRepositoryInterface){
        this.atcoderUserRepositoryInterface = atcoderUserRepositoryInterface;
        this.atcoderUserContestRepositoryInterface = atcoderUserContestRepositoryInterface;
    }
    @Override
    public AtcoderUserDomain get(String atcoderId) {
        return this.atcoderUserRepositoryInterface.get(atcoderId);
    } 
    @Override
    public List<AtcoderUserContestDomain> getBingo(String atcoderId, String contestType){
        Integer bingoSize = 25;
        List<AtcoderUserContestDomain> atcoderUserContestDomains = new ArrayList<AtcoderUserContestDomain>(bingoSize);
        for(int i = 0; i < bingoSize; i += 1) {
            atcoderUserContestDomains.add(new AtcoderUserContestDomain());
        }
        //TODO bingoのドメインを作るべきだけど一旦面倒なのでここにロジックを書く
        List<AtcoderUserContestDomain> atcoderUserContestDomains2 = this.atcoderUserContestRepositoryInterface.get(atcoderId, contestType);
        for(AtcoderUserContestDomain atcoderUserContestDomain:atcoderUserContestDomains2) {
            Integer place = atcoderUserContestDomain.getPlace();
            if(place.equals(null) || place < 1 || place > bingoSize) continue;
            place -= 1;
            atcoderUserContestDomains.set(place, atcoderUserContestDomain);
        }
        return atcoderUserContestDomains;
    }
}