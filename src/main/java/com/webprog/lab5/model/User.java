package com.webprog.lab5.model;

import com.webprog.lab5.constant.Gender;
import com.webprog.lab5.model.base.UUIDEntityBase;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User extends UUIDEntityBase {

    private static final long serialVersionUID = 8889990467901825421L;

    @Getter
    @Setter
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Getter
    @Setter
    @Column(name = "password", nullable = false)
    private String password;

    @Getter
    @Setter
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Getter
    @Setter
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Getter
    @Setter
    @Column(name = "patronymic")
    private String patronymic;

    @Getter
    @Setter
    @Column(name = "birthday")
    private String birthday;

    @Getter
    @Setter
    @Column(name = "gender")
    private Gender gender;

    @Getter
    @Setter
    @Column(name = "address")
    private String address;

    @Getter
    @Setter
    @Column(name = "image_path")
    private String imagePath;

}
