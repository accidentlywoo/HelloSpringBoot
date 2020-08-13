package hello.hellospring.data.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class ClassScheduleInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String week_day;
    private String start_time;
    private String end_time;
}
