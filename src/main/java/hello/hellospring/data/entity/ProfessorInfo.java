package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "prof_info")
public class ProfessorInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prof_id")
    private String id;
    @Column(name = "prof_name")
    private String name;
    @OneToOne
    private DepartmentInfo departmentInfo;
}
