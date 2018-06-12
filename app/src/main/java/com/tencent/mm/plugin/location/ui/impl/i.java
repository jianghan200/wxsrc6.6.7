package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelsimple.v;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.ui.n;
import com.tencent.mm.plugin.location.ui.n.a;
import com.tencent.mm.plugin.location_soso.ViewManager;
import com.tencent.mm.plugin.map.a.b;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.h;
import com.tencent.mm.pluginsdk.ui.tools.AppChooserUI;
import com.tencent.mm.pluginsdk.ui.tools.r;
import com.tencent.mm.protocal.c.bim;
import com.tencent.mm.protocal.c.bin;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;

public class i
  extends a
  implements com.tencent.mm.ab.e
{
  protected long bJC = -1L;
  private boolean bUY = true;
  private boolean fTW = false;
  public com.tencent.mm.remoteservice.d iMQ = new com.tencent.mm.remoteservice.d(this.activity);
  private long kHe = 0L;
  private String kKs = "";
  n kKt;
  com.tencent.mm.ui.widget.a.d kKu;
  boolean kKv = false;
  private Runnable kKw;
  private com.tencent.mm.modelgeo.a.a kKx = new i.5(this);
  
  public i(Activity paramActivity)
  {
    super(paramActivity);
    g.DF().a(424, this);
  }
  
  protected final String Wm()
  {
    return getString(a.h.location_see_info);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.ViewMapUI", "onScene end %d %d %d", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paraml.getType() == 424)
    {
      if ((paramInt2 == 0) && (paramInt1 == 0))
      {
        paramString = v.mY(((v)paraml).Ru().rjF);
        x.d("MicroMsg.ViewMapUI", "getUrl success! url is %s", new Object[] { paramString });
        this.kKs = paramString;
        if (!bi.oW(paramString)) {
          this.kKv = true;
        }
        if ((this.type == 9) && (!bi.oW(paramString)))
        {
          paramString = (TextView)findViewById(a.e.street_tv);
          paramString.setVisibility(0);
          paramString.setOnClickListener(new i.8(this));
        }
      }
      return;
    }
    x.e("MicroMsg.ViewMapUI", "msg failed.errtype:%d, errcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  protected void aZV()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("kopenGmapNums", this.kHO.kEC);
    localIntent.putExtra("kopenOthersNums", this.kHO.kED);
    localIntent.putExtra("kopenreportType", this.kHO.ecA);
    localIntent.putExtra("kRemark", aZU());
    localIntent.putExtra("soso_street_view_url", this.kKs);
    this.activity.setResult(-1, localIntent);
  }
  
  void aZW()
  {
    this.kHR.kIh.setEnabled(true);
    this.kHR.kId.setVisibility(8);
    c(this.kHP);
    this.kHR.kEZ.getIController().setZoom(this.kCy);
    this.kHR.kIf.setEnabled(true);
    this.bUY = this.activity.getIntent().getBooleanExtra("kShowshare", true);
    label143:
    Object localObject;
    if (this.bUY)
    {
      this.kHR.kIf.setVisibility(0);
      this.kKs = this.activity.getIntent().getStringExtra("soso_street_view_url");
      if ((bi.oW(this.kKs)) || ((!w.chN()) && (!w.chM()))) {
        break label575;
      }
      this.kKv = true;
      this.kHR.kIf.setOnClickListener(new i.3(this));
      this.kKt = new n(this.kHR.kEZ, this.activity, bak());
      localObject = this.kKt;
      if (((n)localObject).mViewManager != null)
      {
        ((n)localObject).mViewManager.addView(((n)localObject).kHF, 0.0D, 0.0D);
        ((n)localObject).mViewManager.setMarkerTag(((n)localObject).kHF, "info_window_tag");
        if (((n)localObject).kHI)
        {
          ((n)localObject).mViewManager.setInfoWindowAdapter(new n.a((n)localObject, (byte)0));
          ((n)localObject).mViewManager.showInfoWindowByView(((n)localObject).kHF);
        }
      }
      this.kKt.b(this.kHP);
      if (!com.tencent.mm.plugin.location.model.e.k(this.kHP.kCw, this.kHP.kCx))
      {
        x.d("MicroMsg.ViewMapUI", "isValidLatLng %f %f", new Object[] { Double.valueOf(this.kHP.kCw), Double.valueOf(this.kHP.kCx) });
        localObject = this.kKt;
        ((n)localObject).kEX = false;
        ((n)localObject).kHG.setVisibility(8);
      }
      if (2 == this.type)
      {
        x.i("MicroMsg.ViewMapUI", "location id %s", new Object[] { this.kHP.kCv });
        if (this.activity.getIntent().getBooleanExtra("kFavCanRemark", true)) {
          aZT();
        }
        if (!bi.oW(this.kHP.kCz)) {
          this.kHR.kIe.setVisibility(0);
        }
      }
      this.kHT.put(this.kHP.kCv, this.kKt);
      if (!this.kHP.aYZ()) {
        break label673;
      }
      if ((this.kFa != null) && (!this.kFa.equals(""))) {
        this.kKt.kFa = this.kFa;
      }
      this.kKt.setText(this.kKt.getPreText() + this.kHP.kCz);
    }
    for (;;)
    {
      localObject = this.kKt;
      i.4 local4 = new i.4(this);
      if ((((n)localObject).kHI) && (((n)localObject).mViewManager != null)) {
        ((n)localObject).mViewManager.setMarkerClick(((n)localObject).kHF, local4);
      }
      return;
      this.kHR.kIf.setVisibility(8);
      break;
      label575:
      if ((!w.chN()) && (!w.chM())) {
        break label143;
      }
      this.kKv = false;
      try
      {
        localObject = (bim)new v((float)this.kHP.kCx, (float)this.kHP.kCw, this.bJC).diG.dID.dIL;
        new v((bim)localObject);
        g.DF().a(new v((bim)localObject), 0);
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.ViewMapUI", localException.toString());
      }
      break label143;
      label673:
      if (com.tencent.mm.plugin.location.model.e.k(this.kHP.kCw, this.kHP.kCx)) {
        this.kHU.a(this.kHP.kCw, this.kHP.kCx, this.kIb, this.kHP.kCv);
      }
    }
  }
  
  public boolean aZX()
  {
    if ((this.kKu != null) && (this.kKu.isShowing())) {
      this.kKu.bzW();
    }
    for (;;)
    {
      return true;
      bap();
      this.kKu.bXO();
    }
  }
  
  public void bai() {}
  
  protected void baj() {}
  
  protected boolean bak()
  {
    return true;
  }
  
  public void bal() {}
  
  protected void bam() {}
  
  final void bap()
  {
    this.kKu = new com.tencent.mm.ui.widget.a.d(this.activity, 1, false);
    this.kKu.ofp = new i.1(this);
    this.kKu.ofq = new i.2(this);
  }
  
  protected final void baq()
  {
    if (this.kKv)
    {
      r.a(new com.tencent.mm.pluginsdk.ui.tools.e());
      Intent localIntent = new Intent();
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("jsapi_args_appid", "wx751a1acca5688ba3");
      localIntent.putExtra("rawUrl", this.kKs);
      localIntent.putExtra("title", a.h.scan_entry_street);
      localIntent.putExtra("webview_bg_color_rsID", a.b.black);
      com.tencent.mm.bg.d.b(this.activity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    }
  }
  
  protected final void bar()
  {
    x.d("MicroMsg.ViewMapUI", "directlyFavorite lat %s, long %s, scale", new Object[] { Double.valueOf(this.kHP.kCw), Double.valueOf(this.kHP.kCx) });
    Intent localIntent = new Intent();
    localIntent.putExtra("kfavorite", true);
    localIntent.putExtra("kopenGmapNums", this.kHO.kEC);
    localIntent.putExtra("kopenOthersNums", this.kHO.kED);
    localIntent.putExtra("kopenreportType", this.kHO.ecA);
    localIntent.putExtra("kRemark", aZU());
    localIntent.putExtra("kwebmap_slat", this.kHP.kCw);
    localIntent.putExtra("kwebmap_lng", this.kHP.kCx);
    localIntent.putExtra("Kwebmap_locaion", this.kHP.kCz);
    localIntent.putExtra("kPoiName", this.kFa);
    this.activity.setResult(-1, localIntent);
    this.activity.getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
    this.activity.getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
    this.activity.finish();
  }
  
  protected final void bas()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(12809, new Object[] { Integer.valueOf(3), "" });
    x.d("MicroMsg.ViewMapUI", "locationLine, locationInfo.slat=%f, locationInfo.slong=%f, myLocation.slat=%f, myLocation.slong=%f", new Object[] { Double.valueOf(this.kHP.kCw), Double.valueOf(this.kHP.kCx), Double.valueOf(this.kHQ.kCw), Double.valueOf(this.kHQ.kCx) });
    if (this.kHQ.aYY()) {
      bam();
    }
    do
    {
      return;
      this.kHV = true;
    } while (this.handler == null);
    if (this.kKw != null) {
      this.handler.removeCallbacks(this.kKw);
    }
    this.kKw = new i.6(this);
    this.handler.postDelayed(this.kKw, 10000L);
    Activity localActivity = this.activity;
    getString(a.h.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(localActivity, getString(a.h.get_location), true, new i.7(this));
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.dispatchTouchEvent(paramMotionEvent);
      if ((Math.abs(paramMotionEvent.getX() - this.jUm) > 10.0F) || (Math.abs(paramMotionEvent.getY() - this.hlo) > 10.0F))
      {
        this.fTW = true;
        bai();
        continue;
        this.jUm = paramMotionEvent.getX();
        this.hlo = paramMotionEvent.getY();
        this.kHe = System.currentTimeMillis();
        this.fTW = false;
        bal();
        continue;
        if (!this.fTW) {
          System.currentTimeMillis();
        }
      }
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    com.tencent.mm.plugin.location.ui.d locald;
    label468:
    do
    {
      Object localObject2;
      do
      {
        return;
        locald = this.kHO;
        switch (paramInt1)
        {
        default: 
          return;
        case 4098: 
          if ((-1 == paramInt2) && (paramIntent != null))
          {
            localObject1 = paramIntent.getStringExtra("selectpkg");
            localObject2 = paramIntent.getBundleExtra("transferback");
            boolean bool = paramIntent.getBooleanExtra("isalways", false);
            paramIntent = ((Bundle)localObject2).getParcelableArrayList("locations");
            locald.a((LocationInfo)paramIntent.get(0), (LocationInfo)paramIntent.get(1), (String)localObject1, bool);
            return;
          }
          break;
        }
      } while (4097 != paramInt2);
      if (paramIntent.getBooleanExtra("isalways", false))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(11091, new Object[] { Integer.valueOf(6), Integer.valueOf(2) });
        paramIntent = paramIntent.getBundleExtra("transferback").getParcelableArrayList("locations");
        localObject1 = (LocationInfo)paramIntent.get(0);
        localObject2 = (LocationInfo)paramIntent.get(1);
        if (!bi.oW(((LocationInfo)localObject1).kCA)) {
          break label468;
        }
      }
      for (paramIntent = "zh-cn";; paramIntent = ((LocationInfo)localObject1).kCA)
      {
        paramIntent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=" + paramIntent, new Object[] { Double.valueOf(((LocationInfo)localObject2).kCw), Double.valueOf(((LocationInfo)localObject2).kCx), Double.valueOf(((LocationInfo)localObject1).kCw), Double.valueOf(((LocationInfo)localObject1).kCx) })));
        localObject1 = new Bundle();
        ((Bundle)localObject1).putParcelable("targetintent", paramIntent);
        localObject2 = new Intent();
        ((Intent)localObject2).setClass(locald.context, AppChooserUI.class);
        ((Intent)localObject2).putExtra("type", 1);
        ((Intent)localObject2).putExtra("title", locald.context.getResources().getString(a.h.location_info_send_tip));
        ((Intent)localObject2).putExtra("targetintent", paramIntent);
        ((Intent)localObject2).putExtra("transferback", (Bundle)localObject1);
        ((Intent)localObject2).putExtra("scene", 6);
        ((Activity)locald.context).startActivityForResult((Intent)localObject2, 4099);
        return;
        com.tencent.mm.plugin.report.service.h.mEJ.h(11091, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
        break;
      }
    } while ((-1 != paramInt2) || (paramIntent == null));
    Object localObject1 = paramIntent.getStringExtra("selectpkg");
    paramIntent = new Intent((Intent)paramIntent.getBundleExtra("transferback").getParcelable("targetintent"));
    paramIntent.setPackage((String)localObject1);
    paramIntent.addFlags(524288);
    locald.context.startActivity(paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    double d1 = this.activity.getIntent().getDoubleExtra("kwebmap_slat", 0.0D);
    double d2 = this.activity.getIntent().getDoubleExtra("kwebmap_lng", 0.0D);
    x.i("MicroMsg.ViewMapUI", "start dslat " + d1 + " " + d2);
    this.kCy = this.activity.getIntent().getIntExtra("kwebmap_scale", 15);
    if (this.kCy <= 0) {
      this.kCy = 15;
    }
    this.kFa = this.activity.getIntent().getStringExtra("kPoiName");
    paramBundle = this.activity.getIntent().getStringExtra("Kwebmap_locaion");
    x.d("MicroMsg.ViewMapUI", "view " + d1 + " " + d2);
    LocationInfo localLocationInfo = this.kHP;
    localLocationInfo.kCw = d1;
    localLocationInfo.kCx = d2;
    localLocationInfo.kCz = paramBundle;
    localLocationInfo.kCy = this.kCy;
    localLocationInfo.bWB = this.kFa;
    this.bJC = this.activity.getIntent().getLongExtra("kMsgId", -1L);
    this.kDN = this.activity.getIntent().getStringExtra("map_talker_name");
    initView();
  }
  
  public void onDestroy()
  {
    this.iMQ.release();
    this.handler.removeCallbacks(this.kKw);
    this.handler = null;
    g.DF().b(424, this);
    super.onDestroy();
  }
  
  public void onPause()
  {
    x.d("MicroMsg.ViewMapUI", "onbaseGeoResume");
    if (this.kIa != null) {
      this.kIa.c(this.kKx);
    }
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    x.d("MicroMsg.ViewMapUI", "onbaseGeoResume");
    if (this.kIa != null) {
      this.kIa.b(this.kKx, true);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/location/ui/impl/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */