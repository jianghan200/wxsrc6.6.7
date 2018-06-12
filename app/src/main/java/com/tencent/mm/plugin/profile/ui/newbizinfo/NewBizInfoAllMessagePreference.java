package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class NewBizInfoAllMessagePreference
  extends Preference
{
  private MMActivity bGc;
  private TextView eBO;
  private TextView kxe;
  c lYt;
  private LinearLayout lYx;
  
  public NewBizInfoAllMessagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
  }
  
  public NewBizInfoAllMessagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
  }
  
  public final void onBindView(View paramView)
  {
    this.lYx = ((LinearLayout)paramView.findViewById(R.h.new_bizinfo_message_container));
    this.eBO = ((TextView)paramView.findViewById(R.h.new_bizinfo_message_title));
    this.kxe = ((TextView)paramView.findViewById(R.h.new_bizinfo_message_count));
    if ((this.lYt != null) && (this.lYt.bnO()))
    {
      this.lYx.setVisibility(0);
      this.eBO.setText(this.bGc.getString(R.l.contact_info_biz_all_message_title));
      this.kxe.setText(this.lYt.field_allArticleWording);
      return;
    }
    this.lYx.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoAllMessagePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */