package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.walletlock.a.d;
import com.tencent.mm.plugin.walletlock.a.e;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;

final class a
{
  View mView = null;
  TextView pHA = null;
  TextView pHx = null;
  FrameLayout pHy = null;
  PatternLockView pHz = null;
  
  public a(Activity paramActivity)
  {
    this.mView = View.inflate(paramActivity, a.e.input_pattern_view, null);
    this.pHx = ((TextView)this.mView.findViewById(a.d.tv_info));
    this.pHy = ((FrameLayout)this.mView.findViewById(a.d.pattern_view_wrapper));
    this.pHz = ((PatternLockView)this.mView.findViewById(a.d.pattern_view));
    this.pHA = ((TextView)this.mView.findViewById(a.d.tv_forgotpwd));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */