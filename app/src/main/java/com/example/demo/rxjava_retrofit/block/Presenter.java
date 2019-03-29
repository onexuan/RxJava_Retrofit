package com.example.demo.rxjava_retrofit.block;

import com.example.demo.rxjava_retrofit.network.response.ResponseTransformer;
import com.example.demo.rxjava_retrofit.network.schedulers.BaseSchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class Presenter {

    private Model model;

    private Contract.View view;

    private BaseSchedulerProvider schedulerProvider;

    private CompositeDisposable mDisposable;

    public Presenter(Model model,
                     Contract.View view,
                     BaseSchedulerProvider schedulerProvider) {
        this.model = model;
        this.view = view;
        this.schedulerProvider = schedulerProvider;
        mDisposable = new CompositeDisposable();

    }

    public void despose(){
        mDisposable.dispose();
    }

    public void getList() {

        Disposable disposable = model.getCauseList()
                .compose(ResponseTransformer.handleResult())
                .compose(schedulerProvider.applySchedulers())
                .subscribe(causeBeans -> {
                    // 处理数据 直接获取到List<Cause> carBeans
                    view.getDataSuccess(causeBeans);
                }, throwable -> {
                    // 处理异常
                    view.getDataFail();
                });

        mDisposable.add(disposable);
    }

}
