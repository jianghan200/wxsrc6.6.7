package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.setting.a.d;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;

public class NetStatGroup
  extends LinearLayout
{
  LinearLayout mPY;
  final TextView mPZ;
  
  public NetStatGroup(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NetStatGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    View.inflate(paramContext, a.g.netstat_group, this);
    this.mPY = ((LinearLayout)findViewById(a.f.group));
    this.mPZ = ((TextView)findViewById(a.f.date));
    this.mPZ.setTextSize(0, paramContext.getResources().getDimensionPixelSize(a.d.HintTextSize));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/NetStatGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */