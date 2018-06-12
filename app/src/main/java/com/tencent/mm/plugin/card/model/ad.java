package com.tencent.mm.plugin.card.model;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.d.j;
import com.tencent.mm.protocal.c.abr;
import com.tencent.mm.protocal.c.abs;
import com.tencent.mm.protocal.c.abv;
import com.tencent.mm.protocal.c.lz;
import com.tencent.mm.protocal.c.ma;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class ad
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public boolean hxk = false;
  
  public ad(double paramDouble1, double paramDouble2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new abr();
    ((b.a)localObject).dIH = new abs();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardslayout";
    ((b.a)localObject).dIF = 984;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (abr)this.diG.dID.dIL;
    ((abr)localObject).latitude = paramDouble1;
    ((abr)localObject).longitude = paramDouble2;
    ((abr)localObject).scene = paramInt;
    ((abr)localObject).rGo = ((String)g.Ei().DT().get(aa.a.sPR, null));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetCardsLayout", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramq = (abs)this.diG.dIE.dIL;
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetCardsLayout", "json:" + paramq.hwU);
    long l1;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.Ei().DT().a(aa.a.sPR, paramq.rGo);
      paramq = paramq.hwU;
      l1 = System.currentTimeMillis();
      paramArrayOfByte = (String)g.Ei().DT().get(aa.a.sPQ, null);
      if (!bi.oW(paramArrayOfByte)) {
        paramq = paramArrayOfByte;
      }
      paramArrayOfByte = j.xU(paramq);
      am.axi().diF.fV("UserCardInfo", "update UserCardInfo set stickyIndex=0, stickyEndTime=0 , label_wording='' where stickyIndex>0");
      if (paramArrayOfByte == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CardStickyHelper", "[doUpdateStickyInfoLogic] resp null");
        bool1 = false;
        this.hxk = bool1;
      }
    }
    else
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    boolean bool1 = false;
    boolean bool2 = false;
    Object localObject;
    label301:
    long l2;
    int i;
    if (paramArrayOfByte.rGr != null)
    {
      localObject = paramArrayOfByte.rGr;
      localObject = new HashMap();
      ((Map)localObject).put("expiring_list", Integer.valueOf(2));
      ((Map)localObject).put("member_card_list", Integer.valueOf(2));
      ((Map)localObject).put("nearby_list", Integer.valueOf(3));
      ((Map)localObject).put("first_list", Integer.valueOf(5));
      if (paramArrayOfByte.rGu == 100)
      {
        ((Map)localObject).put("expiring_list", Integer.valueOf(4));
        l2 = g.Ei().dqq.dO(Thread.currentThread().getId());
        if ((paramArrayOfByte.rGr.rqj == null) || (paramArrayOfByte.rGr.rqj.rqi == null) || (paramArrayOfByte.rGr.rqj.rqi.size() <= 0)) {
          break label1199;
        }
        bool2 = true;
        paramInt1 = ((Integer)((Map)localObject).get("expiring_list")).intValue();
        j.b(paramArrayOfByte.rGr.rqj.rqi, paramInt1 * 100000 + 3);
        i = paramArrayOfByte.rGr.rqj.rqi.size() + 0;
        label418:
        paramInt1 = i;
        bool1 = bool2;
        if (paramArrayOfByte.rGr.rqk != null)
        {
          paramInt1 = i;
          bool1 = bool2;
          if (paramArrayOfByte.rGr.rqk.rqi != null)
          {
            paramInt1 = i;
            bool1 = bool2;
            if (paramArrayOfByte.rGr.rqk.rqi.size() > 0)
            {
              bool1 = true;
              paramInt1 = ((Integer)((Map)localObject).get("member_card_list")).intValue();
              j.b(paramArrayOfByte.rGr.rqk.rqi, paramInt1 * 100000 + 2);
              paramInt1 = i + paramArrayOfByte.rGr.rqk.rqi.size();
            }
          }
        }
        i = paramInt1;
        bool2 = bool1;
        if (paramArrayOfByte.rGr.rql != null)
        {
          i = paramInt1;
          bool2 = bool1;
          if (paramArrayOfByte.rGr.rql.rqi != null)
          {
            i = paramInt1;
            bool2 = bool1;
            if (paramArrayOfByte.rGr.rql.rqi.size() > 0)
            {
              bool2 = true;
              i = ((Integer)((Map)localObject).get("nearby_list")).intValue();
              j.b(paramArrayOfByte.rGr.rql.rqi, i * 100000 + 1);
              i = paramInt1 + paramArrayOfByte.rGr.rql.rqi.size();
            }
          }
        }
        paramInt1 = i;
        bool1 = bool2;
        if (paramArrayOfByte.rGr.rqm != null)
        {
          paramInt1 = i;
          bool1 = bool2;
          if (paramArrayOfByte.rGr.rqm.rqi != null)
          {
            paramInt1 = i;
            bool1 = bool2;
            if (paramArrayOfByte.rGr.rqm.rqi.size() > 0)
            {
              bool1 = true;
              paramInt1 = i + paramArrayOfByte.rGr.rqm.rqi.size();
              j.c(paramArrayOfByte.rGr.rqm.rqi, 0);
            }
          }
        }
        i = paramInt1;
        bool2 = bool1;
        if (paramArrayOfByte.rGr.rqn != null)
        {
          i = paramInt1;
          bool2 = bool1;
          if (paramArrayOfByte.rGr.rqn.rqi != null)
          {
            i = paramInt1;
            bool2 = bool1;
            if (paramArrayOfByte.rGr.rqn.rqi.size() > 0)
            {
              bool2 = true;
              i = ((Integer)((Map)localObject).get("first_list")).intValue() * 100000 + 4;
              j.b(paramArrayOfByte.rGr.rqn.rqi, i);
              j.c(paramArrayOfByte.rGr.rqn.rqi, i);
              i = paramInt1 + paramArrayOfByte.rGr.rqn.rqi.size();
            }
          }
        }
        g.Ei().dqq.gp(l2);
      }
    }
    for (;;)
    {
      am.axn().putValue("key_get_card_layout_resp", paramArrayOfByte);
      g.Ei().DT().a(aa.a.sPZ, paramq);
      bool1 = bool2;
      if (i <= 0) {
        break;
      }
      l2 = System.currentTimeMillis();
      paramq = new ArrayList();
      paramArrayOfByte = new IDKey();
      paramArrayOfByte.SetID(281);
      paramArrayOfByte.SetKey(36);
      paramArrayOfByte.SetValue(1L);
      localObject = new IDKey();
      ((IDKey)localObject).SetID(281);
      ((IDKey)localObject).SetKey(37);
      ((IDKey)localObject).SetValue((int)(l2 - l1));
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(38);
      localIDKey1.SetValue(i);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(40);
      localIDKey2.SetValue((int)(l2 - l1) / i);
      paramq.add(paramArrayOfByte);
      paramq.add(localObject);
      paramq.add(localIDKey1);
      paramq.add(localIDKey2);
      com.tencent.mm.plugin.report.service.h.mEJ.b(paramq, true);
      bool1 = bool2;
      break;
      if (paramArrayOfByte.rGu == 102)
      {
        ((Map)localObject).put("member_card_list", Integer.valueOf(4));
        break label301;
      }
      if (paramArrayOfByte.rGu != 101) {
        break label301;
      }
      ((Map)localObject).put("nearby_list", Integer.valueOf(4));
      break label301;
      label1199:
      i = 0;
      break label418;
      i = 0;
      bool2 = bool1;
    }
  }
  
  public final int getType()
  {
    return 984;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/card/model/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */