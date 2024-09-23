package com.gec.pojo;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

//
//    public Integer getUserid() {
//        return userid;
//    }
//
//    public void setUserid(Integer userid) {
//        this.userid = userid;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public Integer getUserage() {
//        return userage;
//    }
//
//    public void setUserage(Integer userage) {
//        this.userage = userage;
//    }
//
//    public String getUsersex() {
//        return usersex;
//    }
//
//    public void setUsersex(String usersex) {
//        this.usersex = usersex;
//    }
//
//    public String getUseraddress() {
//        return useraddress;
//    }
//
//    public void setUseraddress(String useraddress) {
//        this.useraddress = useraddress;
//    }
//    private Integer userid;
//
//    public User() {
//    }
//
//    public User(Integer userid, String username, Integer userage, String usersex, String useraddress) {
//        this.userid = userid;
//        this.username = username;
//        this.userage = userage;
//        this.usersex = usersex;
//        this.useraddress = useraddress;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userid=" + userid +
//                ", username='" + username + '\'' +
//                ", userage=" + userage +
//                ", usersex='" + usersex + '\'' +
//                ", useraddress='" + useraddress + '\'' +
//                '}';
//    }

    private String username;
    private Integer userage;
    private String usersex;
    private String useraddress;
    private int userid;

}
