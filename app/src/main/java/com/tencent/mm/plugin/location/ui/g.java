package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.plugin.r.d;

public final class g
  extends FrameLayout
{
  public boolean kES = false;
  private ImageView kFk;
  public d kFl;
  private Context mContext;
  
  public g(Context paramContext, d paramd)
  {
    super(paramContext);
    this.kFl = paramd;
    this.mContext = paramContext;
    this.kFk = ((ImageView)View.inflate(this.mContext, a.f.poi_point, this).findViewById(a.e.point_iv));
  }
  
  public final void remove()
  {
    if (this.kES) {
      this.kFl.removeView(this);
    }
    this.kES = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/location/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */