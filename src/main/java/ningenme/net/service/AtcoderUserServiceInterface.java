package ningenme.net.service;

import java.util.List;

import ningenme.net.domain.AtcoderUserContestDomain;
import ningenme.net.domain.AtcoderUserDomain;

public interface AtcoderUserServiceInterface {
    AtcoderUserDomain get(String atcoderId);
    List<AtcoderUserContestDomain> getBingo(String atcoderId, String contestType);
}