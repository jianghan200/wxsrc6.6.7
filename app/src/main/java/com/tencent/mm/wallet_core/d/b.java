package com.tencent.mm.wallet_core.d;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave.RetryPayInfo;
import com.tencent.mm.wallet_core.tenpay.model.j;
import java.util.HashMap;
import org.json.JSONObject;

public final class b
  implements e
{
  static ITenpaySave.RetryPayInfo oYE;
  private j uXF;
  private int uXH = 0;
  e uXI;
  
  public b(e parame)
  {
    this.uXI = parame;
  }
  
  private void a(int paramInt1, int paramInt2, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback errCode = " + paramInt2 + "errType = " + paramInt1);
    if ((this.uXF != null) && (paramJSONObject != null) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      x.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mScene !=null");
      this.uXF.a(paramInt2, paramString, paramJSONObject);
      this.uXI.a(paramInt1, paramInt2, paramString, this.uXF);
    }
    for (;;)
    {
      x.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback reset");
      this.uXH = 0;
      return;
      if (this.uXI != null)
      {
        x.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mRealCallback !=null");
        this.uXI.a(paramInt1, paramInt2, paramString, this.uXF);
      }
    }
  }
  
  private void c(int paramInt1, int paramInt2, com.tencent.mm.ab.l paraml)
  {
    a(paramInt1, paramInt2, oYE.uXU, ((j)paraml).uYi);
  }
  
  private boolean cDq()
  {
    int i = cDr();
    return this.uXH < i;
  }
  
  private static int cDr()
  {
    if ((oYE != null) && (oYE.cDx())) {
      return oYE.uXT;
    }
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.d("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "errType: %d, errCode: %d, errMsg: %s scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml });
    if ((paraml instanceof j))
    {
      if ((paraml instanceof ITenpaySave))
      {
        ITenpaySave.RetryPayInfo localRetryPayInfo = ((ITenpaySave)paraml).bMO();
        if (localRetryPayInfo.cDx()) {
          oYE = localRetryPayInfo;
        }
      }
      g.Ek();
      g.Eh().dpP.b(385, this);
      if (((j)paraml).uYm)
      {
        if (!this.uXF.pgm) {
          break label136;
        }
        x.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess ok");
        a(paramInt1, paramInt2, paramString, ((j)paraml).uYi);
      }
    }
    label136:
    do
    {
      do
      {
        return;
        if ((!this.uXF.uYn) || (!cDq())) {
          break;
        }
        x.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try isServerDelayQuery true svrcanRetry %s localCanRetry %s", new Object[] { Boolean.valueOf(this.uXF.uYn), Boolean.valueOf(cDq()) });
      } while (d(this.uXF));
      c(paramInt1, paramInt2, paraml);
      return;
      if (!((j)paraml).uXm) {
        break;
      }
      x.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try svr no resp");
    } while (d(this.uXF));
    c(paramInt1, paramInt2, paraml);
    return;
    paramString = oYE.uXU;
    x.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess error %s", new Object[] { paramString });
    a(paramInt1, paramInt2, paramString, ((j)paraml).uYi);
  }
  
  public final boolean d(j paramj)
  {
    if ((oYE != null) && (oYE.cDx())) {}
    int k;
    for (int i = oYE.uXS;; i = 0)
    {
      k = cDr();
      this.uXH += 1;
      if (this.uXH <= k) {
        break;
      }
      return false;
    }
    this.uXF = paramj;
    this.uXF.mxp = true;
    g.Ek();
    g.Eh().dpP.a(385, this);
    this.uXF.cDC();
    int m = this.uXH;
    if (this.uXH >= k) {}
    for (int j = 1;; j = 0)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("retry_count", String.valueOf(m));
      localHashMap.put("is_last_retry", String.valueOf(j));
      paramj.aB(localHashMap);
      x.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
      g.Ek();
      g.Eh().dpP.a(paramj, i);
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */