package com.ram.Hanumanjetlibrary;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class testmodel {


    @SerializedName("ss_id")
    @Expose
    public String ss_id;

    public String getSs_id() {
        return ss_id;
    }

    public void setSs_id(String ss_id) {
        this.ss_id = ss_id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getAdmission_no() {
        return admission_no;
    }

    public void setAdmission_no(String admission_no) {
        this.admission_no = admission_no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @SerializedName("lastname")
    @Expose
    public String lastname;



    @SerializedName("firstname")
    @Expose
    public String firstname;



    @SerializedName("roll_no")
    @Expose
    public String roll_no;



    @SerializedName("admission_no")
    @Expose
    public String admission_no;


    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("image")
    @Expose
    public String image;


}
