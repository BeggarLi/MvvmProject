package com.li.mvvmproject.model;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

import com.li.mvvmproject.TimeUtil;
import com.li.mvvmproject.viewmodel.ViewModel;

// 负责逻辑和数据
public class Model {

  // 数据源
  private Data mData = Data.EMPTY;

  // 所有的监听者
  private List<ModelDataListener> mModelDataListeners = new ArrayList<>();

  // 请求网络刷新数据
  public void requestNet() {
    // ......
    mData.mTitle1 = "1:" + TimeUtil.getCurrentTime();
    mData.mTitle2 = "2:" + TimeUtil.getCurrentTime();
    mData.mTitle3 = "3:" + TimeUtil.getCurrentTime();

    notifyAllListener(mData);
  }

  // 数据更新
  private void notifyAllListener(@NonNull Data data) {
    for (ModelDataListener listener : mModelDataListeners) {
      listener.onDataChanged(data);
    }
  }

  public void registerDataListener(@NonNull ModelDataListener dataListener) {
    mModelDataListeners.add(dataListener);
  }

  public void unregisterDataListener(@NonNull ModelDataListener dataListener) {
    mModelDataListeners.remove(dataListener);
  }

}
