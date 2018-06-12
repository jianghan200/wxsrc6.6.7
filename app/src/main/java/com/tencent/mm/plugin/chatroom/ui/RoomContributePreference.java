package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.preference.Preference;

public class RoomContributePreference
  extends Preference
{
  private ImageView eBM;
  private MaskLayout hNB;
  private String hNC;
  
  public RoomContributePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public RoomContributePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
    setWidgetLayoutResource(R.i.mm_preference_image_right);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if ((this.eBM != null) && (!bi.oW(this.hNC))) {
      a.b.a(this.eBM, this.hNC);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    this.hNB = ((MaskLayout)paramViewGroup.findViewById(R.h.image_mask));
    this.eBM = ((ImageView)paramViewGroup.findViewById(R.h.image));
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/RoomContributePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */