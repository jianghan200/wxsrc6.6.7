package com.google.android.gms.c;

import com.google.android.gms.common.internal.g;
import java.util.regex.Pattern;

public final class ab
{
  private static final Pattern aXP = Pattern.compile("\\$\\{(.*?)\\}");
  
  public static boolean bt(String paramString)
  {
    return (paramString == null) || (g.aNs.k(paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/c/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */