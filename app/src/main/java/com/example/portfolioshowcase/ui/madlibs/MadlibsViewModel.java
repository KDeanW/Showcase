package com.example.portfolioshowcase.ui.madlibs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MadlibsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MadlibsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Fill in the blanks!:");
    }

    public LiveData<String> getText() {
        return mText;
    }
}