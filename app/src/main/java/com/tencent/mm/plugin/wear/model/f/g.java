package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.cee;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;
import java.io.IOException;

public final class g
  extends b
{
  private bd bXQ;
  
  public g(bd parambd)
  {
    this.bXQ = parambd;
  }
  
  public final String getName()
  {
    return "WearLuckyCreateTask";
  }
  
  protected final void send()
  {
    cee localcee = new cee();
    Object localObject = this.bXQ.field_content;
    if (localObject != null)
    {
      localObject = g.a.J((String)localObject, this.bXQ.field_reserved);
      if ((localObject == null) || (!((g.a)localObject).dyc.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao"))) {
        break label219;
      }
      localcee.szl = this.bXQ.field_msgId;
      localcee.szk = this.bXQ.field_talker;
      if (this.bXQ.field_isSend != 1) {
        break label203;
      }
      localObject = ((g.a)localObject).dxW;
      localcee.bHD = h.PP(this.bXQ.field_talker);
      if (!s.fq(this.bXQ.field_talker)) {
        break label211;
      }
      String str = d(this.bXQ.field_talker, this.bXQ);
      localcee.jSA = String.format(ad.getContext().getString(R.l.notification_msg_chatroom_template), new Object[] { h.PP(str), Character.valueOf('​'), localObject });
    }
    for (;;)
    {
      label203:
      label211:
      label219:
      try
      {
        com.tencent.mm.plugin.wear.model.a.bSl();
        r.b(20014, localcee.toByteArray(), true);
        com.tencent.mm.plugin.wear.model.c.a.ee(10, 0);
        com.tencent.mm.plugin.wear.model.c.a.zC(10);
        return;
      }
      catch (IOException localIOException) {}
      x.w("MicroMsg.Wear.WearLuckyCreateTask", "xml is null!");
      return;
      localObject = ((g.a)localObject).dxV;
      break;
      localcee.jSA = ((String)localObject);
      continue;
      x.i("MicroMsg.Wear.WearLuckyCreateTask", "biz c2c message, do not send to watch!");
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */