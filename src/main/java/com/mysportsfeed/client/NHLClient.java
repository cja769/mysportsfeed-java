package com.mysportsfeed.client;

import com.mysportsfeed.client.exception.MySportsFeedException;
import com.mysportsfeed.param.common.CommonSeasonParams;
import com.mysportsfeed.param.nhl.*;
import com.mysportsfeed.response.nhl.*;
import com.mysportsfeed.response.nhl.NHLPlayByPlayResponse;
import com.mysportsfeed.response.nhl.NHLPlayerGameLogResponse;
import com.mysportsfeed.response.nhl.NHLRosterPlayersResponse;
import lombok.Setter;

public class NHLClient extends BaseClient {

    @Setter
    private String baseUrl = "https://api.mysportsfeeds.com/v1.0/pull/nhl";

    public NHLClient(String apiKey, String password) {
        super(apiKey, password);
    }

    public NHLFullGameScheduleResponse getFullGameSchedule(NHLFullGameScheduleParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/full_game_schedule"), NHLFullGameScheduleResponse.class);
    }

    public NHLDailyGameScheduleResponse getDailyGameSchedule(NHLDailyGameScheduleParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/daily_game_schedule"), NHLDailyGameScheduleResponse.class);
    }

    public NHLScoreboardResponse getScoreboard(NHLScoreboardParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/scoreboard"), NHLScoreboardResponse.class);
    }

    public NHLLatestUpdatesResponse getLatestUpdates(CommonSeasonParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/latest_updates"), NHLLatestUpdatesResponse.class);
    }

    public NHLCurrentSeasonResponse getCurrentSeason(NHLCurrentSeasonParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/current_season"), NHLCurrentSeasonResponse.class);
    }

    public NHLCumulativePlayerStatsResponse getCumulativePlayerStats(NHLCumulativePlayerStatsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/cumulative_player_stats"), NHLCumulativePlayerStatsResponse.class);
    }

    public NHLDailyPlayerStatsResponse getDailyPlayerStats(NHLDailyPlayerStatsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/daily_player_stats"), NHLDailyPlayerStatsResponse.class);
    }

    public NHLPlayerGameLogResponse getPlayerGameLogs(NHLPlayerGameLogsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/player_gamelogs"), NHLPlayerGameLogResponse.class);
    }

    public NHLTeamGameLogResponse getTeamGameLogs(NHLTeamGameLogsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/team_gamelogs"), NHLTeamGameLogResponse.class);
    }

    public NHLOverallTeamStandingsResponse getOverallTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/overall_team_standings"), NHLOverallTeamStandingsResponse.class);
    }

    public NHLConferenceTeamStandingsResponse getConferenceTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/conference_team_standings"), NHLConferenceTeamStandingsResponse.class);
    }

    public NHLDivisionTeamStandingsResponse getDivisionTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/division_team_standings"), NHLDivisionTeamStandingsResponse.class);
    }

    public NHLConferenceTeamStandingsResponse getPlayoffTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/playoff_team_standings"), NHLConferenceTeamStandingsResponse.class);
    }

    public NHLBoxScoreResponse getBoxScore(NHLBoxScoreParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/game_boxscore"), NHLBoxScoreResponse.class);
    }

    public NHLPlayByPlayResponse getPlayByPlay(NHLPlayByPlayParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/game_playbyplay"), NHLPlayByPlayResponse.class);
    }

    public NHLRosterPlayersResponse getRosterPlayers(NHLRosterPlayersParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/roster_players"), NHLRosterPlayersResponse.class);
    }

    public NHLGameLineupResponse getGameStartingLineup(NHLGameStartingLineupParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/game_startinglineup"), NHLGameLineupResponse.class);
    }

    public NHLActivePlayersResponse getActivePlayers(NHLActivePlayersParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/active_players"), NHLActivePlayersResponse.class);
    }

    public NHLPlayerInjuriesResponse getInjuredPlayers(NHLInjuredPlayersParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/player_injuries"), NHLPlayerInjuriesResponse.class);
    }

    public NHLDailyDfsResponse getDailyDfs(NHLDailyDfsParams params) throws MySportsFeedException {
        return execute(params.buildUrlString(baseUrl, "/daily_dfs"), NHLDailyDfsResponse.class);
    }

}
