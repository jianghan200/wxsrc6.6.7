package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.ui.base.preference.Preference;

public class GameRegionPreference
  extends Preference
{
  a kbx;
  
  public GameRegionPreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public GameRegionPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public GameRegionPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(f.f.mm_preference);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(f.e.region_name);
    paramView = (CheckBox)paramView.findViewById(f.e.state_icon);
    if ((localTextView != null) && (paramView != null) && (this.kbx != null))
    {
      localTextView.setText(f.a(this.kbx));
      paramView.setChecked(this.kbx.eQK);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(f.e.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(f.f.game_region_select_layout, localViewGroup);
    return paramViewGroup;
  }
  
  public static final class a
  {
    public String csQ;
    public boolean eQK;
    public boolean isDefault;
    public String kbA;
    public String kby;
    public String kbz;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameRegionPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */