package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class StudentInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private String id;
    @OneToOne
    private DepartmentInfo departmentInfo;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_email")
    private String email;
    @Column(name = "student_pwd")
    private String pwd;
}
