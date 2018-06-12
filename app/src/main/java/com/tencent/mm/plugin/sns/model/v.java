package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bps;
import com.tencent.mm.protocal.c.bpt;
import com.tencent.mm.protocal.c.bpu;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class v
  extends com.tencent.mm.ab.l
  implements k
{
  private String bKg;
  private int bNI;
  private b diG;
  public com.tencent.mm.ab.e diJ;
  public LinkedList<bps> noG = null;
  public int noH;
  
  public v(int paramInt)
  {
    this.bNI = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bpt();
    ((b.a)localObject).dIH = new bpu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstaglist";
    ((b.a)localObject).dIF = 292;
    ((b.a)localObject).dII = 116;
    ((b.a)localObject).dIJ = 1000000116;
    this.diG = ((b.a)localObject).KT();
    localObject = af.bys().Np("@__weixintsnstag").field_md5;
    if (localObject == null) {
      localObject = "";
    }
    for (;;)
    {
      this.bKg = ((String)localObject);
      bpt localbpt = (bpt)this.diG.dID.dIL;
      localbpt.qZc = paramInt;
      localbpt.snP = ((String)localObject);
      return;
    }
  }
  
  public static t a(t paramt, bps parambps)
  {
    paramt.field_tagId = parambps.snO;
    paramt.field_tagName = bi.aG(parambps.jSt, "");
    paramt.field_count = parambps.hbF;
    paramt.co(parambps.hbG);
    x.d("MicroMsg.NetSceneSnsTagList", "tagInfo getList: " + parambps.toString());
    return paramt;
  }
  
  private static boolean a(List<Long> paramList, Long paramLong)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((Long)paramList.next()).longValue() == paramLong.longValue()) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean b(t paramt, bps parambps)
  {
    boolean bool2 = false;
    paramt = paramt.field_memberList.split(",");
    parambps = parambps.hbG.iterator();
    label73:
    label80:
    label83:
    for (;;)
    {
      boolean bool1 = bool2;
      if (parambps.hasNext())
      {
        bhz localbhz = (bhz)parambps.next();
        i = 0;
        if (i >= paramt.length) {
          break label80;
        }
        if (!paramt[i].equals(localbhz)) {
          break label73;
        }
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label83;
        }
        bool1 = true;
        return bool1;
        i += 1;
        break;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSnsTagList", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    Object localObject1 = (bpu)((b)paramq).dIE.dIL;
    x.d("MicroMsg.NetSceneSnsTagList", "[onGYNetEnd]State：%s", new Object[] { Integer.valueOf(this.noH) });
    this.noH = ((bpu)localObject1).noH;
    this.noG = ((bpu)localObject1).hbG;
    paramq = ((bpu)localObject1).snP;
    if (this.bKg.equals(paramq))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramArrayOfByte = af.byu().bBG();
    Object localObject2;
    if (this.bNI != 3) {
      localObject2 = paramArrayOfByte.iterator();
    }
    label483:
    for (;;)
    {
      Object localObject3;
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Long)((Iterator)localObject2).next();
        Iterator localIterator = ((bpu)localObject1).hbG.iterator();
        bps localbps;
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localbps = (bps)localIterator.next();
        } while (((Long)localObject3).longValue() != localbps.snO);
      }
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        if (paramInt1 != 0) {
          break label483;
        }
        ((Iterator)localObject2).remove();
        af.byu().fl(((Long)localObject3).longValue());
        break;
        localObject1 = ((bpu)localObject1).hbG.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (bps)((Iterator)localObject1).next();
          if (!a(paramArrayOfByte, Long.valueOf(((bps)localObject2).snO)))
          {
            localObject3 = new t();
            a((t)localObject3, (bps)localObject2);
            af.byu().a((t)localObject3);
          }
          else
          {
            localObject3 = af.byu().fk(((bps)localObject2).snO);
            if (((((t)localObject3).field_tagName != null) && (!((t)localObject3).field_tagName.equals(((bps)localObject2).jSt))) || (((t)localObject3).field_count != ((bps)localObject2).hbF) || (b((t)localObject3, (bps)localObject2)))
            {
              a((t)localObject3, (bps)localObject2);
              af.byu().a((t)localObject3);
            }
          }
        }
        paramArrayOfByte = af.bys().Np("@__weixintsnstag");
        paramArrayOfByte.field_md5 = paramq;
        af.bys().a(paramArrayOfByte);
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    }
  }
  
  public final List<String> eQ(long paramLong)
  {
    LinkedList localLinkedList = new LinkedList();
    if (this.noG == null) {
      return localLinkedList;
    }
    Iterator localIterator = this.noG.iterator();
    while (localIterator.hasNext())
    {
      bps localbps = (bps)localIterator.next();
      if (localbps.snO == paramLong)
      {
        localIterator = localbps.hbG.iterator();
        while (localIterator.hasNext()) {
          localLinkedList.add(((bhz)localIterator.next()).siM);
        }
        return localLinkedList;
      }
    }
    return localLinkedList;
  }
  
  public final int getType()
  {
    return 292;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */