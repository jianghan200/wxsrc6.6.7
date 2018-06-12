package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.location.ui.MyLocationButton;
import com.tencent.mm.plugin.location.ui.NewMyLocationButton;
import com.tencent.mm.plugin.location.ui.m;
import com.tencent.mm.plugin.location.ui.n;
import com.tencent.mm.plugin.map.a.d;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.n.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class h
  extends i
{
  MyLocationButton kJJ;
  m kJL;
  com.tencent.mm.plugin.location.ui.l kJN;
  private Button kJZ;
  private NewMyLocationButton kKa;
  private com.tencent.mm.plugin.location.ui.f kKb;
  View kKc;
  private boolean kKd = false;
  private com.tencent.mm.ui.widget.a.d kKe;
  Map<String, String> kKf;
  int kKg;
  
  public h(Activity paramActivity)
  {
    super(paramActivity);
  }
  
  final void aZW()
  {
    if ((this.activity.getIntent().getBooleanExtra("KFavLocSigleView", false)) && (this.activity.getIntent().getBooleanExtra("kFavCanRemark", false))) {
      this.kKd = true;
    }
    super.aZW();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TrackMapUI", "oldVer %s", new Object[] { Boolean.valueOf(this.kKd) });
    ((TextView)findViewById(a.e.mm_action_bar_mmtitle)).setText(a.h.location_info);
    findViewById(a.e.title_search_icon).setVisibility(8);
    if (!this.kKd)
    {
      localObject = (ViewStub)findViewById(a.e.location_info_stub);
      ((ViewStub)localObject).setOnInflateListener(new h.1(this));
      this.kKc = ((ViewStub)localObject).inflate();
      findViewById(a.e.locate_to_my_position).setVisibility(8);
      this.activity.getWindow().getDecorView().post(new h.5(this));
    }
    this.kJL = new m(this.activity, this.kHR.kEZ, false);
    this.kJL.kHb = false;
    this.kJL.kHc = false;
    Object localObject = this.kJL;
    ((m)localObject).kGZ = true;
    if (((m)localObject).kGS != null)
    {
      ((m)localObject).kGS.setOnAvatarOnClickListener(null);
      ((m)localObject).kGS.setOnLocationOnClickListener(null);
      ((m)localObject).kGS.ban();
    }
    this.kJL.kGW = false;
    this.kJN = new com.tencent.mm.plugin.location.ui.l(this.activity, new h.7(this));
    if (!this.kKd)
    {
      findViewById(a.e.start_share).setVisibility(8);
      this.kHR.jfx.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          h.this.aZV();
          h.this.YC();
          h.this.activity.finish();
        }
      });
      if (this.kKd) {
        break label781;
      }
      this.kKa = ((NewMyLocationButton)this.kKc.findViewById(a.e.new_locate_to_my_position));
      this.kKa.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          h.this.kJL.a(h.this.kHR.kEZ);
        }
      });
      localObject = this.activity.getIntent().getStringExtra("kPoi_url");
      if (!bi.oW((String)localObject)) {
        break label748;
      }
      this.kHR.kAp.setVisibility(8);
    }
    for (;;)
    {
      int i;
      if (!this.kKd)
      {
        localObject = this.kKt;
        i = a.d.location_artboard1;
        ((n)localObject).kHF.setImageResource(i);
        this.kKb = new com.tencent.mm.plugin.location.ui.f(this.kHR.kEZ, this.activity);
        if (this.kHP.aYZ())
        {
          if ((this.kFa != null) && (!this.kFa.equals(""))) {
            this.kKb.kFa = this.kFa;
          }
          this.kKb.setText(this.kKt.getPreText() + this.kHP.kCz);
        }
        localObject = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TrackMapUI", "newpoi old go back onclick");
            h.this.bNP = 0;
            h.this.baj();
            h.this.bas();
          }
        };
        com.tencent.mm.plugin.location.ui.f localf = this.kKb;
        localf.kFd.setOnClickListener((View.OnClickListener)localObject);
        localf.kFd.setVisibility(0);
      }
      return;
      this.kJZ = ((Button)findViewById(a.e.start_share));
      this.kJZ.setVisibility(0);
      this.kJZ.setOnClickListener(new h.8(this));
      this.kJZ.setEnabled(true);
      if (this.type == 2) {
        i = 0;
      }
      for (;;)
      {
        if (i != 0) {
          break label746;
        }
        this.kJZ.setVisibility(8);
        break;
        if (this.type == 3)
        {
          i = 0;
        }
        else if (this.type == 7)
        {
          i = 0;
        }
        else if (this.type == 9)
        {
          i = 0;
        }
        else if (this.bJC != -1L)
        {
          localObject = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(this.bJC);
          if ((s.hf(((cm)localObject).field_talker)) || (s.hL(((cm)localObject).field_talker)) || (ab.XO(((cm)localObject).field_talker)) || (ab.XQ(((cm)localObject).field_talker)) || (ab.gY(((cm)localObject).field_talker))) {
            i = 0;
          } else {
            i = 1;
          }
        }
        else
        {
          i = 1;
        }
      }
      label746:
      break;
      label748:
      this.kHR.kAp.setVisibility(0);
      this.kHR.kAp.setOnClickListener(new h.11(this, (String)localObject));
      continue;
      label781:
      this.kJJ = ((MyLocationButton)findViewById(a.e.locate_to_my_position));
      this.kJJ.setOnClickListener(new h.12(this));
      if ((this.type == 2) && (this.activity.getIntent().getBooleanExtra("kFavCanRemark", true))) {
        ((ViewGroup.MarginLayoutParams)this.kJJ.getLayoutParams()).bottomMargin = com.tencent.mm.bp.a.fromDPToPix(this.activity, 80);
      }
      localObject = this.activity.getIntent().getStringExtra("kPoi_url");
      if (bi.oW((String)localObject))
      {
        this.kHR.kAp.setVisibility(8);
      }
      else
      {
        this.kHR.kAp.setVisibility(0);
        this.kHR.kAp.setOnClickListener(new h.2(this, (String)localObject));
      }
    }
  }
  
  public final void bai()
  {
    super.bai();
  }
  
  protected final boolean bak()
  {
    return this.kKd;
  }
  
  public final void bal()
  {
    super.bal();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrackMapUI", "onDown");
  }
  
  protected final void bam()
  {
    this.kKe = new com.tencent.mm.ui.widget.a.d(this.activity, 1, false);
    this.kKe.ofp = new h.3(this);
    this.kKe.ofq = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        switch (paramAnonymousMenuItem.getItemId())
        {
        default: 
          if (h.this.kKf != null)
          {
            Iterator localIterator = h.this.kKf.entrySet().iterator();
            while (localIterator.hasNext())
            {
              Map.Entry localEntry = (Map.Entry)localIterator.next();
              if (((String)localEntry.getValue()).equals(paramAnonymousMenuItem.getTitle()))
              {
                h.this.kHO.a(h.this.kHP, h.this.kHQ, (String)localEntry.getKey(), false);
                com.tencent.mm.plugin.report.service.h.mEJ.h(12809, new Object[] { Integer.valueOf(4), localEntry.getKey() });
              }
            }
          }
          return;
        case 1: 
          h.this.baq();
          com.tencent.mm.plugin.report.service.h.mEJ.h(12809, new Object[] { Integer.valueOf(4) });
          return;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrackMapUI", "click tencent map: %s", new Object[] { Boolean.valueOf(h.this.kKf.containsKey("com.tencent.map")) });
        if (h.b(h.this))
        {
          h.this.kHO.a(h.this.kHP, h.this.kHQ, "com.tencent.map", false);
          com.tencent.mm.plugin.report.service.h.mEJ.h(12809, new Object[] { Integer.valueOf(4), "com.tencent.map" });
          return;
        }
        if (h.this.kKg < 4)
        {
          paramAnonymousMenuItem = h.this;
          paramAnonymousMenuItem.kKg += 1;
          g.Ei().DT().a(aa.a.sWX, Integer.valueOf(h.this.kKg));
        }
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("rawUrl", " http://mapdownload.map.qq.com/?key=wx&referer=wx1&channel=00008");
        com.tencent.mm.bg.d.b(h.this.activity, "webview", ".ui.tools.WebViewUI", paramAnonymousMenuItem);
        com.tencent.mm.plugin.report.service.h.mEJ.h(12809, new Object[] { Integer.valueOf(5) });
      }
    };
    this.kKe.bXO();
  }
  
  public final boolean d(LocationInfo paramLocationInfo)
  {
    com.tencent.mm.plugin.location.a.a locala = com.tencent.mm.plugin.location.model.l.aZj().FM(this.kDN);
    StringBuilder localStringBuilder = new StringBuilder("resume try to enter trackRoom ");
    boolean bool;
    if (locala != null)
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrackMapUI", bool);
      if (locala != null) {
        break label54;
      }
    }
    label54:
    do
    {
      return true;
      bool = false;
      break;
      if ((!bi.oW(locala.kCs)) && (!bi.oW(paramLocationInfo.kCz)) && (!locala.kCs.equals(paramLocationInfo.kCz))) {
        return false;
      }
    } while ((Math.abs(locala.latitude - paramLocationInfo.kCw) < 0.001D) && (Math.abs(locala.longitude - paramLocationInfo.kCx) < 0.001D));
    return false;
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4) {
      paramKeyEvent.getAction();
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kKg = ((Integer)g.Ei().DT().get(aa.a.sWX, Integer.valueOf(0))).intValue();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrackMapUI", "count: %s", new Object[] { Integer.valueOf(this.kKg) });
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    if (this.kJL != null) {
      this.kJL.destroy();
    }
  }
  
  public final void onPause()
  {
    super.onPause();
    if (this.kJL != null) {
      this.kJL.onPause();
    }
  }
  
  public final void onResume()
  {
    super.onResume();
    if (this.kJL != null) {
      this.kJL.onResume();
    }
    fz localfz;
    if (this.type == 2)
    {
      localfz = new fz();
      localfz.bOL.bJA = this.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L);
      localfz.bOL.type = 4;
      com.tencent.mm.sdk.b.a.sFg.m(localfz);
      if (localfz.bOM.auX != null)
      {
        if (this.kHW != null) {
          break label121;
        }
        this.kHW = new ArrayList();
      }
    }
    for (;;)
    {
      this.kHW.addAll(localfz.bOM.auX);
      aZS();
      return;
      label121:
      this.kHW.clear();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/location/ui/impl/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */