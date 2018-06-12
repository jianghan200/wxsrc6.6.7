package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;

public final class FriendSnsPreference
  extends IconPreference
{
  private Context context;
  String tiV = null;
  Bitmap tiW = null;
  long tiX;
  
  public FriendSnsPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FriendSnsPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if ((this.tiV != null) && (g.Eg().Dx())) {
      a.b.a(this.kYT, this.tiV);
    }
    if ((this.tiX != 0L) && (this.kYT != null)) {
      ((m)g.l(m.class)).a(this.tiX, this.kYT, this.mContext.hashCode());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/FriendSnsPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */