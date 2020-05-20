import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private int total;
    private ArrayList<Integer> work = new ArrayList<>();


    public int getTotal() {
        return total;
    }

    public int getTenthSemestr() {
        return work.get(9);
    }

    public void setTenthSemestr(int tenthSemestr) {
        this.work.add(tenthSemestr);
        this.total += tenthSemestr;
    }

    public int getNinthSemestr() {
        return work.get(8);
    }

    public void setNinthSemestr(int ninthSemestr) {
        this.work.add(ninthSemestr);
        this.total += ninthSemestr;
    }

    public int getEighthSemestr() {
        return work.get(7);
    }

    public void setEighthSemestr(int eighthSemestr) {
        this.work.add(eighthSemestr);
        this.total += eighthSemestr;
    }

    public int getSeventhSemestr() {
        return work.get(6);
    }

    public void setSeventhSemestr(int seventhSemestr) {
        this.work.add(seventhSemestr);
        this.total += seventhSemestr;
    }

    public int getSixthSemestr() {
        return work.get(5);
    }

    public void setSixthSemestr(int sixthSemestr) {
        this.work.add(sixthSemestr);
        this.total += sixthSemestr;
    }

    public int getFiveSemestr() {
        return work.get(4);
    }

    public void setFiveSemestr(int fiveSemestr) {
        this.work.add(fiveSemestr);
        this.total += fiveSemestr;
    }

    public int getFourthSemestr() {
        return work.get(3);
    }

    public void setFourthSemestr(int fourthSemestr) {
        this.work.add(fourthSemestr);
        this.total += fourthSemestr;
    }

    public int getThirdSemestr() {
        return work.get(2);
    }

    public void setThirdSemestr(int thirdSemestr) {
        this.work.add(thirdSemestr);
        this.total += thirdSemestr;
    }

    public int getSecondSemestr() {
        return work.get(1);
    }

    public void setSecondSemestr(int secondSemestr) {
        this.work.add(secondSemestr);
        this.total += secondSemestr;
    }

    public int getFirstSemestr() {
        return work.get(0);

    }

    public void setFirstSemestr(int firstSemestr) {
        this.work.add(firstSemestr);
        this.total += firstSemestr;
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
