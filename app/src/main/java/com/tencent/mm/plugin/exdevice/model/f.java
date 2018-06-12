package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.a.g;
import com.tencent.mm.aa.c;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.bw;
import com.tencent.mm.model.am.b.a;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class f
{
  public static void a(com.tencent.mm.plugin.exdevice.h.b paramb, alx paramalx, aly paramaly)
  {
    if (paramaly != null)
    {
      paramb.field_connProto = paramaly.rOw;
      paramb.field_connStrategy = paramaly.rOx;
      paramb.field_closeStrategy = paramaly.rOy;
      paramb.field_mac = com.tencent.mm.plugin.exdevice.j.b.Az(com.tencent.mm.plugin.exdevice.j.b.AA(paramaly.rgL));
      paramb.field_authKey = paramaly.reA;
      paramb.field_brandName = paramaly.rOv;
      paramb.du(paramaly.eJM);
      paramb.aw(paramaly.cCW);
      paramb.ek(paramaly.rOE);
      paramb.ej(paramaly.rOD);
      paramb.ei(paramaly.rOC);
      paramb.fe(paramaly.rOF);
      paramb.setIconUrl(paramaly.jPG);
      paramb.ff(paramaly.cCV);
      paramb.eh(paramaly.jOU);
      paramb.el(paramaly.cCX);
      paramb.em(paramaly.cCY);
      paramb.en(paramaly.cCZ);
      paramb.eo(paramaly.cDa);
    }
    if (paramalx != null)
    {
      paramb.field_deviceID = paramalx.hbO;
      paramb.field_deviceType = paramalx.reT;
      paramb.field_md5Str = g.u(new String(paramalx.reT + paramalx.hbO).getBytes());
      if (bi.oW(paramb.field_brandName)) {
        paramb.field_brandName = paramalx.reT;
      }
    }
  }
  
  public static boolean ae(Context paramContext, String paramString)
  {
    if (bi.oW(paramString))
    {
      x.i("MicroMsg.exdevice.ExdeviceLogic", "Jump to webview failed, url is null or nil.");
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    return true;
  }
  
  public static boolean b(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    return (paramb != null) && ((paramb.cCW & 1L) == 1L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */