package com.tencent.mm.plugin.fav.b.d;

import android.os.HandlerThread;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.aj;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.fav.a.z;
import com.tencent.mm.protocal.c.auj;
import com.tencent.mm.protocal.c.aum;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class d
  implements e, z
{
  private static Map<Integer, g.a> bFf = new HashMap();
  private static Map<Integer, Integer> iXO = new HashMap();
  private Queue<com.tencent.mm.plugin.fav.a.g> bFd = new LinkedList();
  private boolean bFh = false;
  private boolean bFi = false;
  public int bFj = 0;
  private long bFk = 0L;
  public com.tencent.mm.sdk.platformtools.al bFo = new com.tencent.mm.sdk.platformtools.al(com.tencent.mm.kernel.g.Em().lnJ.getLooper(), new d.3(this), false);
  
  public d()
  {
    com.tencent.mm.kernel.g.DF().a(426, this);
  }
  
  private static void a(long paramLong, LinkedList<auj> paramLinkedList, LinkedList<aum> paramLinkedList1)
  {
    Object localObject1 = new auj();
    ((auj)localObject1).rXA = 4;
    ((auj)localObject1).rXB = 0;
    paramLinkedList.add(localObject1);
    paramLinkedList = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().du(paramLong);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavModService", "setModAfterClientUpload %d modcdnlistsize %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramLinkedList.size()) });
    paramLinkedList = paramLinkedList.iterator();
    label472:
    while (paramLinkedList.hasNext())
    {
      localObject1 = (c)paramLinkedList.next();
      boolean bool = b.Bb(((c)localObject1).field_dataId);
      if ((bi.oW(((c)localObject1).field_cdnUrl)) || (bool))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavModService", "setModAfterClientUpload cdnUrl:%s, isThumb:%b,  favLocalId:%d", new Object[] { ((c)localObject1).field_cdnUrl, Boolean.valueOf(bool), Long.valueOf(paramLong) });
      }
      else
      {
        Object localObject2 = new aum();
        ((aum)localObject2).jSt = ("dataitem." + ((c)localObject1).field_dataId + ".cdn_dataurl");
        ((aum)localObject2).mEl = ((c)localObject1).field_cdnUrl;
        paramLinkedList1.add(localObject2);
        localObject2 = new aum();
        ((aum)localObject2).jSt = ("dataitem." + ((c)localObject1).field_dataId + ".cdn_datakey");
        ((aum)localObject2).mEl = ((c)localObject1).field_cdnKey;
        paramLinkedList1.add(localObject2);
        localObject2 = new aum();
        ((aum)localObject2).jSt = ("dataitem." + ((c)localObject1).field_dataId);
        ((aum)localObject2).rXG = "datastatus";
        ((aum)localObject2).mEl = "0";
        paramLinkedList1.add(localObject2);
        localObject2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(((c)localObject1).field_favLocalId);
        if (localObject2 != null)
        {
          if (((com.tencent.mm.plugin.fav.a.g)localObject2).field_type == 4) {}
          for (int i = 1;; i = 0)
          {
            if (i == 0) {
              break label472;
            }
            localObject2 = b.a((com.tencent.mm.plugin.fav.a.g)localObject2, ((c)localObject1).field_dataId);
            if (localObject2 == null) {
              break;
            }
            aum localaum = new aum();
            localaum.jSt = ("dataitem." + ((c)localObject1).field_dataId + ".stream_videoid");
            localaum.mEl = ((vx)localObject2).rzY;
            paramLinkedList1.add(localaum);
            break;
          }
        }
      }
    }
  }
  
  public static void startSync()
  {
    aj localaj = new aj();
    com.tencent.mm.kernel.g.DF().a(localaj, 0);
  }
  
  public final void a(final int paramInt1, final int paramInt2, String paramString, final l paraml)
  {
    if (paraml.getType() != 426) {}
    while (!(paraml instanceof com.tencent.mm.plugin.fav.a.al)) {
      return;
    }
    com.tencent.mm.kernel.g.Em().H(new Runnable()
    {
      public final void run()
      {
        d.a(d.this);
        int i = ((com.tencent.mm.plugin.fav.a.al)paraml).iXb;
        d.QV().remove(Integer.valueOf(i));
        if ((paramInt2 != 3) || (paramInt2 != 0)) {
          d.b(d.this);
        }
        com.tencent.mm.plugin.fav.a.g localg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dz(i);
        if ((localg == null) || (localg.field_itemStatus == 10)) {
          return;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          if (localg.field_itemStatus == 17)
          {
            com.tencent.mm.plugin.report.service.h.mEJ.h(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localg.field_type), Integer.valueOf(0), Long.valueOf(b.b(localg)), Long.valueOf(com.tencent.mm.plugin.fav.a.h.dr(localg.field_localId)) });
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavModService", "mod end set status done. favId:%d", new Object[] { Integer.valueOf(localg.field_id) });
            localg.field_itemStatus = 10;
            d.A(localg);
            ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(localg, new String[] { "localId" });
            ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().dv(localg.field_localId);
          }
        }
        for (;;)
        {
          if (d.c(d.this) <= 0) {
            break label500;
          }
          if (d.d(d.this)) {
            break;
          }
          d.startSync();
          return;
          Integer localInteger2 = Integer.valueOf(bi.a((Integer)d.aMa().get(Integer.valueOf(i)), 0));
          Integer localInteger1 = localInteger2;
          if (paramInt1 != 1)
          {
            localInteger1 = localInteger2;
            if (paramInt1 != 0) {
              localInteger1 = Integer.valueOf(localInteger2.intValue() - 1);
            }
          }
          if (localInteger1.intValue() <= 0)
          {
            int j = com.tencent.mm.plugin.fav.a.h.cA(paramInt1, paramInt2);
            com.tencent.mm.plugin.report.service.h.mEJ.h(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localg.field_type), Integer.valueOf(j), Long.valueOf(b.b(localg)), Long.valueOf(com.tencent.mm.plugin.fav.a.h.dr(localg.field_localId)) });
            d.aMa().remove(Integer.valueOf(i));
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavModService", "achieved retry limit, set error, favId:%d", new Object[] { Integer.valueOf(i) });
            localg.field_itemStatus = 18;
            ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(localg, new String[] { "localId" });
          }
        }
        label500:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavModService", "klem stopFlag <= 0 , Stop Service");
        d.e(d.this);
      }
      
      public final String toString()
      {
        return super.toString() + "|onSceneEnd";
      }
    });
  }
  
  public final void run()
  {
    com.tencent.mm.kernel.g.Em().H(new d.2(this));
  }
  
  public final void wx()
  {
    this.bFd.clear();
    bFf.clear();
    this.bFi = false;
    this.bFh = false;
    iXO.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/fav/b/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */