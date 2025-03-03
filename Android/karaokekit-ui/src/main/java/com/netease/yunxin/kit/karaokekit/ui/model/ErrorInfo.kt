/*
 * Copyright (c) 2022 NetEase, Inc. All rights reserved.
 * Use of this source code is governed by a MIT license that can be
 * found in the LICENSE file.
 */

package com.netease.yunxin.kit.karaokekit.ui.model

data class ErrorInfo(
    val serious: Boolean,
    val code: Int,
    val msg: String? = null
)
