package com.mysportsfeed.client.nhl;

import com.mysportsfeed.client.BaseClient;
import com.mysportsfeed.client.common.param.CommonSeasonParams;
import com.mysportsfeed.client.exception.MySportsFeedException;
import com.mysportsfeed.client.nhl.param.*;
import com.mysportsfeed.dto.common.LatestUpdates;
import com.mysportsfeed.dto.common.Schedule;
import com.mysportsfeed.dto.common.SeasonList;
import com.mysportsfeed.dto.nhl.core.NHLScoreboard;
import com.mysportsfeed.dto.nhl.detailed.*;
import com.mysportsfeed.dto.nhl.dfs.DailyDfs;
import com.mysportsfeed.dto.nhl.stats.*;
import lombok.Setter;

public class NHLClient extends BaseClient {

    @Setter
    private String baseUrl = "https://api.mysportsfeeds.com/v1.0/pull/nhl";

    public NHLClient(String apiKey, String password) {
        super(apiKey, password);
    }

    public Schedule getFullGameSchedule(NHLFullGameScheduleParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/full_game_schedule"), Schedule.class);
    }

    public Schedule getDailyGameSchedule(NHLDailyGameScheduleParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/daily_game_schedule"), Schedule.class);
    }

    public NHLScoreboard getScoreboard(NHLScoreboardParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/scoreboard"), NHLScoreboard.class);
    }

    public LatestUpdates getLatestUpdates(CommonSeasonParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/latest_updates"), LatestUpdates.class);
    }

    public SeasonList getCurrentSeason(NHLCurrentSeasonParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/current_season"), SeasonList.class);
    }

    public PlayerStats getCumulativePlayerStats(NHLCumulativePlayerStatsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/cumulative_player_stats"), PlayerStats.class);
    }

    public PlayerStats getDailyPlayerStats(NHLDailyPlayerStatsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/daily_player_stats"), PlayerStats.class);
    }

    public PlayerGameLogList getPlayerGameLogs(NHLPlayerGameLogsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/player_gamelogs"), PlayerGameLogList.class);
    }

    public TeamGameLogList getTeamGameLogs(NHLTeamGameLogsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/team_gamelogs"), TeamGameLogList.class);
    }

    public OverallTeamStandings getOverallTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/overall_team_standings"), OverallTeamStandings.class);
    }

    public ConferenceTeamStandings getConferenceTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/conference_team_standings"), ConferenceTeamStandings.class);
    }

    public DivisionTeamStandings getDivisionTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/division_team_standings"), DivisionTeamStandings.class);
    }

    public ConferenceTeamStandings getPlayoffTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/playoff_team_standings"), ConferenceTeamStandings.class);
    }

    public BoxScore getBoxScore(NHLBoxScoreParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/game_boxscore"), BoxScore.class);
    }

    public PlayByPlay getPlayByPlay(NHLPlayByPlayParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/game_playbyplay"), PlayByPlay.class);
    }

    public RosterPlayers getRosterPlayers(NHLRosterPlayersParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/roster_players"), RosterPlayers.class);
    }

    public GameLineup getGameStartingLineup(NHLGameStartingLineupParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/game_startinglineup"), GameLineup.class);
    }

    public ActivePlayers getActivePlayers(NHLActivePlayersParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/active_players"), ActivePlayers.class);
    }

    public PlayerInjuries getInjuredPlayers(NHLInjuredPlayersParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/player_injuries"), PlayerInjuries.class);
    }

    public DailyDfs getDailyDfs(NHLDailyDfsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/daily_dfs"), DailyDfs.class);
    }

}
