package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.axm;
import com.tencent.mm.protocal.c.axn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public int hUm = 0;
  public String hUn = "";
  public axn pCc;
  public String token = null;
  
  public e(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new axm();
    ((b.a)localObject).dIH = new axn();
    ((b.a)localObject).dIF = 1958;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/openecardauth";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (axm)this.diG.dID.dIL;
    ((axm)localObject).rhb = paramString1;
    ((axm)localObject).saD = paramString2;
    ((axm)localObject).bVB = paramInt;
    ((axm)localObject).token = paramString3;
    this.token = null;
    x.i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d, token: %s, wxp_passwd_enc==null: %s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString3, Boolean.valueOf(bi.oW(paramString2)) });
    x.i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d", new Object[] { paramString1, Integer.valueOf(paramInt) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneOpenECardAuth", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pCc = ((axn)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneOpenECardAuth", "ret_code: %d, ret_msg: %s, is_token_invalid: %s", new Object[] { Integer.valueOf(this.pCc.hwV), this.pCc.hwW, Boolean.valueOf(this.pCc.saF) });
    if (!bi.oW(this.pCc.saE)) {
      x.d("MicroMsg.NetSceneOpenECardAuth", "rettext: %s", new Object[] { this.pCc.saE });
    }
    try
    {
      paramq = new JSONObject(this.pCc.saE);
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
        x.printErrStackTrace("MicroMsg.NetSceneOpenECardAuth", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    return 1958;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */