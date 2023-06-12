package com.mysportsfeeds.client;

import com.mysportsfeeds.client.exception.MySportsFeedsException;
import com.mysportsfeeds.param.common.CommonSeasonParams;
import com.mysportsfeeds.param.nhl.*;
import com.mysportsfeeds.type.SeasonType;
import org.junit.Test;

import java.util.List;

public class NHLClientTest {

    private final NHLClient sut;
    private final String baseUrl = "https://scrambled-api.mysportsfeeds.com/v1.1/pull/nhl";

    public NHLClientTest() {
        NHLClient nhlClient = new NHLClient("apikey", "password");
        nhlClient.setBaseUrl(baseUrl);
        this.sut = nhlClient;
    }

    @Test
    public void test_fullGameSchedule() throws MySportsFeedsException {
        NHLFullGameScheduleParams params = NHLFullGameScheduleParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .build();
        sut.getFullGameSchedule(params);
    }

    @Test
    public void test_getDailyGameSchedule() throws MySportsFeedsException {
        NHLDailyGameScheduleParams params = NHLDailyGameScheduleParams.builder()
            .seasonType(SeasonType.PLAYOFF)
            .startYear(2023)
            .date("20230417")
            .build();
        sut.getDailyGameSchedule(params);
    }

    @Test
    public void test_getScoreboard() throws MySportsFeedsException {
        NHLScoreboardParams params = NHLScoreboardParams.builder()
            .seasonType(SeasonType.PLAYOFF)
            .startYear(2023)
            .date("20230418")
            .build();
        sut.getScoreboard(params);
    }

    @Test
    public void test_getLatestUpdates() throws MySportsFeedsException {
        CommonSeasonParams params = CommonSeasonParams.builder()
            .seasonType(SeasonType.PLAYOFF)
            .startYear(2023)
            .build();
        sut.getLatestUpdates(params);
    }

    @Test
    public void test_getCurrentSeason() throws MySportsFeedsException {
        NHLCurrentSeasonParams params = NHLCurrentSeasonParams.builder()
            .date("20230417")
            .build();
        sut.getCurrentSeason(params);
    }

    @Test
    public void test_getCumulativePlayerStats() throws MySportsFeedsException {
        NHLCumulativePlayerStatsParams params = NHLCumulativePlayerStatsParams.builder()
            .seasonType(SeasonType.PLAYOFF)
            .startYear(2023)
            .build();
        sut.getCumulativePlayerStats(params);
    }

    @Test
    public void test_getDailyPlayerStats() throws MySportsFeedsException {
        NHLDailyPlayerStatsParams params = NHLDailyPlayerStatsParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .date("20221008")
            .build();
        sut.getDailyPlayerStats(params);
    }

    @Test
    public void test_getPlayerGameLogs() throws MySportsFeedsException {
        NHLPlayerGameLogsParams params = NHLPlayerGameLogsParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .teams(List.of("bos"))
            .build();
        sut.getPlayerGameLogs(params);
    }

    @Test
    public void test_getTeamGameLogs() throws MySportsFeedsException {
        NHLTeamGameLogsParams params = NHLTeamGameLogsParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .teams(List.of("bos"))
            .build();
        sut.getTeamGameLogs(params);
    }

    @Test
    public void test_getOverallTeamStandings() throws MySportsFeedsException {
        NHLTeamStandingsParams params = NHLTeamStandingsParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .build();
        sut.getOverallTeamStandings(params);
    }

    @Test
    public void test_getConferenceTeamStandings() throws MySportsFeedsException {
        NHLTeamStandingsParams params = NHLTeamStandingsParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .build();
        sut.getConferenceTeamStandings(params);
    }

    @Test
    public void test_getDivisionTeamStandings() throws MySportsFeedsException {
        NHLTeamStandingsParams params = NHLTeamStandingsParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .build();
        sut.getDivisionTeamStandings(params);
    }

    @Test
    public void test_getPlayoffTeamStandings() throws MySportsFeedsException {
        NHLTeamStandingsParams params = NHLTeamStandingsParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .build();
        sut.getPlayoffTeamStandings(params);
    }

    @Test
    public void test_getBoxScore() throws MySportsFeedsException {
        NHLBoxScoreParams params = NHLBoxScoreParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .gameId("20221012-SEA-ANA")
            .build();
        sut.getBoxScore(params);
    }

    @Test
    public void test_getPlayByPlay() throws MySportsFeedsException {
        NHLPlayByPlayParams params = NHLPlayByPlayParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .gameId("20221012-CBJ-CAR")
            .build();
        sut.getPlayByPlay(params);
    }

    @Test
    public void test_getRosterPlayers() throws MySportsFeedsException {
        NHLRosterPlayersParams params = NHLRosterPlayersParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .date("20221011")
            .build();
        sut.getRosterPlayers(params);
    }

    @Test
    public void test_getGameStartingLineup() throws MySportsFeedsException {
        NHLGameStartingLineupParams params = NHLGameStartingLineupParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .gameId("20221011-VGK-LAK")
            .build();
        sut.getGameStartingLineup(params);
    }

    @Test
    public void test_getActivePlayers() throws MySportsFeedsException {
        NHLActivePlayersParams params = NHLActivePlayersParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .build();
        sut.getActivePlayers(params);
    }

    @Test
    public void test_getInjuredPlayers() throws MySportsFeedsException {
        NHLInjuredPlayersParams params = NHLInjuredPlayersParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .build();
        sut.getInjuredPlayers(params);
    }

    @Test
    public void test_getDailyDfs() throws MySportsFeedsException {
        NHLDailyDfsParams params = NHLDailyDfsParams.builder()
            .seasonType(SeasonType.REGULAR)
            .startYear(2022)
            .endYear(2023)
            .date("20221011")
            .build();
        sut.getDailyDfs(params);
    }
}
