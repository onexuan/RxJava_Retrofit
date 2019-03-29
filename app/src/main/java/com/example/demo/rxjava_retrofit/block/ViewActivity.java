package com.example.demo.rxjava_retrofit.block;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.demo.rxjava_retrofit.R;
import com.example.demo.rxjava_retrofit.bean.Cause;
import com.example.demo.rxjava_retrofit.network.schedulers.SchedulerProvider;

import java.util.List;

/**
 * Created by Zaifeng on 2018/3/1.
 */

public class ViewActivity extends AppCompatActivity implements Contract.View {

    private static final String TAG = "ViewActivity";
    private Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        presenter = new Presenter(new Model(), this, SchedulerProvider.getInstance());
    }

    public void btnRequest(View view) {
        presenter.getList();
    }

    @Override
    public void getDataSuccess(List<Cause> causeList) {
        Log.i(TAG, "size:" + causeList.size());
    }

    @Override
    public void getDataFail() {
        Log.e(TAG, "查询来访事由出错!");
    }
}
