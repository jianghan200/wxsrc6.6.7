package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.loader.stub.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class at
  extends c
{
  public static at dBv = new at(c.duQ);
  
  private at(c paramc)
  {
    super(paramc.duR);
  }
  
  public final String HL()
  {
    return I("last_avatar_path", "");
  }
  
  public final void T(String paramString1, String paramString2)
  {
    x.i("MicroMsg.LastLoginInfo", "save key : %s value : %s", new Object[] { paramString1, paramString2 });
    this.duR.edit().putString(paramString1, paramString2).commit();
    if (paramString1.equals("login_weixin_username")) {
      ad.getContext().getSharedPreferences("notify_key_pref_no_account", 4).edit().putString("login_weixin_username", paramString2).commit();
    }
  }
  
  public final void c(String paramString1, int paramInt, String paramString2)
  {
    int i = 0;
    if (paramInt != 0)
    {
      i = 1;
      T("last_login_bind_qq", String.valueOf(paramInt));
    }
    paramInt = i;
    if (!bi.oW(paramString2))
    {
      paramInt = i | 0x2;
      T("last_login_bind_email", String.valueOf(paramString2));
    }
    i = paramInt;
    if (!bi.oW(paramString1))
    {
      i = paramInt | 0x4;
      T("last_login_bind_mobile", paramString1);
    }
    T("last_bind_info", String.valueOf(i));
  }
  
  public final void iy(String paramString)
  {
    x.i("MicroMsg.LastLoginInfo", "Save last avatar: " + paramString);
    if (bi.oW(paramString)) {}
    do
    {
      return;
      str = paramString.substring(paramString.lastIndexOf('/') + 1);
    } while (bi.oW(str));
    String str = e.duN + str;
    x.i("MicroMsg.LastLoginInfo", "delete old avatar path[%s], ret[%b]", new Object[] { str, Boolean.valueOf(FileOp.deleteFile(str)) });
    FileOp.y(paramString, str);
    T("last_avatar_path", str);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */