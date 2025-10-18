package com.BC3.BilinChain30.enitys.manytomany.compositekeys;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class RolePermissionId implements Serializable {
    private long roleId;
    private long permissionId;
}
