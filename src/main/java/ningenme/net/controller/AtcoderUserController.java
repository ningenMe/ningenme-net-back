package ningenme.net.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public AtcoderUserDomain get(@PathVariable("atcoder_id") String atcoderId) {
        return atcoderUserServiceInterface.get(atcoderId);
    }
}