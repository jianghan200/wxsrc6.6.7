package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public class RoomCardPreference
  extends Preference
{
  public boolean bIq = false;
  public CharSequence fyL;
  private LinearLayout gxf;
  private TextView qPr;
  public CharSequence qPs;
  
  public RoomCardPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public RoomCardPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    paramView = (ViewGroup)paramView.findViewById(R.h.content).findViewById(R.h.real_content);
    if (this.gxf == null) {
      this.gxf = ((LinearLayout)paramView.getChildAt(1));
    }
    if (this.qPr == null) {
      this.qPr = ((TextView)paramView.findViewById(R.h.room_info_notice));
    }
    if (this.bIq)
    {
      this.gxf.setVisibility(0);
      this.qPr.setVisibility(0);
    }
    for (;;)
    {
      if (this.qPs != null) {
        this.qPr.setText(this.qPs);
      }
      return;
      this.gxf.setVisibility(8);
      this.qPr.setVisibility(8);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localViewGroup.setPadding(0, 0, 0, 0);
    View.inflate(this.mContext, R.i.mm_preference_roominfo, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/preference/RoomCardPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */