package com.tencent.mm.plugin.topstory.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.plugin.topstory.ui.b.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(1)
public class TopStorySubTaskHomeUI
  extends MMActivity
{
  private b ozv = new b(this, false);
  
  protected final int getLayoutId()
  {
    return b.e.top_story_home_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.TopStory.TopStoryHomeUI", "use TopStoryHomeUI");
    this.ozv.onCreate(paramBundle);
  }
  
  protected void onDestroy()
  {
    this.ozv.onDestroy();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return this.ozv.yd(paramInt);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    this.ozv.onNewIntent(paramIntent);
    super.onNewIntent(paramIntent);
  }
  
  protected void onPause()
  {
    this.ozv.onPause();
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.ozv.onResume();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    this.ozv.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/home/TopStorySubTaskHomeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */