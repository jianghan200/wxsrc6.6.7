package com.tencent.mm.plugin.appbrand.widget.f;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.sdk.platformtools.ag;

public final class a
  extends FrameLayout
  implements View.OnClickListener, c
{
  private TextView gFz;
  private final Runnable gOM = new a.1(this);
  private ViewPropertyAnimator gON;
  ViewPropertyAnimator gOO;
  private final ag mHandler = new ag(Looper.getMainLooper());
  
  public a(Context paramContext)
  {
    super(paramContext);
    LayoutInflater.from(paramContext).inflate(s.h.app_brand_show_no_icon_toast, this, true);
    this.gFz = ((TextView)findViewById(s.g.title));
    setOnClickListener(this);
  }
  
  public final void a(FrameLayout paramFrameLayout)
  {
    paramFrameLayout.addView(this, new FrameLayout.LayoutParams(-2, -2, 17));
  }
  
  public final View getView()
  {
    return this;
  }
  
  public final void onClick(View paramView) {}
  
  public final void wp(String paramString)
  {
    this.gFz.setText(paramString);
    this.mHandler.removeCallbacks(this.gOM);
    this.mHandler.postDelayed(this.gOM, gOS);
    if ((getAlpha() == 1.0F) || (this.gON != null)) {
      return;
    }
    setVisibility(0);
    animate().cancel();
    paramString = animate();
    this.gON = paramString;
    paramString.alpha(1.0F).setListener(new a.2(this)).start();
    setVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */