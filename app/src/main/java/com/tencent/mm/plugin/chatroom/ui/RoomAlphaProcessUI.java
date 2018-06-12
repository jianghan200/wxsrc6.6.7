package com.tencent.mm.plugin.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;

@a(3)
@Deprecated
public class RoomAlphaProcessUI
  extends MMActivity
  implements a.a
{
  private String chatroomName;
  
  private static void w(Runnable paramRunnable)
  {
    new ag().postDelayed(paramRunnable, 200L);
  }
  
  public final int getLayoutId()
  {
    return -1;
  }
  
  public final void h(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean)
    {
      h.bA(this, getString(R.l.room_upgrade_success));
      w(new RoomAlphaProcessUI.1(this, paramBoolean, paramInt));
      return;
    }
    h.a(this, getString(R.l.room_upgrade_result_failed), "", null);
    w(new RoomAlphaProcessUI.2(this, paramBoolean));
  }
  
  protected final void initView() {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.chatroomName = getIntent().getStringExtra("RoomInfo_Id");
    paramBundle = new com.tencent.mm.plugin.chatroom.d.o(this.chatroomName);
    a.2 local2 = new a.2(h.a(this, getString(R.l.loading_tips), false, new a.1()), this, this);
    au.DF().a(482, local2);
    au.DF().a(paramBundle, 0);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/RoomAlphaProcessUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */