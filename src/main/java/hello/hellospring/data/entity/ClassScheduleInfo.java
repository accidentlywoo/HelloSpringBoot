package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ClassScheduleInfo {
    @Id
    @Column(name = "class_id")
    private String id;
    @Id @Column(length = 3)
    private String week_day;
    @Id
    private String start_time;
    private String end_time;
}
