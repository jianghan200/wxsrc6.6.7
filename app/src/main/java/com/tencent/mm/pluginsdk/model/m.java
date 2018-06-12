package com.tencent.mm.pluginsdk.model;

import android.text.TextUtils;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.d.a;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.byb;
import com.tencent.mm.protocal.c.byd;
import com.tencent.mm.protocal.c.bye;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.g;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class m
  extends l
  implements k
{
  public int bOh = 0;
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String eLb;
  public List<String> qyZ = null;
  public String qza;
  private List<String> qzb = null;
  
  public m(int paramInt, List<String> paramList, List<Integer> paramList1, String paramString1, String paramString2)
  {
    this(paramInt, paramList, paramList1, null, paramString1, paramString2, null, null, "");
  }
  
  public m(int paramInt, List<String> paramList1, List<Integer> paramList, List<String> paramList2, String paramString1, String paramString2, Map<String, Integer> paramMap, String paramString3, String paramString4)
  {
    boolean bool;
    Object localObject;
    if (paramInt != 3)
    {
      bool = true;
      Assert.assertTrue("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK", bool);
      this.bOh = paramInt;
      this.qyZ = paramList1;
      if (paramList2 != null)
      {
        localObject = paramList2;
        if (paramList2.size() != 0) {}
      }
      else
      {
        localObject = new LinkedList();
      }
      paramList2 = new b.a();
      paramList2.dIG = new byd();
      paramList2.dIH = new bye();
      paramList2.uri = "/cgi-bin/micromsg-bin/verifyuser";
      paramList2.dIF = 137;
      paramList2.dII = 44;
      paramList2.dIJ = 1000000044;
      this.diG = paramList2.KT();
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        if (((List)localObject).size() == paramList1.size()) {
          break label277;
        }
        x.e("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify Error lstAntispamTicket:%d lstVerifyUser:%d", new Object[] { Integer.valueOf(((List)localObject).size()), Integer.valueOf(paramList1.size()) });
      }
    }
    for (;;)
    {
      if (paramInt != 2) {
        break label335;
      }
      int i = 0;
      while (i < paramList1.size())
      {
        ((List)localObject).add(bi.aG(a.ZN().Gw().XH((String)paramList1.get(i)), ""));
        i += 1;
      }
      bool = false;
      break;
      label277:
      i = 0;
      while (i < ((List)localObject).size())
      {
        a.ZN().Gw().x((String)paramList1.get(i), 2147483633, (String)((List)localObject).get(i));
        i += 1;
      }
    }
    label335:
    byd localbyd = (byd)this.diG.dID.dIL;
    localbyd.rfe = paramInt;
    localbyd.rKZ = paramString1;
    this.qza = paramString1;
    paramString1 = new LinkedList();
    paramInt = 0;
    if (paramInt < paramList1.size())
    {
      byb localbyb = new byb();
      localbyb.mEl = ((String)paramList1.get(paramInt));
      if (paramString2 == null) {}
      for (paramList2 = "";; paramList2 = paramString2)
      {
        localbyb.sud = paramList2;
        paramList2 = a.ZN().Gw();
        String str = localbyb.mEl;
        ((Integer)paramList.get(paramInt)).intValue();
        localbyb.rEJ = bi.aG(paramList2.XH(str), "");
        if ((TextUtils.isEmpty(localbyb.rEJ)) && (localObject != null) && (((List)localObject).size() > paramInt)) {
          localbyb.rEJ = ((String)((List)localObject).get(paramInt));
        }
        localbyb.siA = paramString3;
        if ((paramMap != null) && (paramMap.containsKey(localbyb.mEl))) {
          localbyb.sue = ((Integer)paramMap.get(localbyb.mEl)).intValue();
        }
        localbyb.sui = paramString4;
        x.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify op:%s idx:%s user:%s anti:%s chatroom:%s, reportInfo:%s", new Object[] { Integer.valueOf(this.bOh), Integer.valueOf(paramInt), localbyb.mEl, localbyb.rEJ, paramString3, paramString4 });
        paramString1.add(localbyb);
        paramInt += 1;
        break;
      }
    }
    localbyd.suk = paramString1;
    localbyd.suj = paramString1.size();
    paramList1 = new LinkedList();
    paramList1.addAll(paramList);
    localbyd.sum = paramList1;
    localbyd.sul = paramList1.size();
    localbyd.rTr = new bhy().bq(com.tencent.mm.plugin.normsg.a.b.lFJ.bjE());
    x.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify op:%d scene:%d user:%d antitickets:%s chatroom:%s stack:%s", new Object[] { Integer.valueOf(this.bOh), Integer.valueOf(localbyd.suk.size()), Integer.valueOf(localbyd.sum.size()), bi.c((List)localObject, ","), paramString3, bi.cjd() });
  }
  
  private m(String paramString1, String paramString2, int paramInt)
  {
    Assert.assertTrue("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK", true);
    this.qyZ = new LinkedList();
    this.qyZ.add(paramString1);
    this.bOh = 3;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new byd();
    ((b.a)localObject).dIH = new bye();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyuser";
    ((b.a)localObject).dIF = 137;
    ((b.a)localObject).dII = 44;
    ((b.a)localObject).dIJ = 1000000044;
    this.diG = ((b.a)localObject).KT();
    localObject = (byd)this.diG.dID.dIL;
    ((byd)localObject).rfe = 3;
    ((byd)localObject).rKZ = "";
    LinkedList localLinkedList = new LinkedList();
    byb localbyb = new byb();
    localbyb.mEl = paramString1;
    localbyb.sud = paramString2;
    localbyb.rEJ = a.ZN().Gw().XH(paramString1);
    localbyb.siA = null;
    localLinkedList.add(localbyb);
    ((byd)localObject).suk = localLinkedList;
    ((byd)localObject).suj = localLinkedList.size();
    paramString1 = new LinkedList();
    paramString1.add(Integer.valueOf(paramInt));
    ((byd)localObject).sum = paramString1;
    ((byd)localObject).sul = paramString1.size();
    ((byd)localObject).rTr = new bhy().bq(com.tencent.mm.plugin.normsg.a.b.lFJ.bjE());
    x.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify scene:%d user:%d ticket:%s anti:%s", new Object[] { Integer.valueOf(((byd)localObject).suk.size()), Integer.valueOf(((byd)localObject).sum.size()), paramString2, localbyb.rEJ });
  }
  
  public m(String paramString1, String paramString2, int paramInt, byte paramByte)
  {
    this(paramString1, paramString2, paramInt);
  }
  
  public m(List<String> paramList, List<Integer> paramList1, String paramString1, String paramString2, Map<String, Integer> paramMap, String paramString3)
  {
    this(2, paramList, paramList1, null, paramString1, paramString2, paramMap, paramString3, "");
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      x.e("MicroMsg.NetSceneVerifyUser.dkverify", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final String cby()
  {
    if ((this.diG != null) && (this.diG.dIE != null)) {
      return ((bye)this.diG.dIE.dIL).hbL;
    }
    return "";
  }
  
  public final int cbz()
  {
    return this.bOh;
  }
  
  public final void fy(String paramString1, String paramString2)
  {
    Iterator localIterator = ((byd)this.diG.dID.dIL).suk.iterator();
    while (localIterator.hasNext())
    {
      byb localbyb = (byb)localIterator.next();
      localbyb.suf = paramString1;
      localbyb.sug = paramString2;
    }
  }
  
  public final int getType()
  {
    return 30;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/pluginsdk/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */