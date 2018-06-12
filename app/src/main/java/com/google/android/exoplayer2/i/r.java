package com.google.android.exoplayer2.i;

import android.os.Trace;

public final class r
{
  public static void beginSection(String paramString)
  {
    if (t.SDK_INT >= 18) {
      Trace.beginSection(paramString);
    }
  }
  
  public static void endSection()
  {
    if (t.SDK_INT >= 18) {
      Trace.endSection();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/i/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */