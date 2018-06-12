package com.tencent.mm.plugin.location.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.location.ui.impl.f;
import com.tencent.mm.protocal.c.afu;
import com.tencent.mm.protocal.c.afv;
import com.tencent.mm.protocal.c.ays;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
  extends l
  implements k
{
  public String Yy;
  public int bNI;
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  private Runnable egq;
  public int errCode;
  public int errType;
  public String fuu;
  public boolean hxu = false;
  public byte[] kCI;
  public byte[] kCJ = null;
  public String kCK = "";
  public int kCL;
  public List<f> list = new ArrayList();
  
  public h(byte[] paramArrayOfByte, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new afu();
    ((b.a)localObject).dIH = new afv();
    ((b.a)localObject).dIH = new afv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getpoilist";
    ((b.a)localObject).dIF = 457;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    afu localafu = (afu)this.diG.dID.dIL;
    if (paramArrayOfByte == null) {}
    for (localObject = new bhy();; localObject = new bhy().bq(paramArrayOfByte))
    {
      localafu.rIW = ((bhy)localObject);
      localafu.rDH = paramString2;
      localafu.rjj = paramDouble1;
      localafu.rji = paramDouble2;
      localafu.otY = paramInt1;
      localafu.qZc = paramInt2;
      localafu.rJH = paramDouble4;
      localafu.rJG = paramDouble3;
      localafu.rIY = 1;
      this.bNI = localafu.qZc;
      this.kCK = paramString1;
      this.kCI = paramArrayOfByte;
      x.i("MicroMsg.NetSceneGetPoiList", "lat %f lng %f scene %d opcode %d oriLat %f oriLng %f" + paramArrayOfByte, new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Double.valueOf(paramDouble4), Double.valueOf(paramDouble3) });
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneGetPoiList", "scene done");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetPoiList", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + "errMsg:" + paramString);
    this.errType = paramInt2;
    this.errCode = paramInt3;
    this.Yy = paramString;
    paramq = (afv)this.diG.dIE.dIL;
    this.list.clear();
    x.d("MicroMsg.NetSceneGetPoiList", "url " + paramq.rJf + " " + paramq.rBM + " " + paramq.jPK + " " + paramq.rlo);
    x.d("MicroMsg.NetSceneGetPoiList", "autoInterval: %d", new Object[] { Integer.valueOf(paramq.rJg) });
    this.fuu = paramq.rlo;
    this.kCL = paramq.rJg;
    if (paramq.rJJ != null)
    {
      x.d("MicroMsg.NetSceneGetPoiList", "poi result %d ", new Object[] { Integer.valueOf(paramq.rJJ.size()) });
      if (paramq.rJJ.size() > 0) {
        x.d("MicroMsg.NetSceneGetPoiList", "addr %s, province %s, street %s, city %s", new Object[] { ((ays)paramq.rJJ.get(0)).sbw, ((ays)paramq.rJJ.get(0)).eJI, ((ays)paramq.rJJ.get(0)).ruZ, ((ays)paramq.rJJ.get(0)).eJJ });
      }
      paramArrayOfByte = paramq.rJJ.iterator();
      while (paramArrayOfByte.hasNext())
      {
        f localf = new f((ays)paramArrayOfByte.next(), this.fuu);
        this.list.add(localf);
      }
    }
    if (paramq.rIW != null) {
      this.kCJ = ab.a(paramq.rIW);
    }
    if (paramq.rJK == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.hxu = bool;
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      if (this.egq != null) {
        this.egq.run();
      }
      return;
    }
  }
  
  public final int getType()
  {
    return 457;
  }
  
  public final boolean isFirst()
  {
    return this.kCI == null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/location/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */