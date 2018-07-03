package com.github.kkimishima.springbootsecuritydemo.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "security_demo")
public class SecurityDemo {

  @Id
  private Integer id;

  @Column
  private String name;

  @Column
  private String email;

  @Column
  private String pass;

  @CreationTimestamp
  @Column(name = "created_time", updatable = false)
  public Timestamp createdTime;

  @UpdateTimestamp
  @Column(name = "updated_time")
  private Timestamp updatedTime;
}
