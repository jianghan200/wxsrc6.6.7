package com.tencent.mm.plugin.appbrand.h;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import java.util.Map;

public enum b
  implements m
{
  private b() {}
  
  public final d.b a(String paramString, Map<String, String> paramMap, d.a parama)
  {
    if ((paramString == null) || (!paramString.equals("subscribesysmsg")))
    {
      x.e("MicroMsg.WxaSubscribeSysmsgHandler", "subType is err, return");
      return null;
    }
    paramMap = (String)paramMap.get(".sysmsg.subscribesysmsg.content_template.link_list.link.share_key");
    if (bi.oW(paramMap))
    {
      x.e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey is null, return");
      return null;
    }
    x.i("MicroMsg.WxaSubscribeSysmsgHandler", "consumeNewXml subType:%s", new Object[] { paramString });
    paramString = ((com.tencent.mm.modelappbrand.i)g.l(com.tencent.mm.modelappbrand.i.class)).jm(paramMap);
    if (paramString == null)
    {
      x.e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey:%s wxaUpdateableMsg is null, ingore", new Object[] { paramMap });
      return null;
    }
    if ((paramString.field_btnState != 2) || (paramString.field_msgState != 0))
    {
      x.e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey:%s btnState:%d msgState:%d ingore", new Object[] { paramMap, Integer.valueOf(paramString.field_btnState), Integer.valueOf(paramString.field_msgState) });
      return null;
    }
    if ((parama == null) || (parama.dIN == null))
    {
      x.e("MicroMsg.WxaSubscribeSysmsgHandler", "addMsgInfo or addMsgInfo.addMsg is null! should not happen");
      return null;
    }
    paramMap = parama.dIN;
    String str1 = ab.a(paramMap.rcl);
    String str2 = ab.a(paramMap.rcj);
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().I(str2, paramMap.rcq);
    int i = 0;
    if (paramString.field_msgId > 0L) {
      i = 1;
    }
    paramString.ax(paramMap.rcq);
    if ((!parama.dIO) || (!parama.dIQ)) {
      paramString.ay(com.tencent.mm.model.bd.o(str2, paramMap.lOH));
    }
    paramString.setType(603979825);
    paramString.setContent(str1);
    paramString.eX(0);
    paramString.setStatus(3);
    paramString.ep(str2);
    paramString.dt(paramMap.rco);
    com.tencent.mm.model.bd.a(paramString, parama);
    if (i == 0)
    {
      com.tencent.mm.model.bd.i(paramString);
      paramMap = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yq(paramString.field_talker);
      if (paramMap == null) {
        break label435;
      }
      paramMap.gf(33554432);
      i = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().a(paramMap, paramString.field_talker);
      x.d("MicroMsg.WxaSubscribeSysmsgHandler", "username:%s ok:%b", new Object[] { paramString.field_talker, Integer.valueOf(i) });
    }
    for (;;)
    {
      return null;
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().b(paramMap.rcq, paramString);
      break;
      label435:
      x.d("MicroMsg.WxaSubscribeSysmsgHandler", "conv is null");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */