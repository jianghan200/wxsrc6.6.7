package com.tencent.mm.compatible.e;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class u
{
  public static boolean dfm = false;
  public String dfn = "";
  Map<String, String> dfo = null;
  public int dfp = 0;
  
  public static boolean zP()
  {
    boolean bool = false;
    if (dfm)
    {
      dfm = false;
      bool = true;
    }
    return bool;
  }
  
  public final void fP(int paramInt)
  {
    this.dfp = paramInt;
    dfm = true;
    SharedPreferences.Editor localEditor = MultiProcessSharedPreferences.getSharedPreferences(ad.getContext(), "system_config_prefs", 4).edit();
    localEditor.putInt("update_swip_back_status", paramInt);
    localEditor.commit();
    x.v("MicroMsg.ManuFacturerInfo", "update mSwipBackStatus(%s)", new Object[] { Integer.valueOf(this.dfp) });
  }
  
  public final void fe(String paramString)
  {
    this.dfn = paramString;
  }
  
  public final void i(Map<String, String> paramMap)
  {
    this.dfo = paramMap;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/e/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */