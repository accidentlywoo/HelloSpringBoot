package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class SubjectInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String prof_id;
    private String name;
    private String score;
    private String major_or_not;
}
