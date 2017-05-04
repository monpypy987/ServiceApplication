package com.rnus.serviceapplication.OPPMSService;

import com.rnus.serviceapplication.OPPMSService.OPPMSDAO.OPPMSDAO;
import com.rnus.serviceapplication.OPPMSService.OPPMSDAO.SendQuick;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by RNUS on 5/4/2017.
 */

public interface OPPMSService {
    @POST("index.php/OPPMS/service_android/graph_cycle")
    Call<OPPMSDAO> getOPPMSData();

    @FormUrlEncoded
    @POST("index.php/OPPMS/service_android/send_quick")
    Call<SendQuick> sendData(@Field("id")String id, @Field("name")String name);
}
