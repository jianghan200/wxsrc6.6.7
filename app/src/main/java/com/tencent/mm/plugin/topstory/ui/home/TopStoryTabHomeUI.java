package com.tencent.mm.plugin.topstory.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.plugin.topstory.ui.b.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public class TopStoryTabHomeUI
  extends MMActivity
{
  private c ozE = new c(this);
  
  protected final int getLayoutId()
  {
    return b.e.top_story_home_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.TopStory.TopStoryHomeUI", "use TopStoryHomeUI");
    this.ozE.onCreate(paramBundle);
  }
  
  protected void onDestroy()
  {
    this.ozE.onDestroy();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.ozE.yd(paramInt)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    this.ozE.onNewIntent(paramIntent);
    super.onNewIntent(paramIntent);
  }
  
  protected void onPause()
  {
    this.ozE.onPause();
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.ozE.onResume();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    this.ozE.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/home/TopStoryTabHomeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */