package com.tencent.mm.plugin.sns.a.b;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bf;
import com.tencent.mm.protocal.c.bg;
import com.tencent.mm.protocal.c.bh;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private b diG;
  public com.tencent.mm.ab.e diJ;
  
  public d(String paramString1, int paramInt1, int paramInt2, int paramInt3, bf parambf, com.tencent.mm.protocal.c.bi parambi, int paramInt4, String paramString2, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bg();
    ((b.a)localObject).dIH = new bh();
    if (paramInt6 != 2) {
      ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/exposure";
    }
    for (((b.a)localObject).dIF = 1231;; ((b.a)localObject).dIF = 1875)
    {
      ((b.a)localObject).dII = 0;
      ((b.a)localObject).dIJ = 0;
      this.diG = ((b.a)localObject).KT();
      x.i("MicroMsg.NetSceneAdExposure", "uri %s", new Object[] { this.diG.uri });
      localObject = (bg)this.diG.dID.dIL;
      ((bg)localObject).rbC = paramInt3;
      ((bg)localObject).type = paramInt2;
      ((bg)localObject).scene = paramInt1;
      ((bg)localObject).egF = paramString1;
      ((bg)localObject).rbF = paramInt5;
      ((bg)localObject).rbG = paramInt7;
      ((bg)localObject).rbH = paramInt8;
      ((bg)localObject).rbt = paramInt9;
      if (parambf != null)
      {
        ((bg)localObject).rbD = parambf;
        x.i("MicroMsg.NetSceneAdExposure", "exposure_info " + parambf.rbA);
      }
      if (parambi != null)
      {
        ((bg)localObject).rbE = parambi;
        x.i("MicroMsg.NetSceneAdExposure", "social_info " + parambi.rbI + " " + parambi.like_count);
      }
      parambf = (WifiManager)ad.getContext().getSystemService("wifi");
      if (parambf != null)
      {
        parambf = parambf.getConnectionInfo();
        if (parambf != null)
        {
          ((bg)localObject).bssid = com.tencent.mm.sdk.platformtools.bi.aG(parambf.getBSSID(), "");
          ((bg)localObject).ssid = com.tencent.mm.sdk.platformtools.bi.aG(parambf.getSSID(), "");
        }
      }
      ((bg)localObject).rbo = System.currentTimeMillis();
      ((bg)localObject).rbq = paramInt4;
      if (paramString2 != null) {
        ((bg)localObject).rbn = paramString2;
      }
      x.i("MicroMsg.NetSceneAdExposure", "##time viewid " + paramString1 + " sceneType " + paramInt1 + " type: " + paramInt2 + " duration " + paramInt3 + "feed_duration " + paramInt7 + "feed_full_duration " + paramInt8 + " ad_type " + paramInt4 + " exposureCount " + paramInt5 + " descXml:" + paramString2 + " flip_status " + paramInt9);
      return;
      ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adexposure";
    }
  }
  
  public d(String paramString, int paramInt1, com.tencent.mm.protocal.c.bi parambi, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramString, paramInt1, 1, 0, null, parambi, paramInt2, "", paramInt3, paramInt4, 0, 0, 0);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAdExposure", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (bh)this.diG.dIE.dIL;
    x.i("MicroMsg.NetSceneAdExposure", "resp " + paramq.ret + " msg: " + paramq.bIr);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1231;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */