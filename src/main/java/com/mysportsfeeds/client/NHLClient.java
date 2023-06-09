package com.mysportsfeeds.client;

import com.mysportsfeeds.client.exception.MySportsFeedsException;
import com.mysportsfeeds.param.common.CommonSeasonParams;
import com.mysportsfeeds.param.nhl.*;
import com.mysportsfeeds.response.nhl.*;
import com.mysportsfeeds.response.nhl.NHLPlayByPlayResponse;
import com.mysportsfeeds.response.nhl.NHLPlayerGameLogResponse;
import com.mysportsfeeds.response.nhl.NHLRosterPlayersResponse;
import lombok.Setter;

public class NHLClient extends BaseClient {

    @Setter
    private String baseUrl = "https://api.mysportsfeeds.com/v1.0/pull/nhl";

    public NHLClient(String apiKey, String password) {
        super(apiKey, password);
    }

    public NHLFullGameScheduleResponse getFullGameSchedule(NHLFullGameScheduleParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/full_game_schedule"), NHLFullGameScheduleResponse.class);
    }

    public NHLDailyGameScheduleResponse getDailyGameSchedule(NHLDailyGameScheduleParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/daily_game_schedule"), NHLDailyGameScheduleResponse.class);
    }

    public NHLScoreboardResponse getScoreboard(NHLScoreboardParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/scoreboard"), NHLScoreboardResponse.class);
    }

    public NHLLatestUpdatesResponse getLatestUpdates(CommonSeasonParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/latest_updates"), NHLLatestUpdatesResponse.class);
    }

    public NHLCurrentSeasonResponse getCurrentSeason(NHLCurrentSeasonParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/current_season"), NHLCurrentSeasonResponse.class);
    }

    public NHLCumulativePlayerStatsResponse getCumulativePlayerStats(NHLCumulativePlayerStatsParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/cumulative_player_stats"), NHLCumulativePlayerStatsResponse.class);
    }

    public NHLDailyPlayerStatsResponse getDailyPlayerStats(NHLDailyPlayerStatsParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/daily_player_stats"), NHLDailyPlayerStatsResponse.class);
    }

    public NHLPlayerGameLogResponse getPlayerGameLogs(NHLPlayerGameLogsParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/player_gamelogs"), NHLPlayerGameLogResponse.class);
    }

    public NHLTeamGameLogResponse getTeamGameLogs(NHLTeamGameLogsParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/team_gamelogs"), NHLTeamGameLogResponse.class);
    }

    public NHLOverallTeamStandingsResponse getOverallTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/overall_team_standings"), NHLOverallTeamStandingsResponse.class);
    }

    public NHLConferenceTeamStandingsResponse getConferenceTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/conference_team_standings"), NHLConferenceTeamStandingsResponse.class);
    }

    public NHLDivisionTeamStandingsResponse getDivisionTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/division_team_standings"), NHLDivisionTeamStandingsResponse.class);
    }

    public NHLConferenceTeamStandingsResponse getPlayoffTeamStandings(NHLTeamStandingsParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/playoff_team_standings"), NHLConferenceTeamStandingsResponse.class);
    }

    public NHLBoxScoreResponse getBoxScore(NHLBoxScoreParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/game_boxscore"), NHLBoxScoreResponse.class);
    }

    public NHLPlayByPlayResponse getPlayByPlay(NHLPlayByPlayParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/game_playbyplay"), NHLPlayByPlayResponse.class);
    }

    public NHLRosterPlayersResponse getRosterPlayers(NHLRosterPlayersParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/roster_players"), NHLRosterPlayersResponse.class);
    }

    public NHLGameLineupResponse getGameStartingLineup(NHLGameStartingLineupParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/game_startinglineup"), NHLGameLineupResponse.class);
    }

    public NHLActivePlayersResponse getActivePlayers(NHLActivePlayersParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/active_players"), NHLActivePlayersResponse.class);
    }

    public NHLPlayerInjuriesResponse getInjuredPlayers(NHLInjuredPlayersParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/player_injuries"), NHLPlayerInjuriesResponse.class);
    }

    public NHLDailyDfsResponse getDailyDfs(NHLDailyDfsParams params) throws MySportsFeedsException {
        return execute(params.buildUrlString(baseUrl, "/daily_dfs"), NHLDailyDfsResponse.class);
    }

}
