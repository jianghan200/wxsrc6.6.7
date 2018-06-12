package com.tencent.mm.plugin.hp.b;

import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class i
{
  public static void a(String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, String paramString4, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (bi.oW(paramString2))
    {
      x.e("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "msg is null");
      return;
    }
    x.i("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "try to show dialog");
    ah.A(new i.1(paramString1, paramString2, paramString3, paramString4, paramOnClickListener1, paramOnClickListener2));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/hp/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */