package com.tencent.mm.plugin.account.friend.a;

import android.content.Context;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.sf;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.protocal.c.hg;
import com.tencent.mm.protocal.c.hh;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;

public final class x
  extends com.tencent.mm.ab.l
  implements k
{
  private String bQX = null;
  private String bQZ = null;
  private int dJp = 2;
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  
  public x(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new hg();
    ((b.a)localObject).dIH = new hh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindopmobile";
    ((b.a)localObject).dIF = 132;
    ((b.a)localObject).dII = 45;
    ((b.a)localObject).dIJ = 1000000045;
    this.diG = ((b.a)localObject).KT();
    localObject = (hg)this.diG.dID.dIL;
    ((hg)localObject).rfe = paramInt1;
    ((hg)localObject).rhw = paramInt2;
    ((hg)localObject).rhx = paramString3;
    if ((bi.oW(this.bQX)) && (bi.oW(this.bQZ)))
    {
      if (com.tencent.mm.sdk.platformtools.e.sFF)
      {
        paramString3 = ad.getContext().getString(a.j.safe_device_android_device_nm);
        ((hg)localObject).rhz = paramString3;
        ((hg)localObject).rhA = d.DEVICE_NAME;
      }
    }
    else
    {
      if ((paramString1 == null) || (paramString1.length() <= 0) || ((paramInt1 != 1) && (paramInt1 != 4) && (paramInt1 != 18))) {
        break label296;
      }
      g.Ei().DT().set(4097, paramString1);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBindOpMobile", "Get mobile:" + paramString1 + " opcode:" + paramInt1 + " verifyCode:" + paramString2);
      ((hg)localObject).rhu = paramString1;
      ((hg)localObject).rhv = paramString2;
      ((hg)localObject).iwP = com.tencent.mm.sdk.platformtools.w.chP();
      return;
      paramString3 = ad.getContext().getString(a.j.safe_device_android_device);
      break;
      label296:
      if ((paramInt1 == 2) || (paramInt1 == 19)) {
        paramString1 = (String)g.Ei().DT().get(4097, null);
      } else if (paramInt1 == 3) {
        paramString1 = (String)g.Ei().DT().get(6, null);
      }
    }
  }
  
  public x(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(paramString1, paramInt, paramString2, 0, paramString3);
    this.bQX = paramString4;
    this.bQZ = paramString5;
    paramString1 = (hg)this.diG.dID.dIL;
    paramString1.rhz = paramString4;
    paramString1.rhA = paramString5;
  }
  
  public final int Oh()
  {
    return ((hg)this.diG.dID.dIL).rfe;
  }
  
  public final String Oj()
  {
    return ((hh)this.diG.dIE.dIL).bLe;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (hg)this.diG.dID.dIL;
    if ((parame1.rhu == null) || (parame1.rhu.length() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneBindOpMobile", "doScene getMobile Error: " + parame1.rhu);
      return -1;
    }
    if (((parame1.rfe == 2) || (parame1.rfe == 19)) && ((parame1.rhv == null) || (parame1.rhv.length() <= 0)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneBindOpMobile", "doScene getVerifyCode Error: " + parame1.rhu);
      return -1;
    }
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (hg)this.diG.dID.dIL;
    paramArrayOfByte = (hh)this.diG.dIE.dIL;
    boolean bool;
    if (paramArrayOfByte != null)
    {
      paramInt1 = paramArrayOfByte.reI;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop:%s", new Object[] { Integer.valueOf(paramInt1) });
      g.Ek();
      g.Ei().dqk.set(47, Integer.valueOf(paramInt1));
      com.tencent.mm.network.e locale = g.Eh().dpP.dJs;
      if (locale != null)
      {
        if ((paramInt1 & 0x1) != 0) {
          break label219;
        }
        bool = true;
        locale.bF(bool);
      }
    }
    for (;;)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
        if ((paramInt2 == 4) && (paramInt3 == 65296))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBindOpMobile", "summerauth bindop MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", new Object[] { Integer.valueOf(this.dJp) });
          this.dJp -= 1;
          if (this.dJp <= 0)
          {
            this.diJ.a(3, -1, "", this);
            return;
            label219:
            bool = false;
            break;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop not set as ret:%s", new Object[] { paramArrayOfByte });
            continue;
          }
          a(this.dIX, this.diJ);
          return;
        }
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " sms:" + paramArrayOfByte.rhG + "safedevice status = " + paramArrayOfByte.raE);
    if ((paramq.rfe == 2) || (paramq.rfe == 4) || (paramq.rfe == 11) || (paramq.rfe == 19))
    {
      g.Ei().DT().set(4097, "");
      g.Ei().DT().set(6, paramq.rhu);
      if ((bi.oW(this.bQX)) || (bi.oW(this.bQZ))) {
        l.Xz();
      }
      if (paramq.rfe == 19) {
        g.Ei().DT().set(12322, null);
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  mobile binded");
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      if (paramq.rfe == 3)
      {
        g.Ei().DT().set(4097, "");
        g.Ei().DT().set(6, "");
        g.Ei().DT().set(12322, null);
        g.Ei().DT().set(64, Integer.valueOf(paramArrayOfByte.raE));
        paramq = new sf();
        paramq.ccY.ccZ = false;
        paramq.ccY.cda = true;
        a.sFg.m(paramq);
        l.XG();
        l.XH();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  mobile unbinded");
      }
    }
  }
  
  public final int getType()
  {
    return 132;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */