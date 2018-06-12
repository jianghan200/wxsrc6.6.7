package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.m;

public class MMFormSelectorView
  extends LinearLayout
{
  private TextView eCm;
  private String eVC;
  private int layout = -1;
  private Context mContext = null;
  private EditText meN;
  private String title;
  
  public MMFormSelectorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  @TargetApi(11)
  public MMFormSelectorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.FormItemView, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(a.m.FormItemView_form_title, 0);
    if (paramInt != 0) {
      this.title = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(a.m.FormItemView_form_hint, 0);
    if (paramInt != 0) {
      this.eVC = paramContext.getString(paramInt);
    }
    this.layout = paramAttributeSet.getResourceId(a.m.FormItemView_form_layout, this.layout);
    paramAttributeSet.recycle();
    inflate(paramContext, this.layout, this);
    this.mContext = paramContext;
  }
  
  public String getText()
  {
    if (this.meN != null) {
      return this.meN.getText().toString();
    }
    x.e("MicroMsg.MMFormSelectorView", "contentET is null!");
    return null;
  }
  
  public void onFinishInflate()
  {
    this.eCm = ((TextView)findViewById(a.g.title));
    this.meN = ((EditText)findViewById(a.g.edittext));
    if ((this.eCm == null) || (this.meN == null)) {
      x.w("MicroMsg.MMFormSelectorView", "titleTV : %s, contentET : %s", new Object[] { this.eCm, this.meN });
    }
    do
    {
      return;
      if (this.title != null) {
        this.eCm.setText(this.title);
      }
    } while (this.eVC == null);
    this.meN.setHint(this.eVC);
  }
  
  public void setHint(int paramInt)
  {
    if (this.meN != null)
    {
      this.meN.setHint(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormSelectorView", "contentET is null!");
  }
  
  public void setHint(String paramString)
  {
    if (this.meN != null)
    {
      this.meN.setHint(paramString);
      return;
    }
    x.e("MicroMsg.MMFormSelectorView", "contentET is null!");
  }
  
  public void setText(String paramString)
  {
    if (this.meN != null)
    {
      this.meN.setText(paramString);
      return;
    }
    x.e("MicroMsg.MMFormSelectorView", "contentET is null!");
  }
  
  public void setTitle(int paramInt)
  {
    if (this.eCm != null)
    {
      this.eCm.setText(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormSelectorView", "titleTV is null!");
  }
  
  public void setTitle(String paramString)
  {
    if (this.eCm != null)
    {
      this.eCm.setText(paramString);
      return;
    }
    x.e("MicroMsg.MMFormSelectorView", "titleTV is null!");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/MMFormSelectorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */