package com.tencent.mm.plugin.card.sharecard.a;

import android.os.Looper;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.base.d;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.n;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements com.tencent.mm.ab.e
{
  public byte[] dsN = new byte[0];
  private List<WeakReference<d>> htB = new ArrayList();
  public List<n> hty = am.axr().axg();
  public List<n> htz = new ArrayList();
  public com.tencent.mm.plugin.card.sharecard.model.e hya;
  private int hyb = 0;
  public int hyc = 5;
  public ag mHandler = new ag(Looper.getMainLooper());
  private Runnable mRunnable = new a.1(this);
  
  public a()
  {
    x.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr <init>, init pending list size = %d", new Object[] { Integer.valueOf(this.hty.size()) });
    g.Eh().dpP.a(903, this);
  }
  
  private ArrayList<n> H(LinkedList<String> paramLinkedList)
  {
    ArrayList localArrayList = new ArrayList();
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      int i;
      synchronized (this.dsN)
      {
        if (this.hty.size() == 0)
        {
          x.e("MicroMsg.ShareCardBatchGetCardMgr", "getSuccessShareCardSyncItem pendingList size is 0");
          return localArrayList;
        }
        localLinkedList.addAll(this.hty);
        i = 0;
        if (i >= paramLinkedList.size()) {
          break;
        }
        ??? = (String)paramLinkedList.get(i);
        int j = 0;
        if (j < localLinkedList.size())
        {
          if ((??? != null) && (localLinkedList.get(j) != null) && (((String)???).equals(((n)localLinkedList.get(j)).field_card_id))) {
            localArrayList.add(localLinkedList.get(j));
          }
          j += 1;
        }
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public final void a(int paramInt1, int paramInt2, String arg3, l paraml)
  {
    x.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.hya = null;
    n localn;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      x.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd fail, stop batch get, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paraml = H(((com.tencent.mm.plugin.card.sharecard.model.e)paraml).hwZ);
      for (;;)
      {
        synchronized (this.dsN)
        {
          if (paraml.size() > 0)
          {
            this.hty.removeAll(paraml);
            this.htz.addAll(paraml);
          }
          ??? = am.axr();
          if (paraml.size() == 0)
          {
            x.e("MicroMsg.ShareCardSyncItemInfoStorage", "increaseRetryCount fail, share card list is empty");
            return;
          }
        }
        paraml = paraml.iterator();
        while (paraml.hasNext())
        {
          localn = (n)paraml.next();
          if (localn != null)
          {
            localn.field_retryCount += 1;
            ???.c(localn, new String[0]);
          }
        }
      }
    }
    paraml = H(((com.tencent.mm.plugin.card.sharecard.model.e)paraml).hxa);
    x.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, batch get succ, remove succ id list, size = %d", new Object[] { Integer.valueOf(paraml.size()) });
    for (;;)
    {
      synchronized (this.dsN)
      {
        this.hty.removeAll(paraml);
        long l1 = System.currentTimeMillis();
        long l2 = g.Ei().dqq.dO(Thread.currentThread().getId());
        ??? = am.axr();
        if (paraml.size() == 0)
        {
          x.e("MicroMsg.ShareCardSyncItemInfoStorage", "deleteList fail, share card list is empty");
          g.Ei().dqq.gp(l2);
          x.i("MicroMsg.ShareCardBatchGetCardMgr", "onSceneEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          awz();
          auM();
          return;
        }
      }
      paraml = paraml.iterator();
      while (paraml.hasNext())
      {
        localn = (n)paraml.next();
        if (localn != null) {
          ???.a(localn, new String[0]);
        }
      }
    }
  }
  
  public final void a(d paramd)
  {
    if (this.htB == null) {
      this.htB = new ArrayList();
    }
    if (paramd != null) {
      this.htB.add(new WeakReference(paramd));
    }
  }
  
  public final void auM()
  {
    if (this.htB == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.htB.size())
      {
        Object localObject = (WeakReference)this.htB.get(i);
        if (localObject != null)
        {
          localObject = (d)((WeakReference)localObject).get();
          if (localObject != null) {
            ((d)localObject).awx();
          }
        }
        i += 1;
      }
    }
  }
  
  public final void awz()
  {
    LinkedList localLinkedList1 = new LinkedList();
    synchronized (this.dsN)
    {
      if (this.hty.size() == 0)
      {
        x.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr getNow, no pending cardinfo ,no need to get");
        return;
      }
      localLinkedList1.addAll(this.hty);
      if (this.hya != null)
      {
        x.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr getNow, already doing scene, not trigger now");
        return;
      }
    }
    ??? = new LinkedList();
    if (localCollection.size() <= 10) {
      ((LinkedList)???).addAll(localCollection);
    }
    LinkedList localLinkedList2;
    for (;;)
    {
      localLinkedList2 = new LinkedList();
      int i = 0;
      while (i < ((LinkedList)???).size())
      {
        localLinkedList2.add(((n)((LinkedList)???).get(i)).field_card_id);
        i += 1;
      }
      ((LinkedList)???).addAll(localLinkedList2.subList(0, 10));
    }
    this.hya = new com.tencent.mm.plugin.card.sharecard.model.e(localLinkedList2);
    g.Eh().dpP.a(this.hya, 0);
  }
  
  public final void axD()
  {
    x.i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene");
    int j = (int)(System.currentTimeMillis() / 1000L);
    int k = j - this.hyb;
    int i;
    if (this.hyc <= 0)
    {
      i = 5;
      if (k < i) {
        break label74;
      }
      com.tencent.mm.plugin.card.sharecard.model.h localh = new com.tencent.mm.plugin.card.sharecard.model.h();
      g.Eh().dpP.a(localh, 0);
    }
    for (;;)
    {
      this.hyb = j;
      return;
      i = this.hyc;
      break;
      label74:
      x.i("MicroMsg.ShareCardBatchGetCardMgr", "sync interval is " + k);
      this.mHandler.removeCallbacks(this.mRunnable);
      this.mHandler.postDelayed(this.mRunnable, i * 1000);
    }
  }
  
  public final void b(d paramd)
  {
    if ((this.htB == null) || (paramd == null)) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.htB.size())
      {
        WeakReference localWeakReference = (WeakReference)this.htB.get(i);
        if (localWeakReference != null)
        {
          d locald = (d)localWeakReference.get();
          if ((locald != null) && (locald.equals(paramd)))
          {
            this.htB.remove(localWeakReference);
            return;
          }
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */