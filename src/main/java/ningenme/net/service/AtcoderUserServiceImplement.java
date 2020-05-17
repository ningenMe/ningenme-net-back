package ningenme.net.service;

import org.springframework.stereotype.Service;

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
}