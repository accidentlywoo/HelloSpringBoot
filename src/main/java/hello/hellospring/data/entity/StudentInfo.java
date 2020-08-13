package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class StudentInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @OneToOne
    private DepartmentInfo departmentInfo;
    private String name;
    private String email;
    private String pwd;
}
