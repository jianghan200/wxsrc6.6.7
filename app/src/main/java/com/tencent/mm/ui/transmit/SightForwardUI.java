package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.model.au;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.1;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.2;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.3;
import com.tencent.mm.plugin.sight.encode.ui.MainSightSelectContactView;
import com.tencent.mm.plugin.sight.encode.ui.SightCameraView;
import com.tencent.mm.plugin.sight.encode.ui.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity;
import java.util.HashSet;

public class SightForwardUI
  extends MMActivity
{
  private String ben;
  private MainSightForwardContainerView uEZ;
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.main_sight_forward_view;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    getSupportActionBar().hide();
    this.ben = getIntent().getStringExtra("sight_local_path");
    if (!com.tencent.mm.plugin.sight.base.d.Ln(this.ben))
    {
      x.e("MicroMsg.SightForwardUI", "Path:%s, NOT SIGHT!", new Object[] { this.ben });
      finish();
      return;
    }
    if (!au.HX())
    {
      x.e("MicroMsg.SightForwardUI", "acc not ready");
      finish();
      return;
    }
    paramBundle = s.nJ(String.valueOf(SystemClock.elapsedRealtime()));
    o.Ta();
    paramBundle = s.nK(paramBundle);
    if (e.y(this.ben, paramBundle) <= 0L)
    {
      x.e("MicroMsg.SightForwardUI", "Copy File %s to %s FAIL!", new Object[] { this.ben, paramBundle });
      finish();
      return;
    }
    this.ben = paramBundle;
    x.i("MicroMsg.SightForwardUI", "Doing Forward Sight, path %s", new Object[] { this.ben });
    this.uEZ = ((MainSightForwardContainerView)findViewById(R.h.forward_view));
    this.uEZ.setIMainSightViewCallback(new SightForwardUI.1(this));
    paramBundle = this.uEZ;
    Object localObject = this.ben;
    paramBundle.nfG = this;
    paramBundle.nfC = ((String)localObject);
    paramBundle.nfA = g.cu((String)localObject);
    long l = System.currentTimeMillis();
    paramBundle.nfD = 1.3333334F;
    paramBundle.nft = ((SightCameraView)((ViewStub)paramBundle.findViewById(R.h.camera_video_view)).inflate());
    paramBundle.nft.setTargetWidth(com.tencent.mm.pluginsdk.i.a.lgO);
    paramBundle.nft.setFixPreviewRate(paramBundle.nfD);
    paramBundle.nft.setVisibility(0);
    paramBundle.nfx = paramBundle.findViewById(R.h.top_virtual_actionbar);
    paramBundle.nfx.setLayoutParams(new RelativeLayout.LayoutParams(-1, getSupportActionBar().getHeight()));
    paramBundle.nfw = paramBundle.findViewById(R.h.main_sight_close);
    paramBundle.kWn = paramBundle.findViewById(R.h.main_sight_send);
    paramBundle.nfv = paramBundle.findViewById(R.h.camera_shadow);
    paramBundle.nfw.setOnClickListener(new MainSightForwardContainerView.1(paramBundle));
    paramBundle.kWn.setOnClickListener(new MainSightForwardContainerView.2(paramBundle));
    paramBundle.bwo();
    x.d("MicroMsg.MainSightContainerView", "init concrol view use %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    this.uEZ.bwn();
    paramBundle = this.uEZ;
    if (paramBundle.nfs == null)
    {
      localObject = paramBundle.getResources().getDisplayMetrics();
      float f = ((DisplayMetrics)localObject).widthPixels / paramBundle.nfD;
      paramBundle.nfs = ((MainSightSelectContactView)paramBundle.findViewById(R.h.select_contact_root));
      MainSightSelectContactView localMainSightSelectContactView = paramBundle.nfs;
      MMFragmentActivity localMMFragmentActivity = paramBundle.nfG;
      int i = (int)(((DisplayMetrics)localObject).heightPixels - f);
      int j = ((DisplayMetrics)localObject).heightPixels;
      localMainSightSelectContactView.nfG = localMMFragmentActivity;
      localMainSightSelectContactView.ngf = i;
      localMainSightSelectContactView.setMainSightContentView(paramBundle);
      localMainSightSelectContactView.addView(View.inflate(localMainSightSelectContactView.getContext(), R.i.main_sight_select_contact_view, null), -1, -2);
      localMainSightSelectContactView.CU = ((ListView)localMainSightSelectContactView.findViewById(R.h.select_contact_lv));
      localMainSightSelectContactView.ngi = new c(localMainSightSelectContactView);
      localMainSightSelectContactView.ngl = new LinearLayout(localMainSightSelectContactView.getContext());
      localMainSightSelectContactView.ngl.addView(new View(localMainSightSelectContactView.getContext()), -1, localMainSightSelectContactView.ngk.getViewHeight() - localMainSightSelectContactView.ngf);
      localMainSightSelectContactView.ngl.getChildAt(0).setBackgroundColor(0);
      localMainSightSelectContactView.CU.addHeaderView(localMainSightSelectContactView.ngl);
      localMainSightSelectContactView.CU.setAdapter(localMainSightSelectContactView.ngi);
      localMainSightSelectContactView.CU.setOnItemClickListener(paramBundle);
      localMainSightSelectContactView.ngp = new HashSet();
      localMainSightSelectContactView.ngq = new HashSet();
      localMainSightSelectContactView.CU.setOnScrollListener(localMainSightSelectContactView);
      localMainSightSelectContactView.ngg = new com.tencent.mm.plugin.sight.encode.ui.d();
      localMainSightSelectContactView.ngg.ngb = localMainSightSelectContactView;
      paramBundle.nfs.setSearchView(paramBundle.findViewById(R.h.search_view));
      paramBundle.nfs.setEmptyBgView(paramBundle.findViewById(R.h.empty_bg));
      paramBundle.nfs.setMainSightContentView(paramBundle);
    }
    paramBundle.hP(true);
    paramBundle.nft.postDelayed(new MainSightForwardContainerView.3(paramBundle), 50L);
  }
  
  protected void onPause()
  {
    super.onPause();
    this.uEZ.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.uEZ.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/transmit/SightForwardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */