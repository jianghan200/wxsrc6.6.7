package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.m;
import android.support.v4.app.q;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.permission.a;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.chatting.b.c;

@SuppressLint({"DefaultLocale", "ValidFragment"})
@TargetApi(11)
public class ChattingUI
  extends MMFragmentActivity
{
  public ag tGH = new ag();
  public com.tencent.mm.ui.x tLY;
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI", "chatting ui dispatch key event %s", new Object[] { paramKeyEvent });
    if ((this.tLY != null) && (this.tLY.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    getWindow().setFormat(-2);
    e.N(this);
    super.onCreate(null);
    if (c.av(getIntent()))
    {
      finish();
      return;
    }
    setContentView(R.i.chattingui_activity_container);
    this.tLY = new y((byte)0);
    paramBundle = getIntent().getExtras();
    paramBundle.putBoolean("FROM_CHATTING_ACTIVITY", true);
    this.tLY.setArguments(paramBundle);
    getSupportFragmentManager().bk().a(R.h.mm_root_view, this.tLY).commit();
    getSupportActionBar().show();
    if (getIntent().getBooleanExtra("resend_fail_messages", false))
    {
      ah.i(new ChattingUI.1(this), 500L);
      getIntent().putExtra("is_need_resend_sns", false);
    }
    a.Vj().Vk();
    initNavigationSwipeBack();
    this.tGH.post(new Runnable()
    {
      public final void run()
      {
        if (ChattingUI.this.tLY != null) {
          e.a(ChattingUI.this, ChattingUI.this.tLY.getBodyView());
        }
        b.bu(ChattingUI.this.tLY.getContext());
      }
    });
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI", "chatting ui on key down, %d, %s", new Object[] { Integer.valueOf(paramInt), paramKeyEvent });
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI", "chatting ui on key up");
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI", "chatting onRequestPermissionsResult");
    this.tLY.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/ChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */