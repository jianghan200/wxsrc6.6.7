package com.tencent.mm.modelvideo;

import android.graphics.BitmapFactory.Options;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bku;
import com.tencent.mm.protocal.c.bkv;
import com.tencent.mm.protocal.c.btc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class e
  extends l
  implements k
{
  private String clientId = "";
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private long emf = -1L;
  private r emg = null;
  private keep_SceneResult emh = null;
  
  public e(long paramLong, r paramr, keep_SceneResult paramkeep_SceneResult, String paramString)
  {
    x.i("MicroMsg.NetSceneMassUploadSight", "massSendId %d, clientId %s", new Object[] { Long.valueOf(paramLong), paramString });
    this.emf = paramLong;
    this.emg = paramr;
    this.emh = paramkeep_SceneResult;
    this.clientId = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = 0;
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new bku();
    parame1.dIH = new bkv();
    parame1.uri = "/cgi-bin/micromsg-bin/sendsight";
    parame1.dIF = 245;
    this.diG = parame1.KT();
    parame1 = (bku)this.diG.dID.dIL;
    parame1.dwK = this.emh.field_aesKey;
    parame1.nuY = this.clientId;
    parame1.bKg = this.emg.cas;
    parame1.skf = this.emg.enM;
    o.Ta();
    Object localObject = s.nL(this.emg.getFileName());
    BitmapFactory.Options localOptions = c.VZ((String)localObject);
    if (localOptions != null)
    {
      parame1.dwJ = localOptions.outWidth;
      parame1.dwI = localOptions.outHeight;
    }
    for (;;)
    {
      parame1.emx = this.emg.enJ;
      localObject = bi.aG(this.emg.enU, "").split(",");
      if ((localObject != null) && (localObject.length > 0)) {
        break;
      }
      x.e("MicroMsg.NetSceneMassUploadSight", "cdn upload video done, massSendId[%d], split username fail", new Object[] { Long.valueOf(this.emf) });
      return -1;
      x.w("MicroMsg.NetSceneMassUploadSight", "sight send getImageOptions for thumb failed path:%s", new Object[] { localObject });
    }
    int j = localObject.length;
    while (i < j)
    {
      localOptions = localObject[i];
      btc localbtc = new btc();
      localbtc.username = localOptions;
      parame1.ske.add(localbtc);
      i += 1;
    }
    parame1.url = this.emh.field_fileId;
    parame1.enM = this.emg.dHI;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMassUploadSight", "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.clientId + " massSendId " + this.emf);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 245;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/modelvideo/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */