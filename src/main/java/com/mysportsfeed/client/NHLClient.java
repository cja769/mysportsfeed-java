package com.mysportsfeed.client;

import com.mysportsfeed.client.exception.MySportsFeedException;
import com.mysportsfeed.param.common.CommonSeasonParams;
import com.mysportsfeed.param.nhl.*;
import com.mysportsfeed.response.nhl.*;
import com.mysportsfeed.response.nhl.component.NHLPlayByPlay;
import com.mysportsfeed.response.nhl.component.NHLPlayerGameLogList;
import com.mysportsfeed.response.nhl.component.NHLRosterPlayers;
import lombok.Setter;

public class NHLClient extends BaseClient {

    @Setter
    private String baseUrl = "https://api.mysportsfeeds.com/v1.0/pull/nhl";

    public NHLClient(String apiKey, String password) {
        super(apiKey, password);
    }

    public NHLSchedule getFullGameSchedule(NHLFullGameScheduleParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/full_game_schedule"), NHLSchedule.class);
    }

    public NHLSchedule getDailyGameSchedule(NHLDailyGameScheduleParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/daily_game_schedule"), NHLSchedule.class);
    }

    public NHLScoreboard getScoreboard(NHLScoreboardParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/scoreboard"), NHLScoreboard.class);
    }

    public NHLLatestUpdates getLatestUpdates(CommonSeasonParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/latest_updates"), NHLLatestUpdates.class);
    }

    public NHLSeasonList getCurrentSeason(NHLCurrentSeasonParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/current_season"), NHLSeasonList.class);
    }

    public NHLPlayerStats getCumulativePlayerStats(NHLCumulativePlayerStatsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/cumulative_player_stats"), NHLPlayerStats.class);
    }

    public NHLPlayerStats getDailyPlayerStats(NHLDailyPlayerStatsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/daily_player_stats"), NHLPlayerStats.class);
    }

    public NHLPlayerGameLogList getPlayerGameLogs(NHLPlayerGameLogsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/player_gamelogs"), NHLPlayerGameLogList.class);
    }

    public NHLTeamGameLogList getTeamGameLogs(NHLTeamGameLogsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/team_gamelogs"), NHLTeamGameLogList.class);
    }

    public NHLOverallTeamStandings getOverallTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/overall_team_standings"), NHLOverallTeamStandings.class);
    }

    public NHLConferenceTeamStandings getConferenceTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/conference_team_standings"), NHLConferenceTeamStandings.class);
    }

    public NHLDivisionTeamStandings getDivisionTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/division_team_standings"), NHLDivisionTeamStandings.class);
    }

    public NHLConferenceTeamStandings getPlayoffTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/playoff_team_standings"), NHLConferenceTeamStandings.class);
    }

    public NHLBoxScore getBoxScore(NHLBoxScoreParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/game_boxscore"), NHLBoxScore.class);
    }

    public NHLPlayByPlay getPlayByPlay(NHLPlayByPlayParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/game_playbyplay"), NHLPlayByPlay.class);
    }

    public NHLRosterPlayers getRosterPlayers(NHLRosterPlayersParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/roster_players"), NHLRosterPlayers.class);
    }

    public NHLGameLineup getGameStartingLineup(NHLGameStartingLineupParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/game_startinglineup"), NHLGameLineup.class);
    }

    public NHLActivePlayers getActivePlayers(NHLActivePlayersParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/active_players"), NHLActivePlayers.class);
    }

    public NHLPlayerInjuries getInjuredPlayers(NHLInjuredPlayersParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/player_injuries"), NHLPlayerInjuries.class);
    }

    public NHLDailyDfs getDailyDfs(NHLDailyDfsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/daily_dfs"), NHLDailyDfs.class);
    }

}
