package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ClassHistory {
    @Id
    private long id;
    @OneToOne
    @JoinColumn(name = "id",insertable = false, updatable = false)
    private ClassRequest classRequest;
    private int percentage;
    private String score;
}
