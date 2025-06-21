package com.khadka.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
public class Publisher {
    private String pubId;  // Publisher ID
    private String name;
    private String address;
}

