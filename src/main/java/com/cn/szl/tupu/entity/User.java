package com.cn.szl.tupu.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;



@Data@Entity(name="User")
public class User implements Serializable{

    private static final long serialVersionUID = -3417930882448168081L;

    @Id @Getter @Column(name="USER_NAME", length=50)
    private String userName;

    @Getter @Column(name="PASSWORD", length=50)
    private String password;

    @Getter @Column(name="TEL", length=50)
    private String telephone;

    @Getter @Column(name="EMAIL", length=50)
    private String email;

    @Getter @Column(name="ROLE", length=50)
    private String role;

    public User(){
        super();
    }



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }
}
