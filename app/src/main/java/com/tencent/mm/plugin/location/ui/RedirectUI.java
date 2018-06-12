package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.mm.g.a.ma;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.g.a.ro;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.location.ui.impl.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.location.LocationIntent;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(23)
public class RedirectUI
  extends Activity
{
  private static long cXx = 86400000L;
  private long bJC;
  private boolean bTv = false;
  private int hER;
  private final ag handler = new ag();
  private String info = "";
  private double kCw = 0.0D;
  private double kCx = 0.0D;
  private int kCy = 0;
  private boolean kEE = true;
  private String kFm = "";
  private String kFn = "";
  private int kFo;
  private final int kFp = 1;
  private boolean kFq = false;
  private final int kFr = 0;
  private final int kFs = 1;
  private final int kFt = 0;
  private final int kFu = 1;
  private int type = 0;
  
  private void a(Intent paramIntent, double paramDouble1, double paramDouble2)
  {
    if (paramIntent != null)
    {
      paramIntent.putExtra("kShowshare", getIntent().getBooleanExtra("kShowshare", true));
      paramIntent.putExtra("kimg_path", com.tencent.mm.plugin.p.c.Gb());
      paramIntent.putExtra("kPoi_url", bi.aG(getIntent().getStringExtra("kPoi_url"), ""));
      paramIntent.putExtra("map_view_type", getIntent().getIntExtra("map_view_type", 0));
      paramIntent.putExtra("kFavInfoLocalId", getIntent().getLongExtra("kFavInfoLocalId", -1L));
      paramIntent.putExtra("kFavCanDel", getIntent().getBooleanExtra("kFavCanDel", true));
      paramIntent.putExtra("kFavCanRemark", getIntent().getBooleanExtra("kFavCanRemark", true));
      paramIntent.putExtra("kwebmap_slat", paramDouble1);
      paramIntent.putExtra("kwebmap_lng", paramDouble2);
      paramIntent.putExtra("kPoiName", getIntent().getStringExtra("kPoiName"));
      paramIntent.putExtra("kisUsername", bi.aG(getIntent().getStringExtra("kisUsername"), ""));
      paramIntent.putExtra("map_talker_name", this.kFn);
      paramIntent.putExtra("kIs_pick_poi", getIntent().getBooleanExtra("kIs_pick_poi", false));
      paramIntent.putExtra("KFavLocSigleView", getIntent().getBooleanExtra("KFavLocSigleView", false));
      ro localro = new ro();
      localro.ccs.cct = true;
      com.tencent.mm.sdk.b.a.sFg.m(localro);
      if (this.type == 6)
      {
        paramIntent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1L));
        paramIntent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
        if (this.kCy > 0) {
          paramIntent.putExtra("kwebmap_scale", this.kCy);
        }
        paramIntent.putExtra("Kwebmap_locaion", this.info);
        paramIntent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
        startActivityForResult(paramIntent, 3);
      }
      do
      {
        return;
        if ((this.type == 1) || (this.type == 2) || (this.type == 7) || (this.type == 9))
        {
          paramIntent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1L));
          paramIntent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
          paramIntent.putExtra("kTags", getIntent().getStringArrayListExtra("kTags"));
          if (this.kCy > 0) {
            paramIntent.putExtra("kwebmap_scale", this.kCy);
          }
          paramIntent.putExtra("Kwebmap_locaion", this.info);
          paramIntent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
          startActivityForResult(paramIntent, 3);
          return;
        }
        if (this.type == 0)
        {
          startActivityForResult(paramIntent, 2);
          return;
        }
        if (this.type == 3)
        {
          startActivityForResult(paramIntent, 5);
          return;
        }
      } while (this.type != 8);
      startActivityForResult(paramIntent, 6);
      return;
    }
    finish();
  }
  
  private void l(double paramDouble1, double paramDouble2)
  {
    this.bTv = true;
    Intent localIntent = d.t(this);
    Object localObject;
    switch (this.type)
    {
    case 4: 
    case 5: 
    default: 
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RedirectUI", "view type error");
      localObject = null;
      switch (this.type)
      {
      }
      break;
    }
    for (;;)
    {
      if (!af.ewK) {
        break label335;
      }
      this.handler.postDelayed(new RedirectUI.1(this, (Intent)localObject, paramDouble1, paramDouble2), 2000L);
      return;
      String str = getIntent().getStringExtra("fromWhereShare");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RedirectUI", "location resume");
      localIntent.putExtra("intent_map_key", 5);
      localObject = localIntent;
      if (bi.oW(str)) {
        break;
      }
      localIntent.putExtra("fromWhereShare", str);
      localObject = localIntent;
      break;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RedirectUI", "view normal");
      localIntent.putExtra("intent_map_key", 4);
      localObject = localIntent;
      break;
      localIntent.putExtra("intent_map_key", 4);
      localObject = localIntent;
      break;
      localObject = new StringBuilder("view poi      isHidePoiOversea : ");
      if (bi.getInt(com.tencent.mm.k.g.AU().G("ShowConfig", "hidePoiOversea"), 1) == 1) {}
      for (boolean bool = true;; bool = false)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ConfigListDecoder", "isHidePoiOversea : " + bool);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RedirectUI", bool);
        localIntent.putExtra("intent_map_key", 2);
        localObject = localIntent;
        break;
      }
      ((Intent)localObject).putExtra("location_scene", 1);
    }
    label335:
    a((Intent)localObject, paramDouble1, paramDouble2);
  }
  
  public void finish()
  {
    super.finish();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RedirectUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      finish();
      return;
    }
    if (paramIntent == null)
    {
      finish();
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      setResult(paramInt2, paramIntent);
      finish();
      return;
      String str1 = this.kFn;
      LocationIntent localLocationIntent = (LocationIntent)paramIntent.getParcelableExtra("KLocationIntent");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RedirectUI", "locationintent " + localLocationIntent.bGa());
      Object localObject1 = new ma();
      ((ma)localObject1).bWy.bWA = this.kFo;
      ((ma)localObject1).bWy.lat = localLocationIntent.lat;
      ((ma)localObject1).bWy.lng = localLocationIntent.lng;
      ((ma)localObject1).bWy.bSz = localLocationIntent.bSz;
      ((ma)localObject1).bWy.label = localLocationIntent.label;
      ((ma)localObject1).bWy.bWB = localLocationIntent.kFa;
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject1);
      double d1 = localLocationIntent.lat;
      double d2 = localLocationIntent.lng;
      paramInt1 = localLocationIntent.bSz;
      String str2 = localLocationIntent.label;
      Object localObject2 = localLocationIntent.kFa;
      String str3 = localLocationIntent.qyA;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "";
      }
      localObject1 = "<msg><location x=\"" + d1 + "\" y=\"" + d2 + "\" scale=\"" + paramInt1 + "\" label=\"" + bi.WS(str2) + "\" poiname=\"" + bi.WS((String)localObject1) + "\" infourl=\"" + bi.WS(str3) + "\" maptype=\"0\" /></msg>";
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RedirectUI", "xml " + (String)localObject1);
      localObject2 = new ow();
      ((ow)localObject2).bZQ.bZR = str1;
      ((ow)localObject2).bZQ.content = ((String)localObject1);
      ((ow)localObject2).bZQ.type = 48;
      ((ow)localObject2).bZQ.flags = 0;
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject2);
      o.a(2004, (float)localLocationIntent.lng, (float)localLocationIntent.lat, 0);
      continue;
      localObject1 = (LocationIntent)paramIntent.getParcelableExtra("KLocationIntent");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RedirectUI", "locationintent " + ((LocationIntent)localObject1).bGa());
      if (((LocationIntent)localObject1).qyB == 3)
      {
        h.mEJ.h(10822, new Object[] { Integer.valueOf(1), ((LocationIntent)localObject1).kCB, Integer.valueOf(1) });
        label553:
        paramIntent.putExtra("kwebmap_slat", ((LocationIntent)localObject1).lat);
        paramIntent.putExtra("kwebmap_lng", ((LocationIntent)localObject1).lng);
        paramIntent.putExtra("kwebmap_scale", ((LocationIntent)localObject1).bSz);
        paramIntent.putExtra("Kwebmap_locaion", ((LocationIntent)localObject1).label);
        paramIntent.putExtra("kTags", paramIntent.getStringArrayListExtra("kTags"));
        if (!((LocationIntent)localObject1).kFa.equals("")) {
          break label681;
        }
      }
      label681:
      for (localObject1 = "";; localObject1 = ((LocationIntent)localObject1).kFa)
      {
        paramIntent.putExtra("kPoiName", (String)localObject1);
        break;
        h.mEJ.h(10822, new Object[] { Integer.valueOf(1), ((LocationIntent)localObject1).kCB, Integer.valueOf(0) });
        break label553;
      }
      localObject1 = (LocationIntent)paramIntent.getParcelableExtra("KLocationIntent");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RedirectUI", "locationintent " + ((LocationIntent)localObject1).bGa());
      if (((LocationIntent)localObject1).dSa != null) {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RedirectUI", "addr: " + ((LocationIntent)localObject1).dSa.toString());
      }
      paramIntent.putExtra("key_pick_addr", ((LocationIntent)localObject1).dSa);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().addFlags(Integer.MIN_VALUE);
      getWindow().setStatusBarColor(0);
    }
    if (bi.bG(Long.valueOf(bi.c((Long)com.tencent.mm.kernel.g.Ei().DT().get(81938, null))).longValue()) * 1000L > cXx) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        com.tencent.mm.ar.c.Qj().update();
      }
      this.type = getIntent().getIntExtra("map_view_type", -1);
      if (this.type == -1) {
        finish();
      }
      this.bJC = getIntent().getLongExtra("kMsgId", -1L);
      this.kFn = getIntent().getStringExtra("map_talker_name");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RedirectUI", "tofutest type: %s", new Object[] { Integer.valueOf(this.type) });
      switch (this.type)
      {
      case 4: 
      case 5: 
      default: 
        return;
      }
    }
    paramBundle = l.aZj().FM(this.kFn);
    StringBuilder localStringBuilder = new StringBuilder("resume try to enter trackRoom ");
    if (paramBundle != null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RedirectUI", bool);
      if (paramBundle == null) {
        break;
      }
      this.kCw = paramBundle.latitude;
      this.kCx = paramBundle.longitude;
      this.info = paramBundle.kCs;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RedirectUI", "resume lat %f lng %f %s member size %d", new Object[] { Double.valueOf(this.kCw), Double.valueOf(this.kCx), this.info, Integer.valueOf(paramBundle.bUb.size()) });
      this.kCy = 0;
      l(this.kCw, this.kCx);
      return;
    }
    l(-1000.0D, -1000.0D);
    return;
    this.kCw = getIntent().getDoubleExtra("kwebmap_slat", -85.0D);
    this.kCx = getIntent().getDoubleExtra("kwebmap_lng", -1000.0D);
    this.kCy = getIntent().getIntExtra("kwebmap_scale", 0);
    this.info = getIntent().getStringExtra("Kwebmap_locaion");
    l(this.kCw, this.kCx);
    return;
    this.kFm = getIntent().getStringExtra("map_sender_name");
    this.hER = getIntent().getIntExtra("view_type_key", 1);
    this.kFo = getIntent().getIntExtra("key_get_location_type", 0);
    l(-85.0D, -1000.0D);
  }
  
  protected void onDestroy()
  {
    this.kEE = false;
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/location/ui/RedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */