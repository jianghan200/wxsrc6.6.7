package com.tencent.mm.plugin.messenger.a;

import com.tencent.mm.pluginsdk.a.b;
import com.tencent.mm.sdk.platformtools.x;

public final class g
{
  public static d lbL;
  
  public static d bcT()
  {
    if (lbL == null) {
      lbL = new b();
    }
    if ((lbL instanceof b)) {
      x.w("MicroMsg.SendMsgMgrFactory", "we are using dummy SendMsgMgr!!");
    }
    return lbL;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/messenger/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */