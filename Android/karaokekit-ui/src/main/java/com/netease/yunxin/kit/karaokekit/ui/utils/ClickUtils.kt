/*
 * Copyright (c) 2022 NetEase, Inc. All rights reserved.
 * Use of this source code is governed by a MIT license that can be
 * found in the LICENSE file.
 */

package com.netease.yunxin.kit.karaokekit.ui.utils

import com.netease.yunxin.kit.alog.ALog

object ClickUtils {
    private var lastClickTime: Long = 0
    private const val CLICK_TIME = 300 // 快速点击间隔时间
    private const val SLIGHTLY_CLICK_TIME = 800 // 稍微地快速点击间隔时间
    private const val TAG = "ClickUtils"

    // 判断按钮是否快速点击
    fun isFastClick(): Boolean {
        val time = System.currentTimeMillis()
        if (time - lastClickTime < CLICK_TIME) { // 判断系统时间差是否小于点击间隔时间
            ALog.d(TAG, "isFastClick:true")
            return true
        }
        lastClickTime = time
        ALog.d(TAG, "isFastClick:false")
        return false
    }

    fun isSlightlyFastClick(): Boolean {
        val time = System.currentTimeMillis()
        if (time - lastClickTime < SLIGHTLY_CLICK_TIME) { // 判断系统时间差是否小于点击间隔时间
            ALog.d(TAG, "isSlightlyFastClick:true")
            return true
        }
        lastClickTime = time
        ALog.d(TAG, "isSlightlyFastClick:false")
        return false
    }
}
