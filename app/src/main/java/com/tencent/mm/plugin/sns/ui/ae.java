package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.mm.model.s;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
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
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.d.i;

public final class ae
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
  private boolean nPd = false;
  
  public ae(MMActivity paramMMActivity, boolean paramBoolean)
  {
    this.bGc = paramMMActivity;
    this.nPd = paramBoolean;
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
    paramBundle = this.bGc.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null) {
      this.nOa = new SendMessageToWX.Req(paramBundle).message;
    }
  }
  
  public final void H(Bundle paramBundle) {}
  
  public final boolean a(int paramInt1, int paramInt2, i parami, String paramString1, List<String> paramList1, arj paramarj, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    if (this.bGc.isFinishing()) {
      return false;
    }
    paramString2 = new ax(2);
    paramPInt.value = paramString2.afv;
    if (paramInt3 > a.nkE) {
      paramString2.wC(2);
    }
    paramPInt = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      List localList = s.Hv();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        String str = (String)paramList1.next();
        if (!localList.contains(str))
        {
          bqg localbqg = new bqg();
          localbqg.hbL = str;
          paramPInt.add(localbqg);
        }
      }
    }
    if (paramBoolean) {
      paramString2.wH(1);
    }
    for (;;)
    {
      if (parami != null) {
        paramString2.eB(parami.token, parami.rWk);
      }
      paramString2.wG(this.nMA);
      if (this.nNY) {
        paramString2.wG(5);
      }
      if ((this.nNZ) && (this.nOa != null))
      {
        paramString2.Mz(this.nOa.mediaTagName);
        paramString2.aa(this.bPS, this.nOa.messageExt, this.nOa.messageAction);
      }
      paramString2.f(null, null, null, paramInt4, paramInt5);
      paramString2.My(paramString1).a(paramarj).ag(paramPInt).wE(paramInt1).wF(paramInt2).ci(paramList2);
      paramInt1 = paramString2.commit();
      if (this.nMG != null)
      {
        this.nMG.iq(paramInt1);
        e.nxO.c(this.nMG);
      }
      this.bGc.setResult(-1);
      af.byk().bwX();
      this.bGc.finish();
      return true;
      paramString2.wH(0);
    }
  }
  
  public final boolean bBU()
  {
    return this.nPd;
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */