package yxy.test.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yxy on 2016/9/18.
 */
public class Deposit implements Serializable{
    private String title;
    private String remark;
    private Date term;
    private String money;
    private int color;

    //备用字段
    private String other1;
    private String other2;
    private String other3;
    private int otherInt1;
    private int otherInt2;
    private int otherInt3;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getTerm() {
        return term;
    }

    public void setTerm(Date term) {
        this.term = term;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3;
    }

    public int getOtherInt1() {
        return otherInt1;
    }

    public void setOtherInt1(int otherInt1) {
        this.otherInt1 = otherInt1;
    }

    public int getOtherInt2() {
        return otherInt2;
    }

    public void setOtherInt2(int otherInt2) {
        this.otherInt2 = otherInt2;
    }

    public int getOtherInt3() {
        return otherInt3;
    }

    public void setOtherInt3(int otherInt3) {
        this.otherInt3 = otherInt3;
    }
}
