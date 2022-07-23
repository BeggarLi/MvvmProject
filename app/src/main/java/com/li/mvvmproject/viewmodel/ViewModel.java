package com.li.mvvmproject.viewmodel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.li.mvvmproject.model.Data;
import com.li.mvvmproject.model.Model;
import com.li.mvvmproject.model.ModelDataListener;
import com.li.mvvmproject.mvvm.BaseViewModel;
import com.li.mvvmproject.mvvm.Intent;

public class ViewModel extends BaseViewModel {

  @NonNull
  private final Model mModel;

  @Nullable
  private ViewModelListener mViewModelListener;

  // 监听model数据变化
  @NonNull
  private final ModelDataListener mModelDataListener = new ModelDataListener() {
    @Override
    public void onDataChanged(@NonNull Data data) {
      notifyViewUpdate(data);
    }
  };

  public ViewModel(@NonNull Model model) {
    mModel = model;
    mModel.registerDataListener(mModelDataListener);
  }

  public void setViewModelListener(@Nullable ViewModelListener viewModelListener) {
    mViewModelListener = viewModelListener;
  }

  void notifyViewUpdate(Data data) {
    mViewModelListener.onTitle1Changed(data.mTitle1);
    mViewModelListener.onTitle2Changed(data.mTitle2);
    mViewModelListener.onTitle3Changed(data.mTitle3);
  }

  @Override
  public void handleIntent(@NonNull Intent intent) {
    if (intent instanceof TitleOneIntent) {
      mModel.requestNet();
    } else if (intent instanceof Title2Intent) {
      mModel.requestUserInfoNet();
    } else if (intent instanceof Title3Intent) {
      mModel.requestxxxNet();
    }
  }

  public interface ViewModelListener {
    void onTitle1Changed(@Nullable String title);

    void onTitle2Changed(@Nullable String title);

    void onTitle3Changed(@Nullable String title);
  }
}
