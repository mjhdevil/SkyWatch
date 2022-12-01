package com.moon.skywatch.ui.number;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NumberViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NumberViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is number4 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}