package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.protocal.c.aex;
import com.tencent.mm.protocal.c.aey;
import com.tencent.mm.storage.aa.a;

public final class b
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public e mXj;
  
  public b(float paramFloat1, float paramFloat2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aex();
    ((b.a)localObject).dIH = new aey();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getlbscard";
    ((b.a)localObject).dIF = 1251;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aex)this.diG.dID.dIL;
    ((aex)localObject).bSx = paramFloat2;
    ((aex)localObject).bUg = paramFloat1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "onGYNetEnd, getType = 1251 errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aey)this.diG.dIE.dIL;
      if (paramq == null) {
        break label834;
      }
      paramInt1 = (int)(System.currentTimeMillis() / 1000L);
      if (paramq.rIO) {
        break label100;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetLbsCard", "getlbscard have_card is false, no card , don't handle");
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label100:
      if (paramq.rIS <= paramInt1)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetLbsCard", "getlbscard entrance_endtime: " + paramq.rIS + " is <= currentTime:" + paramInt1 + " , don't handle");
      }
      else if (TextUtils.isEmpty(paramq.huU))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetLbsCard", "getlbscard card_tp_id is empty , don't handle");
      }
      else
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_card is true");
        if (paramq.rIP)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_red_dot is true");
          label194:
          this.mXj = new e();
          this.mXj.hwF = 1;
          this.mXj.huU = paramq.huU;
          this.mXj.cad = paramq.cad;
          this.mXj.title = paramq.title;
          this.mXj.huX = paramq.huX;
          this.mXj.huY = paramq.huY;
          this.mXj.hwh = paramq.hwh;
          this.mXj.huW = paramq.huW;
          this.mXj.dxh = paramq.dxh;
          this.mXj.mXk = 0;
          this.mXj.mXn = paramq.mXn;
          this.mXj.mXo = paramq.mXo;
          this.mXj.mXp = paramq.mXp;
          this.mXj.mXq = paramq.mXq;
          this.mXj.mXr = "";
          this.mXj.end_time = paramq.end_time;
          this.mXj.mXs = paramq.mXs;
          this.mXj.mXt = paramq.mXt;
          m.buI().mXm = this.mXj.mXr;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard entrance_endtime: " + paramq.rIS + " is <= currentTime:" + paramInt1);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard activity_type: " + paramq.rIU);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sOB, Integer.valueOf(paramInt1));
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sOC, Integer.valueOf(paramq.rIS));
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sOD, paramq.rIV);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sOG, paramq.rIT);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sOH, Integer.valueOf(paramq.rIU));
          paramArrayOfByte = com.tencent.mm.plugin.shake.c.c.a.buZ();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard msg reddotid is " + paramq.rIQ);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard pre reddotid is " + paramArrayOfByte);
          if (TextUtils.isEmpty(paramq.rIQ)) {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard resp.red_dot_id is empty");
          }
          if (!TextUtils.isEmpty(paramArrayOfByte)) {
            break label740;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard pre_red_dot_id is empty, resp.red_dot_id is not empty");
          com.tencent.mm.s.c.Cp().v(262155, true);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sOL, paramq.rIQ);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sOM, paramq.rIR);
        }
        for (;;)
        {
          h.mEJ.k(11721, paramq.huU);
          break;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_red_dot is false");
          break label194;
          label740:
          if (!paramArrayOfByte.equals(paramq.rIQ))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "getlbscard redDotId and msg.reddotid is not empty, but no equals");
            com.tencent.mm.s.c.Cp().v(262155, true);
            au.HU();
            com.tencent.mm.model.c.DT().a(aa.a.sOL, paramq.rIQ);
            au.HU();
            com.tencent.mm.model.c.DT().a(aa.a.sOM, paramq.rIR);
          }
          else if (paramArrayOfByte.equals(paramq.rIQ))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetLbsCard", "redDotId equals msg.reddotid");
          }
        }
        label834:
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetLbsCard", "getlbscard resp is null");
      }
    }
  }
  
  public final int getType()
  {
    return 1251;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/shake/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */