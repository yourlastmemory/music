package com.badcode.musicforum.model.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.UUID;

/**
 * Base class with property 'id'.
 * Used as a base class for all objects that requires this property.
 *
 * @author yourlastmemory
 * @version 1.0
 */

@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class AbstractBaseEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;

    @CreatedDate
    @Column(name = "created_date")
    private Date created;

    @LastModifiedDate
    @Column(name = "updated_date")
    private Date updated;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
