package com.mysportsfeed.dto.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

import java.util.Date;

@Data
public class Detail {

    private String name;

    private String slug;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date startDate;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date endDate;

    private String intervalType;
}
