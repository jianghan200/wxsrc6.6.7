package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.g.a;
import com.tencent.mm.ab.g.b;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.plugin.masssend.a.h;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.k;
import junit.framework.Assert;

public class MassSendHistoryUI
  extends MMActivity
  implements g.a, g.b, SensorController.a
{
  private static SensorController hlW;
  private com.tencent.mm.e.a.a bAW;
  private boolean hlZ = true;
  private n.d hqV = new MassSendHistoryUI.4(this);
  private View kwy;
  private ListView laZ;
  private c lba;
  private Button lbb;
  private Button lbc;
  private MMPullDownView lbd;
  private boolean lbe = false;
  private LinearLayout lbf;
  
  private boolean Gn(String paramString)
  {
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      hlW.a(this);
      paramString = h.bco().Gi(paramString);
      au.HU();
      if ((com.tencent.mm.model.c.isSDCardAvailable()) || (bi.oW(paramString.bch()))) {
        break;
      }
      com.tencent.mm.ui.base.s.gH(this);
      return false;
    }
    if (this.bAW == null) {
      this.bAW = new com.tencent.mm.e.a.a(this);
    }
    this.bAW.aJ(false);
    if (this.bAW.m(paramString.bch(), this.hlZ))
    {
      au.HV().e(this.hlZ, false, false);
      this.bAW.bCU = this;
      this.bAW.bCT = this;
      return true;
    }
    Toast.makeText(this, getString(R.l.chatting_play_err), 0).show();
    return false;
  }
  
  private void stopPlay()
  {
    hlW.ciL();
    this.bAW.aJ(false);
    this.lba.Gl("");
    releaseWakeLock();
  }
  
  public final void dK(boolean paramBoolean)
  {
    if (this.bAW == null) {}
    do
    {
      return;
      if (!this.bAW.isPlaying())
      {
        this.bAW.aK(true);
        au.HV().e(true, false, false);
        this.hlZ = true;
        return;
      }
      this.bAW.aK(paramBoolean);
      au.HV().e(paramBoolean, false, false);
      this.hlZ = paramBoolean;
    } while (paramBoolean);
    if (Gn(this.lba.laO))
    {
      this.lba.Gl(this.lba.laO);
      return;
    }
    this.lba.Gl("");
  }
  
  protected final int getLayoutId()
  {
    return R.i.mass_send_history;
  }
  
  protected final void initView()
  {
    this.lbe = getIntent().getBooleanExtra("finish_direct", false);
    x.d("MicroMsg.MassSendHistoryUI", "isFromSearch  " + this.lbe);
    this.lbf = ((LinearLayout)findViewById(R.h.mass_send_next_ll));
    this.laZ = ((ListView)findViewById(R.h.mass_send_history_list));
    this.laZ.setTranscriptMode(0);
    this.lbd = ((MMPullDownView)findViewById(R.h.mass_send_history_pull_down_view));
    this.lbd.setOnTopLoadDataListener(new MassSendHistoryUI.5(this));
    this.lbd.setTopViewVisible(true);
    this.lbd.setAtBottomCallBack(new MassSendHistoryUI.6(this));
    this.lbd.setAtTopCallBack(new MassSendHistoryUI.7(this));
    this.lbd.setIsBottomShowAll(true);
    this.lba = new c(this);
    this.lba.tlG = new MassSendHistoryUI.8(this);
    this.kwy = findViewById(R.h.mass_send_history_empty_view);
    this.laZ.setAdapter(this.lba);
    this.laZ.setOnItemClickListener(new MassSendHistoryUI.9(this));
    this.laZ.setOnTouchListener(new MassSendHistoryUI.10(this));
    this.lbb = ((Button)findViewById(R.h.mass_send_next));
    this.lbb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent(MassSendHistoryUI.this, MassSendSelectContactUI.class);
        MassSendHistoryUI.this.startActivity(paramAnonymousView);
      }
    });
    this.lbc = ((Button)findViewById(R.h.mass_send_next_two));
    this.lbc.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent(MassSendHistoryUI.this, MassSendSelectContactUI.class);
        MassSendHistoryUI.this.startActivity(paramAnonymousView);
      }
    });
    setBackBtn(new MassSendHistoryUI.2(this));
    addIconOptionMenu(0, R.l.app_set, R.k.actionbar_setting_icon, new MassSendHistoryUI.3(this));
    new k(this).a(this.laZ, this, this.hqV);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.mass_send_helper);
    if (hlW == null) {
      hlW = new SensorController(getApplicationContext());
    }
    initView();
    this.bAW = new com.tencent.mm.e.a.a(this);
    this.bAW.bCU = this;
    this.bAW.bCT = this;
    this.lba.laP = new MassSendHistoryUI.1(this);
    if (this.mController != null) {
      this.mController.ak(3, false);
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    x.v("MicroMsg.MassSendHistoryUI", "onCreateContextMenu");
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenuInfo = ((com.tencent.mm.plugin.masssend.a.a)this.lba.getItem(paramView.position)).bcj().split(";");
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramContextMenuInfo.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramContextMenuInfo[i];
      au.HU();
      localObject = com.tencent.mm.model.c.FR().Yg((String)localObject);
      if (localObject != null) {
        localStringBuilder.append(((ab)localObject).BL() + ";");
      }
      i += 1;
    }
    paramContextMenu.setHeaderTitle(localStringBuilder.toString());
    paramContextMenu.add(paramView.position, 1, 0, getString(R.l.chatting_long_click_menu_delete_msg));
  }
  
  protected void onDestroy()
  {
    this.lba.aYc();
    super.onDestroy();
  }
  
  public final void onError()
  {
    stopPlay();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.lbe) {
        finish();
      }
      for (;;)
      {
        return true;
        paramKeyEvent = new Intent();
        paramKeyEvent.addFlags(67108864);
        com.tencent.mm.plugin.masssend.a.ezn.q(paramKeyEvent, this);
        finish();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    au.HV().yO();
    h.bco().d(this.lba);
    hlW.ciL();
  }
  
  protected void onResume()
  {
    super.onResume();
    h.bco().c(this.lba);
    this.lba.a(null, null);
    this.laZ.setSelection(this.lba.getCount() - 1);
  }
  
  protected final void releaseWakeLock()
  {
    this.laZ.setKeepScreenOn(false);
  }
  
  public final void wd()
  {
    stopPlay();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */