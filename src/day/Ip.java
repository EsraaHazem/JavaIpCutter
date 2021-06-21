/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day;

/**
 *
 * @author Esraa
 */
public class Ip {
    String ip;

    public Ip(String ip) {
        this.ip = ip;
    }

    
    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }
    
    public String[] cutIp(){
        String x = getIp();
        String[] arrOfStr = x.split("\\.");
        return arrOfStr;
        
    }

    @Override
    public String toString() {
        return "Ip{" + "ip=" + ip + '}';
    }
    
    
}
