package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.c.cdw;
import com.tencent.mm.sdk.platformtools.ad;
import java.io.IOException;
import java.util.List;

public final class e
  extends c
{
  public final String getName()
  {
    return "WearFailMsgCreateTask";
  }
  
  protected final void send()
  {
    int i = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().bdg().size();
    cdw localcdw = new cdw();
    localcdw.jTt = a.bSl().pIO.PK(q.GF()).id;
    localcdw.bHD = ad.getContext().getString(R.l.app_name);
    localcdw.jSA = ad.getContext().getString(R.l.notificaiton_notify_fail_msg, new Object[] { Integer.valueOf(i) });
    try
    {
      a.bSl();
      r.b(20005, localcdw.toByteArray(), true);
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */