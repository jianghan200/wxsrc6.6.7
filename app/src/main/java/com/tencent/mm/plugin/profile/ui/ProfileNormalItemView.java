package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;
import com.tencent.mm.pluginsdk.ui.ProfileItemView;
import com.tencent.mm.sdk.platformtools.bi;

public class ProfileNormalItemView
  extends ProfileItemView
{
  private String cZH;
  private TextView gsY;
  TextView lSk;
  CharSequence lXS;
  View.OnClickListener lXT;
  
  public ProfileNormalItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.ProfileNormalItemView);
    this.cZH = paramContext.getString(R.n.ProfileNormalItemView_title);
    paramContext.recycle();
  }
  
  public ProfileNormalItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final boolean bnH()
  {
    this.gsY.setText(this.cZH);
    if (bi.K(this.lXS))
    {
      setVisibility(8);
      return false;
    }
    setVisibility(0);
    this.lSk.setText(this.lXS);
    setOnClickListener(this.lXT);
    return true;
  }
  
  public int getLayout()
  {
    return R.i.profile_normal_item_layout;
  }
  
  public final void init()
  {
    this.gsY = ((TextView)findViewById(R.h.contact_normal_item_title));
    this.lSk = ((TextView)findViewById(R.h.contact_normal_item_summary));
  }
  
  public final ProfileNormalItemView uM(int paramInt)
  {
    this.cZH = getContext().getString(paramInt);
    return this;
  }
  
  public final ProfileNormalItemView uN(int paramInt)
  {
    this.lXS = getContext().getString(paramInt);
    return this;
  }
  
  public final ProfileNormalItemView uO(int paramInt)
  {
    this.lSk.setTextColor(paramInt);
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/ProfileNormalItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */