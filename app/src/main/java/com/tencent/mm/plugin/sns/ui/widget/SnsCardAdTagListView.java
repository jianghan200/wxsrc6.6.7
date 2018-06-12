package com.tencent.mm.plugin.sns.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.List;

public class SnsCardAdTagListView
  extends LinearLayout
{
  private Activity activity;
  private List<View> nWx = new ArrayList();
  private int omV;
  
  public SnsCardAdTagListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SnsCardAdTagListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void cw(List<String> paramList)
  {
    int i;
    if (paramList != null)
    {
      i = 0;
      if (i < paramList.size()) {
        if (i != 0) {
          break label132;
        }
      }
    }
    label132:
    for (int j = 0;; j = 1)
    {
      String str = (String)paramList.get(i);
      if (!bi.oW(str))
      {
        View localView = this.activity.getLayoutInflater().inflate(i.g.ad_card_tag_item, null);
        TextView localTextView = (TextView)localView.findViewById(i.f.card_ad_tag_text);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (j != 0) {
          localLayoutParams.leftMargin = this.omV;
        }
        localTextView.setText(str);
        addView(localView, localLayoutParams);
        this.nWx.add(localView);
      }
      i += 1;
      break;
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt2 = 0;
    paramInt1 = 0;
    int i = paramInt1;
    if (paramInt1 < this.nWx.size())
    {
      if (paramInt1 <= 0) {
        break label209;
      }
      paramInt2 += this.omV;
    }
    label48:
    label209:
    for (;;)
    {
      if (paramInt2 >= getMeasuredWidth()) {
        i = paramInt1 - 1;
      }
      for (;;)
      {
        if ((i >= 0) && (i < this.nWx.size()))
        {
          View localView = (View)this.nWx.get(i);
          TextView localTextView = (TextView)localView.findViewById(i.f.card_ad_tag_text);
          localTextView.setEllipsize(TextUtils.TruncateAt.END);
          getViewTreeObserver().addOnPreDrawListener(new SnsCardAdTagListView.1(this, localTextView, localView));
          paramInt1 = i + 1;
          for (;;)
          {
            if (paramInt1 < this.nWx.size())
            {
              removeView((View)this.nWx.get(paramInt1));
              this.nWx.remove(paramInt1);
              paramInt1 += 1;
              continue;
              paramInt2 = ((View)this.nWx.get(paramInt1)).getMeasuredWidth() + paramInt2;
              i = paramInt1;
              if (paramInt2 >= getMeasuredWidth()) {
                break label48;
              }
              paramInt1 += 1;
              break;
            }
          }
        }
      }
      return;
    }
  }
  
  public void removeAllViews()
  {
    super.removeAllViews();
    this.nWx.clear();
  }
  
  public void setActivityContext(Activity paramActivity)
  {
    this.activity = paramActivity;
  }
  
  public void setTagSpace(int paramInt)
  {
    this.omV = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/widget/SnsCardAdTagListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */