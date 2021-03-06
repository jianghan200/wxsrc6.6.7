package com.tencent.qqmusic.mediaplayer.audiofx;

import android.content.Context;
import android.os.Bundle;

public abstract interface IAudioListenerBuilder
{
  public abstract IAudioListener createAudioEffect(Bundle paramBundle);
  
  public abstract Bundle getConfiguration(int paramInt);
  
  public abstract String getId();
  
  public abstract void init(Context paramContext);
  
  public abstract boolean isEnabled();
  
  public abstract void release();
  
  public abstract void setConfiguration(int paramInt, Bundle paramBundle);
  
  public abstract boolean setEnabled(boolean paramBoolean);
  
  public abstract void setListener(OnBuilderStateChangedListener paramOnBuilderStateChangedListener);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/audiofx/IAudioListenerBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */