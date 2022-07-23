package com.li.mvvmproject;

import android.view.View;
import android.widget.TextView;

public class ViewModel {
  private Model mModel;

  public ViewModel(Model model, viewModelListener viewModelListener) {
    mModel = model;
    mViewModelListener = viewModelListener;
  }

  public void handleClickEvent(View view){
  }

  private ViewModel.viewModelListener mViewModelListener;
  public static interface ModelListener{
    void modelChanged();
  }
  public static interface viewModelListener{
    void viewModelChanged();
  }
}
