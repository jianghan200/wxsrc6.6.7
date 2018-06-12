package com.tencent.mm.model.gdpr;

import com.tencent.mm.sdk.platformtools.bi;

public enum a
{
  public final String dEe;
  public final int dEf;
  
  private a(String paramString, int paramInt)
  {
    this.dEe = paramString;
    this.dEf = paramInt;
  }
  
  public static boolean iX(String paramString)
  {
    return iY(paramString) != null;
  }
  
  public static a iY(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return null;
      a[] arrayOfa = values();
      int j = arrayOfa.length;
      int i = 0;
      while (i < j)
      {
        a locala = arrayOfa[i];
        if (paramString.equals(locala.dEe)) {
          return locala;
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/gdpr/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */