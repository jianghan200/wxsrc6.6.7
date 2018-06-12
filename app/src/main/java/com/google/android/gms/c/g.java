package com.google.android.gms.c;

import com.google.android.gms.common.internal.w;
import java.util.HashMap;
import java.util.Map;

public final class g
  extends af<g>
{
  public final Map<String, Object> aFa = new HashMap();
  
  public static String br(String paramString)
  {
    w.bg(paramString);
    String str = paramString;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.startsWith("&")) {
        str = paramString.substring(1);
      }
    }
    w.i(str, "Name can not be empty or \"&\"");
    return str;
  }
  
  public final String toString()
  {
    return af.n(this.aFa, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */