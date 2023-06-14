package ua.lviv.iot.weblab.model;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    @NotNull
    @Column
    private String name;

//    @NotNull
    @Column
    private String text;

}
