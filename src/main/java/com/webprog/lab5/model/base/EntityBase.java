package com.webprog.lab5.model.base;

import java.io.Serializable;

public interface EntityBase<PK extends Serializable> extends Serializable {

    byte UUIDLength = 36;

    PK getId();

    void setId(final PK id);

}
