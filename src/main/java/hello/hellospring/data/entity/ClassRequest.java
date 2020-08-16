package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ClassRequest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Id 필드 추가
    @OneToOne
    @JoinColumn(insertable = false, updatable = false)
    private ClassInfo class_id;
    @OneToOne
    @JoinColumn(insertable = false, updatable = false)
    private StudentInfo studentInfo;
}
