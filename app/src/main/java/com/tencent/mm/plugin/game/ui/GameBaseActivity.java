package com.tencent.mm.plugin.game.ui;

import android.os.Bundle;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public abstract class GameBaseActivity
  extends MMActivity
{
  private int jUp = 1;
  private long jUq = 0L;
  private long jUr = 0L;
  private long mStartTime = 0L;
  
  public boolean aUL()
  {
    return true;
  }
  
  public abstract int aUM();
  
  public abstract int aUN();
  
  public abstract int aUO();
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    if (this.mStartTime != 0L)
    {
      long l = System.currentTimeMillis() - this.mStartTime;
      x.i("MicroMsg.GameBaseActivity", "visit page(%s), stayTime:%sms, foregroundTime:%sms", new Object[] { getClass().getSimpleName(), Long.valueOf(l), Long.valueOf(this.jUq) });
      if (aUL()) {
        an.a(this.jUp, aUM(), aUN(), aUO(), "", "", l / 1000L, this.jUq / 1000L);
      }
    }
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    this.jUq += System.currentTimeMillis() - this.jUr;
  }
  
  public void onResume()
  {
    if (this.mStartTime == 0L) {
      this.mStartTime = System.currentTimeMillis();
    }
    this.jUr = System.currentTimeMillis();
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */