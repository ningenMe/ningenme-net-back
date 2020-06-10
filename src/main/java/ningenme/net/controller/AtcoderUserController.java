package ningenme.net.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ningenme.net.domain.AtcoderUserContestDomain;
import ningenme.net.domain.AtcoderUserDomain;
import ningenme.net.service.AtcoderUserServiceInterface;

@RestController
@RequestMapping("/atcoder/users")
public class AtcoderUserController {
    private final AtcoderUserServiceInterface atcoderUserServiceInterface;
    public AtcoderUserController(AtcoderUserServiceInterface atcoderUserServiceInterface) {
        this.atcoderUserServiceInterface = atcoderUserServiceInterface;
    }

    /**
     * AtCoderのユーザー情報を参照するエンドポイント
     * @param atcoderId atcoderのuserId
     */
    @GetMapping(path = "/{atcoder_id}", produces = "application/json")
    public AtcoderUserDomain getAtcoderUser(@PathVariable("atcoder_id") String atcoderId) {
        return atcoderUserServiceInterface.get(atcoderId);
    }

    /**
     * AtCoderのユーザーが出たコンテストの情報を参照するエンドポイント
     * @param atcoderId atcoderのuserId
     * @param contestType contestsのcontestType
     */
    @GetMapping(path = "/{atcoder_id}/contests/{contest_type}", produces = "application/json")
    public List<AtcoderUserContestDomain> getAtcoderUserContestsContestType(
        @PathVariable("atcoder_id") String atcoderId,
        @PathVariable("contest_type") String contestType) {
        List<AtcoderUserContestDomain> atcoderUserContestDomains = new ArrayList<>();
        atcoderUserContestDomains.add(new AtcoderUserContestDomain("hoge"));
        atcoderUserContestDomains.add(new AtcoderUserContestDomain("fuga"));
        return atcoderUserContestDomains;
    }

}