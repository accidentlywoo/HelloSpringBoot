package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
public class ClassHistory {
    @Id @OneToOne
    private ClassRequest classRequest;
    @Id @OneToOne
    private StudentInfo studentInfo;
    private int percentage;
    private String score;
}
