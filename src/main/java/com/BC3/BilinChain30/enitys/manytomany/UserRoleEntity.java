package com.BC3.BilinChain30.enitys.manytomany;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.BC3.BilinChain30.enitys.RoleEntity;
import com.BC3.BilinChain30.enitys.UserEntity;
import com.BC3.BilinChain30.enitys.manytomany.compositekeys.UserRoleId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user_roles")
@Data
public class UserRoleEntity {

    @EmbeddedId
    private UserRoleId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "role_id")
    private RoleEntity role;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}
