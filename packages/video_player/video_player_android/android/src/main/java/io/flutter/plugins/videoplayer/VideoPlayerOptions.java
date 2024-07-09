// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.plugins.videoplayer;

class VideoPlayerOptions {
  public boolean mixWithOthers;
  public VideoLoadConfiguration videoLoadConfiguration;
}

class VideoLoadConfiguration {
  public AndroidLoadControl androidLoadControl;
  public DarwinLoadControl darwinLoadControl;
}

class AndroidLoadControl {
  public int minBufferDuration;
  public int maxBufferDuration;
  public int backBufferDuration;
  public int bufferForPlaybackDuration;
  public int bufferForPlaybackAfterRebufferDuration;
  public boolean prioritizeTimeOverSizeThresholds;
}

class DarwinLoadControl {
  public boolean automaticallyWaitsToMinimizeStalling;
  public int preferredForwardBufferDuration;
  public boolean canUseNetworkResourcesForLiveStreamingWhilePaused;
  public int preferredPeakBitRate;
}