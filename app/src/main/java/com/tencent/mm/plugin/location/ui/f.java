package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.h;
import com.tencent.mm.plugin.r.d;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  implements c
{
  public boolean bNu = false;
  private boolean isVisible = true;
  private String kCs;
  private double kCw = 1000000.0D;
  private double kCx = 1000000.0D;
  private boolean kEX = true;
  private View kEY;
  private d kEZ;
  private String kEx = "";
  public String kFa;
  private TextView kFb;
  private TextView kFc;
  public ImageButton kFd;
  
  public f(d paramd, Context paramContext)
  {
    paramContext = ((Activity)paramContext).findViewById(a.e.location_info_frame);
    this.kFb = ((TextView)paramContext.findViewById(a.e.location_info));
    this.kFc = ((TextView)paramContext.findViewById(a.e.location_info_detail));
    this.kFd = ((ImageButton)paramContext.findViewById(a.e.location_navigate_iv));
    this.kEZ = paramd;
    this.kEY = paramContext;
  }
  
  public final String getPreText()
  {
    return this.kEx;
  }
  
  public final void setText(String paramString)
  {
    this.kCs = paramString;
    paramString = this.kCs;
    x.d("NewItemOverlay", "popView " + this.kEY.getWidth() + " " + this.kEY.getHeight());
    if ((paramString != null) && (!paramString.equals(""))) {
      this.kFc.setText(paramString);
    }
    if ((this.kFa != null) && (!this.kFa.equals(""))) {
      this.kFb.setText(this.kFa);
    }
    for (;;)
    {
      if (this.kEX)
      {
        this.kEY.setVisibility(0);
        this.kEY.invalidate();
      }
      return;
      this.kFb.setText(a.h.location_conversation);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/location/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */