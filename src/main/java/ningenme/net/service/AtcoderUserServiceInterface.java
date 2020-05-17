package ningenme.net.service;

import ningenme.net.domain.AtcoderUserDomain;

public interface AtcoderUserServiceInterface {
    AtcoderUserDomain get(String atcoderId);
}