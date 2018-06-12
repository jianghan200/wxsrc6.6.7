package com.google.android.exoplayer2.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
public final class c
{
  public static final c afy = new c(new int[] { 2 }, 2);
  private final int afA;
  final int[] afz;
  
  private c(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt != null)
    {
      this.afz = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
      Arrays.sort(this.afz);
    }
    for (;;)
    {
      this.afA = paramInt;
      return;
      this.afz = new int[0];
    }
  }
  
  public static c W(Context paramContext)
  {
    paramContext = paramContext.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    if ((paramContext == null) || (paramContext.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0)) {
      return afy;
    }
    return new c(paramContext.getIntArrayExtra("android.media.extra.ENCODINGS"), paramContext.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof c)) {
        return false;
      }
      paramObject = (c)paramObject;
    } while ((Arrays.equals(this.afz, ((c)paramObject).afz)) && (this.afA == ((c)paramObject).afA));
    return false;
  }
  
  public final int hashCode()
  {
    return this.afA + Arrays.hashCode(this.afz) * 31;
  }
  
  public final String toString()
  {
    return "AudioCapabilities[maxChannelCount=" + this.afA + ", supportedEncodings=" + Arrays.toString(this.afz) + "]";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */