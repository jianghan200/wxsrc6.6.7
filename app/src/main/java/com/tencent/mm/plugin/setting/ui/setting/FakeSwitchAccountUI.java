package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@a(3)
public class FakeSwitchAccountUI
  extends MMActivity
{
  private int cXC;
  private int count;
  private String country;
  private String eSe;
  private SwitchAccountGridView mPR;
  private View mPS;
  private View mPT;
  private ArrayList<SwitchAccountModel> mPU;
  private Map<String, SwitchAccountModel> mPV = new HashMap();
  private al mPW;
  
  private int btt()
  {
    Object localObject = (ActivityManager)getSystemService("activity");
    try
    {
      localObject = ((ActivityManager)localObject).getRunningAppProcesses().iterator();
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      } while (!localRunningAppProcessInfo.processName.equals("com.tencent.mm"));
      x.i("MicroMsg.FakeSwitchAccountUI", "process %s, %s", new Object[] { localRunningAppProcessInfo.processName, Integer.valueOf(localRunningAppProcessInfo.pid) });
      int i = localRunningAppProcessInfo.pid;
      return i;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.FakeSwitchAccountUI", "isMMProcessExist Exception: " + localException.toString());
      return 0;
    }
    catch (Error localError)
    {
      for (;;)
      {
        x.e("MicroMsg.FakeSwitchAccountUI", "isMMProcessExist Error: " + localError.toString());
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.settings_switch_account;
  }
  
  protected final void initView()
  {
    x.i("MicroMsg.FakeSwitchAccountUI", "FakeSwitchAccount onCreate");
    setMMTitle("");
    getSupportActionBar().hide();
    this.mPR = ((SwitchAccountGridView)findViewById(a.f.switch_account_grid));
    this.mPR.setRowCount(1);
    this.mPR.setClickable(false);
    this.cXC = getIntent().getIntExtra("key_mm_process_pid", 0);
    this.eSe = getIntent().getStringExtra("key_switch_from_wx_username");
    x.i("MicroMsg.FakeSwitchAccountUI", "title %s", new Object[] { getResources().getString(a.i.settings_switch_account_login_title) });
    this.mPU = getIntent().getParcelableArrayListExtra("key_switch_account_users");
    if (this.mPU != null)
    {
      Iterator localIterator = this.mPU.iterator();
      while (localIterator.hasNext())
      {
        SwitchAccountModel localSwitchAccountModel = (SwitchAccountModel)localIterator.next();
        this.mPV.put(localSwitchAccountModel.mOP, localSwitchAccountModel);
      }
    }
    this.mPS = findViewById(a.f.switch_account_delete_btn);
    this.mPS.setVisibility(8);
    this.mPT = findViewById(a.f.switch_account_cancel_btn);
    this.mPT.setVisibility(8);
    x.i("MicroMsg.FakeSwitchAccountUI", "account count %d", new Object[] { Integer.valueOf(this.mPV.size()) });
    this.mPR.setUseSystemDecoder(true);
    this.mPR.L(this.mPV);
    this.mPR.setLastLoginWxUsername(this.eSe);
    this.mPR.setLogoutState(true);
    this.mPR.bum();
    this.mPW = new al(Looper.myLooper(), new FakeSwitchAccountUI.1(this), true);
    if (this.mPW != null) {
      this.mPW.J(1500L, 500L);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.country = getIntent().getStringExtra("key_langauage_code");
    if (!bi.oW(this.country))
    {
      x.i("MicroMsg.FakeSwitchAccountUI", "country %s", new Object[] { this.country });
      be.setProperty("language_key", this.country);
      s.bw(ad.getContext(), this.country);
    }
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.FakeSwitchAccountUI", "fake switch account destroy");
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    x.i("MicroMsg.FakeSwitchAccountUI", "fake switch account resume");
  }
  
  protected void onStop()
  {
    super.onStop();
    x.i("MicroMsg.FakeSwitchAccountUI", "fake switch account stop");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/FakeSwitchAccountUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */