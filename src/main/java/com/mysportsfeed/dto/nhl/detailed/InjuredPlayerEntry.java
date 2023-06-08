package com.mysportsfeed.dto.nhl.detailed;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class InjuredPlayerEntry extends PlayerEntry {

    private String injury;
}
