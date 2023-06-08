package com.mysportsfeed.response.nhl.component;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NHLInjuredPlayerEntry extends NHLPlayerEntry {

    private String injury;
}
