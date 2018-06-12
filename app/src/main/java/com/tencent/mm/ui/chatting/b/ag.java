package com.tencent.mm.ui.chatting.b;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.R.l;
import com.tencent.mm.a.n;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.mq;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.b.b.y;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.b.a.a(cwo=y.class)
public class ag
  extends a
  implements e, f.a, y
{
  private static boolean tRX = false;
  private int djl = -1;
  @SuppressLint({"HandlerLeak"})
  private com.tencent.mm.sdk.platformtools.ag handler = new ag.1(this);
  private int tRW;
  private long tRY;
  
  public final void Fe(int paramInt)
  {
    if (this.bAG == null)
    {
      x.e("MicroMsg.SignallingComponent", "[doDirectSend] mChattingContext is null!", new Object[] { bi.cjd().toString() });
      return;
    }
    Object localObject2 = this.bAG;
    if ((com.tencent.mm.model.s.fq(((com.tencent.mm.ui.chatting.c.a)localObject2).getTalkerUserName())) || (((com.tencent.mm.ui.chatting.b.b.c)((com.tencent.mm.ui.chatting.c.a)localObject2).O(com.tencent.mm.ui.chatting.b.b.c.class)).cus())) {}
    int j;
    for (int i = 1;; i = 0)
    {
      j = ((Integer)au.HS().get(35, Integer.valueOf(10))).intValue();
      localObject1 = new LinkedList();
      ((List)localObject1).add(((com.tencent.mm.ui.chatting.c.a)localObject2).getTalkerUserName());
      if (j != -2) {
        break label195;
      }
      if ((i == 0) || ((paramInt != 1) && (paramInt != 2))) {
        break;
      }
      x.d("MicroMsg.SignallingComponent", "oreh old logic doDirectSend not support chatStatus:%d", new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    x.d("MicroMsg.SignallingComponent", "oreh old logic doDirectSend done chatStatus:%d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject1 = new com.tencent.mm.modelsimple.f((List)localObject1, n.eo(paramInt));
    au.DF().a((l)localObject1, 0);
    return;
    label195:
    if ((i != 0) || (ab.XQ(((com.tencent.mm.ui.chatting.c.a)localObject2).getTalkerUserName())) || (ab.XO(((com.tencent.mm.ui.chatting.c.a)localObject2).getTalkerUserName())) || (((com.tencent.mm.ui.chatting.c.a)localObject2).oLT.ckW()))
    {
      x.d("MicroMsg.SignallingComponent", "oreh doDirectSend not support");
      return;
    }
    if (this.tRY == 0L)
    {
      localObject2 = ((com.tencent.mm.ui.chatting.b.b.s)this.bAG.O(com.tencent.mm.ui.chatting.b.b.s.class)).cvI();
      if ((localObject2 != null) && (((List)localObject2).size() > 0)) {
        this.tRY = ((bd)((List)localObject2).get(0)).field_createTime;
      }
    }
    long l = bi.bH(this.tRY);
    if ((j == -1) || (l > j * 1000L))
    {
      x.d("MicroMsg.SignallingComponent", "oreh doDirectSend interval too long: %d;  interval: %d", new Object[] { Long.valueOf(l / 1000L), Integer.valueOf(j) });
      return;
    }
    x.d("MicroMsg.SignallingComponent", "oreh doDirectSend done chatStatus:%d, delt:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(l / 1000L) });
    localObject1 = new com.tencent.mm.modelsimple.f((List)localObject1, n.eo(paramInt));
    au.DF().a((l)localObject1, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (this.bAG == null) {}
    do
    {
      do
      {
        do
        {
          return;
          this.bAG.dismissDialog();
        } while (10 != paraml.getType());
        boolean bool1 = ((com.tencent.mm.ui.chatting.b.b.w)this.bAG.O(com.tencent.mm.ui.chatting.b.b.w.class)).cvQ();
        boolean bool2 = ((com.tencent.mm.ui.chatting.b.b.w)this.bAG.O(com.tencent.mm.ui.chatting.b.b.w.class)).cvR();
        boolean bool3 = ((com.tencent.mm.ui.chatting.b.b.w)this.bAG.O(com.tencent.mm.ui.chatting.b.b.w.class)).cvT();
        if ((bool3) || (bool2) || (bool1))
        {
          x.i("MicroMsg.SignallingComponent", "[onSceneEnd] [%s|%s|%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          return;
        }
      } while ((paramInt1 != 0) || (paramInt2 != 0));
      paramString = (com.tencent.mm.modelsimple.f)paraml;
    } while ((paramString.eeZ == null) || (!paramString.eeZ.equals(this.bAG.getTalkerUserName())));
    if ((paramString.content == null) || (paramString.content.length != 4))
    {
      x.e("MicroMsg.SignallingComponent", "unknown directsend op");
      return;
    }
    paramInt1 = n.r(paramString.content, 0);
    x.d("MicroMsg.SignallingComponent", "directsend: status=" + paramInt1);
    switch (paramInt1)
    {
    case 2: 
    default: 
      tRX = false;
      ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).cvn();
      this.bAG.avj();
      return;
    case 1: 
      tRX = true;
      ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).setMMTitle(R.l.chatting_status_typing);
      paramString = new Message();
      this.handler.sendMessageDelayed(paramString, 15000L);
      paramString = new mq();
      com.tencent.mm.sdk.b.a.sFg.m(paramString);
      return;
    }
    tRX = true;
    ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).setMMTitle(R.l.chatting_status_voice_typing);
    paramString = new Message();
    this.handler.sendMessageDelayed(paramString, 15000L);
  }
  
  public final void a(com.tencent.mm.plugin.messenger.foundation.a.a.f paramf, f.c paramc)
  {
    x.d("MicroMsg.SignallingComponent", "on msg notify change");
    if (this.bAG == null) {
      x.w("MicroMsg.SignallingComponent", "[onNotifyChange] mChattingContext is null!");
    }
    while ((!this.bAG.getTalkerUserName().equals(paramc.talker)) || (!"insert".equals(paramc.lcx)) || (paramc.lcy.size() <= 0) || (((bd)paramc.lcy.get(0)).field_isSend != 0)) {
      return;
    }
    x.i("MicroMsg.SignallingComponent", "summerbadcr oreh onNotifyChange receive a new msg flag[%d], msgSeq[%d]", new Object[] { Integer.valueOf(((bd)paramc.lcy.get(0)).field_flag), Long.valueOf(((bd)paramc.lcy.get(0)).field_msgSeq) });
    this.tRY = bi.VF();
  }
  
  public final void a(com.tencent.mm.ui.chatting.c.a parama)
  {
    super.a(parama);
    x.i("MicroMsg.SignallingComponent", "[onComponentInstall] hash:%s", new Object[] { this });
    au.DF().a(new bg(new ag.2(this)), 0);
  }
  
  public final void cpH()
  {
    au.HU();
    com.tencent.mm.model.c.FT().a(this, Looper.getMainLooper());
    au.DF().a(10, this);
  }
  
  public final void cpK()
  {
    au.HU();
    com.tencent.mm.model.c.FT().a(this);
    au.DF().b(10, this);
  }
  
  public final void cun()
  {
    super.cun();
    x.i("MicroMsg.SignallingComponent", "[onComponentUnInstall] hash:%s", new Object[] { this });
    this.handler.removeCallbacksAndMessages(null);
  }
  
  public final void keepSignalling()
  {
    if (this.tRW == -2) {
      au.DF().a(new bg(new ag.3(this)), 0);
    }
  }
  
  public final void stopSignalling()
  {
    au.DF().a(new bg(new ag.4(this)), 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/b/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */