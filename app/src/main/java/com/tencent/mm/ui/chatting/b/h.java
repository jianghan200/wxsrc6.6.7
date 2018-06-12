package com.tencent.mm.ui.chatting.b;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.chatting.b.b.f;
import com.tencent.mm.ui.m;
import java.util.HashSet;
import java.util.Iterator;

public final class h
  implements f, m
{
  private HashSet<m> tOO = new HashSet();
  
  public final void a(m paramm)
  {
    if (!this.tOO.contains(paramm)) {
      this.tOO.add(paramm);
    }
  }
  
  public final void b(m paramm)
  {
    this.tOO.remove(paramm);
  }
  
  public final void cpF()
  {
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.tOO).iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      long l2 = System.currentTimeMillis();
      localm.cpF();
      long l3 = System.currentTimeMillis();
      x.v("MicroMsg.ChattingLifecycleObserver", "[onChattingInit] listener:%s cost:%sms", new Object[] { localm.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    x.i("MicroMsg.ChattingLifecycleObserver", "[onChattingInit]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
  }
  
  public final void cpG()
  {
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.tOO).iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      long l2 = System.currentTimeMillis();
      localm.cpG();
      long l3 = System.currentTimeMillis();
      x.v("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimStart] listener:%s cost:%sms", new Object[] { localm.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    x.i("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimStart]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
  }
  
  public final void cpH()
  {
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.tOO).iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      long l2 = System.currentTimeMillis();
      localm.cpH();
      long l3 = System.currentTimeMillis();
      x.v("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimEnd] listener:%s cost:%sms", new Object[] { localm.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    x.i("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimEnd]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
  }
  
  public final void cpI()
  {
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.tOO).iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      long l2 = System.currentTimeMillis();
      localm.cpI();
      long l3 = System.currentTimeMillis();
      x.v("MicroMsg.ChattingLifecycleObserver", "[onChattingResume] listener:%s cost:%sms", new Object[] { localm.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    x.i("MicroMsg.ChattingLifecycleObserver", "[onChattingResume]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
  }
  
  public final void cpJ()
  {
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.tOO).iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      long l2 = System.currentTimeMillis();
      localm.cpJ();
      long l3 = System.currentTimeMillis();
      x.v("MicroMsg.ChattingLifecycleObserver", "[onChattingPause] listener:%s cost:%sms", new Object[] { localm.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    x.i("MicroMsg.ChattingLifecycleObserver", "[onChattingPause]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
  }
  
  public final void cpK()
  {
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.tOO).iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      long l2 = System.currentTimeMillis();
      localm.cpK();
      long l3 = System.currentTimeMillis();
      x.v("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimStart] listener:%s cost:%sms", new Object[] { localm.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    x.i("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimStart]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
  }
  
  public final void cpL()
  {
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.tOO).iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      long l2 = System.currentTimeMillis();
      localm.cpL();
      long l3 = System.currentTimeMillis();
      x.v("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimEnd] listener:%s cost:%sms", new Object[] { localm.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    x.i("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimEnd]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */