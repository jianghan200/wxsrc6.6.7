package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure;
import com.tencent.qqmusic.mediaplayer.ISoLibraryLoader;

public class Util4NativeCommon
{
  private static final String TAG = "Util4NativeCommon";
  
  static
  {
    try
    {
      AudioPlayerConfigure.getSoLibraryLoader().load("audio_common");
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      Logger.e("Util4NativeCommon", localUnsatisfiedLinkError);
      return;
    }
    catch (Throwable localThrowable)
    {
      Logger.e("Util4NativeCommon", localThrowable);
    }
  }
  
  public static native boolean isSupportNeon();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/util/Util4NativeCommon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */