package com.tencent.mm.ac.a;

import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.am;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;

public final class i
{
  private static void an(String paramString1, String paramString2)
  {
    long l = e.li(paramString1);
    if (l == -1L)
    {
      x.i("MicroMsg.BizChatStatusNotifyService", "qy_status_notify bizLocalId == -1,%s", new Object[] { paramString1 });
      return;
    }
    int i = z.Nb().bd(l).field_newUnReadCount;
    z.Nb().bf(l);
    paramString1 = z.Na().ak(l);
    ai localai = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yq(paramString2);
    if (localai == null)
    {
      x.w("MicroMsg.BizChatStatusNotifyService", "qy_status_notify cvs == null:%s", new Object[] { paramString2 });
      return;
    }
    if (paramString1.hu(1))
    {
      if (localai.field_unReadMuteCount <= i)
      {
        localai.fb(0);
        ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().a(localai, paramString2);
        ((com.tencent.mm.plugin.notification.b.a)g.n(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancelNotification(paramString2);
        return;
      }
      localai.fb(localai.field_unReadMuteCount - i);
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().a(localai, paramString2);
      return;
    }
    if (localai.field_unReadCount <= i)
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Ys(paramString2);
      ((com.tencent.mm.plugin.notification.b.a)g.n(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancelNotification(paramString2);
      return;
    }
    localai.fa(0);
    localai.eV(localai.field_unReadCount - i);
    ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().a(localai, paramString2);
  }
  
  public static void e(int paramInt, String paramString1, String paramString2)
  {
    if (!"EnterpriseChatStatus".equals(paramString1)) {}
    String str;
    do
    {
      return;
      paramString1 = paramString2.split(";");
      paramString2 = paramString1[0];
      str = paramString1[1];
      bi.getInt(paramString1[2], 0);
      if (paramInt == 7)
      {
        an(str, paramString2);
        return;
      }
      if (paramInt == 8)
      {
        an(str, paramString2);
        return;
      }
    } while (paramInt != 9);
    an(str, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ac/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */