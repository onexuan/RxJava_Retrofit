package com.example.demo.rxjava_retrofit.block;

import com.example.demo.rxjava_retrofit.bean.Cause;
import com.example.demo.rxjava_retrofit.network.NetWorkManager;
import com.example.demo.rxjava_retrofit.network.response.Response;

import java.util.List;

import io.reactivex.Observable;

public class Model implements Contract.Model {
    @Override
    public Observable<Response<List<Cause>>> getCauseList() {
        return NetWorkManager.getRequest().getCauseList();
    }
}
