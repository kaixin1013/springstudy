package com.spring.aop.ioc;

import java.util.List;

/**
 * Created by hp on 2019/3/4.
 */
public class Meeting {
    private String theme;
    private List<Boss> boss;

    public Meeting() {
    }

    public Meeting(String theme, List<Boss> boss) {
        this.theme = theme;
        this.boss = boss;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBoss() {
        return boss;
    }

    public void setBoss(List<Boss> boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", boss=" + boss +
                '}';
    }
}