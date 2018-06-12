package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.preference.Preference;

public class PersonalPreference
  extends Preference
{
  private String bWI;
  private String cCR;
  Bitmap dHf = null;
  private TextView eMf = null;
  ImageView jev = null;
  private TextView mQc = null;
  int mQd = -1;
  String mQe = null;
  private View.OnClickListener mQf;
  private String username;
  
  public PersonalPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PersonalPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.g.mm_preference);
    setWidgetLayoutResource(a.g.mm_preference_submenu);
  }
  
  public final void onBindView(View paramView)
  {
    if (this.jev == null) {
      this.jev = ((ImageView)paramView.findViewById(a.f.image_iv));
    }
    if (this.dHf != null)
    {
      this.jev.setImageBitmap(this.dHf);
      this.jev.setOnClickListener(this.mQf);
      if ((this.eMf != null) && (this.bWI != null)) {
        this.eMf.setText(j.a(this.mContext, this.bWI, this.eMf.getTextSize()));
      }
      if (this.mQc != null) {
        if (!bi.oW(this.cCR)) {
          break label222;
        }
      }
    }
    label222:
    for (String str = this.username;; str = this.cCR)
    {
      if ((bi.oW(this.cCR)) && (ab.XT(this.username))) {
        this.mQc.setVisibility(8);
      }
      this.mQc.setText(this.mContext.getString(a.i.app_field_username) + str);
      super.onBindView(paramView);
      return;
      if (this.mQd > 0)
      {
        this.jev.setImageResource(this.mQd);
        break;
      }
      if (this.mQe == null) {
        break;
      }
      a.b.a(this.jev, this.mQe);
      break;
    }
  }
  
  public final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.g.mm_preference_content_personal, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/PersonalPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */