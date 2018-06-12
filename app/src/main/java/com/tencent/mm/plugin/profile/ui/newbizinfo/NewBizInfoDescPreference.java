package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class NewBizInfoDescPreference
  extends Preference
{
  private MMActivity bGc;
  private LinearLayout gxf;
  private boolean iAc;
  private TextView lYA;
  private TextView lYB;
  private TextView lYC;
  private TextView lYD;
  c lYt;
  private LinearLayout lYy;
  private LinearLayout lYz;
  
  public NewBizInfoDescPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  public NewBizInfoDescPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  public final void onBindView(View paramView)
  {
    this.gxf = ((LinearLayout)paramView.findViewById(R.h.bizinfo_desc_layout));
    this.lYy = ((LinearLayout)paramView.findViewById(R.h.bizinfo_desc_layout_1));
    this.lYz = ((LinearLayout)paramView.findViewById(R.h.bizinfo_desc_layout_2));
    this.lYA = ((TextView)paramView.findViewById(R.h.bizinfo_desc_layout_title_1));
    this.lYB = ((TextView)paramView.findViewById(R.h.bizinfo_desc_layout_title_2));
    this.lYC = ((TextView)paramView.findViewById(R.h.bizinfo_desc_layout_desc_1));
    this.lYD = ((TextView)paramView.findViewById(R.h.bizinfo_desc_layout_desc_2));
    this.iAc = true;
    if (!this.iAc)
    {
      x.w("MicroMsg.NewBizInfoDescPreference", "bindView:%b or profileInfo is null, return", new Object[] { Boolean.valueOf(this.iAc) });
      return;
    }
    if (this.lYt == null)
    {
      this.gxf.setVisibility(4);
      return;
    }
    this.gxf.setVisibility(0);
    if (this.lYt.field_originalArticleCount > 0)
    {
      this.lYy.setVisibility(0);
      this.lYA.setText(this.lYt.field_originalArticleCount);
    }
    while (this.lYt.field_friendSubscribeCount > 0)
    {
      this.lYz.setVisibility(0);
      this.lYB.setText(this.lYt.field_friendSubscribeCount);
      return;
      this.lYy.setVisibility(8);
    }
    this.lYz.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoDescPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */