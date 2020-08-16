package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class ClassInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id",length = 15)
    private String id;
    @OneToOne
    private DepartmentInfo departmentInfo;
    @OneToOne
    private SubjectInfo subjectInfo;
    @OneToOne
    private ProfessorInfo professorInfo;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassScheduleInfo classScheduleInfos;
    @OneToOne
    private ClassRoom classRoom;

    @Column(name = "class_currentcount")
    private int current_count;
    private int max_count;
}
