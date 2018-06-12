package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.g.a.qm;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.boc;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpp;
import com.tencent.mm.protocal.c.bpz;
import com.tencent.mm.protocal.c.bqa;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cg;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public final class y
  extends com.tencent.mm.ab.l
  implements k, d
{
  private static Vector<String> nnU = new Vector();
  public int Ma = 0;
  final int bJt;
  private com.tencent.mm.ab.b diG;
  public com.tencent.mm.ab.e diJ;
  private boolean eet = false;
  public boolean nnR;
  private long nnS = 0L;
  long nnT = 0L;
  public int nnV = 0;
  public int nnW = 0;
  private long noK = 0L;
  private boolean noL = false;
  private boolean noM = false;
  private long nos = 0L;
  private String not = "";
  
  public y(long paramLong)
  {
    long l2 = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bpz();
    ((b.a)localObject).dIH = new bqa();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstimeline";
    ((b.a)localObject).dIF = 211;
    ((b.a)localObject).dII = 98;
    ((b.a)localObject).dIJ = 1000000098;
    this.diG = ((b.a)localObject).KT();
    int i;
    if (ao.isWifi(ad.getContext())) {
      i = 1;
    }
    for (;;)
    {
      this.nnS = paramLong;
      boolean bool;
      label161:
      bpz localbpz;
      int j;
      long l1;
      label222:
      int k;
      com.tencent.mm.plugin.sns.storage.l locall;
      if (paramLong == 0L)
      {
        bool = true;
        this.nnR = bool;
        this.bJt = 2;
        localbpz = (bpz)this.diG.dID.dIL;
        localbpz.snU = i;
        localbpz.smv = paramLong;
        j = af.bye().byM();
        localObject = af.byo();
        if (!this.nnR) {
          break label574;
        }
        l1 = 0L;
        this.nnT = ((o)localObject).e(l1, j, true);
        localbpz.snR = this.nnT;
        k = c.a(this.nnT, paramLong, "@__weixintimtline");
        localbpz.snS = k;
        if (this.nnR)
        {
          this.nos = af.byo().e(0L, 1, true);
          x.i("MicroMsg.NetSceneSnsTimeLine", "newerid " + this.nos);
          localbpz.snT = this.nos;
          locall = af.bys().Np("@__weixintimtline");
          if (locall != null) {
            break label580;
          }
          localObject = "";
          label336:
          this.not = ((String)localObject);
          if (this.not == null) {
            this.not = "";
          }
          localbpz.smu = this.not;
          if ((locall != null) && (locall.field_adsession != null)) {
            break label590;
          }
        }
      }
      for (localbpz.slZ = new bhy().bq(new byte[0]);; localbpz.slZ = new bhy().bq(locall.field_adsession))
      {
        this.noK = paramLong;
        x.i("MicroMsg.NetSceneSnsTimeLine", " This req nextCount: " + j + " max:" + paramLong + " min:" + this.nnT + " ReqTime:" + localbpz.snS + " nettype: " + i);
        x.d("MicroMsg.NetSceneSnsTimeLine", "maxId: %s minId: %s lastReqTime: %s", new Object[] { i.eF(paramLong), i.eF(this.nnT), Integer.valueOf(k) });
        x.d("MicroMsg.NetSceneSnsTimeLine", "NetSceneSnsTimeLine %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
        return;
        if (ao.is3G(ad.getContext()))
        {
          i = 3;
          break;
        }
        if (ao.is4G(ad.getContext()))
        {
          i = 4;
          break;
        }
        if (!ao.is2G(ad.getContext())) {
          break label633;
        }
        i = 2;
        break;
        bool = false;
        break label161;
        label574:
        l1 = paramLong;
        break label222;
        label580:
        localObject = locall.field_md5;
        break label336;
        label590:
        x.d("MicroMsg.NetSceneSnsTimeLine", "request adsession %s", new Object[] { locall.field_adsession });
      }
      label633:
      i = 0;
    }
  }
  
  /* Error */
  public static boolean Mb(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 41	com/tencent/mm/plugin/sns/model/y:nnU	Ljava/util/Vector;
    //   6: aload_0
    //   7: invokevirtual 299	java/util/Vector:contains	(Ljava/lang/Object;)Z
    //   10: istore_1
    //   11: iload_1
    //   12: ifeq +10 -> 22
    //   15: iconst_0
    //   16: istore_1
    //   17: ldc 2
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: getstatic 41	com/tencent/mm/plugin/sns/model/y:nnU	Ljava/util/Vector;
    //   25: aload_0
    //   26: invokevirtual 302	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   29: pop
    //   30: iconst_1
    //   31: istore_1
    //   32: goto -15 -> 17
    //   35: astore_0
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_0
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	paramString	String
    //   10	22	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	11	35	finally
    //   22	30	35	finally
  }
  
  public static boolean Mc(String paramString)
  {
    try
    {
      nnU.remove(paramString);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void a(bqa parambqa, String paramString)
  {
    aj.a("@__weixintimtline", this.bJt, parambqa.rgH, paramString);
    this.nnT = ((boy)parambqa.rgH.getLast()).rlK;
    if (this.nnS == 0L) {
      this.nnS = ((boy)parambqa.rgH.getFirst()).rlK;
    }
    for (;;)
    {
      c.d("@__weixintimtline", this.nnS, this.nnT, parambqa.snV);
      try
      {
        parambqa = parambqa.rgH.iterator();
        while (parambqa.hasNext())
        {
          paramString = (boy)parambqa.next();
          if (paramString.smS == 0)
          {
            Object localObject = af.byo().fi(paramString.rlK);
            if ((localObject != null) && (((n)localObject).bAJ() != null))
            {
              int i = ((n)localObject).field_type;
              if (i == 15)
              {
                try
                {
                  localObject = ((ate)((n)localObject).bAJ().sqc.ruA.get(0)).jPK;
                  h.mEJ.h(14388, new Object[] { Long.valueOf(paramString.rlK), Integer.valueOf(4), localObject, Integer.valueOf(0) });
                }
                catch (Exception paramString) {}
                continue;
                this.nnS = c.eJ(this.nnS);
              }
            }
          }
        }
      }
      catch (Exception parambqa) {}
    }
  }
  
  private static boolean b(cg paramcg)
  {
    if (!ao.isWifi(ad.getContext())) {
      return false;
    }
    try
    {
      com.tencent.mm.modelsns.e.ng(ab.b(paramcg.rcB.slX.smH));
      af.byj();
      b.bxs();
      return true;
    }
    catch (Exception paramcg) {}
    return false;
  }
  
  private void bxL()
  {
    Object localObject = af.byo();
    String str = o.bBz();
    localObject = ((o)localObject).diF.b(str, null, 2);
    int i = 0;
    while (((Cursor)localObject).moveToNext()) {
      i += 1;
    }
    ((Cursor)localObject).close();
    if ((i < 3) && (i > 0)) {
      this.noM = true;
    }
    while (i != 0) {
      return;
    }
    this.noL = true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSnsTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (bqa)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramq.Id().qWB != 207) && (paramq.Id().qWB != 0))
    {
      Mc("@__weixintimtline");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramArrayOfByte.smA != null)
    {
      x.d("MicroMsg.NetSceneSnsTimeLine", "serverConfig  " + paramArrayOfByte.smA.snN + " " + paramArrayOfByte.smA.snM);
      paramInt1 = paramArrayOfByte.smA.snN;
      com.tencent.mm.plugin.sns.c.a.nkE = paramInt1;
      if (paramInt1 <= 0) {
        com.tencent.mm.plugin.sns.c.a.nkE = Integer.MAX_VALUE;
      }
      com.tencent.mm.storage.z.sOr = paramArrayOfByte.smA.snM;
    }
    this.nnV = paramArrayOfByte.smy;
    this.nnW = paramArrayOfByte.smz;
    x.i("MicroMsg.NetSceneSnsTimeLine", "for same md5 count: " + paramArrayOfByte.smy + " , objCount:  " + paramArrayOfByte.rXE + " cflag : " + paramArrayOfByte.smz);
    this.Ma = paramArrayOfByte.rXE;
    String str1 = i.eG(this.nnS);
    if (!paramArrayOfByte.rgH.isEmpty())
    {
      x.i("MicroMsg.NetSceneSnsTimeLine", "respone size " + paramArrayOfByte.rgH.size() + " Max " + ((boy)paramArrayOfByte.rgH.getFirst()).rlK + " " + i.eF(((boy)paramArrayOfByte.rgH.getFirst()).rlK) + "  respone min  " + ((boy)paramArrayOfByte.rgH.getLast()).rlK + " " + i.eF(((boy)paramArrayOfByte.rgH.getLast()).rlK));
      if (this.nnR) {
        break label546;
      }
      x.d("MicroMsg.NetSceneSnsTimeLine", "np resp list size " + paramArrayOfByte.rgH.size());
      if (!paramArrayOfByte.rgH.isEmpty()) {
        break label535;
      }
      af.byo().Nq(str1);
      this.noL = true;
      this.nnT = this.nnS;
    }
    for (;;)
    {
      Mc("@__weixintimtline");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.i("MicroMsg.NetSceneSnsTimeLine", " respone is Empty");
      break;
      label535:
      a(paramArrayOfByte, str1);
    }
    label546:
    this.Ma = paramArrayOfByte.rXE;
    if (this.not.equals(paramArrayOfByte.smu))
    {
      paramq = af.byo();
      if (this.nnR) {}
      for (long l = 0L;; l = this.noK)
      {
        this.nnT = paramq.e(l, this.nnV, true);
        x.i("MicroMsg.NetSceneSnsTimeLine", "md5 is no change!! the new minid %s", new Object[] { Long.valueOf(this.nnT) });
        bxL();
        Mc("@__weixintimtline");
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    }
    x.d("MicroMsg.NetSceneSnsTimeLine", "fp resp list size " + paramArrayOfByte.rgH.size() + " adsize : " + paramArrayOfByte.snW);
    af.bys().f("@__weixintimtline", paramArrayOfByte.smu, ab.a(paramArrayOfByte.slZ));
    paramInt1 = 0;
    Object localObject1;
    Object localObject3;
    for (;;)
    {
      if (paramInt1 < paramArrayOfByte.snX.size())
      {
        localObject1 = (cg)paramArrayOfByte.snX.get(paramInt1);
        String str2;
        if (this.eet) {
          str2 = af.Gq() + "ad.proto";
        }
        try
        {
          localObject3 = ((cg)localObject1).toByteArray();
          com.tencent.mm.a.e.b(str2, (byte[])localObject3, localObject3.length);
          str2 = ab.a(((cg)localObject1).rcC);
          localObject3 = ab.a(((cg)localObject1).rcB.slY);
          localObject1 = ab.b(((cg)localObject1).rcB.slX.smH);
          x.i("MicroMsg.NetSceneSnsTimeLine", "skXml " + str2);
          x.i("MicroMsg.NetSceneSnsTimeLine", "adXml " + (String)localObject3);
          x.i("MicroMsg.NetSceneSnsTimeLine", "snsXml " + (String)localObject1 + "\r\n");
          paramInt1 += 1;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            x.e("MicroMsg.NetSceneSnsTimeLine", "save error " + localException2.getMessage());
          }
        }
      }
    }
    if ((this.eet) && (paramArrayOfByte.snX.size() == 0)) {}
    try
    {
      localObject1 = com.tencent.mm.a.e.f(af.Gq() + "ad.proto", 0, -1);
      localObject2 = new cg();
      ((cg)localObject2).aG((byte[])localObject1);
      paramArrayOfByte.snX.add(localObject2);
      paramArrayOfByte.snW = paramArrayOfByte.snX.size();
      x.d("MicroMsg.NetSceneSnsTimeLine", "read from path " + paramArrayOfByte.snW);
      if (paramArrayOfByte.snX.size() > 0)
      {
        localObject1 = (cg)paramArrayOfByte.snX.get(0);
        localObject2 = ab.a(((cg)localObject1).rcC);
        localObject3 = ab.a(((cg)localObject1).rcB.slY);
        String str3 = ab.b(((cg)localObject1).rcB.slX.smH);
        x.i("MicroMsg.NetSceneSnsTimeLine", "skXml " + (String)localObject2);
        x.i("MicroMsg.NetSceneSnsTimeLine", "adXml " + (String)localObject3);
        x.i("MicroMsg.NetSceneSnsTimeLine", "snsXml " + str3 + "\r\n");
        b((cg)localObject1);
      }
      a.e(paramArrayOfByte.snX, paramArrayOfByte.rgH);
      a.ad(paramArrayOfByte.snX);
      if (paramArrayOfByte.snW == 0)
      {
        x.i("MicroMsg.NetSceneSnsTimeLine", "recv %d recommend", new Object[] { Integer.valueOf(paramArrayOfByte.snY) });
        a.d(paramArrayOfByte.snZ, paramArrayOfByte.rgH);
        a.ac(paramArrayOfByte.snZ);
      }
      localObject1 = new LinkedList();
      localObject2 = paramArrayOfByte.rgH.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((LinkedList)localObject1).add(Long.valueOf(((boy)((Iterator)localObject2).next()).rlK));
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        x.e("MicroMsg.NetSceneSnsTimeLine", "read error " + localException1.getMessage());
      }
      Object localObject2 = new qm();
      ((qm)localObject2).cba.cbb = localException1;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
      if (paramq.Id().qWB == 207)
      {
        if (paramArrayOfByte.rgH.isEmpty())
        {
          af.byo().bBv();
          this.nnT = this.nnS;
        }
        for (;;)
        {
          this.noL = true;
          Mc("@__weixintimtline");
          this.diJ.a(paramInt2, paramInt3, paramString, this);
          return;
          af.byo().Nr(i.eG(((boy)paramArrayOfByte.rgH.getFirst()).rlK));
          af.byo().Nq(i.eG(((boy)paramArrayOfByte.rgH.getLast()).rlK));
          a(paramArrayOfByte, str1);
          a.ae(paramArrayOfByte.rgH);
        }
      }
      if (!paramArrayOfByte.rgH.isEmpty()) {
        break label1579;
      }
    }
    af.byo().bBv();
    this.nnT = this.nnS;
    this.noL = true;
    for (;;)
    {
      Mc("@__weixintimtline");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label1579:
      a(paramArrayOfByte, str1);
      a.ae(paramArrayOfByte.rgH);
    }
  }
  
  public final long bxA()
  {
    return 0L;
  }
  
  public final boolean bxu()
  {
    return this.nnR;
  }
  
  public final boolean bxv()
  {
    return this.noL;
  }
  
  public final boolean bxw()
  {
    return this.noM;
  }
  
  public final boolean bxx()
  {
    return false;
  }
  
  public final long bxy()
  {
    return this.nnT;
  }
  
  public final boolean bxz()
  {
    return false;
  }
  
  public final int getType()
  {
    return 211;
  }
  
  public final String getUserName()
  {
    return "@__weixintimtline";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/model/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */