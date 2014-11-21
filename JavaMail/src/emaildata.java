/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Speed
 */


public class emaildata {
String uid,upw,upv;

public void setusername(String username){
    uid=username;
}
public void setpassword(String password){
    uid=password;
}
public void setprovider(String provider){
    uid=provider;
}
public String getusername(){
    return(uid);
}
public String getpassword(){
    return(upw);
}
public String getprovider(){
    return(upv);
}
}
