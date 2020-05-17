package ningenme.net.repository;

import ningenme.net.domain.AtcoderUserDomain;

public interface AtcoderUserRepositoryInterface {
    AtcoderUserDomain get(String atcoderId);
}