package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.ak.o;
import com.tencent.mm.model.s;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.bqg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.y;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ai
  implements z
{
  private String appId = "";
  private String appName = "";
  private MMActivity bGc;
  private String bSw = "";
  private String bZG;
  private Bitmap dHf = null;
  private TextView eBO = null;
  private String egr = "";
  private int fwV = 9;
  private View gYR = null;
  private int h = -1;
  private boolean leb = false;
  private int nMA;
  private CdnImageView nMB = null;
  private TextView nMC = null;
  private int nMD;
  private String nME = "";
  private String nMF = "";
  private b nMG = null;
  private String nMx = "";
  private byte[] nMy = null;
  private String nMz;
  private String title = "";
  private int w = -1;
  
  public ai(MMActivity paramMMActivity, int paramInt)
  {
    this.bGc = paramMMActivity;
    this.fwV = paramInt;
  }
  
  public final void G(Bundle paramBundle)
  {
    this.nMG = b.p(this.bGc.getIntent());
    this.w = this.bGc.getIntent().getIntExtra("Ksnsupload_width", -1);
    this.h = this.bGc.getIntent().getIntExtra("Ksnsupload_height", -1);
    this.nMA = this.bGc.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.egr = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_link"), "");
    this.title = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_title"), "");
    this.nMx = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
    this.bSw = this.bGc.getIntent().getStringExtra("KsnsUpload_imgPath");
    this.leb = this.bGc.getIntent().getBooleanExtra("ksnsis_video", false);
    this.bZG = bi.aG(this.bGc.getIntent().getStringExtra("src_username"), "");
    this.nMz = bi.aG(this.bGc.getIntent().getStringExtra("src_displayname"), "");
    this.nMF = bi.aG(this.bGc.getIntent().getStringExtra("KContentObjDesc"), "");
    this.nME = bi.aG(this.bGc.getIntent().getStringExtra("KUploadProduct_UserData"), "");
    this.appName = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.appId = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.nMD = this.bGc.getIntent().getIntExtra("KUploadProduct_subType", 0);
  }
  
  public final void H(Bundle paramBundle) {}
  
  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, arj paramarj, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    paramString2 = new ax(this.fwV);
    paramPInt.value = paramString2.afv;
    if (paramInt3 > a.nkE) {
      paramString2.wC(2);
    }
    paramString2.MD(this.title).MB(this.nMF).MC(this.egr).My(paramString1);
    if (!bi.oW(this.bSw))
    {
      paramString2.a(FileOp.e(this.bSw, 0, -1), this.nMF, this.title, this.nMD, this.nME);
      if (parami != null) {
        paramString2.eB(parami.token, parami.rWk);
      }
      paramString2.wG(this.nMA);
      paramString2.MG(this.bZG);
      paramString2.MH(this.nMz);
      paramString2.wE(paramInt1);
      paramString2.f(null, null, null, paramInt4, paramInt5);
      if (!paramBoolean) {
        break label372;
      }
      paramString2.wH(1);
    }
    for (;;)
    {
      paramString2.ci(paramList2);
      if (!bi.oW(this.appId))
      {
        paramString2.ME(this.appId);
        paramString2.MF(this.appName);
      }
      parami = new LinkedList();
      if (paramList1 == null) {
        break label382;
      }
      new LinkedList();
      paramString1 = s.Hv();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        paramList2 = (String)paramList1.next();
        if (!paramString1.contains(paramList2))
        {
          paramPInt = new bqg();
          paramPInt.hbL = paramList2;
          parami.add(paramPInt);
        }
      }
      if ((bi.oW(this.nMx)) || (o.Pe() == null)) {
        break;
      }
      o.Pe();
      paramString1 = com.tencent.mm.ak.c.jz(this.nMx);
      if (paramString1 == null) {
        break;
      }
      paramString2.b(com.tencent.mm.sdk.platformtools.c.Q(paramString1), "", "");
      break;
      label372:
      paramString2.wH(0);
    }
    label382:
    paramString2.ag(parami);
    paramString2.a(paramarj);
    paramInt1 = paramString2.commit();
    if (this.nMG != null)
    {
      this.nMG.iq(paramInt1);
      e.nxO.c(this.nMG);
    }
    af.byk().bwX();
    this.bGc.finish();
    return false;
  }
  
  public final boolean bBU()
  {
    return true;
  }
  
  public final View bBV()
  {
    this.gYR = y.gq(this.bGc).inflate(i.g.upload_media_link, null);
    this.nMB = ((CdnImageView)this.gYR.findViewById(i.f.image_left));
    this.eBO = ((TextView)this.gYR.findViewById(i.f.titletext));
    this.nMC = ((TextView)this.gYR.findViewById(i.f.righttext));
    if (this.leb)
    {
      this.gYR.findViewById(i.f.state).setVisibility(0);
      this.eBO.setText(this.title);
      if (this.fwV == 13) {
        this.eBO.setText(this.title + "\n" + this.nMF);
      }
      if (bi.oW(this.nMx)) {
        break label210;
      }
      this.nMB.setVisibility(0);
      this.nMB.setUrl(this.nMx);
    }
    for (;;)
    {
      com.tencent.mm.plugin.sns.data.i.b(this.nMB, this.bGc);
      return this.gYR;
      this.gYR.findViewById(i.f.state).setVisibility(8);
      break;
      label210:
      if (!bi.bC(this.nMy))
      {
        this.nMB.setVisibility(0);
        this.dHf = com.tencent.mm.sdk.platformtools.c.bs(this.nMy);
        this.nMB.setImageBitmap(this.dHf);
      }
      else
      {
        this.nMB.setVisibility(8);
      }
    }
  }
  
  public final boolean bBW()
  {
    if ((this.dHf != null) && (!this.dHf.isRecycled())) {
      this.dHf.recycle();
    }
    return false;
  }
  
  public final boolean d(int paramInt, Intent paramIntent)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */