package org.example.api.entity;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "CreateTime", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "LastTime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastTime;

    @Column(name = "Status", nullable = false)
    private boolean status = true; // true = Visible, false = Hidden

    @PrePersist
    protected void onCreate() {
        Date now = new Date();
        this.createTime = now;
        this.lastTime = now;
    }

    @PreUpdate
    protected void onUpdate() {
        this.lastTime = new Date();
    }
}
