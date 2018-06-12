package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.protocal.c.ahc;
import com.tencent.mm.protocal.c.ahd;
import com.tencent.mm.storage.aa.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public boolean pjc = false;
  private long pkG = 10L;
  
  public b()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetRealnameWording", "NetSceneGetRealnameWording call");
    b.a locala = new b.a();
    ahc localahc = new ahc();
    localahc.rmQ = i.bOL();
    if (!f.cfE()) {
      localahc.rqE = f.cfF();
    }
    locala.dIG = localahc;
    locala.dIH = new ahd();
    locala.uri = "/cgi-bin/mmpay-bin/getrealnamewording";
    locala.dIF = 1666;
    this.diG = locala.KT();
    this.diG.dIU = true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetRealnameWording", "onGYNetEnd,errType=" + paramInt2 + "errCode=" + paramInt3);
    Object localObject;
    long l;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localObject = (ahd)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      if (((ahd)localObject).rKy <= 0L) {
        l = this.pkG;
      }
    }
    for (;;)
    {
      this.pjc = ((ahd)localObject).pjc;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetRealnameWording", "need_agree_duty %s", new Object[] { Boolean.valueOf(this.pjc) });
      paramq = new JSONObject();
      try
      {
        paramq.put("bindcardTitle", ((ahd)localObject).rKr);
        paramq.put("bindcardSubTitle", ((ahd)localObject).rKs);
        paramq.put("bindIdTitle", ((ahd)localObject).rKt);
        paramq.put("bindIdSubTitle", ((ahd)localObject).rKu);
        paramq.put("extral_wording", ((ahd)localObject).rKv);
        paramq.put("question_answer_switch", ((ahd)localObject).rKw);
        paramq.put("question_answer_url", ((ahd)localObject).rKx);
        paramq.put("cache_time", l);
        paramq.put("timestamp", Long.valueOf(System.currentTimeMillis() / 1000L));
        paramq.put("isShowBindCard", ((ahd)localObject).rKz);
        paramq.put("isShowBindCardVerify", ((ahd)localObject).rKB);
        paramq.put("isShowBindId", ((ahd)localObject).rKA);
        paramq.put("bindCardVerifyTitle", ((ahd)localObject).rKC);
        paramq.put("bindCardVerifySubtitle", ((ahd)localObject).rKD);
        paramq.put("bindCardVerifyAlertViewRightBtnTxt", ((ahd)localObject).rKE);
        paramq.put("bindCardVerifyAlertViewContent", ((ahd)localObject).rKF);
        paramq.put("isShowBindCardVerifyAlertView", ((ahd)localObject).rKG);
        if ((((ahd)localObject).rKH != null) && (((ahd)localObject).rKH.size() > 0))
        {
          paramArrayOfByte = new StringBuffer();
          paramInt1 = 0;
          localObject = ((ahd)localObject).rKH.iterator();
          for (;;)
          {
            if (((Iterator)localObject).hasNext())
            {
              String str = (String)((Iterator)localObject).next();
              if (paramInt1 != 0) {
                paramArrayOfByte.append("\n");
              }
              paramArrayOfByte.append(str);
              paramInt1 = 1;
              continue;
              l = ((ahd)localObject).rKy;
              break;
            }
          }
          paramq.put("cache_header_titles", paramArrayOfByte.toString());
        }
        g.Ek();
        g.Ei().DT().a(aa.a.sTc, paramq.toString());
        g.Ek();
        g.Ei().DT().lm(true);
      }
      catch (JSONException paramq)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneGetRealnameWording", paramq, "", new Object[0]);
        }
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1666;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */