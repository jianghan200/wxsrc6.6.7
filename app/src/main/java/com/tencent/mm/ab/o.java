package com.tencent.mm.ab;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.network.i;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import junit.framework.Assert;

public final class o
  implements e
{
  private static int dJC = 1;
  private static o dJr = null;
  private boolean dJA = false;
  private al dJB = new al(Looper.getMainLooper(), new al.a()
  {
    public final boolean vD()
    {
      boolean bool2 = false;
      if (o.b(o.this) == null) {
        return false;
      }
      x.v("MicroMsg.NetSceneQueue", "onQueueIdle, running=%d, waiting=%d, foreground=%b", new Object[] { Integer.valueOf(o.c(o.this).size()), Integer.valueOf(o.d(o.this).size()), Boolean.valueOf(o.e(o.this)) });
      o.a locala = o.b(o.this);
      o localo = o.this;
      boolean bool1 = bool2;
      if (o.f(o.this))
      {
        bool1 = bool2;
        if (o.c(o.this).isEmpty())
        {
          bool1 = bool2;
          if (o.d(o.this).isEmpty()) {
            bool1 = true;
          }
        }
      }
      locala.a(localo, bool1);
      return true;
    }
  }, true);
  public com.tencent.mm.network.e dJs;
  public ah dJt = null;
  private Vector<l> dJu = new Vector();
  private Vector<l> dJv = new Vector();
  private final Map<Integer, Set<e>> dJw = new HashMap();
  public Boolean dJx = null;
  private final a dJy;
  private long dJz = 21600000L;
  public boolean foreground = false;
  private final ag handler = new ag(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      o.this.a((l)paramAnonymousMessage.obj, 0);
    }
  };
  private final Object lock = new Object();
  
  private o(a parama)
  {
    this.dJy = parama;
  }
  
  private void Lk()
  {
    for (;;)
    {
      int i;
      synchronized (this.lock)
      {
        if (this.dJv.size() > 0)
        {
          l locall = (l)this.dJv.get(0);
          int j = locall.priority;
          i = 1;
          if (i < this.dJv.size())
          {
            if (((l)this.dJv.get(i)).priority > j)
            {
              this.dJv.get(i);
              if (Ll())
              {
                locall = (l)this.dJv.get(i);
                j = locall.priority;
              }
            }
          }
          else
          {
            this.dJv.remove(locall);
            x.i("MicroMsg.NetSceneQueue", "waiting2running waitingQueue_size = " + this.dJv.size());
            b(locall, 0);
          }
        }
        else
        {
          return;
        }
      }
      i += 1;
    }
  }
  
  private boolean Ll()
  {
    return this.dJu.size() < 50;
  }
  
  public static o a(a parama)
  {
    if (dJr == null) {
      dJr = new o(parama);
    }
    return dJr;
  }
  
  private void b(final l paraml, int paramInt)
  {
    boolean bool = Ll();
    int j = this.dJu.size();
    int k = paraml.getType();
    int m = paraml.hashCode();
    int n = paraml.Lb();
    int i1 = this.dJv.size();
    int i;
    if (this.dJs == null)
    {
      i = 0;
      x.i("MicroMsg.NetSceneQueue", "doSceneImp start: mmcgi type:%d hash[%d,%d] run:%d wait:%d afterSec:%d canDo:%b autoauth:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(i1), Integer.valueOf(paramInt), Boolean.valueOf(bool), Integer.valueOf(i) });
      if ((paramInt != 0) || (!bool) || (this.dJs == null)) {
        break label308;
      }
    }
    label308:
    do
    {
      for (;;)
      {
        synchronized (this.lock)
        {
          this.dJu.add(paraml);
          if (j == this.dJu.size()) {
            x.w("MicroMsg.NetSceneQueue", "doSceneImp mmcgi  Add to runningQueue wrong  type:%d hash:%d run:[%d ,%d] wait:%d ", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paraml.hashCode()), Integer.valueOf(j), Integer.valueOf(this.dJu.size()), Integer.valueOf(this.dJv.size()) });
          }
          this.dJt.H(new Runnable()
          {
            public final void run()
            {
              int k = 0;
              paraml.dJb = o.this;
              int j;
              if ((!paraml.aBS) && (o.g(o.this) != null))
              {
                j = paraml.a(o.g(o.this), o.this);
                if (j >= 0) {}
              }
              for (int i = j;; i = 0)
              {
                int m = paraml.getType();
                int n = paraml.hashCode();
                int i1 = paraml.Lb();
                boolean bool = paraml.aBS;
                int i2 = o.c(o.this).size();
                int i3 = o.d(o.this).size();
                if (o.g(o.this) == null) {
                  j = k;
                }
                for (;;)
                {
                  x.w("MicroMsg.NetSceneQueue", "doscene mmcgi Failed type:%d hash[%d,%d] cancel[%b] run:%d wait:%d ret:%d autoauth:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Boolean.valueOf(bool), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(j) });
                  paraml.dJb = null;
                  synchronized (o.h(o.this))
                  {
                    o.c(o.this).remove(paraml);
                    if (!paraml.aBS) {
                      o.i(o.this).post(new Runnable()
                      {
                        public final void run()
                        {
                          o.this.a(3, -1, "doScene failed", o.5.this.bFp);
                        }
                      });
                    }
                    return;
                    j = o.g(o.this).hashCode();
                  }
                }
                k = paraml.getType();
                m = paraml.hashCode();
                n = paraml.Lb();
                i1 = o.c(o.this).size();
                i2 = o.d(o.this).size();
                if (o.g(o.this) == null) {}
                for (i = 0;; i = o.g(o.this).hashCode())
                {
                  x.i("MicroMsg.NetSceneQueue", "On doscene  mmcgi type:%d hash[%d,%d] run:%d wait:%d ret:%d autoauth:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(j), Integer.valueOf(i) });
                  paraml.dJc = false;
                  return;
                }
              }
            }
            
            public final String toString()
            {
              return super.toString() + "|doSceneImp_" + paraml + "_type=" + paraml.getType();
            }
          });
          if (this.dJs != null) {
            break label560;
          }
          if (this.dJy != null) {
            break;
          }
          x.e("MicroMsg.NetSceneQueue", "prepare dispatcher failed, queue idle:%s", new Object[] { this.dJy });
          return;
          i = this.dJs.hashCode();
        }
        if (paramInt > 0)
        {
          ??? = Message.obtain();
          ((Message)???).obj = paraml;
          this.handler.sendMessageDelayed((Message)???, paramInt);
          x.i("MicroMsg.NetSceneQueue", "timed: type=" + paraml.getType() + " id=" + paraml.hashCode() + " cur_after_sec=" + paramInt);
        }
        else
        {
          x.i("MicroMsg.NetSceneQueue", "waited: type=" + paraml.getType() + " id=" + paraml.hashCode() + " cur_waiting_cnt=" + this.dJv.size());
          synchronized (this.lock)
          {
            this.dJv.add(paraml);
            x.i("MicroMsg.NetSceneQueue", "waitingQueue_size = " + this.dJv.size());
          }
        }
      }
      this.dJy.a(this);
      paraml = new al(Looper.getMainLooper(), new al.a()
      {
        private long dJH = 10L;
        
        public final boolean vD()
        {
          if (o.g(o.this) == null)
          {
            long l = this.dJH;
            this.dJH = (l - 1L);
            if (l > 0L) {
              return true;
            }
          }
          o.k(o.this);
          return false;
        }
      }, true);
      long l = dJC * 100;
      paraml.J(l, l);
    } while (dJC >= 512);
    dJC *= 2;
    return;
    label560:
    dJC = 1;
  }
  
  private void c(final int paramInt1, final int paramInt2, final String paramString, final l paraml)
  {
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        Set localSet = (Set)o.j(o.this).get(Integer.valueOf(paraml.getType()));
        Object localObject;
        e locale;
        if ((localSet != null) && (localSet.size() > 0))
        {
          localObject = new HashSet();
          ((Set)localObject).addAll(localSet);
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            locale = (e)((Iterator)localObject).next();
            if ((locale != null) && (localSet.contains(locale))) {
              locale.a(paramInt1, paramInt2, paramString, paraml);
            }
          }
        }
        localSet = (Set)o.j(o.this).get(Integer.valueOf(-1));
        if ((localSet != null) && (localSet.size() > 0))
        {
          localObject = new HashSet();
          ((Set)localObject).addAll(localSet);
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            locale = (e)((Iterator)localObject).next();
            if ((locale != null) && (localSet.contains(locale))) {
              locale.a(paramInt1, paramInt2, paramString, paraml);
            }
          }
        }
      }
    });
  }
  
  private boolean e(l paraml)
  {
    int i = paraml.getType();
    if (paraml.KX()) {
      synchronized (this.lock)
      {
        Iterator localIterator = this.dJu.iterator();
        l locall;
        while (localIterator.hasNext())
        {
          locall = (l)localIterator.next();
          if (locall.getType() == i)
          {
            x.i("MicroMsg.NetSceneQueue", "forbid in running: type=" + paraml.getType() + " id=" + paraml.hashCode() + " cur_running_cnt=" + this.dJu.size());
            if (paraml.b(locall)) {
              return true;
            }
            if (paraml.a(locall))
            {
              x.e("MicroMsg.NetSceneQueue", "forbid in running diagnostic: type=" + paraml.getType() + " id=" + paraml.hashCode() + " cur_running_cnt=" + this.dJu.size() + " ---" + locall.hashCode());
              if (!this.foreground)
              {
                x.e("MicroMsg.NetSceneQueue", "forbid in running diagnostic: type=" + paraml.getType() + "acinfo[" + locall.getInfo() + "] scinfo[" + paraml.getInfo() + "]");
                x.chR();
                Assert.assertTrue("NetsceneQueue forbid in running diagnostic: type=" + paraml.getType(), false);
              }
              c(locall);
              return true;
            }
            return false;
          }
        }
        localIterator = this.dJv.iterator();
        while (localIterator.hasNext())
        {
          locall = (l)localIterator.next();
          if (locall.getType() == i)
          {
            x.i("MicroMsg.NetSceneQueue", "forbid in waiting: type=" + paraml.getType() + " id=" + paraml.hashCode() + " cur_waiting_cnt=" + this.dJv.size());
            if (paraml.b(locall)) {
              return true;
            }
            if (paraml.a(locall))
            {
              x.e("MicroMsg.NetSceneQueue", "forbid in waiting diagnostic: type=" + paraml.getType() + " id=" + paraml.hashCode() + " cur_waiting_cnt=" + this.dJv.size() + " ---" + locall.hashCode());
              if (!this.foreground)
              {
                x.chR();
                Assert.assertTrue("NetsceneQueue forbid in waiting diagnostic: type=" + paraml.getType(), false);
              }
              c(locall);
              return true;
            }
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public final com.tencent.mm.network.e DJ()
  {
    return this.dJs;
  }
  
  public final int Lg()
  {
    try
    {
      if ((this.dJs != null) && (this.dJs.Ls() != null)) {
        return this.dJs.Ls().UA();
      }
      x.e("MicroMsg.NetSceneQueue", "[arthurdan.getNetworkStatus] Notice!!! autoAuth and autoAuth.getNetworkEvent() is null!!!!");
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.NetSceneQueue", "exception:%s", new Object[] { bi.i(localException) });
      }
    }
    if (ao.isConnected(ad.getContext())) {
      return 6;
    }
    return 0;
  }
  
  public final boolean Lh()
  {
    if (this.dJs != null) {
      return this.dJs.Lh();
    }
    return true;
  }
  
  public final void Li()
  {
    Vector localVector = this.dJu;
    this.dJu = new Vector();
    Iterator localIterator = localVector.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      x.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + locall.getType());
      locall.cancel();
      c(3, -1, "doScene failed clearRunningQueue", locall);
    }
    localVector.clear();
  }
  
  public final void Lj()
  {
    x.i("MicroMsg.NetSceneQueue", "resetDispatcher");
    if (this.dJs != null)
    {
      this.dJs.reset();
      this.dJs = null;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i = 0;
    paraml.dJc = true;
    for (;;)
    {
      synchronized (this.lock)
      {
        this.dJu.remove(paraml);
        int j = paraml.getType();
        int k = paraml.hashCode();
        int m = paraml.Lb();
        int n = this.dJu.size();
        int i1 = this.dJv.size();
        if (this.dJs == null)
        {
          x.i("MicroMsg.NetSceneQueue", "onSceneEnd mmcgi type:%d hash[%d,%d] run:%d wait:%d autoauth:%d [%d,%d,%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          Lk();
          c(paramInt1, paramInt2, paramString, paraml);
          if ((this.dJA) && (this.dJu.isEmpty()) && (this.dJv.isEmpty()))
          {
            paramString = this.dJB;
            long l = this.dJz;
            paramString.J(l, l);
          }
          return;
        }
      }
      i = this.dJs.hashCode();
    }
  }
  
  public final void a(int paramInt, e parame)
  {
    synchronized (this.dJw)
    {
      if (!this.dJw.containsKey(Integer.valueOf(paramInt))) {
        this.dJw.put(Integer.valueOf(paramInt), new HashSet());
      }
      if ((!((Set)this.dJw.get(Integer.valueOf(paramInt))).contains(parame)) && (((Set)this.dJw.get(Integer.valueOf(paramInt))).add(parame))) {
        ListenerInstanceMonitor.cc(parame);
      }
      return;
    }
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    if (this.dJs == null)
    {
      x.e("MicroMsg.NetSceneQueue", "logUtil autoAuth  == null");
      return;
    }
    this.dJs.a(paramInt1, paramString, paramInt2, paramBoolean);
  }
  
  public final boolean a(l paraml, int paramInt)
  {
    if ((paraml != null) || (paramInt >= 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (this.dJt == null) {
        break label45;
      }
    }
    label45:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("worker thread has not been set", bool);
      if (e(paraml)) {
        break label50;
      }
      return false;
      bool = false;
      break;
    }
    label50:
    b(paraml, paramInt);
    return true;
  }
  
  public final void b(int paramInt, e parame)
  {
    try
    {
      synchronized (this.dJw)
      {
        if ((this.dJw.get(Integer.valueOf(paramInt)) != null) && (((Set)this.dJw.get(Integer.valueOf(paramInt))).remove(parame))) {
          ListenerInstanceMonitor.cd(parame);
        }
        return;
      }
    }
    catch (Exception parame)
    {
      for (;;) {}
    }
  }
  
  public final void bA(boolean paramBoolean)
  {
    this.dJA = paramBoolean;
    if (!this.dJA)
    {
      this.dJB.SO();
      return;
    }
    x.e("MicroMsg.NetSceneQueue", "the working process is ready to be killed");
    al localal = this.dJB;
    long l = this.dJz;
    localal.J(l, l);
  }
  
  public final void bB(boolean paramBoolean)
  {
    this.foreground = paramBoolean;
    this.dJx = Boolean.valueOf(paramBoolean);
    b.bB(paramBoolean);
    com.tencent.mm.hardcoder.HardCoderJNI.foreground = paramBoolean;
    if (this.dJs == null)
    {
      x.e("MicroMsg.NetSceneQueue", "setForeground autoAuth  == null");
      return;
    }
    this.dJs.bC(paramBoolean);
  }
  
  public final void c(l paraml)
  {
    if (paraml == null) {
      return;
    }
    x.l("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", new Object[] { Integer.valueOf(paraml.hashCode()) });
    paraml.cancel();
    synchronized (this.lock)
    {
      this.dJv.remove(paraml);
      this.dJu.remove(paraml);
      return;
    }
  }
  
  public final void cancel(final int paramInt)
  {
    x.l("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", new Object[] { Integer.valueOf(paramInt) });
    this.dJt.H(new Runnable()
    {
      public final void run()
      {
        o.a(o.this, paramInt);
      }
      
      public final String toString()
      {
        return super.toString() + "|cancelImp_" + paramInt;
      }
    });
  }
  
  public final void d(com.tencent.mm.network.e parame)
  {
    this.dJs = parame;
    parame.bC(this.foreground);
    Lk();
  }
  
  public final boolean d(l paraml)
  {
    return a(paraml, 0);
  }
  
  public final String getNetworkServerIp()
  {
    if (this.dJs != null) {
      return this.dJs.getNetworkServerIp();
    }
    return "unknown";
  }
  
  public final void reset()
  {
    if (this.dJs != null) {
      this.dJs.reset();
    }
    Li();
    Vector localVector = this.dJv;
    this.dJv = new Vector();
    Iterator localIterator = localVector.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      x.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + locall.getType());
      locall.cancel();
      c(3, -1, "doScene failed clearWaitingQueue", locall);
    }
    localVector.clear();
  }
  
  public static abstract interface a
  {
    public abstract void a(o paramo);
    
    public abstract void a(o paramo, boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */