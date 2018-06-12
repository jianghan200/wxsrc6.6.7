package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.model.s;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.protocal.c.bqg;
import com.tencent.mm.protocal.c.brh;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cfn;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aa
  implements z
{
  private String appId;
  private String appName;
  final MMActivity bGc;
  private String bZG;
  private String bZL;
  private String bZM;
  private Bitmap dHf = null;
  public String dyP = "";
  public String dyQ = "";
  private TextView eBO = null;
  String egr = "";
  private String fmS;
  private View gYR = null;
  private int h = -1;
  private boolean leb = false;
  private int nMA;
  private CdnImageView nMB = null;
  private TextView nMC = null;
  private b nMG = null;
  private String nMx = "";
  private byte[] nMy = null;
  private String nMz;
  private boolean nNT = false;
  private String nNU;
  private String nNV;
  private boolean nNW = false;
  private boolean nNX = false;
  private boolean nNY = false;
  private boolean nNZ = false;
  private WXMediaMessage nOa = null;
  private String nOb = "";
  private String nOc = "";
  private String nOd;
  private String nOe;
  private int nOf = 0;
  private b nOg = null;
  private int nOh = 0;
  private String nOi = "";
  private String nOj = "";
  private int nOk = 0;
  private String nOl = "";
  private String nOm = "";
  String nOn = "";
  private cfn nsD = null;
  private String title = "";
  private String videoUrl = "";
  private int w = -1;
  
  public aa(MMActivity paramMMActivity)
  {
    this.bGc = paramMMActivity;
  }
  
  public final void G(Bundle paramBundle)
  {
    this.nMG = b.p(this.bGc.getIntent());
    this.nOh = this.bGc.getIntent().getIntExtra("Ksnsupload_type", 0);
    this.nOk = this.bGc.getIntent().getIntExtra("KSnsStreamVideoTotalTime", 0);
    this.nOl = bi.aG(this.bGc.getIntent().getStringExtra("KSnsStreamVideoWroding"), "");
    this.nOm = bi.aG(this.bGc.getIntent().getStringExtra("KSnsStreamVideoWebUrl"), "");
    this.dyP = bi.aG(this.bGc.getIntent().getStringExtra("KSnsStreamVideoAduxInfo"), "");
    this.dyQ = bi.aG(this.bGc.getIntent().getStringExtra("KSnsStreamVideoPublishId"), "");
    this.w = this.bGc.getIntent().getIntExtra("Ksnsupload_width", -1);
    this.h = this.bGc.getIntent().getIntExtra("Ksnsupload_height", -1);
    this.nMA = this.bGc.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.nNV = bi.aG(this.bGc.getIntent().getStringExtra("key_snsad_statextstr"), "");
    this.egr = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_link"), "");
    this.title = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_title"), "");
    this.nMx = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
    this.nMy = this.bGc.getIntent().getByteArrayExtra("Ksnsupload_imgbuf");
    if ((this.nMy == null) && (this.nOa != null) && (this.nOa.mediaObject != null) && ((this.nOa.mediaObject instanceof WXImageObject))) {
      this.nMy = ((WXImageObject)this.nOa.mediaObject).imageData;
    }
    this.leb = this.bGc.getIntent().getBooleanExtra("ksnsis_video", false);
    this.nNW = this.bGc.getIntent().getBooleanExtra("ksnsis_music", false);
    this.nNX = this.bGc.getIntent().getBooleanExtra("ksnsis_appbrand", false);
    this.bZG = bi.aG(this.bGc.getIntent().getStringExtra("src_username"), "");
    this.nMz = bi.aG(this.bGc.getIntent().getStringExtra("src_displayname"), "");
    this.appId = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bi.aG(this.bGc.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.nNY = this.bGc.getIntent().getBooleanExtra("KThrid_app", false);
    this.nNZ = this.bGc.getIntent().getBooleanExtra("KSnsAction", false);
    this.nOd = bi.aG(this.bGc.getIntent().getStringExtra("ShareUrlOriginal"), "");
    this.nOe = bi.aG(this.bGc.getIntent().getStringExtra("ShareUrlOpen"), "");
    this.bZL = bi.aG(this.bGc.getIntent().getStringExtra("JsAppId"), "");
    this.bZM = bi.aG(this.bGc.getIntent().getStringExtra("KPublisherId"), "");
    this.fmS = bi.aG(this.bGc.getIntent().getStringExtra("reportSessionId"), "");
    this.nOf = this.bGc.getIntent().getIntExtra("Ksnsupload_contentattribute", 0);
    this.nOn = this.bGc.getIntent().getStringExtra("fav_note_xml");
    this.nOi = bi.aG(this.bGc.getIntent().getStringExtra("KsnsUpload_BrandUsername"), "");
    this.nOj = bi.aG(this.bGc.getIntent().getStringExtra("KsnsUpload_BrandPath"), "");
    this.nNU = bi.aG(this.bGc.getIntent().getStringExtra("KlinkThumb_url"), "");
    if ((this.nNU.startsWith("http://mmsns.qpic.cn")) || (this.nNU.startsWith("https://mmsns.qpic.cn")))
    {
      this.nMx = this.nNU;
      this.nMy = null;
      x.i("MicroMsg.LinkWidget", "get thumb url %s", new Object[] { this.nNU });
    }
    paramBundle = this.bGc.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null)
    {
      this.nOa = new SendMessageToWX.Req(paramBundle).message;
      if (bi.oW(this.title)) {
        this.title = this.nOa.title;
      }
      if (bi.oW(this.nOc)) {
        this.nOc = this.nOa.description;
      }
      if (bi.bC(this.nMy)) {
        this.nMy = this.nOa.thumbData;
      }
    }
    paramBundle = this.bGc.getIntent().getByteArrayExtra("KWebSearchInfo");
    if (paramBundle != null) {
      this.nsD = new cfn();
    }
    try
    {
      this.nsD.aG(paramBundle);
      paramBundle = this.bGc.getIntent().getStringExtra("KSnsStrId");
      Object localObject = bi.aG(this.bGc.getIntent().getStringExtra("KSnsLocalId"), "");
      localObject = af.byo().Nl((String)localObject);
      if (!bi.oW(paramBundle))
      {
        this.nOg = b.io(706);
        this.nOg.is(this.nOg.egR).nc(System.currentTimeMillis()).is(this.nOg.egS).is(1).nc(paramBundle);
        if (localObject != null)
        {
          this.nOg.ir(((n)localObject).field_type);
          this.nOg.bP(((n)localObject).xb(32)).nb(((n)localObject).bBo()).nb(this.egr);
        }
        com.tencent.mm.plugin.sns.h.f.nxO.b(this.nOg);
      }
      return;
    }
    catch (IOException paramBundle)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.LinkWidget", paramBundle, "parse web search info failed", new Object[0]);
        this.nsD = null;
      }
    }
  }
  
  public final void H(Bundle paramBundle) {}
  
  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, arj paramarj, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    Object localObject1;
    if (this.nNW) {
      localObject1 = new ax(4);
    }
    label318:
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      paramPInt.value = ((ax)localObject1).afv;
      if (paramInt3 > a.nkE) {
        ((ax)localObject1).wC(4);
      }
      if (this.nMy == null)
      {
        com.tencent.mm.ak.o.Pe();
        paramPInt = com.tencent.mm.ak.c.jz(this.nMx);
        if ((paramPInt != null) && (!paramPInt.isRecycled()))
        {
          paramPInt = com.tencent.mm.sdk.platformtools.c.a(paramPInt, 150, 150, false, false);
          x.i("MicroMsg.LinkWidget", "create bitmap %d %d", new Object[] { Integer.valueOf(paramPInt.getHeight()), Integer.valueOf(paramPInt.getWidth()) });
          this.nMy = com.tencent.mm.sdk.platformtools.c.Q(paramPInt);
        }
      }
      ((ax)localObject1).MD(this.title).MB(this.egr).MC(this.egr).My(paramString1);
      if (this.nOh == 15) {
        ((ax)localObject1).MB(bi.aG(this.bGc.getIntent().getStringExtra("fav_note_link_description"), ""));
      }
      if (!this.nNW) {
        break;
      }
      if (!((ax)localObject1).a(this.nMy, this.egr, this.egr, this.egr, 3, "", "")) {}
      ((ax)localObject1).wG(this.nMA);
      ((ax)localObject1).MG(this.bZG);
      ((ax)localObject1).MH(this.nMz);
      paramString1 = this.nNV;
      ((ax)localObject1).nsx.nNV = bi.oV(paramString1);
      x.i("MicroMsg.UploadPackHelper", "setStatExtStr:%s", new Object[] { paramString1 });
      ((ax)localObject1).wE(paramInt1);
      if (!paramBoolean) {
        break label1188;
      }
      ((ax)localObject1).wH(1);
      ((ax)localObject1).ci(paramList2);
      paramString1 = new LinkedList();
      if (paramList1 == null) {
        break label1198;
      }
      new LinkedList();
      paramList2 = s.Hv();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        paramPInt = (String)paramList1.next();
        if (!paramList2.contains(paramPInt))
        {
          localObject2 = new bqg();
          ((bqg)localObject2).hbL = paramPInt;
          paramString1.add(localObject2);
        }
      }
      if (this.leb)
      {
        localObject1 = new ax(5);
      }
      else if (this.nNX)
      {
        localObject1 = new ax(25);
        localObject2 = this.nOi;
        ((ax)localObject1).nsx.sqi.username = ((String)localObject2);
        localObject2 = this.nOj;
        ((ax)localObject1).nsx.sqi.path = ((String)localObject2);
      }
      else if (this.nOh == 11)
      {
        localObject1 = new ax(18);
        localObject2 = new brh();
        ((brh)localObject2).dyM = this.nOl;
        ((brh)localObject2).dyL = this.title;
        ((brh)localObject2).dyJ = this.egr;
        ((brh)localObject2).dyN = this.nOm;
        ((brh)localObject2).dyK = this.nOk;
        ((brh)localObject2).dyO = this.nMx;
        ((brh)localObject2).dyP = this.dyP;
        ((brh)localObject2).dyQ = this.dyQ;
        ((ax)localObject1).nsC = ((brh)localObject2);
        ((ax)localObject1).nsx.sqh = ((brh)localObject2);
      }
      else if (this.nOh == 15)
      {
        localObject1 = new ax(26);
        localObject2 = this.nOn;
        ((ax)localObject1).nsx.sqc.ruC = ((String)localObject2);
      }
      else if ((this.nOh == 16) && (this.nsD != null))
      {
        localObject2 = new ax(3);
        localObject3 = this.nsD;
        localObject1 = localObject2;
        if (localObject3 != null)
        {
          ((ax)localObject2).nsD = ((cfn)localObject3);
          localObject1 = localObject2;
        }
      }
      else
      {
        localObject1 = new ax(3);
      }
    }
    if (this.leb) {
      if (this.nOa == null) {
        break label1491;
      }
    }
    label782:
    label846:
    label1112:
    label1125:
    label1188:
    label1198:
    label1491:
    for (paramPInt = (WXVideoObject)this.nOa.mediaObject;; paramPInt = null)
    {
      localObject2 = this.nMy;
      localObject3 = this.egr;
      if (paramPInt == null)
      {
        paramString1 = this.egr;
        if (paramPInt != null) {
          break label846;
        }
      }
      for (paramPInt = this.egr;; paramPInt = bi.aG(paramPInt.videoUrl, this.egr))
      {
        ((ax)localObject1).a((byte[])localObject2, (String)localObject3, paramString1, paramPInt, 4, bi.aG(this.title, ""), bi.aG(this.nOc, ""));
        break;
        paramString1 = bi.aG(paramPInt.videoLowBandUrl, this.egr);
        break label782;
      }
      if (!bi.oW(this.nNU))
      {
        paramString1 = this.nNU;
        paramInt2 = this.w;
        paramInt3 = this.h;
        paramString1 = ax.ab("", paramString1, paramString1);
        if (paramString1 == null)
        {
          x.e("MicroMsg.UploadPackHelper", "share img o.url is null!");
          break;
        }
        paramString1.jOS = "";
        if ((paramInt2 > 0) && (paramInt3 > 0))
        {
          paramPInt = new atg();
          paramPInt.rWv = paramInt3;
          paramPInt.rWu = paramInt2;
          paramString1.rVH = paramPInt;
        }
        if (!bi.oW("")) {
          paramString1.bHD = "";
        }
        if (!bi.oW("")) {
          paramString1.jOS = "";
        }
        ((ax)localObject1).nsx.sqc.ruA.add(paramString1);
        break;
      }
      if (this.nMy == null) {
        break;
      }
      if (this.nNX)
      {
        paramString1 = this.nMy;
        if (paramString1 != null) {
          break label1112;
        }
      }
      for (paramInt3 = 0;; paramInt3 = 0)
      {
        if (paramInt3 != 0)
        {
          x.i("MicroMsg.LinkWidget", "isPngThumbData");
          paramString1 = f.aL(this.nMy);
          if ((paramString1 != null) && (paramString1.length > 0))
          {
            x.i("MicroMsg.LinkWidget", "use covert data");
            this.nMy = f.aL(paramString1);
          }
        }
        ((ax)localObject1).b(this.nMy, "", "");
        break;
        if (paramString1.length >= 4) {
          break label1125;
        }
      }
      paramInt2 = 1;
      int i = 0;
      for (;;)
      {
        paramInt3 = paramInt2;
        if (i >= 4) {
          break;
        }
        if (paramString1[i] != new byte[] { -119, 80, 78, 71 }[i]) {
          paramInt2 = 0;
        }
        i += 1;
      }
      ((ax)localObject1).wH(0);
      break label318;
      if (parami != null) {
        ((ax)localObject1).eB(parami.token, parami.rWk);
      }
      ((ax)localObject1).ag(paramString1);
      if (!bi.oW(this.appId)) {
        ((ax)localObject1).ME(this.appId);
      }
      if (!bi.oW(this.appName)) {
        ((ax)localObject1).MF(bi.aG(this.appName, ""));
      }
      if (this.nNY) {
        ((ax)localObject1).wG(5);
      }
      ((ax)localObject1).a(paramarj);
      if ((this.nNZ) && (this.nOa != null))
      {
        ((ax)localObject1).Mz(this.nOa.mediaTagName);
        ((ax)localObject1).aa(this.appId, this.nOa.messageExt, this.nOa.messageAction);
      }
      ((ax)localObject1).MA(paramString2);
      ((ax)localObject1).f(this.nOd, this.nOe, this.bZL, paramInt4, paramInt5);
      parami = this.bZM;
      ((ax)localObject1).nsy.bZM = parami;
      ((ax)localObject1).setSessionId(this.fmS);
      paramInt1 = this.nOf;
      ((ax)localObject1).nsx.dwt = paramInt1;
      paramInt1 = ((ax)localObject1).commit();
      if (this.nMG != null)
      {
        this.nMG.iq(paramInt1);
        e.nxO.c(this.nMG);
      }
      if (this.nOg != null)
      {
        this.nOg.iq(paramInt1);
        com.tencent.mm.plugin.sns.h.f.nxO.c(this.nOg);
        this.nOg.RD();
      }
      af.byk().bwX();
      this.bGc.finish();
      return false;
    }
  }
  
  public final boolean bBU()
  {
    return true;
  }
  
  public final View bBV()
  {
    this.gYR = y.gq(this.bGc).inflate(i.g.upload_media_link, null);
    if (!bi.oW(this.egr)) {
      this.gYR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (!bi.oW(aa.this.nOn)) {
            return;
          }
          x.i("MicroMsg.LinkWidget", "adlink url " + aa.this.egr);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", aa.this.egr);
          a.ezn.j(paramAnonymousView, aa.this.bGc);
        }
      });
    }
    this.nMB = ((CdnImageView)this.gYR.findViewById(i.f.image_left));
    this.eBO = ((TextView)this.gYR.findViewById(i.f.titletext));
    this.nMC = ((TextView)this.gYR.findViewById(i.f.righttext));
    int i;
    if ((!this.leb) && (!this.nNW))
    {
      if ((this.nsD != null) && (!bi.oW(this.nsD.pLr)))
      {
        i = 1;
        if (i == 0) {
          break label219;
        }
      }
    }
    else
    {
      this.gYR.findViewById(i.f.state).setVisibility(0);
      label148:
      if (bi.oW(this.title)) {
        break label237;
      }
      this.eBO.setText(this.title);
      label169:
      if (bi.oW(this.nMx)) {
        break label254;
      }
      this.nMB.setVisibility(0);
      this.nMB.setUrl(this.nMx);
    }
    for (;;)
    {
      com.tencent.mm.plugin.sns.data.i.b(this.nMB, this.bGc);
      return this.gYR;
      i = 0;
      break;
      label219:
      this.gYR.findViewById(i.f.state).setVisibility(8);
      break label148;
      label237:
      this.eBO.setText(av.Oa(this.egr));
      break label169;
      label254:
      if (!bi.bC(this.nMy))
      {
        this.nMB.setVisibility(0);
        this.dHf = com.tencent.mm.sdk.platformtools.c.bs(this.nMy);
        this.nMB.setImageBitmap(this.dHf);
        this.nNT = true;
      }
      else if (!bi.oW(this.nOn))
      {
        this.nMB.setImageResource(i.i.note_sns_link_default);
        this.nMB.setVisibility(0);
      }
      else
      {
        this.nMB.setImageResource(i.i.app_attach_file_icon_webpage);
        this.nMB.setVisibility(0);
      }
    }
  }
  
  public final boolean bBW()
  {
    if ((this.dHf != null) && (!this.dHf.isRecycled()) && (this.nNT)) {
      this.dHf.recycle();
    }
    return false;
  }
  
  public final boolean d(int paramInt, Intent paramIntent)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */