package com.tencent.mm.model;

import com.tencent.mm.ac.d;
import com.tencent.mm.ac.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import junit.framework.Assert;

public final class i
{
  public static int a(String paramString, long paramLong, bd.a parama)
  {
    x.d("MicroMsg.BizConversationLogic", "deleteMsgByBizChatId %s", new Object[] { Long.valueOf(paramLong) });
    g.Em().H(new i.1(paramString, paramLong, parama));
    return 0;
  }
  
  public static void gy(String paramString)
  {
    if (!bi.oW(paramString)) {}
    Object localObject;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString);
      if ((localObject != null) && (!bi.oW(((com.tencent.mm.g.c.ai)localObject).field_username))) {
        break;
      }
      return;
    }
    ((ab)localObject).setType(((com.tencent.mm.g.c.ai)localObject).field_type | 0x800);
    s.t((ab)localObject);
    if ((((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yq(paramString) == null) && (((ab)localObject).ckW()))
    {
      if (!f.kJ(paramString)) {
        break label246;
      }
      if (((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yq("officialaccounts") == null)
      {
        localObject = new com.tencent.mm.storage.ai("officialaccounts");
        ((com.tencent.mm.storage.ai)localObject).clx();
        ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().d((com.tencent.mm.storage.ai)localObject);
      }
      localObject = new com.tencent.mm.storage.ai(paramString);
      ((com.tencent.mm.storage.ai)localObject).as(System.currentTimeMillis());
      ((com.tencent.mm.storage.ai)localObject).ef("officialaccounts");
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().d((com.tencent.mm.storage.ai)localObject);
    }
    for (;;)
    {
      x.i("MicroMsg.BizConversationLogic", "setPlacedTop username = " + paramString);
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yv(paramString);
      return;
      label246:
      if ((f.kL(paramString)) && (!f.eZ(paramString)))
      {
        localObject = f.kH(paramString);
        if (((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yq(((d)localObject).field_enterpriseFather) == null)
        {
          localai = new com.tencent.mm.storage.ai(((d)localObject).field_enterpriseFather);
          localai.clx();
          ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().d(localai);
        }
        com.tencent.mm.storage.ai localai = new com.tencent.mm.storage.ai(paramString);
        localai.as(System.currentTimeMillis());
        localai.ef(((d)localObject).Mg());
        ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().d(localai);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */