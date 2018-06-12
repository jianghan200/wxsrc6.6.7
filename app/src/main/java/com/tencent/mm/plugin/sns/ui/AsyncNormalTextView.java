package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.List;

public class AsyncNormalTextView
  extends CollapsibleTextView
{
  public String content;
  private Context context;
  private a.c nLr;
  public int nLs = 0;
  public ay nLt;
  public av nuc;
  
  public AsyncNormalTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }
  
  public final void bBM()
  {
    Object localObject1;
    if (!bi.oW(this.content))
    {
      System.currentTimeMillis();
      setVisibility(0);
      if (this.nLs != 1) {
        break label215;
      }
      if (this.content.length() <= 100) {
        break label207;
      }
      localObject1 = this.content.substring(0, 100) + "...";
      this.content = ((String)localObject1);
      localObject1 = new SpannableStringBuilder(j.a(this.context, this.content, this.nMn.getTextSize()));
      a(this.nLs, (CharSequence)localObject1, TextView.BufferType.NORMAL, this.nuc.nMs, this.nLt.nMU, this.nLt.oev, this.nuc, this.content, this.nLt.nLv);
    }
    for (;;)
    {
      localObject1 = new as(this.nLt.oev, this.nLt.nMU, false, false, 1);
      this.nMn.setTag(localObject1);
      if (this.nMo != null) {
        this.nMo.setTag(localObject1);
      }
      this.nMp.setTag(this.nLr);
      return;
      label207:
      localObject1 = this.content;
      break;
      label215:
      if ((this.content.length() < 400) || (this.nLt.nLv))
      {
        localObject1 = null;
        if (this.nLt != null) {
          localObject1 = this.nLt.oet;
        }
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new SpannableStringBuilder(j.a(this.context, this.content, this.nMn.getTextSize()));
        }
        if (this.nLt != null) {
          a(this.nLs, (CharSequence)localObject2, TextView.BufferType.SPANNABLE, this.nuc.nMs, this.nLt.nMU, this.nLt.oev, this.nuc, this.content, this.nLt.nLv);
        }
      }
      else
      {
        a(this.nLs, this.content, TextView.BufferType.NORMAL, this.nuc.nMs, this.nLt.nMU, this.nLt.oev, this.nuc, this.content, this.nLt.nLv);
      }
    }
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setText(this.content);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.getText().add(this.content);
  }
  
  public void setContentWidth(int paramInt)
  {
    if (this.nMo != null)
    {
      this.nMn.setSpecialWidth(paramInt);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(paramInt, -2);
      this.nMo.setLayoutParams(localLayoutParams);
      this.nMn.setLayoutParams(localLayoutParams);
      this.nMp.setLayoutParams(localLayoutParams);
    }
  }
  
  public void setShow(a.c paramc)
  {
    this.nLr = paramc;
    bBM();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/AsyncNormalTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */