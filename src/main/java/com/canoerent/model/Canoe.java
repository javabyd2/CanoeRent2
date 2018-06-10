package com.canoerent.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "canoe")
public class Canoe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "canoe_id")
    private Long id;

    @Column(name = "canoe_type")
    private String canoeType;


    @ManyToMany(mappedBy = "canoeSet",cascade = CascadeType.ALL)

    Set<User> userSet = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCanoeType() {
        return canoeType;
    }

    public void setCanoeType(String canoeType) {
        this.canoeType = canoeType;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
