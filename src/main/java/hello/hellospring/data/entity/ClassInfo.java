package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ClassInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private String id;
    @OneToOne
    @JoinColumn(name = "department_id",insertable = false, updatable = false)
    private DepartmentInfo departmentInfo;
    @OneToOne
    @JoinColumn(name = "subject_id",insertable = false, updatable = false)
    private SubjectInfo subjectInfo;
    @OneToOne
    @JoinColumn(name = "prof_id",insertable = false, updatable = false)
    private ProfessorInfo professorInfo;
    @ManyToOne
    @JoinColumn(name = "class_id",insertable = false, updatable = false)
    private ClassScheduleInfo classScheduleInfos;
    @OneToOne
    @JoinColumn(name = "building_id",insertable = false, updatable = false)
    private ClassRoom classRoom;

    @Column(name = "class_currentcount",insertable = false, updatable = false)
    private int current_count;
    private int max_count;
}
