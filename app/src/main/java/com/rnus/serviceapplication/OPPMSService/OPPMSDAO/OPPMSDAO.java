package com.rnus.serviceapplication.OPPMSService.OPPMSDAO;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by RNUS on 5/4/2017.
 */

public class OPPMSDAO {
    @SerializedName("details")
    public Details details;
    @SerializedName("graphData")
    public ArrayList<GraphData> graphData;
}
