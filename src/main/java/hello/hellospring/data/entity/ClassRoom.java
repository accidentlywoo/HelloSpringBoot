package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ClassRoom {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "building_id")
    private String id;
    @Column(name = "building_name")
    private String name;
    @Column(name = "max_people")
    private int maxCount;
}
