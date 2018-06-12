package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.bv;
import com.tencent.mm.modelmulti.n;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.q;
import com.tencent.mm.plugin.messenger.foundation.a.q.a;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.am;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bm;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.br;
import com.tencent.mm.storage.bw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import junit.framework.Assert;

public class PluginMessengerFoundation
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.api.bucket.d, ai, o
{
  private com.tencent.mm.model.e dBE = new com.tencent.mm.model.e();
  private d lcf;
  private e lcg;
  private bv lch = new bv();
  private com.tencent.mm.plugin.chatroom.b lci = new com.tencent.mm.plugin.chatroom.b();
  private ai lcj;
  private com.tencent.mm.plugin.messenger.foundation.a.b lck;
  
  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("MESSAGE_TABLE".hashCode()), new PluginMessengerFoundation.10(this));
    localHashMap.put(Integer.valueOf("CONTACT_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return com.tencent.mm.storage.ah.diD;
      }
    });
    localHashMap.put(Integer.valueOf("OPLOG_TABLE".hashCode()), new PluginMessengerFoundation.12(this));
    localHashMap.put(Integer.valueOf("CONVERSATION_TABLE".hashCode()), new PluginMessengerFoundation.13(this));
    localHashMap.put(Integer.valueOf("ROLEINFO_TABLE".hashCode()), new PluginMessengerFoundation.14(this));
    localHashMap.put(Integer.valueOf("STRANGER_TABLE".hashCode()), new PluginMessengerFoundation.15(this));
    localHashMap.put(Integer.valueOf("DeletedConversationInfo".hashCode()), new PluginMessengerFoundation.2(this));
    localHashMap.put(Integer.valueOf("LBSVERIFYMESSAGE_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return bb.diD;
      }
    });
    localHashMap.put(Integer.valueOf("SHAKEVERIFYMESSAGE_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return bp.diD;
      }
    });
    localHashMap.put(Integer.valueOf("VERIFY_CONTACT_TABLE".hashCode()), new PluginMessengerFoundation.5(this));
    localHashMap.put(Integer.valueOf("FMESSAGE_MSGINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return au.diD;
      }
    });
    localHashMap.put(Integer.valueOf("FMESSAGE_CONVERSATION_TABLE".hashCode()), new PluginMessengerFoundation.7(this));
    return localHashMap;
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    x.i("MicroMsg.TAG", "init thread pool[%s] current tid[%d] priority[%d] process[%s]", new Object[] { com.tencent.mm.sdk.f.e.cjw(), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(Thread.currentThread().getPriority()), ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).dox });
    com.tencent.mm.plugin.zero.c.qxT = new com.tencent.mm.by.c() {};
    Object localObject = new a();
    q.a.a(2, (q)localObject);
    q.a.a(17, (q)localObject);
    q.a.a(4, (q)localObject);
    q.a.a(7, new b());
    localObject = new c();
    q.a.a(5, (q)localObject);
    q.a.a(8, (q)localObject);
    q.a.a(9, (q)localObject);
    q.a.a(1, new g());
    com.tencent.mm.kernel.g.Ee().a(com.tencent.mm.plugin.messenger.foundation.a.p.class, new com.tencent.mm.kernel.c.e(new n()));
    com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.zero.a.d.class);
    if (paramg.ES())
    {
      new com.tencent.mm.plugin.zero.tasks.b().before(this);
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.messenger.foundation.a.d.class, new com.tencent.mm.plugin.messenger.foundation.a.d()
      {
        public final com.tencent.mm.vending.b.b a(com.tencent.mm.plugin.messenger.foundation.a.c paramAnonymousc)
        {
          return a.a(paramAnonymousc);
        }
        
        public final void a(aue paramAnonymousaue, String paramAnonymousString)
        {
          a.a(paramAnonymousaue, paramAnonymousString, null, true, false);
        }
      });
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.messenger.foundation.a.h.class, new PluginMessengerFoundation.9(this));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.chatroom.b.b.class, this.lci);
    }
  }
  
  public void dependency()
  {
    dependsOn(PluginZero.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      this.lcf = new d();
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.messenger.foundation.a.i.class, new com.tencent.mm.kernel.c.e(this.lcf));
      this.lcg = new e();
      com.tencent.mm.kernel.g.a(j.class, new com.tencent.mm.kernel.c.e(this.lcg));
    }
  }
  
  public com.tencent.mm.plugin.messenger.foundation.a.b getBizTimeLineCallback()
  {
    return this.lck;
  }
  
  public List<com.tencent.mm.model.ah> getDataTransferList()
  {
    if (this.lcj != null)
    {
      List localList = this.lcj.getDataTransferList();
      if (localList.size() > 7) {
        Assert.assertTrue("Do not add more IDataTransfer from mIDataTransferFactoryDelegate!!!!!!!!!!!", false);
      }
      return localList;
    }
    return new ArrayList();
  }
  
  public bv getSysCmdMsgExtension()
  {
    return this.lch;
  }
  
  public void installed()
  {
    alias(o.class);
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    d.c.a(Integer.valueOf(10000), this.dBE);
    d.c.a(Integer.valueOf(1), this.dBE);
    d.c.a(Integer.valueOf(10001), this.lch);
    d.c.a(Integer.valueOf(10002), this.lch);
  }
  
  public void onAccountRelease()
  {
    d.c.b(Integer.valueOf(10000), this.dBE);
    d.c.b(Integer.valueOf(1), this.dBE);
    d.c.b(Integer.valueOf(10001), this.lch);
    d.c.b(Integer.valueOf(10002), this.lch);
  }
  
  public void onDataBaseClosed(com.tencent.mm.bt.h paramh1, com.tencent.mm.bt.h paramh2) {}
  
  public void onDataBaseOpened(com.tencent.mm.bt.h paramh1, com.tencent.mm.bt.h paramh2)
  {
    com.tencent.mm.model.p.GD();
    paramh1 = this.lcf;
    paramh2 = com.tencent.mm.kernel.g.Ei().dqq;
    com.tencent.mm.bt.h localh = com.tencent.mm.kernel.g.Ei().dqr;
    paramh1.lbX = new com.tencent.mm.aq.p(new com.tencent.mm.aq.i(paramh2));
    paramh1.lbT = new com.tencent.mm.storage.ah(paramh2);
    paramh1.lbU = new br(paramh2);
    paramh1.lbW = new aj(paramh2);
    paramh1.lbV = new be(paramh2, paramh1.lbT, paramh1.lbW);
    paramh1.lbY = new bm(paramh2);
    paramh1.lbZ = new am(paramh2);
    paramh1.lca = new au(paramh2);
    paramh1.lcb = new as(paramh2);
    paramh1.lcc = new bb(paramh2);
    paramh1.lcd = new bp(paramh2);
    paramh1.lce = new bw(paramh2);
  }
  
  public void setBizTimeLineCallback(com.tencent.mm.plugin.messenger.foundation.a.b paramb)
  {
    this.lck = paramb;
  }
  
  public void setIDataTransferFactoryDelegate(ai paramai)
  {
    this.lcj = paramai;
  }
  
  public String toString()
  {
    return "plugin-messenger-foundation";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/messenger/foundation/PluginMessengerFoundation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */