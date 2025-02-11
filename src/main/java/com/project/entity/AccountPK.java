package com.project.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class AccountPK implements Serializable {

    private Long accNum;
    private String accType;

}
