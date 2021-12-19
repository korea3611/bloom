package com.example.bloom.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(
        indexes = @Index(name="member_index", columnList = "member_set_id")
)
public class Member {
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_set_id", length = 20, nullable = false, unique = true)
    private String memberId;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 30)
    private String name;

    @Column
    private Boolean license;

    @Column(length = 40)
    private String email;
}