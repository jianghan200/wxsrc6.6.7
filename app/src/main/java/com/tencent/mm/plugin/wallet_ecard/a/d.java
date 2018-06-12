package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.axo;
import com.tencent.mm.protocal.c.axp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public int hUm = 0;
  public String hUn = "";
  public axp pBY;
  public String pBZ;
  public String pCa;
  public String pCb;
  
  public d(String paramString1, String paramString2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new axo();
    ((b.a)localObject).dIH = new axp();
    ((b.a)localObject).dIF = 1985;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/openecard";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (axo)this.diG.dID.dIL;
    ((axo)localObject).rhb = paramString1;
    ((axo)localObject).rhc = paramString2;
    this.diG.dIU = true;
    ((axo)localObject).saJ = 0;
    ((axo)localObject).bVB = paramInt;
    ((axo)localObject).saG = true;
    x.i("MicroMsg.NetSceneOpenECard", "create NetSceneOpenECard with reuse exist card, cardType: %s, reqSerial: %s, openScene: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
  }
  
  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, boolean paramBoolean)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt, paramBoolean, false);
  }
  
  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new axo();
    ((b.a)localObject).dIH = new axp();
    ((b.a)localObject).dIF = 1985;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/openecard";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (axo)this.diG.dID.dIL;
    ((axo)localObject).rhb = paramString1;
    ((axo)localObject).rhc = paramString2;
    this.diG.dIU = true;
    if (paramBoolean1)
    {
      ((axo)localObject).saH = paramString3;
      if (!paramBoolean2) {
        break label247;
      }
    }
    label247:
    for (((axo)localObject).saJ = 1;; ((axo)localObject).saJ = 0)
    {
      ((axo)localObject).pjw = paramString4;
      ((axo)localObject).lMV = paramString5;
      ((axo)localObject).bVB = paramInt;
      ((axo)localObject).saG = false;
      this.pBZ = paramString3;
      this.pCa = paramString4;
      this.pCb = paramString5;
      x.d("MicroMsg.NetSceneOpenECard", "cardNo: %s", new Object[] { paramString3 });
      x.i("MicroMsg.NetSceneOpenECard", "cardType: %s, reqSerial: %s, openScene: %s, mobileNo: %s, bankType: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), paramString4, paramString5 });
      return;
      ((axo)localObject).saI = paramString3;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneOpenECard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pBY = ((axp)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneOpenECard", "ret_code: %d, ret_msg: %s", new Object[] { Integer.valueOf(this.pBY.hwV), this.pBY.hwW });
    if (!bi.oW(this.pBY.saE)) {
      x.d("MicroMsg.NetSceneOpenECard", "rettext: %s", new Object[] { this.pBY.saE });
    }
    try
    {
      paramq = new JSONObject(this.pBY.saE);
      this.hUm = paramq.optInt("retcode", 0);
      this.hUn = paramq.optString("retmsg", "");
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      return;
    }
    catch (JSONException paramq)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.NetSceneOpenECard", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    return 1985;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */