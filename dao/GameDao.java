package dao;

import entity.Game;
import java.util.List;

public interface GameDao {

    List<Game> getAllGames();
    Game getGameById(int gameId);
    Game addGame(Game game);
    void updateGame(Game round);
}
