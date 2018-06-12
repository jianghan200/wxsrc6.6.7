package com.tencent.mm.plugin.wear.model.f;

import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.c.cem;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public final class i
  extends c
{
  private ArrayList<Integer> pKh;
  private boolean qv;
  
  public i()
  {
    this.qv = true;
  }
  
  public i(ArrayList<Integer> paramArrayList)
  {
    this.pKh = paramArrayList;
    this.qv = false;
  }
  
  public final String getName()
  {
    return "WearCancelNotificationTask";
  }
  
  protected final void send()
  {
    x.i("MicroMsg.WearCancelNotificationTask", "Id List=%s", new Object[] { this.pKh });
    cem localcem = new cem();
    if (this.pKh != null) {
      localcem.szu.addAll(this.pKh);
    }
    localcem.szv = this.qv;
    try
    {
      a.bSl();
      r.b(20004, localcem.toByteArray(), false);
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */