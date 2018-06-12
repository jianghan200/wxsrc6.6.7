package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.pe;
import com.tencent.mm.g.a.pe.a;
import com.tencent.mm.g.a.pe.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.d.f;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends c<pe>
  implements com.tencent.mm.ab.e
{
  private pe htx;
  
  public a()
  {
    this.sFo = pe.class.getName().hashCode();
  }
  
  private boolean a(pe parampe)
  {
    if (!g.Eg().Dx()) {
      x.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent account is not ready");
    }
    while (!(parampe instanceof pe)) {
      return false;
    }
    this.htx = parampe;
    parampe = this.htx.caa.cac;
    String str = this.htx.caa.cad;
    int i = this.htx.caa.cae;
    if (TextUtils.isEmpty(parampe))
    {
      x.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent card_id is empty");
      awy();
      return false;
    }
    g.Eh().dpP.a(651, this);
    x.i("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent doscene from scene " + i);
    parampe = new com.tencent.mm.plugin.card.model.o(parampe, i, "", str, "", "", 0, 0, null);
    g.Eh().dpP.a(parampe, 0);
    return true;
  }
  
  private void awy()
  {
    if (this.htx.bJX != null) {
      this.htx.bJX.run();
    }
    this.htx = null;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    pe.b localb;
    if ((paraml instanceof com.tencent.mm.plugin.card.model.o))
    {
      localb = new pe.b();
      x.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return errcode " + paramInt2 + " errmsg" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label235;
      }
      x.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is success");
      paraml = (com.tencent.mm.plugin.card.model.o)paraml;
      paramInt1 = paraml.hwV;
      paramString = paraml.hwU;
      paraml = paraml.hwW;
      if (paramInt1 != 0) {
        break label195;
      }
      x.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return ok ");
      localb.bLW = true;
      paraml = new CardInfo();
      f.a(paraml, paramString);
      if (TextUtils.isEmpty(paraml.field_card_id)) {
        break label178;
      }
      localb.cac = paraml.field_card_id;
      am.axn().putValue("key_accept_card_info", paraml);
    }
    for (;;)
    {
      g.Eh().dpP.b(651, this);
      this.htx.cab = localb;
      awy();
      return;
      label178:
      x.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return card_id is empty ");
      localb.cac = "";
      break;
      label195:
      x.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return false, retCode " + paramInt1 + " retMsg" + paraml);
      localb.bLW = false;
      continue;
      label235:
      x.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is fail");
      localb.bLW = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */