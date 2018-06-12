package com.tencent.mm.plugin.shake.b;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bmk;
import com.tencent.mm.protocal.c.bml;
import com.tencent.mm.protocal.c.bmm;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.g;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends l
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private String hyz;
  List<d> mWA;
  private int mWB;
  int ret;
  
  public a(byte[] paramArrayOfByte)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bml();
    ((b.a)localObject).dIH = new bmm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shakeget";
    ((b.a)localObject).dIF = 162;
    ((b.a)localObject).dII = 57;
    ((b.a)localObject).dIJ = 1000000057;
    this.diG = ((b.a)localObject).KT();
    localObject = (bml)this.diG.dID.dIL;
    ((bml)localObject).rfy = new bhy().bq(paramArrayOfByte);
    ((bml)localObject).skF = 1;
    ((bml)localObject).rTr = new bhy().bq(com.tencent.mm.plugin.normsg.a.b.lFJ.bjE());
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneShakeGet", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneShakeGet", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (bmm)this.diG.dIE.dIL;
    this.mWA = new LinkedList();
    this.mWB = paramq.skH;
    this.ret = paramq.rfn;
    this.hyz = paramq.lRx;
    int i = paramq.hbF;
    x.d("MicroMsg.NetSceneShakeGet", "size:" + i);
    au.HU();
    paramArrayOfByte = c.FR();
    if (i > 0)
    {
      e locale = m.buC();
      locale.buu();
      x.i("MicroMsg.NewShakeItemStorage", "delOldRecord count:" + i);
      Object localObject1 = new StringBuilder("DELETE FROM shakeitem1 WHERE shakeItemID NOT IN ( SELECT shakeItemID FROM shakeitem1 ORDER BY shakeItemID DESC LIMIT ");
      label247:
      Object localObject2;
      boolean bool;
      if (100 > i)
      {
        paramInt1 = 100 - i;
        localObject1 = paramInt1 + " )";
        if (locale.diF.fV("shakeitem1", (String)localObject1))
        {
          x.i("MicroMsg.NewShakeItemStorage", "delOldRecord success count:" + i);
          locale.doNotify();
        }
        paramInt1 = i - 1;
        if (paramInt1 < 0) {
          break label782;
        }
        if (!com.tencent.mm.model.q.GF().equals(((bmk)paramq.skG.get(paramInt1)).hbL))
        {
          localObject1 = z.MY().kA(((bmk)paramq.skG.get(paramInt1)).hbL);
          ((com.tencent.mm.ac.d)localObject1).field_username = ((bmk)paramq.skG.get(paramInt1)).hbL;
          ((com.tencent.mm.ac.d)localObject1).field_brandList = ((bmk)paramq.skG.get(paramInt1)).eJR;
          localObject2 = ((bmk)paramq.skG.get(paramInt1)).rTl;
          if (localObject2 != null)
          {
            ((com.tencent.mm.ac.d)localObject1).field_brandFlag = ((qt)localObject2).eJV;
            ((com.tencent.mm.ac.d)localObject1).field_brandInfo = ((qt)localObject2).eJX;
            ((com.tencent.mm.ac.d)localObject1).field_brandIconURL = ((qt)localObject2).eJY;
            ((com.tencent.mm.ac.d)localObject1).field_extInfo = ((qt)localObject2).eJW;
          }
          if (!z.MY().e((com.tencent.mm.ac.d)localObject1)) {
            z.MY().d((com.tencent.mm.ac.d)localObject1);
          }
        }
        localObject1 = new d((bmk)paramq.skG.get(paramInt1));
        localObject2 = new j();
        ((j)localObject2).username = ((d)localObject1).field_username;
        if (((d)localObject1).field_hasHDImg <= 0) {
          break label770;
        }
        bool = true;
        label471:
        ((j)localObject2).by(bool);
        ((j)localObject2).csA = ((d)localObject1).field_imgstatus;
        ((j)localObject2).dHR = ((bmk)paramq.skG.get(paramInt1)).rqZ;
        ((j)localObject2).dHQ = ((bmk)paramq.skG.get(paramInt1)).rra;
        com.tencent.mm.aa.q.KH().a((j)localObject2);
        ((j)localObject2).bWA = -1;
        x.d("MicroMsg.NetSceneShakeGet", "dkhurl search %s b[%s] s[%s]", new Object[] { ((j)localObject2).getUsername(), ((j)localObject2).Kx(), ((j)localObject2).Ky() });
        if (!paramArrayOfByte.Yc(((d)localObject1).field_username)) {
          break label776;
        }
      }
      label770:
      label776:
      for (i = 1;; i = 0)
      {
        ((d)localObject1).field_reserved2 = i;
        localObject2 = paramArrayOfByte.Yg(((d)localObject1).field_username);
        if ((localObject2 != null) && ((int)((com.tencent.mm.l.a)localObject2).dhP > 0))
        {
          locale.Lb(((ai)localObject2).field_username);
          locale.Lb(((ai)localObject2).field_encryptUsername);
        }
        locale.a((d)localObject1, false);
        au.HU();
        c.Gw().x(((d)localObject1).field_username, this.mWB, ((bmk)paramq.skG.get(paramInt1)).rEJ);
        ((d)localObject1).scene = this.mWB;
        this.mWA.add(localObject1);
        x.v("MicroMsg.NetSceneShakeGet", "item info: " + ((d)localObject1).field_username + " " + ((d)localObject1).field_nickname);
        paramInt1 -= 1;
        break label247;
        paramInt1 = 0;
        break;
        bool = false;
        break label471;
      }
    }
    label782:
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 162;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/shake/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */