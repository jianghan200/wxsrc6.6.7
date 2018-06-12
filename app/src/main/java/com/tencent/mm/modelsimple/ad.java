package com.tencent.mm.modelsimple;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.cic;
import com.tencent.mm.protocal.c.cid;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class ad
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private final com.tencent.mm.ab.b efk;
  private int retryCount = 3;
  
  public ad(String paramString, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new cic();
    ((b.a)localObject).dIH = new cid();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/yybgetpkgsig";
    ((b.a)localObject).dIF = 729;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.efk = ((b.a)localObject).KT();
    localObject = (cic)this.efk.dID.dIL;
    ((cic)localObject).iwP = w.chP();
    ((cic)localObject).reQ = com.tencent.mm.plugin.normsg.a.b.lFJ.ub(0);
    ((cic)localObject).sCa = paramString;
    ((cic)localObject).jPh = paramInt;
    x.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig Language[%s], PkgName[%s], versionCode[%d], stack[%s]", new Object[] { ((cic)localObject).iwP, paramString, Integer.valueOf(paramInt), bi.cjd() });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.efk, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (cic)this.efk.dID.dIL;
    paramArrayOfByte = (cid)this.efk.dIE.dIL;
    x.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s], ret[%d], sig[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(paramArrayOfByte.sCb), paramArrayOfByte.sCc });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig err and return!");
      h.mEJ.a(322L, 1L, 1L, false);
      h.mEJ.h(11098, new Object[] { Integer.valueOf(4001), String.format("%s,%d,%d,%d", new Object[] { paramq.sCa, Integer.valueOf(paramq.jPh), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramArrayOfByte.sCb == 2) || (paramArrayOfByte.sCb == 3))
    {
      this.retryCount -= 1;
      if (this.retryCount <= 0)
      {
        x.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken err and return with no try!");
        h.mEJ.a(322L, 2L, 1L, false);
        h.mEJ.h(11098, new Object[] { Integer.valueOf(4002), String.format("%s,%d", new Object[] { paramq.sCa, Integer.valueOf(paramq.jPh) }) });
        this.diJ.a(3, -1, "", this);
        return;
      }
      x.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken do scene again retryCount:%d", new Object[] { Integer.valueOf(this.retryCount) });
      a(this.dIX, this.diJ);
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      if (paramArrayOfByte.sCb == 1)
      {
        MultiProcessSharedPreferences.getSharedPreferences(com.tencent.mm.sdk.platformtools.ad.getContext(), "yyb_pkg_sig_prefs", 4).edit().remove(paramq.sCa).commit();
        h.mEJ.a(322L, 5L, 1L, false);
        h.mEJ.h(11098, new Object[] { Integer.valueOf(4005), String.format("%s,%d", new Object[] { paramq.sCa, Integer.valueOf(paramq.jPh) }) });
        x.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no sig[%s] and remove", new Object[] { paramArrayOfByte.sCc });
      }
      else if (paramArrayOfByte.sCb == 4)
      {
        x.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no need try and revise");
        h.mEJ.a(322L, 4L, 1L, false);
        h.mEJ.h(11098, new Object[] { Integer.valueOf(4004), String.format("%s,%d", new Object[] { paramq.sCa, Integer.valueOf(paramq.jPh) }) });
      }
      else
      {
        x.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret sig[%s]", new Object[] { paramArrayOfByte.sCc });
        MultiProcessSharedPreferences.getSharedPreferences(com.tencent.mm.sdk.platformtools.ad.getContext(), "yyb_pkg_sig_prefs", 4).edit().putString(paramq.sCa, paramArrayOfByte.sCc).commit();
        h.mEJ.a(322L, 3L, 1L, false);
        h.mEJ.h(11098, new Object[] { Integer.valueOf(4003), String.format("%s,%d,%s", new Object[] { paramq.sCa, Integer.valueOf(paramq.jPh), paramArrayOfByte.sCc }) });
      }
    }
  }
  
  public final int getType()
  {
    return 729;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelsimple/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */