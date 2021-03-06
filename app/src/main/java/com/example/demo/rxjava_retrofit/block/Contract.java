package com.example.demo.rxjava_retrofit.block;

import com.example.demo.rxjava_retrofit.bean.Cause;
import com.example.demo.rxjava_retrofit.network.response.Response;

import java.util.List;

import io.reactivex.Observable;

public class Contract {

    public interface View {
        void getDataSuccess(List<Cause> causeList);
        void getDataFail();
    }

    public interface Model {
        Observable<Response<List<Cause>>> getCauseList();
    }

}
