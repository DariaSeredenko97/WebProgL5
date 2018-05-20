package com.webprog.lab5.model.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@ToString
@EqualsAndHashCode
@MappedSuperclass
public class UUIDEntityBase implements EntityBase<String> {

    private static final long serialVersionUID = -7494083061960982465L;

    @Id
    @Getter
    @Setter
    @Column(updatable = false, nullable = false, unique = true, length = UUIDLength)
    private String Id;

}
