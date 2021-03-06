package com.pattern.thai.mvpapplication.mvp.startavtivity;

import com.jess.arms.mvp.IView;
import com.jess.arms.mvp.IModel;
import com.tbruyelle.rxpermissions2.RxPermissions;

/**
 * 定義兩邊的接口
 */
/**
 * 這裡做接口
 * Created by ggttoo44 on 2017/5/9.
 */

public interface StartContract {
    //對於經常使用的關於用戶界面的方法可以定義到基本視點中，如顯示隱藏進度條，和顯示文字消息
    interface View extends IView {
        //申请权限
        RxPermissions getRxPermissions();
    }

    //Model層定義接口，外部只需關心模型返回的數據，無需關心內部細節，及是否使用緩存
    interface Model extends IModel {

    }
}