import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private int firstSemestr;
    private int secondSemestr;
    private int thirdSemestr;
    private int fourthSemestr;
    private int fiveSemestr;
    private int sixthSemestr;
    private int seventhSemestr;
    private int eighthSemestr;
    private int ninthSemestr;
    private int tenthSemestr;
    private int total;

    public int getTotal() {
        return total;
    }

    public int getTenthSemestr() {
        return tenthSemestr;
    }

    public void setTenthSemestr(int tenthSemestr) {
        this.tenthSemestr = tenthSemestr;
        this.total += this.tenthSemestr;
    }

    public int getNinthSemestr() {
        return ninthSemestr;
    }

    public void setNinthSemestr(int ninthSemestr) {
        this.ninthSemestr = ninthSemestr;
        this.total += this.ninthSemestr;
    }

    public int getEighthSemestr() {
        return eighthSemestr;
    }

    public void setEighthSemestr(int eighthSemestr) {
        this.eighthSemestr = eighthSemestr;
        this.total += this.eighthSemestr;
    }

    public int getSeventhSemestr() {
        return seventhSemestr;
    }

    public void setSeventhSemestr(int seventhSemestr) {
        this.seventhSemestr = seventhSemestr;
        this.total += this.seventhSemestr;
    }

    public int getSixthSemestr() {
        return sixthSemestr;
    }

    public void setSixthSemestr(int sixthSemestr) {
        this.sixthSemestr = sixthSemestr;
        this.total += this.sixthSemestr;
    }

    public int getFiveSemestr() {
        return fiveSemestr;
    }

    public void setFiveSemestr(int fiveSemestr) {
        this.fiveSemestr = fiveSemestr;
        this.total += this.fiveSemestr;
    }

    public int getFourthSemestr() {
        return fourthSemestr;
    }

    public void setFourthSemestr(int fourthSemestr) {
        this.fourthSemestr = fourthSemestr;
        this.total += this.fourthSemestr;
    }

    public int getThirdSemestr() {
        return thirdSemestr;
    }

    public void setThirdSemestr(int thirdSemestr) {
        this.thirdSemestr = thirdSemestr;
        this.total += this.thirdSemestr;
    }

    public int getSecondSemestr() {
        return secondSemestr;
    }

    public void setSecondSemestr(int secondSemestr) {
        this.secondSemestr = secondSemestr;
        this.total += this.secondSemestr;
    }

    public int getFirstSemestr() {
        return firstSemestr;

    }

    public void setFirstSemestr(int firstSemestr) {
        this.firstSemestr = firstSemestr;
        this.total += this.firstSemestr;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
