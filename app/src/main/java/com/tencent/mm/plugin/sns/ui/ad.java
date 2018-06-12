package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.tencent.mm.g.a.pn;
import com.tencent.mm.g.a.pn.b;
import com.tencent.mm.model.s;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.protocal.c.bqg;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.QImageView.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ad
  implements z
{
  private String appId;
  private String appName;
  MMActivity bGc;
  private boolean bKE = false;
  String bKg = "";
  String bOX = "";
  String desc = "";
  String dwE;
  ProgressDialog eHw = null;
  private String fmS;
  private View gYR = null;
  String knh;
  private int nMA;
  private b nMG = null;
  private boolean nNY = false;
  private boolean nNZ = false;
  SightPlayImageView nOQ;
  boolean nOR = false;
  private Bitmap nOS = null;
  private aso nOT = new aso();
  private boolean nOU = false;
  private c nOV = new ad.1(this);
  ax nOW = null;
  private int nOX = 0;
  Runnable nOY = new ad.4(this);
  Runnable nOZ = new ad.5(this);
  private WXMediaMessage nOa = null;
  String videoPath = "";
  
  public ad(MMActivity paramMMActivity)
  {
    this.bGc = paramMMActivity;
  }
  
  public final void G(Bundle paramBundle)
  {
    this.nMG = b.p(this.bGc.getIntent());
    this.knh = bi.aG(this.bGc.getIntent().getStringExtra("KSightCdnUrl"), "");
    this.dwE = bi.aG(this.bGc.getIntent().getStringExtra("KSightCdnThumbUrl"), "");
    this.appId = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.nNY = this.bGc.getIntent().getBooleanExtra("KThrid_app", false);
    this.nNZ = this.bGc.getIntent().getBooleanExtra("KSnsAction", false);
    this.nOU = this.bGc.getIntent().getBooleanExtra("Kis_take_photo", false);
    this.nMA = this.bGc.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.fmS = bi.aG(this.bGc.getIntent().getStringExtra("reportSessionId"), "");
    paramBundle = this.bGc.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null) {
      this.nOa = new SendMessageToWX.Req(paramBundle).message;
    }
    this.bOX = this.bGc.getIntent().getStringExtra("KSightThumbPath");
    this.videoPath = this.bGc.getIntent().getStringExtra("KSightPath");
    this.bKg = this.bGc.getIntent().getStringExtra("sight_md5");
    paramBundle = this.bGc.getIntent().getByteArrayExtra("KMMSightExtInfo");
    if (paramBundle != null) {}
    try
    {
      this.nOT.aG(paramBundle);
      if (this.nOT == null)
      {
        this.nOT = new aso();
        this.nOT.rUP = this.nOU;
      }
      this.nOT.bPS = this.fmS;
      paramBundle = new pn();
      paramBundle.cap.type = 2;
      com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
      if (bi.oW(this.videoPath))
      {
        this.videoPath = bi.aG(paramBundle.caq.cau, "");
        x.e("MicroMsg.SightWidget", "videoPath is null %s", new Object[] { this.videoPath });
      }
      if (bi.oW(this.bKg))
      {
        paramBundle = bi.aG(paramBundle.caq.cas, "");
        this.bKg = paramBundle;
        x.i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", new Object[] { this.bOX, this.videoPath, this.bKg });
        com.tencent.mm.sdk.b.a.sFg.b(this.nOV);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        x.i("MicroMsg.SightWidget", "error %s", new Object[] { paramBundle.getMessage() });
        continue;
        paramBundle = this.bKg;
      }
    }
  }
  
  public final void H(Bundle paramBundle) {}
  
  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, arj paramarj, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    if (this.nOW != null) {
      return false;
    }
    if (this.nOR) {
      return true;
    }
    this.nOR = true;
    this.desc = paramString1;
    parami = new LinkedList();
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
          parami.add(localbqg);
        }
      }
    }
    this.nOW = new ax(15);
    paramPInt.value = this.nOW.afv;
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.nkE) {
      this.nOW.wC(3);
    }
    paramString1 = this.nOW.My(paramString1);
    new LinkedList();
    paramString1.a(paramarj).ag(parami).wE(paramInt1).wF(paramInt2).ci(paramList2);
    if (paramBoolean) {
      this.nOW.wH(1);
    }
    for (;;)
    {
      this.nOW.ci(paramList2);
      this.nOW.wG(this.nMA);
      this.nOW.caX = this.nOT;
      this.nOW.f(null, null, null, paramInt4, paramInt5);
      if (!bi.oW(this.appId)) {
        this.nOW.ME(this.appId);
      }
      if (!bi.oW(this.appName)) {
        this.nOW.MF(bi.aG(this.appName, ""));
      }
      if (this.nNY) {
        this.nOW.wG(5);
      }
      if ((this.nNZ) && (this.nOa != null))
      {
        this.nOW.Mz(this.nOa.mediaTagName);
        this.nOW.aa(this.appId, this.nOa.messageExt, this.nOa.messageAction);
      }
      ah.i(this.nOZ, 700L);
      e.post(new ad.3(this), "sight_send_ready");
      return true;
      this.nOW.wH(0);
    }
  }
  
  public final boolean bBU()
  {
    return true;
  }
  
  public final View bBV()
  {
    this.gYR = View.inflate(this.bGc, i.g.upload_new_sight_widget, null);
    this.nOQ = ((SightPlayImageView)this.gYR.findViewById(i.f.thumb_iv));
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    this.bGc.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    this.nOQ.dt(com.tencent.mm.bp.a.fromDPToPix(this.bGc, 100), com.tencent.mm.bp.a.fromDPToPix(this.bGc, 100));
    this.nOQ.setScaleType(QImageView.a.uHR);
    this.nOQ.ndG = true;
    this.nOQ.setOnClickListener(new ad.2(this));
    x.i("MicroMsg.SightWidget", "videoPath " + this.videoPath + " thumbPath " + this.bOX + " " + FileOp.mI(this.videoPath) + " " + FileOp.mI(this.bOX));
    if (FileOp.cn(this.videoPath)) {
      x.i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", new Object[] { this.videoPath, this.bKg });
    }
    this.nOQ.hK(false);
    this.nOQ.aO(this.videoPath, false);
    return this.gYR;
  }
  
  public final boolean bBW()
  {
    if (this.eHw != null) {
      this.eHw.dismiss();
    }
    this.nOQ.aO(this.videoPath, true);
    com.tencent.mm.sdk.b.a.sFg.c(this.nOV);
    if (com.tencent.mm.plugin.sns.data.i.q(this.nOS)) {
      this.nOS.recycle();
    }
    return false;
  }
  
  public final boolean d(int paramInt, Intent paramIntent)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */