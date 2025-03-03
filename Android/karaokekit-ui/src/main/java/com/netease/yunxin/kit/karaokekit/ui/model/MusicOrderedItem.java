// Copyright (c) 2022 NetEase, Inc. All rights reserved.
// Use of this source code is governed by a MIT license that can be
// found in the LICENSE file.

package com.netease.yunxin.kit.karaokekit.ui.model;

import android.text.TextUtils;
import java.util.Objects;

/** 已点歌曲 */
public class MusicOrderedItem {

  public static final int DISCOUNT_TIME_SEC = 3;

  public static final int STATUS_DEFAULT = 0; //等待演唱

  public static final int STATUS_PAUSE = 1; //等待演唱

  public String musicId; //音乐ID

  public String userId; //点歌人Id

  public int countTimeSec; //距离开始时长

  public int status; //音乐状态

  public long timestamp; //歌词位置，初始化时候如果是暂停使用

  public String musicName; //音乐名称

  public String musicAuthor; //音乐作者

  public String userNickname; //点歌人昵称

  public String musicAvatar; //歌曲头像

  public String userAvatar; //点歌人头像

  public String musicLyricUrl; //歌词地址

  public String musicUrl; //歌曲地址

  public MusicOrderedItem(OnSeatModel user, MusicModel music) {
    this.musicId = music.id;
    this.musicName = music.name;
    this.musicAuthor = music.singer;
    this.musicAvatar = music.avatar;
    this.musicLyricUrl = music.lyricUrl;
    this.musicUrl = music.url;
    this.userId = user.getAccount();
    this.userNickname = user.getNick();
    this.userAvatar = user.getAvatar();
    this.countTimeSec = DISCOUNT_TIME_SEC;
    this.status = STATUS_DEFAULT;
  }

  public void setCountTimeSec(int time) {
    this.countTimeSec = time;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public String getKey() {
    return "music_" + musicId + "_" + userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MusicOrderedItem that = (MusicOrderedItem) o;
    return TextUtils.equals(musicId, that.musicId)
        && TextUtils.equals(userId, that.userId)
        && TextUtils.equals(musicName, that.musicName)
        && TextUtils.equals(musicAuthor, that.musicAuthor)
        && TextUtils.equals(userNickname, that.userNickname)
        && TextUtils.equals(musicAvatar, that.musicAvatar)
        && TextUtils.equals(userAvatar, that.userAvatar)
        && TextUtils.equals(musicLyricUrl, that.musicLyricUrl)
        && TextUtils.equals(musicUrl, that.musicUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        musicId,
        userId,
        musicName,
        musicAuthor,
        userNickname,
        musicAvatar,
        userAvatar,
        musicLyricUrl,
        musicUrl);
  }
}
