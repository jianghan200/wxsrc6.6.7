package com.tencent.mm.p;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.g.a.jr;
import com.tencent.mm.g.a.jr.b;
import com.tencent.mm.g.a.st;
import com.tencent.mm.g.a.st.a;
import com.tencent.mm.model.ad;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private static ad bzA;
  
  public static boolean BQ()
  {
    jr localjr = new jr();
    localjr.bTt.action = 1;
    com.tencent.mm.sdk.b.a.sFg.m(localjr);
    return localjr.bTu.bTv;
  }
  
  public static boolean bw(Context paramContext)
  {
    boolean bool = false;
    if (BQ())
    {
      x.i("MicroMsg.DeviceOccupy", "isMultiTalking");
      Toast.makeText(paramContext, a.h.multitalk_in_toast, 0).show();
      bool = true;
    }
    return bool;
  }
  
  public static boolean bx(Context paramContext)
  {
    st localst = new st();
    com.tencent.mm.sdk.b.a.sFg.m(localst);
    if (localst.cdA.cdC)
    {
      x.i("MicroMsg.DeviceOccupy", "isCameraUsing");
      Toast.makeText(paramContext, i(paramContext, localst.cdA.cdB), 0).show();
    }
    return localst.cdA.cdC;
  }
  
  public static boolean by(Context paramContext)
  {
    st localst = new st();
    com.tencent.mm.sdk.b.a.sFg.m(localst);
    if (localst.cdA.cdD)
    {
      x.i("MicroMsg.DeviceOccupy", "isVoiceUsing");
      Toast.makeText(paramContext, i(paramContext, localst.cdA.cdB), 0).show();
    }
    return localst.cdA.cdD;
  }
  
  private static String i(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramContext.getString(a.h.cannot_use_feature_bcz_camera_using);
    }
    return paramContext.getString(a.h.cannot_use_feature_bcz_voice_using);
  }
  
  public static ad vv()
  {
    if (bzA == null) {
      bzA = com.tencent.mm.booter.a.xt();
    }
    return bzA;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */