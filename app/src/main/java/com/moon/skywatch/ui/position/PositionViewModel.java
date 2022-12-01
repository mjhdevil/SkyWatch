package com.moon.skywatch.ui.position;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PositionViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PositionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is connection6 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

