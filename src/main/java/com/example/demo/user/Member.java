package com.example.demo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.user.UserRole;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Entity
@Table(name = "Members")
public class Member {

	    @Id
	    @GeneratedValue
	    private int seq;

	    @Column(unique = true)
	    @NotBlank
	    private String username;
	    @NotBlank
	    private String password;
	    @NotBlank
	    private String name;
	    @NotBlank
	    private String email;
	    @NotBlank
	    private String address;

	    @Column(name = "role")
	    @Enumerated(EnumType.STRING)
	    private UserRole role = UserRole.ROLE_NOT_PERMITTED;

	    @Temporal(TemporalType.TIMESTAMP)
	    @CreationTimestamp
	    private Date createAt;
	    @Temporal(TemporalType.TIMESTAMP)
	    @UpdateTimestamp
	    private Date updateAt;
}
