package com.tencent.mm.plugin.sns.a.b;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.b.g;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.c.bb;
import com.tencent.mm.protocal.c.bc;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  private b diG;
  public com.tencent.mm.ab.e diJ;
  
  private c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, String paramString3, int paramInt5, int paramInt6)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bb();
    ((b.a)localObject).dIH = new bc();
    if (paramInt5 != 2) {
      ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/click";
    }
    for (((b.a)localObject).dIF = 1232;; ((b.a)localObject).dIF = 1817)
    {
      ((b.a)localObject).dII = 0;
      ((b.a)localObject).dIJ = 0;
      this.diG = ((b.a)localObject).KT();
      x.i("MicroMsg.NetSceneAdClick", "uri %s", new Object[] { this.diG.uri });
      x.i("MicroMsg.NetSceneAdClick", "NetSceneAdClick clickPos: " + paramInt1 + " viewId: " + paramString1 + " sceneType: " + paramInt2 + " adtype " + paramInt3 + ", clickAction " + paramInt4 + ",source " + paramInt5 + ", descXml " + paramString2);
      if (!bi.oW(paramString2)) {
        x.i("MicroMsg.NetSceneAdClick", "descXml: " + paramString2);
      }
      localObject = (bb)this.diG.dID.dIL;
      ((bb)localObject).egJ = paramInt1;
      ((bb)localObject).egF = paramString1;
      ((bb)localObject).scene = paramInt2;
      ((bb)localObject).rbn = paramString2;
      paramString1 = (WifiManager)ad.getContext().getSystemService("wifi");
      if (paramString1 != null)
      {
        paramString1 = paramString1.getConnectionInfo();
        if (paramString1 != null)
        {
          ((bb)localObject).bssid = bi.aG(paramString1.getBSSID(), "");
          ((bb)localObject).ssid = bi.aG(paramString1.getSSID(), "");
        }
      }
      ((bb)localObject).rbo = System.currentTimeMillis();
      ((bb)localObject).rbq = paramInt3;
      ((bb)localObject).rbr = paramInt4;
      ((bb)localObject).source = paramInt5;
      ((bb)localObject).rbs = paramString3;
      ((bb)localObject).rbt = paramInt6;
      return;
      ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adclick";
    }
  }
  
  public c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, String paramString3, String paramString4)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramInt3, paramInt4, paramString3, paramString4, 0);
  }
  
  public c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, String paramString3, String paramString4, int paramInt5)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramInt3, paramInt4, paramString3, n.nkD.Lx(paramString4), paramInt5);
  }
  
  public c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, long paramLong)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramInt3, "", paramLong);
  }
  
  public c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, String paramString3)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramInt3, 0, "", paramString3);
  }
  
  private c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, String paramString3, long paramLong)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramInt3, 0, paramString3, n.nkD.eC(paramLong), 0);
  }
  
  public c(String paramString1, String paramString2)
  {
    this(paramString1, 18, 5, paramString2, 2, -1L);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneAdClick", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1232;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */