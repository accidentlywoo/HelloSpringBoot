package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
public class ClassRequest {
    @Id @OneToOne
    private ClassInfo id;
    @Id @OneToOne
    private StudentInfo studentInfo;
}
