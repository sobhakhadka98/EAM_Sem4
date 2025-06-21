package com.khadka.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
public class Member {
    private String membId;     // Member ID
    private String name;
    private String address;
    private String membType;   // Type of member (e.g., regular, premium)
    private String membDate;   // Membership start date
    private String expiryDate; // Membership expiry date
}
