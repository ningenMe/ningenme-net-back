package ningenme.net.repository;

import java.util.List;

import ningenme.net.domain.AtcoderUserContestDomain;
import ningenme.net.domain.AtcoderUserDomain;

public interface AtcoderUserRepositoryInterface {
    AtcoderUserDomain get(String atcoderId);
}