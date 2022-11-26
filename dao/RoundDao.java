package dao;

import entity.Game;
import entity.Round;
import java.util.List;

public interface RoundDao {

    List<Round> getAllRoundsByGameId(int gameId);
    Round getRoundById(int roundId);
    Round addRound(Round round);
}
