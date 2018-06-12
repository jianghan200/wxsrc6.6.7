package com.tencent.mm.plugin.game.ui.tab;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.bg.d;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.game.f.a;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.GameTabData;
import com.tencent.mm.plugin.game.ui.GameCenterActivity;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.SwipeBackLayout;

@com.tencent.mm.ui.base.a(19)
public class GameTabBridgeUI
  extends GameCenterActivity
{
  private BroadcastReceiver kcU = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if ((paramAnonymousIntent != null) && ("com.tencent.mm.ACTION_EXIT".equals(paramAnonymousIntent.getAction())) && (GameTabBridgeUI.this != null) && (!GameTabBridgeUI.this.isFinishing()))
      {
        x.i("MicroMsg.GameTabBridgeUI", "GameTabBridgeUI exit!");
        GameTabBridgeUI.this.finish();
      }
    }
  };
  
  private void goBack()
  {
    x.i("MicroMsg.GameTabBridgeUI", "GameTabHomeUI goBack!");
    if (bi.oV(getIntent().getStringExtra("jump_find_more_friends")).equals("jump_find_more_friends"))
    {
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      localIntent.putExtra("preferred_tab", 2);
      d.e(this, ".ui.LauncherUI", localIntent);
      finish();
      overridePendingTransition(f.a.slide_left_in, f.a.slide_right_out);
      x.i("MicroMsg.GameTabBridgeUI", "back to FindMoreFriendsUI");
    }
    sendBroadcast(new Intent("com.tencent.mm.ACTION_EXIT"), "com.tencent.mm.permission.MM_MESSAGE");
  }
  
  protected final boolean aUL()
  {
    return false;
  }
  
  public final int aUM()
  {
    return 0;
  }
  
  public final int aUN()
  {
    return 0;
  }
  
  public final int aUO()
  {
    return 0;
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_bridge_layout;
  }
  
  protected final void initView()
  {
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GameTabBridgeUI.a(GameTabBridgeUI.this);
        return true;
      }
    });
    setMMTitle(f.i.game_wechat_game);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.GameTabBridgeUI", "%s create", new Object[] { getClass().getSimpleName() });
    GameTabWidget.kda = hashCode();
    initView();
    paramBundle = new IntentFilter();
    paramBundle.addAction("com.tencent.mm.ACTION_EXIT");
    registerReceiver(this.kcU, paramBundle, "com.tencent.mm.permission.MM_MESSAGE", null);
    paramBundle = getIntent();
    GameTabData localGameTabData = (GameTabData)paramBundle.getParcelableExtra("tab_data");
    String str = paramBundle.getStringExtra("tab_key");
    GameTabWidget localGameTabWidget = (GameTabWidget)findViewById(f.e.tabwidget);
    a locala = new a(this);
    localGameTabWidget.setAdapter(locala);
    locala.a(localGameTabData, str);
    paramBundle.setComponent((ComponentName)paramBundle.getParcelableExtra("next_tab_component"));
    f.a("com.tencent.mm:tools", null, GameTabWidget.a.class, new GameTabBridgeUI.1(this, System.currentTimeMillis(), paramBundle));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    unregisterReceiver(this.kcU);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (getSwipeBackLayout() != null) {
      getSwipeBackLayout().setEnableGesture(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/tab/GameTabBridgeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */