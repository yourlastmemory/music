package com.badcode.musicforum.model.music;

import com.badcode.musicforum.model.domain.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "VocalStyle")
@Table(name = "vocal_styles", schema = "music")
@Data
public class VocalStyle extends AbstractBaseEntity {

    private String name;

    private String description;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "musicians_vocal_styles",
            schema = "music",
            joinColumns = {@JoinColumn(name = "musicians_vocal_styles_style")},
            inverseJoinColumns = {@JoinColumn(name = "musicians_vocal_styles_musician")}
    )
    private List<Musician> vocalists;
}
