package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;

public class VcardContactUserHeaderPreference
  extends Preference
{
  String bgn;
  private final Context context;
  String mGD;
  private ImageView mMu;
  private TextView mMv;
  private TextView mMw;
  private TextView mMx;
  private TextView mMy;
  String mMz;
  String title;
  
  public VcardContactUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }
  
  public VcardContactUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    x.e("MicroMsg.scanner.VcardContactUserHeaderPreference", "onbindview");
    this.mMu = ((ImageView)paramView.findViewById(R.h.vcontact_info_avatar_iv));
    this.mMv = ((TextView)paramView.findViewById(R.h.vcontact_info_name_tv));
    if (this.mMz != null) {
      this.mMv.setText(this.mMz);
    }
    this.mMw = ((TextView)paramView.findViewById(R.h.vcontact_info_nickname_tv));
    if (this.bgn != null)
    {
      this.mMw.setText(this.context.getString(R.l.v_contact_nick_name, new Object[] { this.bgn }));
      this.mMw.setVisibility(0);
    }
    this.mMx = ((TextView)paramView.findViewById(R.h.vcontact_info_role_tv));
    if (this.mGD != null)
    {
      this.mMx.setText(this.context.getString(R.l.v_contact_role, new Object[] { this.mGD }));
      this.mMx.setVisibility(0);
    }
    this.mMy = ((TextView)paramView.findViewById(R.h.vcontact_info_title_tv));
    if (this.title != null)
    {
      this.mMy.setText(this.context.getString(R.l.v_contact_tile, new Object[] { this.title }));
      this.mMy.setVisibility(0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/VcardContactUserHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */