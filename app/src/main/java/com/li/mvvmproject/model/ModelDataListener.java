package com.li.mvvmproject.model;

import androidx.annotation.NonNull;

/**
 * created on: 2022/7/23 6:12 下午
 * description: 数据更改监听
 */
public interface ModelDataListener {

  /**
   * 数据变化
   */
  void onDataChanged(@NonNull Data data);

}
