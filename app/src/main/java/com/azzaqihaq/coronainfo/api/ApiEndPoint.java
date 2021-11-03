package com.azzaqihaq.coronainfo.api;

import com.azzaqihaq.coronainfo.model.RiwayatModel;
import com.azzaqihaq.coronainfo.model.CountryModel;
import com.azzaqihaq.coronainfo.model.RingkasanModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Azhar Rivaldi on 20/03/2020.
 */

public interface ApiEndPoint {

    @GET(Api.END_POINT_WORLD_HISTORY)
    Call<List<RiwayatModel>> getHistoryList(@Path("date") String date);

    @GET(Api.END_POINT_SUMMARY_WORLD)
    Call<RingkasanModel> getSummaryWorld();

    @GET(Api.END_POINT_IDN)
    Call<CountryModel> getSummaryIdn();

}
