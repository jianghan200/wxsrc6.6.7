package com.tencent.d.b.f;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.d.b.b.a;

abstract class c
  extends d
{
  protected static void dC(String paramString, int paramInt)
  {
    com.tencent.d.a.c.c.d("Soter.BaseSoterPrepareKeyTask", "soter: marking preference. key: %s, status: %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    try
    {
      if (a.cFO().cFR() != null) {
        a.cFO().cFR().edit().putInt(paramString, paramInt).apply();
      }
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/d/b/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */