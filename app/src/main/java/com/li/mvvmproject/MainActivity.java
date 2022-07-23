package com.li.mvvmproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private LinearLayout mLinearLayout;
  private ViewDataBinding mViewDataBinding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
  }

  private void initView() {
    mLinearLayout = findViewById(R.id.my_view_container);
    mViewDataBinding = new ViewDataBinding(mLinearLayout);
  }
}