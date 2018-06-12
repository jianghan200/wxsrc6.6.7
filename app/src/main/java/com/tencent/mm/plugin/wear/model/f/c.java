package com.tencent.mm.plugin.wear.model.f;

import com.tencent.mm.g.a.tq;
import com.tencent.mm.sdk.platformtools.x;

public abstract class c
  extends d
{
  protected final void execute()
  {
    if (com.tencent.mm.plugin.wear.model.a.bSl().pIM.bSq())
    {
      tq localtq = new tq();
      localtq.cfq.bIH = 11;
      com.tencent.mm.sdk.b.a.sFg.m(localtq);
      send();
      return;
    }
    x.i("MicroMsg.WearBaseSendTask", "can not send message to wear");
  }
  
  public abstract void send();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */