package com.google.android.exoplayer2.source.a;

import com.google.android.exoplayer2.h.q.e;

public final class b
{
  public static boolean b(Exception paramException)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramException instanceof q.e))
    {
      int i = ((q.e)paramException).responseCode;
      if (i != 404)
      {
        bool1 = bool2;
        if (i != 410) {}
      }
      else
      {
        bool1 = true;
      }
    }
    return bool1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/source/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */