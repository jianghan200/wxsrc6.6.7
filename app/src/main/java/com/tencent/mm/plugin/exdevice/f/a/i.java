package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.c.aje;
import com.tencent.mm.protocal.c.ajf;
import com.tencent.mm.protocal.c.bre;
import com.tencent.mm.protocal.c.cig;
import com.tencent.mm.protocal.c.cih;
import com.tencent.mm.protocal.c.kc;
import com.tencent.mm.protocal.c.xj;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i
  extends com.tencent.mm.plugin.exdevice.a.a<aje, ajf>
{
  public String appName;
  public String bhd;
  private final WeakReference<com.tencent.mm.plugin.exdevice.a.b<i>> isV;
  public List<bre> ixA;
  public List<cih> ixB;
  public cig ixC;
  public ArrayList<String> ixD;
  public List<xj> ixE;
  public List<kc> ixF;
  public boolean ixG;
  public int ixH;
  public boolean ixI;
  public String ixv;
  public String ixw;
  public String ixx;
  public String ixy;
  public String ixz;
  public String username;
  
  public i(String paramString1, String paramString2, com.tencent.mm.plugin.exdevice.a.b<i> paramb)
  {
    x.d("MicroMsg.NetSceneGetProfileDetail", "appusername: %s, username: %s", new Object[] { paramString2, paramString1 });
    this.username = paramString1;
    this.appName = paramString2;
    this.isV = new WeakReference(paramb);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    x.d("MicroMsg.NetSceneGetProfileDetail", "hy: getdetail scene gy end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ajf)asj();
      this.ixw = paramq.rLQ;
      this.ixx = paramq.ixx;
      this.ixB = paramq.rLT;
      this.ixC = paramq.rLR;
      this.ixy = paramq.rLV;
      this.bhd = paramq.bhd;
      this.ixz = paramq.rLW;
      this.ixA = paramq.rcK;
      this.ixG = paramq.ixG;
      this.ixE = paramq.rch;
      this.ixF = paramq.rLX;
      this.ixD = new ArrayList();
      this.ixH = paramq.iEk;
      this.ixI = paramq.rLY;
      this.ixv = paramq.ixv;
      if (paramq.rLU != null) {
        this.ixD.addAll(paramq.rLU);
      }
      this.ixA = new LinkedList();
      if (paramq.rcK != null) {
        this.ixA.addAll(paramq.rcK);
      }
      Object localObject1;
      if ((this.username != null) && (!this.username.equalsIgnoreCase(com.tencent.mm.model.q.GF())))
      {
        if (!this.ixG) {
          ad.aHg().Ag(this.username);
        }
      }
      else
      {
        if (paramq.rch == null) {
          break label554;
        }
        paramArrayOfByte = new ArrayList();
        localObject1 = paramq.rch.iterator();
      }
      for (;;)
      {
        if (!((Iterator)localObject1).hasNext()) {
          break label502;
        }
        Object localObject2 = (xj)((Iterator)localObject1).next();
        au.HU();
        if (com.tencent.mm.model.c.FR().Yc(((xj)localObject2).username))
        {
          com.tencent.mm.plugin.exdevice.f.b.a.c localc = new com.tencent.mm.plugin.exdevice.f.b.a.c();
          localc.field_username = ((xj)localObject2).username;
          localc.field_step = ((xj)localObject2).fHo;
          paramArrayOfByte.add(localc);
          continue;
          paramArrayOfByte = ad.aHg();
          localObject1 = this.username;
          if (paramArrayOfByte.a(new com.tencent.mm.plugin.exdevice.f.b.b("hardcode_rank_id", "hardcode_app_name", (String)localObject1)) != null) {
            break;
          }
          localObject2 = new com.tencent.mm.plugin.exdevice.f.b.a.c();
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_rankID = "hardcode_rank_id";
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_appusername = "hardcode_app_name";
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_username = ((String)localObject1);
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_step = 0;
          paramArrayOfByte.b((com.tencent.mm.sdk.e.c)localObject2);
          break;
        }
        au.DF().a(new h(((xj)localObject2).username, null), 0);
      }
      label502:
      x.d("MicroMsg.NetSceneGetProfileDetail", "follows %d %s", new Object[] { Integer.valueOf(paramArrayOfByte.size()), paramArrayOfByte.toString() });
      if (com.tencent.mm.model.q.GF().equalsIgnoreCase(this.username)) {
        ad.aHg().aS(paramArrayOfByte);
      }
      label554:
      this.ixF = new ArrayList();
      if (paramq.rLX != null) {
        this.ixF.addAll(paramq.rLX);
      }
      this.ixG = paramq.ixG;
      paramArrayOfByte = new com.tencent.mm.plugin.exdevice.f.b.a.a();
      paramArrayOfByte.field_championMotto = this.ixx;
      paramArrayOfByte.field_championUrl = this.ixw;
      paramArrayOfByte.field_username = this.username;
      paramq = paramq.rcK;
      ad.aHi().a(paramArrayOfByte);
    }
    paramq = (com.tencent.mm.plugin.exdevice.a.b)this.isV.get();
    if (paramq != null) {
      paramq.b(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1043;
  }
  
  protected final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/rank/getuserrankdetail";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */