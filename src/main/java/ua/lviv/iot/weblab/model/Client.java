package ua.lviv.iot.weblab.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "client")
public class Client {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;

   @Column
   private String name;

   @Column
   private String number;

   @Column
   private String post;

}
