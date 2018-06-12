package com.tencent.mm.plugin.nearlife.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aez;
import com.tencent.mm.protocal.c.afa;
import com.tencent.mm.protocal.c.aqq;
import com.tencent.mm.protocal.c.aqr;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public final class c
  extends l
  implements k
{
  public static Vector<String> lCS = new Vector();
  public int bNI = 0;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String fuu = "";
  public int kCL;
  public String lCT = "";
  public String lCU = "";
  public List<a> lCV;
  public boolean lCW;
  
  public c(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, String paramString1, String paramString2, bhy parambhy, String paramString3, int paramInt5, boolean paramBoolean)
  {
    this.lCT = paramString3;
    if ((paramInt1 != 0) && (paramInt1 != 1)) {
      x.e("MicroMsg.NetSceneGetLbsLifeList", "OpCode Error :" + paramInt1);
    }
    this.bNI = paramInt1;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aez();
    ((b.a)localObject).dIH = new afa();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getlbslifelist";
    ((b.a)localObject).dIF = 603;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aez)this.diG.dID.dIL;
    aqr localaqr = new aqr();
    localaqr.ryX = paramString2;
    localaqr.ryY = paramInt4;
    localaqr.rms = paramFloat2;
    localaqr.rmr = paramFloat1;
    localaqr.ryW = paramString1;
    localaqr.ryV = paramInt3;
    ((aez)localObject).rva = localaqr;
    ((aez)localObject).rDH = paramString3;
    ((aez)localObject).otY = paramInt2;
    ((aez)localObject).rIX = paramInt5;
    if (parambhy == null) {}
    for (((aez)localObject).rIW = new bhy().bq(new byte[0]);; ((aez)localObject).rIW = parambhy)
    {
      ((aez)localObject).rfe = paramInt1;
      ((aez)localObject).rIY = 1;
      this.lCW = paramBoolean;
      x.d("MicroMsg.NetSceneGetLbsLifeList", "Req: opcode:" + paramInt1 + " lon:" + paramFloat1 + " lat:" + paramFloat2 + " pre:" + paramInt3 + " gpsSource:" + paramInt4 + " mac" + paramString1 + " cell:" + paramString2 + " scene: " + paramInt2 + " entryTime: " + paramInt5);
      x.d("MicroMsg.NetSceneGetLbsLifeList", "isLoadMore: %s, buf: %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(((aez)localObject).rIW.siI) });
      return;
    }
  }
  
  public static void clear()
  {
    lCS.clear();
  }
  
  public static boolean tS(int paramInt)
  {
    String str = String.valueOf(paramInt);
    if (lCS.contains(str)) {
      return false;
    }
    lCS.add(str);
    return true;
  }
  
  public static boolean tT(int paramInt)
  {
    lCS.remove(String.valueOf(paramInt));
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetLbsLifeList", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (afa)((b)paramq).dIE.dIL;
    this.fuu = paramq.rlo;
    this.kCL = paramq.rJg;
    x.d("MicroMsg.NetSceneGetLbsLifeList", "resp " + paramq.rJd + "searchId " + this.fuu);
    if ((paramInt3 == 0) || (paramInt3 == 101)) {}
    for (paramInt1 = 1; (paramInt2 != 0) && (paramInt1 == 0); paramInt1 = 0)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneGetLbsLifeList", "continueFlag %d lifeCount %d linkCount %d %s", new Object[] { Integer.valueOf(paramq.rlm), Integer.valueOf(paramq.rJd), Integer.valueOf(paramq.rJb), paramq.rJf });
    this.lCU = bi.aG(paramq.rJf, "");
    this.lCV = new ArrayList();
    paramArrayOfByte = paramq.rJe.iterator();
    Object localObject;
    while (paramArrayOfByte.hasNext())
    {
      localObject = (aqq)paramArrayOfByte.next();
      localObject = new a(paramq.rlo, (aqq)localObject);
      this.lCV.add(localObject);
    }
    if (paramq.rJd > 0)
    {
      paramArrayOfByte = (aqq)paramq.rJe.get(0);
      paramq = new StringBuffer();
      paramq.append(" Bid " + paramArrayOfByte.lCG);
      paramq.append(" title " + paramArrayOfByte.bHD);
      paramq.append(" link " + paramArrayOfByte.lCN);
      paramq.append(" price " + paramArrayOfByte.lCH);
      paramq.append(" rate " + paramArrayOfByte.lCM);
      paramq.append(" type " + paramArrayOfByte.hcE);
      paramq.append(" desc : ");
      paramArrayOfByte = paramArrayOfByte.lCL.iterator();
      while (paramArrayOfByte.hasNext())
      {
        localObject = (bhz)paramArrayOfByte.next();
        paramq.append(((bhz)localObject).siM + "-");
      }
      x.d("MicroMsg.NetSceneGetLbsLifeList", "resp one %s ", new Object[] { paramq.toString() });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final bhy biW()
  {
    bhy localbhy2 = ((afa)this.diG.dIE.dIL).rIW;
    bhy localbhy1 = localbhy2;
    if (localbhy2 == null) {
      localbhy1 = new bhy().bq(new byte[0]);
    }
    return localbhy1;
  }
  
  public final int biX()
  {
    return ((afa)this.diG.dIE.dIL).rlm;
  }
  
  public final int getType()
  {
    return 603;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/nearlife/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */