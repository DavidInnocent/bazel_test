package com.example.bazel.viewmodels;

import androidx.lifecycle.Lifecycle;
        import androidx.lifecycle.LifecycleObserver;
        import androidx.lifecycle.LiveData;
        import androidx.lifecycle.MutableLiveData;
        import androidx.lifecycle.OnLifecycleEvent;

public class MyViewModel extends ViewModel implements LifecycleObserver {
    private MutableLiveData<String> mData = new MutableLiveData<>();

    public MutableLiveData<String> getData() {
        return mData;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        mData.setValue("Hello, World!");
    }
}
