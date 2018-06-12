package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(7)
public class GameIpcProxyUI
  extends MMActivity
{
  protected final void ahy()
  {
    int i = getIntent().getIntExtra("orientation", -1);
    if (i != -1) {
      setRequestedOrientation(i);
    }
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.GameIpcProxyUI", "onCreate");
    paramBundle = (GameProcessActivityTask)getIntent().getParcelableExtra("task_object");
    String str = getIntent().getStringExtra("task_id");
    if (paramBundle != null)
    {
      paramBundle.a(this, new GameIpcProxyUI.1(this, paramBundle, str));
      return;
    }
    setResult(1);
    finish();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.GameIpcProxyUI", "onDestroy");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/GameIpcProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */