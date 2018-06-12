package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.asx;
import com.tencent.mm.protocal.c.asy;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String huH;
  public int huI = 0;
  public String huJ;
  public int huK;
  public String huL;
  public String hyn;
  
  public f(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new asx();
    ((b.a)localObject).dIH = new asy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/marksharecard";
    ((b.a)localObject).dIF = 907;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (asx)this.diG.dID.dIL;
    ((asx)localObject).cac = paramString;
    ((asx)localObject).rVh = paramInt2;
    ((asx)localObject).rVg = paramInt1;
    ((asx)localObject).scene = paramInt3;
    this.hyn = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMarkShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(907), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (asy)this.diG.dIE.dIL;
      x.i("MicroMsg.NetSceneMarkShareCard", "json_ret:" + paramq.hwU);
      paramq = paramq.hwU;
      if (!TextUtils.isEmpty(paramq)) {
        break label119;
      }
      x.e("MicroMsg.NetSceneMarkShareCard", "parseJson json_ret is empty!");
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      try
      {
        label119:
        paramq = new JSONObject(paramq);
        this.huH = paramq.optString("mark_user");
        this.huI = paramq.optInt("mark_succ", 0);
        this.huJ = paramq.optString("mark_card_id");
        this.huK = paramq.optInt("expire_time", 0);
        this.huL = paramq.optString("pay_qrcode_wording");
      }
      catch (JSONException paramq)
      {
        x.printErrStackTrace("MicroMsg.NetSceneMarkShareCard", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    return 907;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */