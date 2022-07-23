package com.li.mvvmproject.viewbinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.li.mvvmproject.R;
import com.li.mvvmproject.viewmodel.Title2Intent;
import com.li.mvvmproject.viewmodel.Title3Intent;
import com.li.mvvmproject.viewmodel.TitleOneIntent;
import com.li.mvvmproject.viewmodel.ViewModel;

public class ViewDataBinding {

  private TextView mTextView1;
  private TextView mTextView2;
  private TextView mTextView3;

  private ViewModel mViewModel;
  // 监听viewModel数据变化
  @NonNull
  private ViewModel.ViewModelListener mViewModelListener = new ViewModel.ViewModelListener() {
    @Override
    public void onTitle1Changed(@Nullable String title) {
      mTextView1.setText(title);
    }

    @Override
    public void onTitle2Changed(@Nullable String title) {
      mTextView2.setText(title);
    }

    @Override
    public void onTitle3Changed(@Nullable String title) {
      mTextView3.setText(title);
    }
  };

  public ViewDataBinding(@NonNull View rootView) {
    initView(rootView);
  }

  // 绑定vm
  public void bindViewModel(@NonNull ViewModel viewModel) {
    mViewModel = viewModel;
    mViewModel.setViewModelListener(mViewModelListener);
  }

  // 初始化view
  public void initView(@NonNull View rootView) {
    mTextView1 = rootView.findViewById(R.id.text_view_1);
    mTextView2 = rootView.findViewById(R.id.text_view_2);
    mTextView3 = rootView.findViewById(R.id.text_view_3);

    mTextView1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mViewModel.handleIntent(new TitleOneIntent());
      }
    });
    mTextView2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mViewModel.handleIntent(new Title2Intent());
      }
    });
    mTextView3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mViewModel.handleIntent(new Title3Intent());
      }
    });
  }

}
