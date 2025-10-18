package com.BC3.BilinChain30.enitys.manytomany.compositekeys;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class UserRoleId implements Serializable {
    private long userId;
    private long roleId;
}
