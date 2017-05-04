package com.rnus.serviceapplication.OPPMSService.OPPMSDAO;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by RNUS on 5/4/2017.
 */

public class Details {
    @SerializedName("programName")
    public String programName;

    @SerializedName("projectName")
    public String projectName;

    @SerializedName("dateStart")
    public String dateStart;

    @SerializedName("pspType")
    public String pspType;

    @SerializedName("creator")
    public String creator;

    @SerializedName("success")
    public boolean success;

    @SerializedName("languages")
    public ArrayList<String> languages;
}
