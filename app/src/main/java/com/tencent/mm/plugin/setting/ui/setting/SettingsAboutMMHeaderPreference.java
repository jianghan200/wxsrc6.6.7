package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.ui.base.preference.Preference;

public class SettingsAboutMMHeaderPreference
  extends Preference
{
  public String mQR = "";
  
  public SettingsAboutMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SettingsAboutMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(a.f.about_version_code);
    localTextView.setText(String.format("%s %s", new Object[] { paramView.getResources().getString(a.i.app_name), this.mQR }));
    localTextView.setOnClickListener(new SettingsAboutMMHeaderPreference.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */