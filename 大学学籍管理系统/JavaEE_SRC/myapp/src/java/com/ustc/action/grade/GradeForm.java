package com.ustc.action.grade;

import org.apache.struts.action.ActionForm;


/**
 * ѧ���ɼ���stu_grade��Ӧ�Ķ���
 * @author whb
 *
 */
public class GradeForm extends ActionForm {
    public String stuID; //ѧ��
    public int numElectron;
    public int numSoftware;
    public int numSecurity;
    public int numJava;
    public int numDB;
    public int numImage;
    public int numDistributed;
    public int numTest;

    public int getNumDB() {
        return numDB;
    }

    public void setNumDB(int numDB) {
        this.numDB = numDB;
    }

    public int getNumElectron() {
        return numElectron;
    }

    public void setNumElectron(int numElectron) {
        this.numElectron = numElectron;
    }

    public int getNumImage() {
        return numImage;
    }

    public void setNumImage(int numImage) {
        this.numImage = numImage;
    }

    public int getNumJava() {
        return numJava;
    }

    public void setNumJava(int numJava) {
        this.numJava = numJava;
    }

    public int getNumSecurity() {
        return numSecurity;
    }

    public void setNumSecurity(int numSecurity) {
        this.numSecurity = numSecurity;
    }

    public int getNumSoftware() {
        return numSoftware;
    }

    public void setNumSoftware(int numSoftware) {
        this.numSoftware = numSoftware;
    }

    public int getNumTest() {
        return numTest;
    }

    public void setNumTest(int numTest) {
        this.numTest = numTest;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public int getNumDistributed() {
        return numDistributed;
    }

    public void setNumDistributed(int numDistributed) {
        this.numDistributed = numDistributed;
    }
}
