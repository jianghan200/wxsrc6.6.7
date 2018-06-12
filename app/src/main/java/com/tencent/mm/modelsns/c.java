package com.tencent.mm.modelsns;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class c
{
  public static int ehb = 0;
  public static c ehc = new c();
  
  public static void RE()
  {
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100024");
    x.i("MicroMsg.StatisticsOplogAbTest", "test " + localc.field_rawXML + " " + localc.isValid());
    if (localc.isValid())
    {
      ehb = bi.WU((String)localc.ckq().get("Switch"));
      x.i("MicroMsg.StatisticsOplogAbTest", "switchVal " + ehb);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelsns/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */