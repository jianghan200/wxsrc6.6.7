package com.tencent.mm.plugin.welab.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.welab.a.a;
import com.tencent.mm.plugin.welab.a.b;
import com.tencent.mm.plugin.welab.a.c;
import com.tencent.mm.plugin.welab.a.d;
import com.tencent.mm.plugin.welab.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class WelabMainUI
  extends MMActivity
{
  private boolean qmX = false;
  private LinearLayout qni;
  private LinearLayout qnj;
  private LinearLayout qnk;
  private LinearLayout qnl;
  private View qnm;
  private View qnn;
  private List<String> qno;
  private Comparator<com.tencent.mm.plugin.welab.c.a.a> qnp = new WelabMainUI.3(this);
  private View.OnClickListener qnq = new WelabMainUI.4(this);
  
  private void a(com.tencent.mm.plugin.welab.c.a.a parama, LinearLayout paramLinearLayout)
  {
    LinearLayout localLinearLayout = (LinearLayout)getLayoutInflater().inflate(a.c.welab_app_view, paramLinearLayout, false);
    ImageView localImageView1 = (ImageView)localLinearLayout.findViewById(a.b.title_prospect);
    ImageView localImageView2 = (ImageView)localLinearLayout.findViewById(a.b.app_img);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(a.b.title);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(a.b.summary);
    if (com.tencent.mm.plugin.welab.d.b.bYX().e(parama)) {
      localImageView1.setVisibility(0);
    }
    for (;;)
    {
      com.tencent.mm.ak.a.a.Pq().a(parama.Sa("field_ThumbUrl"), localImageView2, com.tencent.mm.plugin.welab.b.bYI().pNL);
      com.tencent.mm.plugin.welab.b.bYI();
      localTextView1.setText(com.tencent.mm.plugin.welab.b.a(parama));
      localTextView2.setText(parama.Sa("field_Desc"));
      localLinearLayout.setTag(parama);
      localLinearLayout.setOnClickListener(this.qnq);
      paramLinearLayout.addView(localLinearLayout);
      return;
      localImageView1.setVisibility(8);
    }
  }
  
  private void bYW()
  {
    List localList = com.tencent.mm.plugin.welab.b.bYI().qmM.bYS();
    Object localObject = localList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.welab.c.a.a locala = (com.tencent.mm.plugin.welab.c.a.a)((Iterator)localObject).next();
      if ((System.currentTimeMillis() / 1000L - locala.field_endtime >= 2592000L) || ("labs1de6f3".equals(locala.field_LabsAppId)))
      {
        ((Iterator)localObject).remove();
        com.tencent.mm.plugin.welab.b.bYI().qmM.a(locala, new String[0]);
      }
      else if ((locala.bTJ()) && (locala.field_Switch != 3))
      {
        locala.field_Switch = 3;
        com.tencent.mm.plugin.welab.b.bYI().qmM.c(locala, new String[0]);
      }
      else if (locala.field_Switch != 3)
      {
        ((Iterator)localObject).remove();
      }
    }
    if ("stopped lab " + localList != null) {}
    for (localObject = localList.toString();; localObject = "")
    {
      x.i("WelabMgr", (String)localObject);
      if (!localList.isEmpty()) {
        break;
      }
      this.qnj.setVisibility(8);
      return;
    }
    this.qnj.setVisibility(0);
    Collections.sort(localList, this.qnp);
    localObject = localList.iterator();
    while (((Iterator)localObject).hasNext()) {
      a((com.tencent.mm.plugin.welab.c.a.a)((Iterator)localObject).next(), this.qnl);
    }
    x.d("MicroMsg.WelabMainUI", "get online app count " + this.qnl.getChildCount());
  }
  
  protected final int getLayoutId()
  {
    return a.c.welab_main;
  }
  
  protected final void initView()
  {
    setMMTitle(a.d.welab_name);
    s.cqq();
    if (Build.VERSION.SDK_INT >= 21)
    {
      Window localWindow = getWindow();
      localWindow.clearFlags(201326592);
      localWindow.addFlags(Integer.MIN_VALUE);
      localWindow.setStatusBarColor(getResources().getColor(a.a.welab_main_color));
    }
    if (getSupportActionBar() != null) {
      getSupportActionBar().getCustomView().setBackgroundColor(getResources().getColor(a.a.welab_main_color));
    }
    this.qni = ((LinearLayout)findViewById(a.b.online_composite_container));
    this.qnk = ((LinearLayout)findViewById(a.b.online_container));
    this.qnj = ((LinearLayout)findViewById(a.b.stopped_composite_container));
    this.qnl = ((LinearLayout)findViewById(a.b.stopped_container));
    this.qnm = findViewById(a.b.privacy_detail);
    this.qnn = findViewById(a.b.no_app_view);
    this.qnm.setOnClickListener(new WelabMainUI.1(this));
    setBackBtn(new WelabMainUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    super.onCreate(paramBundle);
    lC(true);
    cqh();
    if (getIntent() != null)
    {
      if (getIntent().getIntExtra("para_from_with_red_point", 0) == 1) {
        bool = true;
      }
      this.qmX = bool;
      this.qno = getIntent().getStringArrayListExtra("key_exclude_apps");
    }
    initView();
    com.tencent.mm.plugin.welab.d.b.bYX();
    ad.chZ().edit().putBoolean("key_has_enter_welab", true).commit();
    com.tencent.mm.plugin.welab.d.b.bYY();
    e.n("", 1, this.qmX);
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.qnk.removeAllViews();
    this.qnl.removeAllViews();
    Object localObject = com.tencent.mm.plugin.welab.b.bYI().bYJ();
    if ((localObject == null) || (((List)localObject).isEmpty())) {
      this.qni.setVisibility(8);
    }
    for (;;)
    {
      bYW();
      if ((this.qni.getVisibility() == 0) || (this.qnj.getVisibility() == 0)) {
        break;
      }
      this.qnn.setVisibility(0);
      return;
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.welab.c.a.a locala = (com.tencent.mm.plugin.welab.c.a.a)localIterator.next();
        if ((!bi.oW(locala.field_LabsAppId)) && (this.qno.contains(locala.field_LabsAppId))) {
          localIterator.remove();
        }
      }
      if (((List)localObject).isEmpty())
      {
        this.qni.setVisibility(8);
      }
      else
      {
        this.qni.setVisibility(0);
        Collections.sort((List)localObject, this.qnp);
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          a((com.tencent.mm.plugin.welab.c.a.a)((Iterator)localObject).next(), this.qnk);
        }
        x.d("MicroMsg.WelabMainUI", "get online app count " + this.qnk.getChildCount());
      }
    }
    this.qnn.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/welab/ui/WelabMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */