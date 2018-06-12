package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.mm.model.s;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.bqg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.d.i;

public final class be
  implements z
{
  private String appName = "";
  private MMActivity bGc;
  private String bPS = "";
  private int nMA;
  private b nMG = null;
  private boolean nNY = false;
  private boolean nNZ = false;
  private WXMediaMessage nOa = null;
  private String nPc = "";
  
  public be(MMActivity paramMMActivity)
  {
    this.bGc = paramMMActivity;
  }
  
  public final void G(Bundle paramBundle)
  {
    this.nMG = b.p(this.bGc.getIntent());
    this.nPc = this.bGc.getIntent().getStringExtra(e.h.thz);
    this.bPS = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.nNY = this.bGc.getIntent().getBooleanExtra("KThrid_app", false);
    this.nNZ = this.bGc.getIntent().getBooleanExtra("KSnsAction", false);
    this.nMA = this.bGc.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.nOa = new SendMessageToWX.Req(this.bGc.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
  }
  
  public final void H(Bundle paramBundle) {}
  
  public final boolean a(int paramInt1, int paramInt2, i parami, String paramString1, List<String> paramList1, arj paramarj, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    if (this.nOa != null)
    {
      this.nOa.description = paramString1;
      if ((this.nOa.mediaObject != null) && ((this.nOa.mediaObject instanceof WXTextObject))) {
        ((WXTextObject)this.nOa.mediaObject).text = paramString1;
      }
    }
    af.byk();
    paramString1 = aw.b(this.nOa, paramString1, this.bPS, this.appName);
    if (paramString1 == null)
    {
      x.e("MicroMsg.TextWidget", "packHelper == null, %s, %s", new Object[] { this.bPS, this.appName });
      return false;
    }
    paramPInt.value = paramString1.afv;
    if (paramInt3 > a.nkE) {
      paramString1.wC(4);
    }
    paramString1.wG(this.nMA);
    if (this.nNY) {
      paramString1.wG(5);
    }
    paramPInt = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      paramString2 = s.Hv();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        String str = (String)paramList1.next();
        if (!paramString2.contains(str))
        {
          bqg localbqg = new bqg();
          localbqg.hbL = str;
          paramPInt.add(localbqg);
        }
      }
    }
    paramString1.ag(paramPInt);
    if (parami != null) {
      paramString1.eB(parami.token, parami.rWk);
    }
    paramString1.a(paramarj);
    if (paramBoolean) {
      paramString1.wH(1);
    }
    for (;;)
    {
      paramString1.ci(paramList2).wE(paramInt1);
      paramString1.f(null, null, null, paramInt4, paramInt5);
      if ((this.nNZ) && (this.nOa != null))
      {
        paramString1.Mz(this.nOa.mediaTagName);
        paramString1.aa(this.bPS, this.nOa.messageExt, this.nOa.messageAction);
      }
      paramInt1 = paramString1.commit();
      if (this.nMG != null)
      {
        this.nMG.iq(paramInt1);
        e.nxO.c(this.nMG);
      }
      af.byk().bwX();
      this.bGc.finish();
      return false;
      paramString1.wH(0);
    }
  }
  
  public final boolean bBU()
  {
    return true;
  }
  
  public final View bBV()
  {
    return null;
  }
  
  public final boolean bBW()
  {
    return false;
  }
  
  public final boolean d(int paramInt, Intent paramIntent)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */