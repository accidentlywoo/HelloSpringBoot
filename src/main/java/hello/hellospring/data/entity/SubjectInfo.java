package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class SubjectInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private String id;
    @Column(name = "subject_name")
    private String name;
    @Column(name = "subject_score")
    private String score;
    private String major_or_not;
}
