package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.a.b.c;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.o.a;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public final class k
  implements o.a
{
  Activity activity;
  private ae nMm;
  private int scene = 0;
  
  public k(Activity paramActivity, int paramInt, ae paramae)
  {
    this.activity = paramActivity;
    this.scene = paramInt;
    this.nMm = paramae;
  }
  
  public final void bQ(Object paramObject)
  {
    int i = 1;
    boolean bool2 = false;
    Intent localIntent = new Intent();
    if (this.activity == null) {
      return;
    }
    Object localObject;
    if ((paramObject instanceof com.tencent.mm.plugin.sns.data.a))
    {
      paramObject = (com.tencent.mm.plugin.sns.data.a)paramObject;
      localObject = new StringBuilder("onClick : ").append(((com.tencent.mm.plugin.sns.data.a)paramObject).userName).append(" activity: ");
      if (this.activity == null) {}
      n localn;
      for (boolean bool1 = true;; bool1 = false)
      {
        x.d("Micro.ClickableCallBack", bool1);
        localn = af.byo().Nl(((com.tencent.mm.plugin.sns.data.a)paramObject).bNH);
        if (!((com.tencent.mm.plugin.sns.data.a)paramObject).nkG) {
          break label433;
        }
        localObject = localn.bAF();
        str = localn.bBn();
        if ((localObject == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject).nyO != 1) || (bi.oW(((com.tencent.mm.plugin.sns.storage.b)localObject).nyP))) {
          break;
        }
        paramObject = ((com.tencent.mm.plugin.sns.storage.b)localObject).nyP;
        x.i("Micro.ClickableCallBack", "headClickParam url " + (String)paramObject + " " + ((com.tencent.mm.plugin.sns.storage.b)localObject).nyQ);
        localIntent = new Intent();
        bool1 = bool2;
        if (((com.tencent.mm.plugin.sns.storage.b)localObject).nyQ == 0) {
          bool1 = true;
        }
        localIntent.putExtra("KsnsViewId", str);
        localIntent.putExtra("KRightBtn", bool1);
        localIntent.putExtra("jsapiargs", new Bundle());
        localIntent.putExtra("rawUrl", (String)paramObject);
        localIntent.putExtra("useJs", true);
        com.tencent.mm.plugin.sns.c.a.ezn.j(localIntent, this.activity);
        return;
      }
      this.nMm.bxT().a(localn, false);
      if (this.scene == 0) {}
      for (;;)
      {
        localObject = new SnsAdClick(str, i, localn.field_snsId, localn.bBo(), localn.bBr(), (byte)0);
        ((SnsAdClick)localObject).egI = localn.bAJ().ksA;
        localIntent.putExtra("Contact_User", ((com.tencent.mm.plugin.sns.data.a)paramObject).userName);
        localIntent.putExtra("KSnsAdTag", (Parcelable)localObject);
        localIntent.putExtra("Contact_Scene", 37);
        com.tencent.mm.plugin.sns.c.a.ezn.d(localIntent, this.activity);
        paramObject = new c(localn.bBn(), 2, ((com.tencent.mm.plugin.sns.data.a)paramObject).scene, "", localn.bBr(), localn.bAK());
        g.Ek();
        g.Eh().dpP.a((l)paramObject, 0);
        return;
        i = 2;
      }
      label433:
      String str = ((com.tencent.mm.plugin.sns.data.a)paramObject).userName;
      if (this.scene == 0)
      {
        paramObject = com.tencent.mm.modelsns.b.io(719);
        ((com.tencent.mm.modelsns.b)paramObject).nb(com.tencent.mm.plugin.sns.data.i.g(localn)).ir(localn.field_type).bP(localn.xb(32)).nb(localn.bBo()).nb(str);
        ((com.tencent.mm.modelsns.b)paramObject).RD();
        if (this.scene != 0) {
          break label609;
        }
        paramObject = com.tencent.mm.modelsns.b.io(746);
        label513:
        localObject = q.GF();
        ((com.tencent.mm.modelsns.b)paramObject).nb(str).bP(str.endsWith((String)localObject));
        ((com.tencent.mm.modelsns.b)paramObject).b(localIntent, "intent_key_StatisticsOplog");
        localObject = str;
        if (this.scene == 0)
        {
          this.nMm.bxT().a(localn, false);
          localObject = str;
        }
      }
    }
    for (;;)
    {
      localIntent.putExtra("Contact_User", (String)localObject);
      com.tencent.mm.plugin.sns.c.a.ezn.d(localIntent, this.activity);
      return;
      paramObject = com.tencent.mm.modelsns.b.ip(719);
      break;
      label609:
      paramObject = com.tencent.mm.modelsns.b.ip(746);
      break label513;
      localObject = (String)paramObject;
      paramObject = localObject;
      if (((String)localObject).contains("@")) {
        paramObject = ((String)localObject).replace("@", "");
      }
      g.Ek();
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Ye((String)paramObject);
      if ((localObject != null) && (((ab)localObject).ckW()))
      {
        localIntent.putExtra("Contact_User", (String)paramObject);
        localIntent.putExtra("Contact_Scene", 37);
        com.tencent.mm.plugin.sns.c.a.ezn.d(localIntent, this.activity);
        return;
      }
      localObject = paramObject;
      if (this.scene == 0)
      {
        localObject = new n();
        ((n)localObject).field_userName = ((String)paramObject);
        this.nMm.bxT().a((n)localObject, false);
        localObject = paramObject;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */