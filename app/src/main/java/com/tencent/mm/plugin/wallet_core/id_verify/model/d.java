package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.j;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bsq;
import com.tencent.mm.protocal.c.bsr;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.c.n;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends i
{
  public String token;
  
  public d(String paramString1, String paramString2, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", "1");
    localHashMap.put("true_name", paramString1);
    localHashMap.put("identify_card", paramString2);
    localHashMap.put("cre_type", "1");
    localHashMap.put("realname_scene", String.valueOf(paramInt));
    x.i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
    F(localHashMap);
  }
  
  public final void J(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject2 = this.diG;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).dIG = new bsq();
      ((b.a)localObject1).dIH = new bsr();
      ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/tenpay/realnameauthen";
      ((b.a)localObject1).dIF = 1616;
      ((b.a)localObject1).dII = 185;
      ((b.a)localObject1).dIJ = 1000000185;
      localObject1 = ((b.a)localObject1).KT();
      ((j)localObject1).dIU = true;
    }
    localObject2 = (bsq)((b)localObject1).dID.dIL;
    if (paramBoolean2) {
      ((bsq)localObject2).rPt = 1;
    }
    this.diG = ((b)localObject1);
  }
  
  public final String OT(String paramString)
  {
    return TenpayUtil.signWith3Des(paramString);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramInt == 0) {
      this.token = paramJSONObject.optString("token");
    }
  }
  
  public final void a(b paramb, bhy parambhy)
  {
    ((bsq)paramb.dID.dIL).rPu = parambhy;
  }
  
  public final void b(b paramb, bhy parambhy)
  {
    ((bsq)paramb.dID.dIL).scR = parambhy;
  }
  
  public final int bNX()
  {
    return 0;
  }
  
  public final n d(b paramb)
  {
    paramb = (bsr)paramb.dIE.dIL;
    n localn = new n();
    localn.rPy = paramb.rPy;
    localn.rPx = paramb.rPx;
    localn.rPw = paramb.rPw;
    localn.rPv = paramb.rPv;
    localn.iwT = paramb.scT;
    localn.uXp = paramb.scS;
    return localn;
  }
  
  public final int getType()
  {
    return 1616;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */