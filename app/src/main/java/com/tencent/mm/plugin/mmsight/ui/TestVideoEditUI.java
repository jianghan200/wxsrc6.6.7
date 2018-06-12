package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.api.b;
import com.tencent.mm.api.e;
import com.tencent.mm.api.m;
import com.tencent.mm.api.m.a.a;
import com.tencent.mm.api.m.b;
import com.tencent.mm.api.m.c;
import com.tencent.mm.plugin.w.a.d;
import com.tencent.mm.plugin.w.a.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class TestVideoEditUI
  extends MMActivity
  implements e
{
  private m lqK;
  
  protected final int getLayoutId()
  {
    return a.e.test_video_edit_ui;
  }
  
  public void onBackPressed()
  {
    if (!this.lqK.tW()) {
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    fullScreenNoTitleBar(true);
    paramBundle = (FrameLayout)findViewById(a.d.content);
    this.lqK = m.bwV.tY();
    Object localObject = this.lqK;
    m.a.a locala = new m.a.a();
    locala.bwX = false;
    locala.bwZ = true;
    locala.bxa = new Rect(0, 0, 1080, 1080);
    locala.bwW = m.c.bxb;
    ((m)localObject).a(locala.uk());
    localObject = this.lqK.aQ(this.mController.tml);
    ((b)localObject).setActionBarCallback(this);
    paramBundle.addView((View)localObject, new FrameLayout.LayoutParams(-1, -1));
    ((b)localObject).setSelectedFeatureListener(new TestVideoEditUI.1(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.lqK.onDestroy();
  }
  
  public final void onFinish()
  {
    this.lqK.a(new TestVideoEditUI.2(this));
  }
  
  public void onSwipeBack()
  {
    super.onSwipeBack();
  }
  
  public final void ua()
  {
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mmsight/ui/TestVideoEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */