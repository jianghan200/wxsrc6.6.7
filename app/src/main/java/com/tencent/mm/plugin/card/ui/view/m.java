package com.tencent.mm.plugin.card.ui.view;

import android.database.Cursor;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.q;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.i;
import com.tencent.mm.plugin.card.model.j;
import com.tencent.mm.plugin.card.model.k;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends g
{
  public final ab azN()
  {
    return new n(this, this.gKS);
  }
  
  public final ab azO()
  {
    return new f(this, this.gKS);
  }
  
  public final ab azP()
  {
    return new t(this, this.gKS);
  }
  
  public final String e(com.tencent.mm.plugin.card.d.c paramc)
  {
    x.i("MicroMsg.CarDynamicCodeView", "code from dynamic offline");
    com.tencent.mm.plugin.card.b.g localg = am.axy();
    Object localObject1 = this.htQ;
    if (localObject1 == null)
    {
      x.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "get code is failure! cardInfo is null");
      return "";
    }
    localg.awD();
    localg.htX = paramc;
    Object localObject3 = ((b)localObject1).awq();
    Object localObject2 = am.axw().diF.rawQuery("select count(1) from CardQrCodeDataInfo where card_id =? AND status=0", new String[] { localObject3 });
    int i;
    if (localObject2 != null)
    {
      ((Cursor)localObject2).moveToFirst();
      i = ((Cursor)localObject2).getInt(0);
      ((Cursor)localObject2).close();
      if (i != 0) {
        break label148;
      }
      x.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "can not getFrom db！db is empty!");
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {
        break label249;
      }
      x.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "can not getFrom db！ request doNetSceneGetDynamicQrcode!");
      localg.a((b)localObject1, q.hIS);
      return "";
      i = 0;
      break;
      label148:
      localObject2 = am.axx().xn((String)localObject3);
      if (localObject2 != null)
      {
        if (com.tencent.mm.plugin.card.b.g.a((i)localObject2))
        {
          localg.htX = com.tencent.mm.plugin.card.d.c.hIw;
          i = 0;
          continue;
        }
        if ((i < ((i)localObject2).field_lower_bound) && (com.tencent.mm.plugin.card.d.l.isNetworkAvailable(ad.getContext())))
        {
          x.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "can not getFrom db！ currentCodeSize < lower_bound,currentCodeSize =%d,lower_bound=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((i)localObject2).field_lower_bound) });
          localg.htX = com.tencent.mm.plugin.card.d.c.hIC;
          i = 0;
          continue;
        }
      }
      i = 1;
    }
    label249:
    localObject2 = am.axw().xp(((b)localObject1).awq());
    if (localObject2 == null)
    {
      x.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get code is failure! db is  empty! doNetSceneGetDynamicQrcode! cardId= %s", new Object[] { ((b)localObject1).awq() });
      localg.a((b)localObject1, q.hIS);
      return "";
    }
    k localk = am.axw().xq((String)localObject3);
    if ((localk != null) && (am.axw().ca((String)localObject3, localk.field_code_id))) {
      localg.a((String)localObject3, localk.field_code_id, paramc);
    }
    localg.htY = 0;
    x.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "update current code showing! newQrCodeData cardId= %s,codeId=%s，refreshReason=%d", new Object[] { localObject3, ((k)localObject2).field_code_id, Integer.valueOf(paramc.action) });
    localObject3 = ((b)localObject1).awq();
    if (localObject2 == null) {
      paramc = "";
    }
    while (bi.oW(paramc))
    {
      localg.U(1, "");
      return "";
      paramc = com.tencent.mm.plugin.card.d.e.cg((String)localObject3, ((k)localObject2).field_code);
      localObject3 = am.axx().xn((String)localObject3);
      if ((localObject3 != null) && (!bi.oW(paramc)) && (((i)localObject3).field_need_insert_show_timestamp) && (!bi.oW(((i)localObject3).field_show_timestamp_encrypt_key)))
      {
        x.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData is need insert show timestamp! code signTimestamp!");
        paramc = com.tencent.mm.plugin.card.d.e.ci(paramc, ((i)localObject3).field_show_timestamp_encrypt_key);
      }
      else
      {
        x.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData only decrypt qrcode!");
      }
    }
    ((k)localObject2).field_status = 1;
    if (!am.axw().c((com.tencent.mm.sdk.e.c)localObject2, new String[] { "card_id", "code_id" })) {
      x.e("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  failure! card_id = %s, code_id = %s ,status = %d", new Object[] { ((k)localObject2).field_card_id, ((k)localObject2).field_code_id, Integer.valueOf(((k)localObject2).field_status) });
    }
    for (;;)
    {
      localg = am.axy();
      localObject1 = ((b)localObject1).awq();
      localObject1 = am.axx().xn((String)localObject1);
      if (localObject1 != null) {
        break;
      }
      x.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRequestCodeTimer failure! CardQrCodeConfi is null!");
      return paramc;
      x.i("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  success! card_id = %s, code_id = %s ,status = %d", new Object[] { ((k)localObject2).field_card_id, ((k)localObject2).field_code_id, Integer.valueOf(((k)localObject2).field_status) });
    }
    long l = ((i)localObject1).field_show_expire_interval * 1000;
    x.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRefreshCodeTimer refreshTime: " + l);
    localg.htZ.J(l, l);
    return paramc;
  }
  
  public final boolean h(b paramb)
  {
    if (this.htQ == null)
    {
      x.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      return true;
    }
    if (paramb == null)
    {
      x.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
      return false;
    }
    if (this.htQ.awn().rnr != paramb.awn().rnr)
    {
      x.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain is_commom_card is different！");
      return true;
    }
    pr localpr1 = this.htQ.awn().rnq;
    pr localpr2 = paramb.awn().rnq;
    if (((localpr1 == null) && (localpr2 != null)) || ((localpr1 != null) && (localpr2 == null)))
    {
      x.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field is different！");
      return true;
    }
    if ((localpr1 != null) && (localpr2 != null) && (localpr1.title != null) && (localpr2.title != null) && (localpr1.title.equals(localpr2.title)))
    {
      x.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field title is different！");
      return true;
    }
    localpr1 = this.htQ.awm().rok;
    paramb = paramb.awm().rok;
    if (((localpr1 == null) && (paramb != null)) || ((localpr1 != null) && (paramb == null)))
    {
      x.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
      return true;
    }
    if ((localpr1 != null) && (paramb != null) && (localpr1.title != null) && (paramb.title != null) && (!localpr1.title.equals(paramb.title)))
    {
      x.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
      return true;
    }
    if ((localpr1 != null) && (paramb != null) && (localpr1.huY != null) && (paramb.huY != null) && (!localpr1.huY.equals(paramb.huY)))
    {
      x.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */