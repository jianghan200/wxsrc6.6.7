package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class s
{
  final Map<String, String> aFa;
  final long aGk;
  final String aGl;
  final String aGm;
  final boolean aGn;
  long aGo;
  
  public s(String paramString1, String paramString2, boolean paramBoolean, long paramLong, Map<String, String> paramMap)
  {
    w.bg(paramString1);
    w.bg(paramString2);
    this.aGk = 0L;
    this.aGl = paramString1;
    this.aGm = paramString2;
    this.aGn = paramBoolean;
    this.aGo = paramLong;
    if (paramMap != null)
    {
      this.aFa = new HashMap(paramMap);
      return;
    }
    this.aFa = Collections.emptyMap();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/analytics/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */