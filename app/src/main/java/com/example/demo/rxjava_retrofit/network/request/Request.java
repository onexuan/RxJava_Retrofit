package com.example.demo.rxjava_retrofit.network.request;

import com.example.demo.rxjava_retrofit.bean.Cause;
import com.example.demo.rxjava_retrofit.network.response.Response;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Request {

    String HOST = "http://192.168.199.159:8080/";

    @GET("test/list")
    Observable<Response<List<Cause>>> getCauseList();

}
