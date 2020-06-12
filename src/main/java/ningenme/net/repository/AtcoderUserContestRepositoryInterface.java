package ningenme.net.repository;

import java.util.List;

import ningenme.net.domain.AtcoderUserContestDomain;

public interface AtcoderUserContestRepositoryInterface {
    List<AtcoderUserContestDomain> get(String atcoderId, String contestType);
}