package com.tencent.mm.plugin.card.b;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.base.d;
import com.tencent.mm.plugin.card.model.ak;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.s;
import com.tencent.mm.plugin.card.model.w;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  implements com.tencent.mm.ab.e
{
  public byte[] dsN = new byte[0];
  private s htA;
  public List<WeakReference<d>> htB = new ArrayList();
  public List<ak> hty = am.axj().axg();
  public List<ak> htz = new ArrayList();
  
  public b()
  {
    x.i("MicroMsg.BatchGetCardMgr", "<init>, init pending list size = %d", new Object[] { Integer.valueOf(this.hty.size()) });
    g.Eh().dpP.a(559, this);
  }
  
  public static void nG(int paramInt)
  {
    w localw = new w(paramInt);
    g.Eh().dpP.a(localw, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l arg4)
  {
    int i = 0;
    x.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.htA = null;
    paramString = ((s)???).hxa;
    ak localak;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      x.e("MicroMsg.BatchGetCardMgr", "onSceneEnd fail, stop batch get, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      ??? = this.dsN;
      if (paramString != null) {}
      for (;;)
      {
        try
        {
          if (paramString.size() > 0)
          {
            this.hty.removeAll(paramString);
            this.htz.addAll(paramString);
          }
          ??? = am.axj();
          if ((paramString == null) || (paramString.size() == 0))
          {
            x.e("MicroMsg.PendingCardIdInfoStorage", "increaseRetryCount fail, list is empty");
            return;
          }
        }
        finally {}
        paramString = paramString.iterator();
        while (paramString.hasNext())
        {
          localak = (ak)paramString.next();
          if (localak != null)
          {
            localak.field_retryCount += 1;
            ???.c(localak, new String[0]);
          }
        }
      }
    }
    if (paramString == null)
    {
      paramInt1 = 0;
      x.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, batch get succ, remove succ id list, size = %d", new Object[] { Integer.valueOf(paramInt1) });
      if (paramString == null) {}
    }
    for (;;)
    {
      synchronized (this.dsN)
      {
        this.hty.removeAll(paramString);
        long l1 = System.currentTimeMillis();
        long l2 = g.Ei().dqq.dO(Thread.currentThread().getId());
        ??? = am.axj();
        if ((paramString == null) || (paramString.size() == 0))
        {
          x.e("MicroMsg.PendingCardIdInfoStorage", "deleteList fail, list is empty");
          g.Ei().dqq.gp(l2);
          x.i("MicroMsg.BatchGetCardMgr", "onSceneEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          awz();
          if (this.htB == null) {
            break;
          }
          paramInt1 = i;
          if (paramInt1 >= this.htB.size()) {
            break;
          }
          paramString = (WeakReference)this.htB.get(paramInt1);
          if (paramString != null)
          {
            paramString = (d)paramString.get();
            if (paramString != null) {
              paramString.awx();
            }
          }
          paramInt1 += 1;
          continue;
          paramInt1 = paramString.size();
        }
      }
      paramString = paramString.iterator();
      while (paramString.hasNext())
      {
        localak = (ak)paramString.next();
        if (localak != null) {
          ???.a(localak, new String[0]);
        }
      }
    }
  }
  
  public final void awz()
  {
    if (this.hty.size() == 0)
    {
      x.i("MicroMsg.BatchGetCardMgr", "getNow, no pending cardinfo ,no need to get");
      return;
    }
    if (this.htA != null)
    {
      x.i("MicroMsg.BatchGetCardMgr", "getNow, already doing scene, not trigger now");
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    if (this.hty.size() <= 10) {
      localLinkedList.addAll(this.hty);
    }
    for (;;)
    {
      this.htA = new s(localLinkedList);
      g.Eh().dpP.a(this.htA, 0);
      return;
      localLinkedList.addAll(this.hty.subList(0, 10));
    }
  }
  
  public final void detach()
  {
    this.hty.clear();
    this.htz.clear();
    if (this.htA != null) {
      g.Eh().dpP.c(this.htA);
    }
    g.Eh().dpP.b(559, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */