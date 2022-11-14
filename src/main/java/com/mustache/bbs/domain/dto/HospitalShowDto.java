package com.mustache.bbs.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HospitalShowDto {

    private Integer id;
    private String hospitalName;
    private String businessTypeName;
    private String businessStatusCode;
    private String roadNameAddress;
    private String phone;
    private Float totalAreaSize;
}
