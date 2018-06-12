package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.util.Logger;

public class AudioPlayerConfigure
{
  private static final String TAG = "AudioPlayerConfigure";
  private static ISoLibraryLoader mISoLibraryLoader = new AudioPlayerConfigure.1();
  static int minAudioTrackWaitTimeMs = 300;
  
  public static ISoLibraryLoader getSoLibraryLoader()
  {
    return mISoLibraryLoader;
  }
  
  public static void setAudioTrackMinWaitTimeMs(int paramInt)
  {
    minAudioTrackWaitTimeMs = paramInt;
  }
  
  public static void setLog(ILog paramILog)
  {
    if (paramILog != null) {
      paramILog.i("AudioPlayerConfigure", "QQMusicAudioPlayer codec version:0.5.12");
    }
    Logger.setLog(paramILog);
  }
  
  public static void setSoLibraryLoader(ISoLibraryLoader paramISoLibraryLoader)
  {
    if (paramISoLibraryLoader != null) {
      mISoLibraryLoader = paramISoLibraryLoader;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/AudioPlayerConfigure.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */