package com.iyouth.common.login.vo;
// Generated 6 Jan, 2011 11:55:20 PM by Hibernate Tools 3.2.1.GA



/**
 * UserRoleMaster generated by hbm2java
 */
public class UserRoleMaster  implements java.io.Serializable {


     private Integer id;
     private String roleName;
     private String roleDescription;

    public UserRoleMaster() {
    }

	
    public UserRoleMaster(String roleName) {
        this.roleName = roleName;
    }
    public UserRoleMaster(String roleName, String roleDescription) {
       this.roleName = roleName;
       this.roleDescription = roleDescription;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleDescription() {
        return this.roleDescription;
    }
    
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }




}

