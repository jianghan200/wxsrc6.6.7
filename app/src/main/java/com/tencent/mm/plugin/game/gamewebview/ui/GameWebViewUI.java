package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.model.a;
import com.tencent.mm.plugin.game.model.GameFloatLayerInfo;
import com.tencent.mm.plugin.game.model.GameWebViewLaunchParams;
import com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public class GameWebViewUI
  extends MMActivity
{
  protected c jIE;
  protected int jKA = -1;
  private boolean jKB;
  private boolean jKC;
  GameSettingParams jKD;
  
  private boolean aTt()
  {
    return getIntent().getBooleanExtra("from_shortcut", false);
  }
  
  private void d(final Intent paramIntent, boolean paramBoolean)
  {
    x.d("MicroMsg.GameWebViewUI", "loadIntent: " + System.currentTimeMillis());
    setIntent(paramIntent);
    this.jIE.c(paramIntent, paramBoolean);
    this.jKA = paramIntent.getIntExtra("screen_orientation", -1);
    paramIntent.setExtrasClassLoader(GameWebViewLaunchParams.class.getClassLoader());
    paramIntent = (GameWebViewLaunchParams)paramIntent.getParcelableExtra("launchParams");
    if (paramIntent != null)
    {
      paramIntent = paramIntent.jOv;
      if (paramIntent != null) {
        new Handler().postDelayed(new Runnable()
        {
          public final void run()
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", paramIntent.url);
            localIntent.putExtra("show_full_screen", paramIntent.jMc);
            localIntent.putExtra("screen_orientation", paramIntent.orientation);
            localIntent.putExtra("transparent_page", true);
            localIntent.putExtra("needAnimation", false);
            GameWebViewUI.a(GameWebViewUI.this, localIntent);
          }
        }, 200L);
      }
    }
    if (aTt())
    {
      com.tencent.mm.plugin.game.gamewebview.a.d.jdMethod_do(this.mController.tml);
      return;
    }
    com.tencent.mm.plugin.game.gamewebview.a.d.dp(this.mController.tml);
  }
  
  public final void L(final Intent paramIntent)
  {
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GameWebViewUI.a(GameWebViewUI.this, paramIntent);
      }
    });
  }
  
  protected final void ahy()
  {
    if (this.jKA != -1)
    {
      setRequestedOrientation(this.jKA);
      return;
    }
    this.tlM = getSharedPreferences(ad.chY(), 4).getBoolean("settings_landscape_mode", false);
    if (this.tlM)
    {
      setRequestedOrientation(-1);
      return;
    }
    setRequestedOrientation(1);
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected void initView()
  {
    FrameLayout localFrameLayout = new FrameLayout(this);
    localFrameLayout.setBackgroundResource(17170443);
    localFrameLayout.setId(R.h.game_btn_container);
    setContentView(localFrameLayout);
    this.jIE = new c(this);
    this.jIE.setBackgroundResource(17170443);
    this.jIE.setId(R.h.game_container);
    localFrameLayout.addView(this.jIE);
    d(getIntent(), true);
  }
  
  public final boolean noActionBar()
  {
    return true;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject;
    if (this.jIE != null)
    {
      localObject = (b)this.jIE.jII.peek();
      if (localObject == null) {
        break label132;
      }
      localObject = ((b)localObject).getPageView();
      if ((((d)localObject).jJr == null) || (!((d)localObject).jJr.b(((d)localObject).jIJ, paramInt1, paramInt2, paramIntent))) {
        break label75;
      }
      paramInt1 = 1;
    }
    for (;;)
    {
      if (paramInt1 != 0) {}
      return;
      label75:
      if (((d)localObject).jIU != null)
      {
        localObject = ((d)localObject).jIU;
        if (((e)localObject).jKe != null) {}
        for (boolean bool = ((e)localObject).jKe.onActivityResult(paramInt1, paramInt2, paramIntent);; bool = false)
        {
          if (!bool) {
            break label127;
          }
          paramInt1 = 1;
          break;
        }
      }
      label127:
      paramInt1 = 0;
      continue;
      label132:
      paramInt1 = 0;
    }
  }
  
  public void onBackPressed()
  {
    this.jIE.fp(true);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.GameWebViewUI", "onCreate");
    if (Build.VERSION.SDK_INT >= 11) {
      getWindow().setFlags(16777216, 16777216);
    }
    getWindow().setFormat(-3);
    paramBundle = new CommonLogicTask();
    paramBundle.type = 10;
    paramBundle.jGe = new Runnable()
    {
      public final void run()
      {
        paramBundle.ahB();
        paramBundle.jfZ.setClassLoader(GameSettingParams.class.getClassLoader());
        GameWebViewUI.a(GameWebViewUI.this, (GameSettingParams)paramBundle.jfZ.getParcelable("game_setting_params"));
        GameWebViewUI.a(GameWebViewUI.this);
      }
    };
    paramBundle.ahA();
    GameWebViewMainProcessService.a(paramBundle);
    this.jKB = getIntent().getBooleanExtra("disable_swipe_back", false);
    initView();
  }
  
  protected final void onCreateBeforeSetContentView()
  {
    super.onCreateBeforeSetContentView();
    getWindow().requestFeature(10);
    getWindow().getDecorView().setFitsSystemWindows(true);
    supportRequestWindowFeature(10);
    supportRequestWindowFeature(1);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.GameWebViewUI", "onDestroy");
    a.cleanup();
    this.jIE.cleanup();
    System.gc();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.jIE.onKeyDown(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    x.i("MicroMsg.GameWebViewUI", "onNewIntent: " + System.currentTimeMillis());
    d(paramIntent, false);
  }
  
  public void onPause()
  {
    super.onPause();
    x.i("MicroMsg.GameWebViewUI", "onPause");
    b localb = (b)this.jIE.jII.peek();
    if (localb != null) {
      localb.fo(true);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    x.i("MicroMsg.GameWebViewUI", "onResume");
    if (getSwipeBackLayout() != null)
    {
      if (!this.jKB) {
        break label61;
      }
      getSwipeBackLayout().setEnableGesture(false);
    }
    for (;;)
    {
      ahy();
      b localb = (b)this.jIE.jII.peek();
      if (localb != null) {
        localb.agE();
      }
      return;
      label61:
      getSwipeBackLayout().setEnableGesture(this.jKC);
    }
  }
  
  public final void qO(int paramInt)
  {
    if (this.jKB) {}
    while (getSwipeBackLayout() == null) {
      return;
    }
    if ((aTt()) || (paramInt > 1))
    {
      this.jKC = false;
      getSwipeBackLayout().setEnableGesture(false);
      return;
    }
    this.jKC = true;
    getSwipeBackLayout().setEnableGesture(true);
  }
  
  public final void qP(int paramInt)
  {
    this.jKA = paramInt;
    ahy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/GameWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */