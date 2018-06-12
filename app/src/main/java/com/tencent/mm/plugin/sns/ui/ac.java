package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.model.s;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.bqg;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.y;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ac
  implements z
{
  private String appName = "";
  MMActivity bGc;
  String bPS = "";
  private TextView eBO = null;
  private com.tencent.mm.sdk.b.c fIu = new ac.1(this);
  private View gYR;
  boolean hTT = false;
  String mediaId;
  private int nMA;
  private CdnImageView nMB = null;
  private TextView nMC = null;
  private com.tencent.mm.modelsns.b nMG = null;
  private boolean nNY = false;
  private boolean nNZ = false;
  ImageView nON;
  private Bitmap nOO;
  WXMediaMessage nOa = null;
  
  public ac(MMActivity paramMMActivity)
  {
    this.bGc = paramMMActivity;
    com.tencent.mm.sdk.b.a.sFg.b(this.fIu);
  }
  
  public final void G(Bundle paramBundle)
  {
    this.nOa = new SendMessageToWX.Req(this.bGc.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
    this.mediaId = this.bGc.getIntent().getStringExtra("Ksnsupload_musicid");
    this.nMG = com.tencent.mm.modelsns.b.p(this.bGc.getIntent());
    this.bPS = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.nNY = this.bGc.getIntent().getBooleanExtra("KThrid_app", false);
    this.nNZ = this.bGc.getIntent().getBooleanExtra("KSnsAction", false);
    this.nMA = this.bGc.getIntent().getIntExtra("Ksnsupload_source", 0);
  }
  
  public final void H(Bundle paramBundle) {}
  
  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, arj paramarj, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    af.byk();
    paramString1 = aw.b(this.nOa, paramString1, this.bPS, this.appName);
    if (paramString1 == null)
    {
      x.e("MicroMsg.MusicWidget", "packHelper == null, %s, %s", new Object[] { this.bPS, this.appName });
      return false;
    }
    paramPInt.value = paramString1.afv;
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.nkE) {
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
    this.gYR = y.gq(this.bGc).inflate(i.g.upload_media_music, null);
    this.nMB = ((CdnImageView)this.gYR.findViewById(i.f.image_left));
    this.eBO = ((TextView)this.gYR.findViewById(i.f.titletext));
    this.nMC = ((TextView)this.gYR.findViewById(i.f.righttext));
    this.gYR.findViewById(i.f.state).setVisibility(8);
    this.eBO.setText(this.nOa.title);
    if (this.nOa.thumbData != null) {
      this.nOO = com.tencent.mm.sdk.platformtools.c.bs(this.nOa.thumbData);
    }
    this.nMB.setImageBitmap(this.nOO);
    if (!bi.oW(this.nOa.description))
    {
      this.nMC.setText(this.nOa.description);
      this.nMC.setVisibility(0);
      this.nON = ((ImageView)this.gYR.findViewById(i.f.state));
      this.nON.setVisibility(0);
      if ((!com.tencent.mm.an.b.PY()) || (!this.hTT)) {
        break label259;
      }
      this.nON.setImageResource(i.e.music_pauseicon);
    }
    for (;;)
    {
      this.nON.setOnClickListener(new ac.4(this));
      com.tencent.mm.plugin.sns.data.i.b(this.nMB, this.bGc);
      return this.gYR;
      this.nMC.setVisibility(8);
      break;
      label259:
      this.nON.setImageResource(i.e.music_playicon);
    }
  }
  
  public final boolean bBW()
  {
    if ((this.nOO != null) && (!this.nOO.isRecycled())) {
      this.nOO.recycle();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.fIu);
    if ((com.tencent.mm.an.b.PY()) && (this.hTT)) {
      bCk();
    }
    return com.tencent.mm.an.b.PY();
  }
  
  final void bCk()
  {
    new ag(this.bGc.getMainLooper()).post(new ac.2(this));
  }
  
  public final boolean d(int paramInt, Intent paramIntent)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */