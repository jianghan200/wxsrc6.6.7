package com.tencent.mm.plugin.fingerprint.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.d.a.c.i;
import com.tencent.d.b.f.b.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.lg;
import com.tencent.mm.g.a.lg.a;
import com.tencent.mm.g.a.lg.b;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
  extends a
{
  private l jgP = null;
  private com.tencent.d.b.c.a jgQ = null;
  
  private static String aNE()
  {
    Object localObject = com.tencent.mm.plugin.wallet_core.model.s.pqR.pqT;
    if (localObject != null) {
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("json", ((i)localObject).vlM);
        localJSONObject.put("signature", ((i)localObject).signature);
        localObject = localJSONObject.toString();
        return (String)localObject;
      }
      catch (JSONException localJSONException)
      {
        x.e("MicroMsg.SoterAuthMgrImp", "hy: error when convert to json: %s", new Object[] { localJSONException.toString() });
        x.printErrStackTrace("MicroMsg.SoterAuthMgrImp", localJSONException, "", new Object[0]);
        return "";
      }
    }
    x.e("MicroMsg.SoterAuthMgrImp", "hy: signature result is null");
    return "";
  }
  
  @TargetApi(16)
  public final int a(final com.tencent.mm.pluginsdk.wallet.c paramc, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      x.i("MicroMsg.SoterAuthMgrImp", "hy: req restart after fail, but no need");
      return 0;
    }
    Object localObject = new k.1(this, paramc);
    this.jgQ = new com.tencent.d.b.c.a();
    localObject = new b.a().Hq(1).hK(ad.getContext()).a(this.jgQ).acG(com.tencent.mm.plugin.wallet_core.model.s.pqR.jgX).a((com.tencent.d.b.c.b)localObject).vml;
    com.tencent.d.b.a.a(new com.tencent.d.b.a.b() {}, (com.tencent.d.b.f.b)localObject);
    return 0;
  }
  
  public final void a(lg paramlg, int paramInt)
  {
    x.i("MicroMsg.SoterAuthMgrImp", "hy: soter onOpenFingerprintAuthSuccess");
    paramlg.bVA.bVE = aNE();
    lg.b localb = paramlg.bVA;
    if (!bi.oW(paramlg.bVA.bVE)) {}
    for (paramInt = 0;; paramInt = 1)
    {
      localb.errCode = paramInt;
      paramlg.bVA.bVF = 2;
      paramlg.bVA.bQb = "";
      paramlg.bVA.bQc = "";
      if (paramlg.bVz.bVD != null) {
        paramlg.bVz.bVD.run();
      }
      return;
    }
  }
  
  public final boolean a(boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    x.i("MicroMsg.SoterAuthMgrImp", "hy: post pay. is fingerprint pay: %b, is pay ok: %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (!paramBoolean1)
    {
      paramBundle = paramBundle.getString("pwd");
      if (!bi.oW(paramBundle)) {
        break label52;
      }
      x.e("MicroMsg.SoterAuthMgrImp", "hy: no pwd. can not change auth key");
    }
    label52:
    while (!com.tencent.mm.plugin.wallet_core.model.s.pqR.jgY) {
      return false;
    }
    x.i("MicroMsg.SoterAuthMgrImp", "hy: need change auth key. start gen auth key");
    com.tencent.d.b.a.a(new k.3(this), true, 1, new com.tencent.mm.plugin.fingerprint.c.c(paramBundle), new com.tencent.mm.plugin.soter.b.e());
    return false;
  }
  
  public final boolean aNc()
  {
    return com.tencent.d.a.a.hA(ad.getContext());
  }
  
  public final void aNe()
  {
    if ((this.jgQ != null) && (Build.VERSION.SDK_INT >= 16))
    {
      x.i("MicroMsg.SoterAuthMgrImp", "alvinluo cancel fingeprint canceller");
      this.jgQ.mR(true);
      if (com.tencent.mm.plugin.soter.c.a.bFg()) {
        com.tencent.mm.plugin.soter.c.a.c(1, -1000223, -1, "user cancelled");
      }
    }
  }
  
  public final j aNg()
  {
    this.jgP = new l();
    return this.jgP;
  }
  
  public final boolean aNh()
  {
    if (q.deQ.deZ == 1) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = com.tencent.d.b.a.cFN();
      x.i("MicroMsg.SoterAuthMgrImp", "hy: config support: %b, device support: %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool1) || (!bool2)) {
        break;
      }
      return true;
    }
    return false;
  }
  
  public final boolean aNi()
  {
    return com.tencent.d.a.a.hz(ad.getContext());
  }
  
  public final void aNj()
  {
    x.i("MicroMsg.SoterAuthMgrImp", "hy: soter init fp. Do nothing?? Prepare ASK??");
    e.fc(true);
    e.fb(true);
    com.tencent.mm.plugin.soter.d.b.a(false, false, null);
  }
  
  public final boolean aNl()
  {
    return false;
  }
  
  public final boolean aNm()
  {
    return aNh();
  }
  
  @SuppressLint({"NewApi"})
  public final void aNn()
  {
    x.i("MicroMsg.SoterAuthMgrImp", "hy: do nothing in system release");
  }
  
  @SuppressLint({"NewApi"})
  public final void aNo()
  {
    x.i("MicroMsg.SoterAuthMgrImp", "hy: do nothing in system release");
  }
  
  public final void aNp()
  {
    if (com.tencent.d.a.a.acz(e.aNu())) {
      com.tencent.d.a.a.bD(e.aNu(), false);
    }
  }
  
  public final Map<String, String> aNq()
  {
    HashMap localHashMap = new HashMap();
    Object localObject = com.tencent.mm.plugin.soter.c.b.bFh();
    String str = ((com.tencent.mm.plugin.soter.c.c)localObject).onE;
    localObject = ((com.tencent.mm.plugin.soter.c.c)localObject).onF;
    localHashMap.put("cpu_id", str);
    localHashMap.put("uid", localObject);
    return localHashMap;
  }
  
  public final com.tencent.mm.pluginsdk.wallet.k aNr()
  {
    return new m();
  }
  
  public final Map<String, String> aNs()
  {
    return aNq();
  }
  
  public final boolean aNt()
  {
    x.v("MicroMsg.SoterAuthMgrImp", "hasAsk: %b, hasAuthKey: %b, isAuthKeyValid: %b", new Object[] { Boolean.valueOf(com.tencent.d.a.a.cFC()), Boolean.valueOf(com.tencent.d.a.a.acz(e.aNu())), Boolean.valueOf(com.tencent.d.a.a.acA(e.aNu())) });
    if ((!com.tencent.d.a.a.cFC()) || (!com.tencent.d.a.a.acz(e.aNu())) || (!com.tencent.d.a.a.acA(e.aNu())))
    {
      x.i("MicroMsg.SoterAuthMgrImp", "hy: no ask or auth key");
      com.tencent.mm.plugin.wallet_core.model.s.pqR.jgY = true;
    }
    return !com.tencent.mm.plugin.wallet_core.model.s.pqR.jgY;
  }
  
  public final void di(Context paramContext)
  {
    x.i("MicroMsg.SoterAuthMgrImp", "hy: start startRigesterSysFP");
  }
  
  public final int type()
  {
    return 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */