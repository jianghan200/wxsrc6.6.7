package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.m;

public final class PluginTextPreference
  extends Preference
{
  private TextView hND = null;
  private ImageView lWM = null;
  public int tDi;
  private String text;
  private int textColor;
  public int visibility;
  
  public PluginTextPreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PluginTextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PluginTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.h.mm_preference_content_plugin_text);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.PluginTextPreference);
    this.tDi = paramContext.getResourceId(a.m.PluginTextPreference_plugin_icon, 0);
    this.text = paramContext.getString(a.m.PluginTextPreference_plugin_text);
    this.textColor = paramContext.getColor(a.m.PluginTextPreference_plugin_text_color, -7039852);
    paramContext.recycle();
  }
  
  public final void EA(int paramInt)
  {
    this.text = this.mContext.getString(paramInt);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.lWM = ((ImageView)paramView.findViewById(a.g.image_iv));
    this.lWM.setImageResource(this.tDi);
    this.lWM.setVisibility(this.visibility);
    this.hND = ((TextView)paramView.findViewById(a.g.text_tv));
    this.hND.setText(this.text);
    this.hND.setTextColor(this.textColor);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/base/preference/PluginTextPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */