package com;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "integrals")
public class Integral {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Lob
    @Column(name = "\"clientCode\"")
    private String clientCode;

    @Column(name = "result")
    private Long result;

    @Lob
    @Column(name = "ip")
    private String ip;

    @Column(name = "date")
    private LocalDateTime date;

    public Integral(String clientCode) {
        this.clientCode = clientCode;
    }

    public Integral() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }
}