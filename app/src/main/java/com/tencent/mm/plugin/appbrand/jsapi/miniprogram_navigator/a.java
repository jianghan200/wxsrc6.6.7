package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.mm.sdk.platformtools.bi;

public enum a
{
  public final int fmv;
  
  private a(int paramInt)
  {
    this.fmv = paramInt;
  }
  
  public static a a(String paramString, a parama)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return parama;
      a[] arrayOfa = values();
      int j = arrayOfa.length;
      int i = 0;
      while (i < j)
      {
        a locala = arrayOfa[i];
        if (locala.name().toLowerCase().equals(paramString)) {
          return locala;
        }
        i += 1;
      }
    }
  }
  
  public static a kO(int paramInt)
  {
    a[] arrayOfa = values();
    int j = arrayOfa.length;
    int i = 0;
    while (i < j)
    {
      a locala = arrayOfa[i];
      if (locala.fmv == paramInt) {
        return locala;
      }
      i += 1;
    }
    return fVw;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */