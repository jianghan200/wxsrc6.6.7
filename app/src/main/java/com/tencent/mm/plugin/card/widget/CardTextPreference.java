package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.ui.base.preference.Preference;

public class CardTextPreference
  extends Preference
{
  private TextView Wx;
  private TextView hIY;
  public int hIZ = 0;
  boolean hJa = true;
  Context mContext;
  
  public CardTextPreference(Context paramContext)
  {
    super(paramContext, null);
    this.mContext = paramContext;
  }
  
  public CardTextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setLayoutResource(a.e.mm_preference);
    this.mContext = paramContext;
  }
  
  public CardTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
  }
  
  private void dU(boolean paramBoolean)
  {
    TextView localTextView;
    Rect localRect;
    if (this.Wx != null)
    {
      localTextView = this.Wx;
      localRect = new Rect();
      localRect.left = localTextView.getPaddingLeft();
      localRect.right = localTextView.getPaddingRight();
      localRect.top = localTextView.getPaddingTop();
      localRect.bottom = localTextView.getPaddingBottom();
      this.Wx.setSingleLine(paramBoolean);
      if (!paramBoolean)
      {
        localRect.top = this.mContext.getResources().getDimensionPixelOffset(a.b.LargePadding);
        localRect.bottom = this.mContext.getResources().getDimensionPixelOffset(a.b.LargePadding);
        localTextView = this.Wx;
        if (localTextView != null) {
          break label108;
        }
      }
    }
    return;
    label108:
    localTextView.setPadding(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  public final void azV()
  {
    if ((this.hIY != null) && (this.hIZ != 0)) {
      this.hIY.setTextColor(this.hIZ);
    }
  }
  
  public final void azW()
  {
    dU(false);
    this.hJa = false;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.hIY = ((TextView)paramView.findViewById(16908304));
    this.Wx = ((TextView)paramView.findViewById(16908310));
    azV();
    dU(this.hJa);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/widget/CardTextPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */