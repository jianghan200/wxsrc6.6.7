package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.r;

public class AccountInfoPreference
  extends Preference
{
  public SpannableString qOo;
  public String qOp;
  private int qOq;
  public View.OnClickListener qOr = null;
  public String userName;
  
  public AccountInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AccountInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(R.h.avatar_iv);
    if ((this.userName != null) && (localObject != null) && (g.Eg().Dx())) {
      a.b.a((ImageView)localObject, this.userName);
    }
    NoMeasuredTextView localNoMeasuredTextView = (NoMeasuredTextView)paramView.findViewById(R.h.nick_name_tv);
    if ((this.userName != null) && (localNoMeasuredTextView != null))
    {
      localNoMeasuredTextView.setShouldEllipsize(true);
      localNoMeasuredTextView.setTextSize(0, com.tencent.mm.bp.a.ad(this.mContext, R.f.NormalTextSize));
      localNoMeasuredTextView.setTextColor(com.tencent.mm.bp.a.ac(this.mContext, R.e.normal_text_color));
      if (this.qOo == null)
      {
        localObject = this.userName;
        localNoMeasuredTextView.setText((CharSequence)localObject);
      }
    }
    else
    {
      localObject = (TextView)paramView.findViewById(R.h.user_name_tv);
      if ((this.qOp == null) || (localObject == null)) {
        break label252;
      }
      ((TextView)localObject).setText(paramView.getResources().getString(R.l.app_account, new Object[] { this.qOp }));
      label165:
      localObject = (TextView)paramView.findViewById(R.h.right_prospect);
      if (localObject != null)
      {
        if (this.qOq <= 99) {
          break label265;
        }
        ((TextView)localObject).setText(this.mContext.getString(R.l.tab_msg_tip_over));
        ((TextView)localObject).setBackgroundResource(r.hd(this.mContext));
        ((TextView)localObject).setVisibility(0);
      }
    }
    for (;;)
    {
      if (this.qOr != null) {
        ((ImageView)paramView.findViewById(R.h.account_info_qr_code)).setOnClickListener(this.qOr);
      }
      return;
      localObject = this.qOo;
      break;
      label252:
      if (localObject == null) {
        break label165;
      }
      ((TextView)localObject).setVisibility(8);
      break label165;
      label265:
      if (this.qOq > 0)
      {
        ((TextView)localObject).setText(this.qOq);
        ((TextView)localObject).setVisibility(0);
      }
      else
      {
        ((TextView)localObject).setVisibility(8);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */