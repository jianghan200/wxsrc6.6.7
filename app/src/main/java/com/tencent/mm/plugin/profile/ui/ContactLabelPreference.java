package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.MMSingelLinePanel;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.ArrayList;

public class ContactLabelPreference
  extends Preference
{
  private TextView eBO;
  private MMSingelLinePanel lUM;
  private ArrayList<String> lUN = new ArrayList();
  private String title;
  
  public ContactLabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public ContactLabelPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
  }
  
  protected final void onBindView(View paramView)
  {
    this.eBO = ((TextView)paramView.findViewById(R.h.title));
    this.lUM = ((MMSingelLinePanel)paramView.findViewById(R.h.contact_label_panel));
    this.lUM.setSingleLine(true);
    this.lUM.txB = false;
    this.lUM.lL(false);
    if (this.eBO != null) {
      this.eBO.setText(this.title);
    }
    if ((this.lUM != null) && (this.lUN != null) && (this.lUN.size() > 0)) {
      this.lUM.a(this.lUN, this.lUN);
    }
    super.onBindView(paramView);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.mm_preference_content_label_info, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/ContactLabelPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */