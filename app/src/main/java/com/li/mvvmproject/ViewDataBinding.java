package com.li.mvvmproject;

import android.view.View;
import android.widget.TextView;

public class ViewDataBinding {
  private View mView;
  private TextView mTextView1;
  private TextView mTextView2;
  private TextView mTextView3;
  private ViewModel mViewModel;
  private ViewModel.viewModelListener mViewModelListener;

  public ViewDataBinding(View view) {
    mView = view;
  }

  public ViewDataBinding(ViewModel model,
      ViewModel.viewModelListener viewModelListener) {
    mViewModel = model;
    mViewModelListener = viewModelListener;
  }

  public void InitView(){
    mTextView1 = mView.findViewById(R.id.text_view_1);
    mTextView2 = mView.findViewById(R.id.text_view_2);
    mTextView3 = mView.findViewById(R.id.text_view_3);
    mTextView1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mViewModel.handleClickEvent(v);
      }
    });
    mTextView2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mViewModel.handleClickEvent(v);
      }
    });
    mTextView3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mViewModel.handleClickEvent(v);
      }
    });
  }
}
