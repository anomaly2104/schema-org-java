/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Integer;
import org.schema.model.VideoGame;
import org.schema.model.GameServerStatus;

/**
 * Server that provides game interaction in a multiplayer game.
 *
 * @see <a href="https://schema.org/GameServer">https://schema.org/GameServer</a>
 */
public interface GameServer extends Intangible {

    /**
     * Number of players on the server.
     *
     * @return {@link Integer}
     */
    List<Integer> getPlayersOnlineList();

    /**
     * Number of players on the server.
     *
     * @return {@link Integer}
     */
    Integer getPlayersOnline();

    /**
     * Number of players on the server.
     *
     * @param playersOnline Integer value to set.
     */
    void addPlayersOnline(Integer playersOnline);

    /**
     * Video game which is played on this server.
     *
     * @return {@link VideoGame}
     */
    List<VideoGame> getGameList();

    /**
     * Video game which is played on this server.
     *
     * @return {@link VideoGame}
     */
    VideoGame getGame();

    /**
     * Video game which is played on this server.
     *
     * @param game VideoGame value to set.
     */
    void addGame(VideoGame game);

    /**
     * Status of a game server.
     *
     * @return {@link GameServerStatus}
     */
    List<GameServerStatus> getServerStatusList();

    /**
     * Status of a game server.
     *
     * @return {@link GameServerStatus}
     */
    GameServerStatus getServerStatus();

    /**
     * Status of a game server.
     *
     * @param serverStatus GameServerStatus value to set.
     */
    void addServerStatus(GameServerStatus serverStatus);
}
