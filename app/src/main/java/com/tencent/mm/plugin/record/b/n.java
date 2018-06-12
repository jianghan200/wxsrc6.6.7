package com.tencent.mm.plugin.record.b;

import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.mf;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.HashMap;

public final class n
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private k msq = null;
  private d msr = null;
  private l mss = new l();
  private com.tencent.mm.sdk.b.c mst = new com.tencent.mm.sdk.b.c() {};
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("RECORD_MSG_INFO_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return com.tencent.mm.plugin.record.a.e.diD;
      }
    });
    cVM.put(Integer.valueOf("RECORD_MSG_CDN_TABLE".hashCode()), new n.3());
  }
  
  private static n bqu()
  {
    au.HN();
    n localn2 = (n)bs.iK("plugin.record");
    n localn1 = localn2;
    if (localn2 == null)
    {
      localn1 = new n();
      au.HN().a("plugin.record", localn1);
    }
    return localn1;
  }
  
  public static com.tencent.mm.plugin.record.a.e bqv()
  {
    return ((com.tencent.mm.plugin.record.a.a)g.n(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgInfoStorage();
  }
  
  public static k bqw()
  {
    g.Eg().Ds();
    if (bqu().msq == null) {
      bqu().msq = new k();
    }
    return bqu().msq;
  }
  
  public static d bqx()
  {
    g.Eg().Ds();
    if (bqu().msr == null) {
      bqu().msr = new d();
    }
    return bqu().msr;
  }
  
  public static com.tencent.mm.plugin.record.a.d getRecordMsgCDNStorage()
  {
    return ((com.tencent.mm.plugin.record.a.a)g.n(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage();
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.d("MicroMsg.SubCoreRecordMsg", "on account post reset");
    com.tencent.mm.sdk.b.a.sFg.b(this.mss);
    com.tencent.mm.sdk.b.a.sFg.b(this.mst);
    au.HU();
    File localFile = new File(com.tencent.mm.model.c.Gm());
    if ((!localFile.exists()) || (!localFile.isDirectory()))
    {
      x.d("MicroMsg.SubCoreRecordMsg", "record stg dir[%s] not exsit, create it");
      localFile.mkdirs();
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    x.d("MicroMsg.SubCoreRecordMsg", "on account post release");
    com.tencent.mm.sdk.b.a.sFg.c(this.mss);
    com.tencent.mm.sdk.b.a.sFg.c(this.mst);
    Object localObject = bqu().msq;
    if (localObject != null)
    {
      ((k)localObject).finish();
      au.DF().b(632, (com.tencent.mm.ab.e)localObject);
      getRecordMsgCDNStorage().b((com.tencent.mm.plugin.record.a.c)localObject);
    }
    localObject = bqu().msr;
    if (localObject != null) {
      ((c)localObject).finish();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/record/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */