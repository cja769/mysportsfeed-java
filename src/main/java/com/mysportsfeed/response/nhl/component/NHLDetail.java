package com.mysportsfeed.response.nhl.component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

import java.util.Date;

@Data
public class NHLDetail {

    private String name;

    private String slug;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date startDate;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date endDate;

    private String intervalType;
}
