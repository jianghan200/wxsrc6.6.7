package com.tencent.mm.wallet_core.d;

import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.tenpay.model.c;
import com.tencent.mm.wallet_core.tenpay.model.d;
import com.tencent.mm.wallet_core.tenpay.model.f;
import com.tencent.mm.wallet_core.tenpay.model.h;
import com.tencent.mm.wallet_core.tenpay.model.j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  implements com.tencent.mm.ab.e
{
  private j uXF;
  private f uXG;
  private int uXH = 0;
  com.tencent.mm.ab.e uXI;
  
  public a(com.tencent.mm.ab.e parame)
  {
    this.uXI = parame;
  }
  
  private void a(int paramInt1, int paramInt2, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback errCode = " + paramInt2 + "errType = " + paramInt1);
    if ((this.uXF != null) && (paramJSONObject != null) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      x.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mScene !=null");
      this.uXF.a(paramInt2, paramString, paramJSONObject);
      this.uXI.a(paramInt1, paramInt2, paramString, this.uXF);
    }
    for (;;)
    {
      x.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback reset");
      this.uXH = 0;
      return;
      if (this.uXI != null)
      {
        x.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mRealCallback !=null");
        this.uXI.a(paramInt1, paramInt2, paramString, this.uXF);
      }
    }
  }
  
  private void c(j paramj)
  {
    this.uXF = paramj;
    this.uXF.mxp = true;
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(385, this);
    paramj = com.tencent.mm.plugin.wallet_core.model.o.bOW();
    int i;
    Object localObject;
    label101:
    int k;
    label138:
    int m;
    StringBuilder localStringBuilder;
    if (paramj.prL > 0)
    {
      i = paramj.prL;
      this.uXH += 1;
      paramj = this.uXF.cDA();
      localObject = (String)paramj.get("req_key");
      if (!bi.oW((String)localObject)) {
        break label257;
      }
      x.i("MicroMsg.DelayQueryOrderHelper", "no reqKey");
      paramj = new f(paramj);
      this.uXG = paramj;
      this.uXG.uXY = true;
      k = com.tencent.mm.plugin.wallet_core.model.o.bOW().mRetryCount;
      paramj = this.uXG;
      if (this.uXH < k) {
        break label424;
      }
      j = 1;
      m = this.uXH;
      localObject = new HashMap();
      localStringBuilder = new StringBuilder();
      if (j == 0) {
        break label429;
      }
    }
    label257:
    label424:
    label429:
    for (int j = 1;; j = 0)
    {
      ((HashMap)localObject).put("is_last_query", j);
      ((HashMap)localObject).put("curr_query_count", String.valueOf(m));
      paramj.aB((Map)localObject);
      x.i("MicroMsg.DelayQueryOrderHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a(this.uXG, i);
      return;
      i = 10000;
      break;
      x.i("MicroMsg.DelayQueryOrderHelper", "payorder reqKey: %s", new Object[] { localObject });
      x.i("MicroMsg.DelayQueryOrderHelper", "delayquery go new split cgi");
      if (((String)localObject).startsWith("sns_aa_"))
      {
        paramj = new com.tencent.mm.wallet_core.tenpay.model.b(paramj);
        break label101;
      }
      if (((String)localObject).startsWith("sns_tf_"))
      {
        paramj = new h(paramj);
        break label101;
      }
      if (((String)localObject).startsWith("sns_ff_"))
      {
        paramj = new c(paramj);
        break label101;
      }
      if (((String)localObject).startsWith("ts_"))
      {
        paramj = new d(paramj);
        break label101;
      }
      if (((String)localObject).startsWith("sns_"))
      {
        paramj = new com.tencent.mm.wallet_core.tenpay.model.g(paramj);
        break label101;
      }
      if (((String)localObject).startsWith("offline_"))
      {
        paramj = new com.tencent.mm.wallet_core.tenpay.model.e(paramj);
        break label101;
      }
      paramj = new f(paramj);
      break label101;
      j = 0;
      break label138;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.d("MicroMsg.DelayQueryOrderHelper", "errType: %d, errCode: %d, errMsg: %s scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml });
    if (((paraml instanceof f)) && (this.uXG.equals(paraml)))
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.b(385, this);
      paraml = (f)paraml;
      x.d("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder errType: %d, errCode: %d, errMsg: %s scene %s  errmsgtype %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml, Integer.valueOf(paraml.uXX) });
      if (paraml.uXX == 1)
      {
        x.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step A");
        a(paramInt1, paramInt2, paramString, paraml.cDy());
      }
    }
    label257:
    do
    {
      do
      {
        return;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          x.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step B");
          if (paraml.uXX != 2) {
            a(paramInt1, paramInt2, paramString, paraml.cDy());
          }
        }
        else
        {
          if (paraml.uXm) {
            break label257;
          }
          x.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step C");
          x.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", new Object[] { com.tencent.mm.plugin.wallet_core.model.o.bOW().prM });
        }
        do
        {
          a(this.uXF.uYf, this.uXF.uYg, this.uXF.uYh, this.uXF.uYi);
          return;
          if (a(this.uXF))
          {
            x.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D doLoopDelayScene");
            c(this.uXF);
            return;
          }
          x.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D fail");
        } while (paraml.uXX != 1);
        a(paramInt1, paramInt2, paramString, paraml.cDy());
        return;
      } while ((!(paraml instanceof j)) || (!this.uXF.equals(paraml)));
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.b(385, this);
    } while (!((j)paraml).uYm);
    if (this.uXF.pgm)
    {
      x.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess ok");
      a(paramInt1, paramInt2, paramString, ((j)paraml).uYi);
      return;
    }
    if (this.uXF.cDB())
    {
      x.i("MicroMsg.DelayQueryOrderHelper", "try isServerDelayQuery true");
      c(this.uXF);
      return;
    }
    paramString = com.tencent.mm.plugin.wallet_core.model.o.bOW().prM;
    x.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", new Object[] { paramString });
    a(paramInt1, paramInt2, paramString, ((j)paraml).uYi);
  }
  
  public final boolean a(j paramj)
  {
    int i = com.tencent.mm.plugin.wallet_core.model.o.bOW().mRetryCount;
    x.i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", new Object[] { Boolean.valueOf(paramj.cDB()), Integer.valueOf(this.uXH) });
    return (paramj.cDB()) && (this.uXH < i);
  }
  
  public final void b(j paramj)
  {
    x.i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
    this.uXH = 0;
    c(paramj);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/wallet_core/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */