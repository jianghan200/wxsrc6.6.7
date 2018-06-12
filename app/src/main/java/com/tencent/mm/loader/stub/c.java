package com.tencent.mm.loader.stub;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.sdk.platformtools.ad;

public class c
{
  public static c duQ = new c(null);
  public final SharedPreferences duR;
  
  public c(SharedPreferences paramSharedPreferences)
  {
    if (paramSharedPreferences == null)
    {
      this.duR = ad.getContext().getSharedPreferences(ad.chY(), 0);
      return;
    }
    this.duR = paramSharedPreferences;
  }
  
  public final String I(String paramString1, String paramString2)
  {
    return this.duR.getString(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/loader/stub/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */