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
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.mm.g.a.pn;
import com.tencent.mm.g.a.pn.b;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.bqg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class al
  implements z
{
  MMActivity bGc;
  private boolean bKE = false;
  String bKg = "";
  String bOX = "";
  private String desc = "";
  ProgressDialog eHw = null;
  ProgressBar eVR;
  private View gYR = null;
  private int nMA;
  private com.tencent.mm.modelsns.b nMG = null;
  private boolean nOR = false;
  private Bitmap nOS = null;
  private com.tencent.mm.sdk.b.c nOV = new al.1(this);
  ax nOW = null;
  com.tencent.mm.plugin.sight.decode.a.a nRH;
  com.tencent.mm.plugin.sight.decode.ui.c nRI = null;
  String videoPath = "";
  
  public al(MMActivity paramMMActivity)
  {
    this.bGc = paramMMActivity;
  }
  
  public final void G(Bundle paramBundle)
  {
    this.nMG = com.tencent.mm.modelsns.b.p(this.bGc.getIntent());
    this.bOX = this.bGc.getIntent().getStringExtra("KSightThumbPath");
    this.videoPath = this.bGc.getIntent().getStringExtra("KSightPath");
    this.bKg = this.bGc.getIntent().getStringExtra("sight_md5");
    this.nMA = this.bGc.getIntent().getIntExtra("Ksnsupload_source", 0);
    paramBundle = new pn();
    paramBundle.cap.type = 2;
    com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
    if (bi.oW(this.videoPath))
    {
      this.videoPath = bi.aG(paramBundle.caq.cau, "");
      x.e("MicroMsg.SightWidget", "videoPath is null %s", new Object[] { this.videoPath });
    }
    if (bi.oW(this.bKg)) {}
    for (paramBundle = bi.aG(paramBundle.caq.cas, "");; paramBundle = this.bKg)
    {
      this.bKg = paramBundle;
      x.i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", new Object[] { this.bOX, this.videoPath, this.bKg });
      com.tencent.mm.sdk.b.a.sFg.b(this.nOV);
      return;
    }
  }
  
  public final void H(Bundle paramBundle) {}
  
  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, arj paramarj, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    if (this.nOW != null) {
      return false;
    }
    this.desc = paramString1;
    parami = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      paramString2 = com.tencent.mm.model.s.Hv();
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
      this.nOW.ci(paramList2).wE(paramInt1);
      this.nOW.wG(this.nMA);
      this.nOW.f(null, null, null, paramInt4, paramInt5);
      if (!FileOp.cn(this.videoPath)) {
        break;
      }
      bCC();
      return true;
      this.nOW.wH(0);
    }
    x.i("MicroMsg.SightWidget", "commit file is not exist " + this.videoPath);
    parami = this.bGc;
    this.bGc.getString(i.j.app_tip);
    this.eHw = h.a(parami, this.bGc.getString(i.j.sns_sight_send_wait), true, new al.3(this));
    return true;
  }
  
  public final boolean bBU()
  {
    return true;
  }
  
  public final View bBV()
  {
    this.gYR = View.inflate(this.bGc, i.g.upload_sight_widget, null);
    this.nRH = ((com.tencent.mm.plugin.sight.decode.a.a)this.gYR.findViewById(i.f.image));
    this.nRH.setDrawableWidth(com.tencent.mm.bp.a.fromDPToPix(this.bGc, 90));
    this.eVR = ((ProgressBar)this.gYR.findViewById(i.f.load_progress));
    Object localObject = new DisplayMetrics();
    this.bGc.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.gYR.findViewById(i.f.chatting_click_area).setOnClickListener(new al.2(this));
    x.i("MicroMsg.SightWidget", "videoPath " + this.videoPath + " thumbPath " + this.bOX + " " + FileOp.mI(this.videoPath) + " " + FileOp.mI(this.bOX));
    if (FileOp.cn(this.videoPath))
    {
      this.nRH.aO(this.videoPath, false);
      this.eVR.setVisibility(8);
      x.i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", new Object[] { this.videoPath, this.bKg });
    }
    for (;;)
    {
      return this.gYR;
      localObject = com.tencent.mm.plugin.sns.data.i.LJ(this.bOX);
      if (localObject != null)
      {
        this.nOS = ((n)localObject).Fw();
        if (com.tencent.mm.plugin.sns.data.i.q(this.nOS)) {
          this.nRH.setThumbBmp(this.nOS);
        }
      }
      this.eVR.setVisibility(0);
    }
  }
  
  public final boolean bBW()
  {
    if (this.eHw != null) {
      this.eHw.dismiss();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.nOV);
    if (com.tencent.mm.plugin.sns.data.i.q(this.nOS)) {
      this.nOS.recycle();
    }
    return false;
  }
  
  final void bCC()
  {
    if (this.nOR) {
      return;
    }
    if (!this.nOW.o(this.videoPath, this.bOX, this.desc, this.bKg))
    {
      x.i("MicroMsg.SightWidget", "videopath " + FileOp.mI(this.videoPath) + " thumb: " + FileOp.mI(this.bOX));
      com.tencent.mm.ui.base.s.makeText(this.bGc, i.j.sendrequest_send_fail, 0).show();
      return;
    }
    Object localObject = new pn();
    ((pn)localObject).cap.type = 0;
    ((pn)localObject).cap.car = true;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    this.nOR = true;
    int i = this.nOW.commit();
    if (this.nMG != null)
    {
      this.nMG.iq(i);
      e.nxO.c(this.nMG);
    }
    af.byv().nQT = 0L;
    localObject = new Intent();
    ((Intent)localObject).putExtra("sns_resume_state", false);
    ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
    ((Intent)localObject).setClass(this.bGc, SnsTimeLineUI.class);
    ((Intent)localObject).addFlags(67108864);
    this.bGc.startActivity((Intent)localObject);
    this.bGc.setResult(-1);
    this.bGc.finish();
  }
  
  public final boolean d(int paramInt, Intent paramIntent)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */