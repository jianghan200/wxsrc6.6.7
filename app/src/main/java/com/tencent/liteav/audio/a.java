package com.tencent.liteav.audio;

import android.content.Context;
import android.media.AudioManager;
import com.tencent.liteav.audio.impl.TXCTraeJNI;
import com.tencent.liteav.basic.log.TXCLog;

public class a
{
  static {}
  
  public static void a(Context paramContext, int paramInt)
  {
    if (paramContext == null) {
      return;
    }
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    if (paramInt == TXEAudioDef.TXE_AUDIO_MODE_RECEIVER)
    {
      paramContext.setMode(3);
      paramContext.setSpeakerphoneOn(false);
      TXCLog.i("TXCAudioConfig", "AudioCenter setAudioMode to receiver");
      return;
    }
    paramContext.setMode(0);
    paramContext.setSpeakerphoneOn(true);
    TXCLog.i("TXCAudioConfig", "AudioCenter setAudioMode to speaker");
  }
  
  public static void a(String paramString)
  {
    TXCTraeJNI.nativeSetTraeConfig(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/liteav/audio/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */