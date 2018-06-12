package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.g.a.it;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.bb;

public final class b
  implements com.tencent.mm.ab.d
{
  public final d.b b(d.a parama)
  {
    by localby = parama.dIN;
    if ((localby == null) || (localby.jQd != 47)) {
      com.tencent.mm.sdk.platformtools.x.f("MicroMsg.EmojiExtension", "parseEmojiMsg failed, invalid cmdAM");
    }
    Object localObject1;
    do
    {
      do
      {
        return null;
        localObject1 = ab.a(localby.rcj);
        localObject2 = ab.a(localby.rck);
        au.HU();
        if (!((String)com.tencent.mm.model.c.DT().get(2, null)).equals(localObject1)) {
          break;
        }
        localObject1 = localObject2;
        localObject2 = ab.a(localby.rcl);
        ((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a((String)localObject1, (String)localObject2, localby.rcq, localby.rco, parama);
        localObject1 = com.tencent.mm.model.bd.iF(localby.rco);
      } while (localObject1 == null);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.EmojiExtension", "bizClientMsgId = %s", new Object[] { ((bd.b)localObject1).dCp });
    } while ((((bd.b)localObject1).dCs == null) || (((bd.b)localObject1).scene != 1));
    parama = ab.a(localby.rcj);
    au.HU();
    com.tencent.mm.model.c.DT().set(73729, Integer.valueOf(1));
    Object localObject2 = new ba();
    ((ba)localObject2).field_content = ad.getContext().getString(R.l.nearby_say_hi_type_emoji);
    ((ba)localObject2).field_createtime = bi.VE();
    ((ba)localObject2).field_imgpath = "";
    ((ba)localObject2).field_sayhicontent = ((ba)localObject2).field_content;
    ((ba)localObject2).field_sayhiuser = parama;
    ((ba)localObject2).field_scene = 18;
    if (localby.hcd > 3) {}
    for (int i = localby.hcd;; i = 3)
    {
      ((ba)localObject2).field_status = i;
      ((ba)localObject2).field_svrid = localby.rcq;
      ((ba)localObject2).field_talker = parama;
      ((ba)localObject2).field_type = localby.jQd;
      ((ba)localObject2).field_isSend = 0;
      ((ba)localObject2).field_sayhiencryptuser = parama;
      ((ba)localObject2).field_ticket = ((bd.b)localObject1).dCs;
      com.tencent.mm.az.d.SG().a((ba)localObject2);
      localObject1 = new it();
      ((it)localObject1).bSl.bSm = parama;
      a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
      return null;
      break;
    }
  }
  
  public final void h(com.tencent.mm.storage.bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */