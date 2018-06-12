package com.tencent.mm.wallet_core.c;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;

public abstract class m
  extends l
  implements k
{
  public String dox = "";
  public int fdx = 0;
  public long iNJ = 0L;
  private int isz = 0;
  private long pCV;
  public Bundle sy;
  
  public final int a(e parame, com.tencent.mm.network.q paramq, k paramk)
  {
    this.pCV = System.currentTimeMillis();
    return super.a(parame, paramq, paramk);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    long l1 = System.currentTimeMillis() - this.pCV;
    Object localObject = "";
    paramArrayOfByte = "";
    this.isz = baY();
    long l2 = System.currentTimeMillis();
    if (this.sy != null)
    {
      String str1 = this.sy.getString("key_TransId");
      String str2 = this.sy.getString("key_reqKey");
      if (this.iNJ == 0L) {
        this.iNJ = this.sy.getLong("key_SessionId", 0L);
      }
      paramArrayOfByte = str2;
      localObject = str1;
      if (this.fdx == 0)
      {
        this.fdx = this.sy.getInt("key_scene");
        localObject = str1;
        paramArrayOfByte = str2;
      }
    }
    h.mEJ.h(11170, new Object[] { Integer.valueOf(getType()), Integer.valueOf(this.isz), Long.valueOf(l1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(ao.getNetType(ad.getContext())), this.dox, localObject, paramArrayOfByte, Long.valueOf(this.iNJ), Long.valueOf(l2) });
    q.a(getType(), baY(), paramInt2, paramInt3, l1, this.fdx, this.dox);
    e(paramInt2, paramInt3, paramString, paramq);
  }
  
  public int baY()
  {
    return -1;
  }
  
  public abstract void e(int paramInt1, int paramInt2, String paramString, com.tencent.mm.network.q paramq);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/wallet_core/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */