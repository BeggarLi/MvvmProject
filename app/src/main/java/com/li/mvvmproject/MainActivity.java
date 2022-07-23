package com.li.mvvmproject;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.li.mvvmproject.model.Model;
import com.li.mvvmproject.viewbinding.ViewDataBinding;
import com.li.mvvmproject.viewmodel.ViewModel;

public class MainActivity extends AppCompatActivity {
  private LinearLayout mLinearLayout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
  }

  private void initView() {
    mLinearLayout = findViewById(R.id.my_view_container);

    Model model = new Model();

    ViewModel viewModel = new ViewModel(model);

    ViewDataBinding viewDataBinding = new ViewDataBinding(mLinearLayout);
    viewDataBinding.bindViewModel(viewModel);
  }
}