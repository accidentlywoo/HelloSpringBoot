package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class DepartmentInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private String id;
    @Column(name = "department_name")
    private String name;

    public DepartmentInfo() {
    }
    public void setDepartmentInfo(String id, String name) {
        this.id = id;
        this.name =name;
    }
}
