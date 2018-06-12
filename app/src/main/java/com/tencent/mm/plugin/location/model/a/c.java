package com.tencent.mm.plugin.location.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbe;
import com.tencent.mm.protocal.c.bfu;
import com.tencent.mm.protocal.c.bfv;
import com.tencent.mm.protocal.c.btp;
import com.tencent.mm.protocal.c.bxg;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  private Runnable egq;
  public String fFG;
  public int kEb;
  public btp kEc = null;
  public List<bxg> kEd = null;
  public bfv kEe;
  public int kEf;
  private String kEg;
  
  public c(String paramString, int paramInt1, bxg parambxg, int paramInt2, btp parambtp)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bfu();
    ((b.a)localObject).dIH = new bfv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/refreshtrackroom";
    ((b.a)localObject).dIF = 492;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bfu)this.diG.dID.dIL;
    ((bfu)localObject).rxQ = paramString;
    ((bfu)localObject).hcE = paramInt1;
    ((bfu)localObject).sgW = parambxg;
    ((bfu)localObject).jRa = paramInt2;
    ((bfu)localObject).sgX = parambtp;
    this.kEg = paramString;
    this.kEf = ((bfu)localObject).hcE;
    x.d("MicroMsg.NetSceneRefreshTrackRoom", "userPosiItem " + parambxg.rdS + " " + parambxg.stK.rjj + " " + parambxg.stK.rji + " heading:" + parambxg.stK.sds);
    x.d("MicroMsg.NetSceneRefreshTrackRoom", "userPoi " + parambtp.rjj + " " + parambtp.rji + " " + parambtp.jPe);
    x.d("MicroMsg.NetSceneRefreshTrackRoom", "trackRoomId:" + paramString + " uploadStatus:" + paramInt1);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.kEe = ((bfv)((b)paramq).dIE.dIL);
    if (this.kEe != null) {
      this.fFG = this.kEe.rmO;
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.kEb = this.kEe.rSw;
      this.kEc = this.kEe.sgZ;
      this.kEd = this.kEe.sgY;
      paramq = new StringBuffer();
      paramq.append(String.format("[ resp count %d ] ", new Object[] { Integer.valueOf(this.kEe.hbF) }));
      if (this.kEc != null) {
        paramq.append(String.format("[ roomPoi  %f %f %s] ", new Object[] { Double.valueOf(this.kEc.rjj), Double.valueOf(this.kEc.rji), this.kEc.jPe }));
      }
      x.d("MicroMsg.NetSceneRefreshTrackRoom", "onGynetEnd " + paramq.toString());
      paramq = new LinkedList();
      paramArrayOfByte = this.kEe.sgY.iterator();
      while (paramArrayOfByte.hasNext())
      {
        bxg localbxg = (bxg)paramArrayOfByte.next();
        if (localbxg == null)
        {
          paramq.add(localbxg);
        }
        else
        {
          if (localbxg.stK == null) {
            paramq.add(localbxg);
          }
          if ((Math.abs(localbxg.stK.rji) > 180.0D) || (Math.abs(localbxg.stK.rjj) > 90.0D))
          {
            x.w("MicroMsg.NetSceneRefreshTrackRoom", "server lat lng invalid %s %f %f %f", new Object[] { localbxg.rdS, Double.valueOf(localbxg.stK.rjj), Double.valueOf(localbxg.stK.rji), Double.valueOf(localbxg.stK.sds) });
            paramq.add(localbxg);
          }
        }
      }
      this.kEe.hbF = this.kEe.sgY.size();
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.egq != null) {
      this.egq.run();
    }
  }
  
  public final int getType()
  {
    return 492;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/location/model/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */