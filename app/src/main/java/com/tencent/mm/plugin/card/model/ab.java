package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abl;
import com.tencent.mm.protocal.c.abm;
import com.tencent.mm.protocal.c.ky;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String hwU;
  public int hxg;
  public String hxh;
  public int hxi;
  public String hxj;
  
  public ab(LinkedList<ky> paramLinkedList, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new abl();
    ((b.a)localObject).dIH = new abm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardlistfromapp";
    ((b.a)localObject).dIF = 690;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (abl)this.diG.dID.dIL;
    ((abl)localObject).qZS = paramLinkedList;
    ((abl)localObject).cae = paramInt1;
    ((abl)localObject).rcN = paramString1;
    ((abl)localObject).sign = paramString2;
    ((abl)localObject).qZO = paramString3;
    ((abl)localObject).qZN = paramString4;
    ((abl)localObject).rGk = paramString5;
    ((abl)localObject).qZP = paramInt2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3 + " netType = 690");
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.hwU = ((abm)this.diG.dIE.dIL).hwU;
      if (!TextUtils.isEmpty(this.hwU)) {
        break label95;
      }
      x.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData json_ret is empty!");
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      try
      {
        label95:
        paramq = new JSONObject(this.hwU);
        this.hxg = paramq.optInt("accept_button_status", 0);
        this.hxh = paramq.optString("accept_button_wording");
        this.hxi = paramq.optInt("private_status", 0);
        this.hxj = paramq.optString("private_wording");
      }
      catch (JSONException paramq)
      {
        x.printErrStackTrace("MicroMsg.NetSceneGetCardListFromApp", paramq, "", new Object[0]);
        x.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData:" + paramq.getMessage());
      }
    }
  }
  
  public final int getType()
  {
    return 690;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/model/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */