package com.LoginRegister.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Users {

    @Id
    private String email;

    private String name;

    private String password;
}
