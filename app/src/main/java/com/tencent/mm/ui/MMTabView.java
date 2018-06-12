package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.a.b;
import com.tencent.mm.ui.tools.r;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.f;
import com.tencent.mm.w.a.i;

public class MMTabView
  extends ViewGroup
{
  private TextView eCm;
  private int index;
  private int padding = 0;
  private TextView tlf;
  private ImageView tnY;
  public int total = 3;
  
  private MMTabView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public MMTabView(Context paramContext, int paramInt)
  {
    this(paramContext);
    this.index = paramInt;
    cqw();
  }
  
  public MMTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public MMTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    this.padding = getResources().getDimensionPixelSize(a.e.SmallestPadding);
    Object localObject = w.chP();
    boolean bool1 = w.chL();
    boolean bool2 = ((String)localObject).equalsIgnoreCase("en");
    if (bool1) {}
    for (int i = (int)(com.tencent.mm.bp.a.fe(getContext()) * com.tencent.mm.bp.a.fromDPToPix(getContext(), 2));; i = 0)
    {
      this.eCm = new TextView(getContext());
      this.eCm.setSingleLine();
      this.eCm.setEllipsize(TextUtils.TruncateAt.END);
      this.eCm.setTextColor(getResources().getColorStateList(a.d.wechat_green));
      this.eCm.setTextSize(0, com.tencent.mm.bp.a.ad(getContext(), a.e.HintTextSize));
      this.eCm.setText("");
      if (bool1)
      {
        localObject = this.eCm;
        float f = this.eCm.getTextSize();
        ((TextView)localObject).setTextSize(0, i + f);
        this.eCm.setTypeface(null, 0);
      }
      for (;;)
      {
        addView(this.eCm);
        this.tnY = new ImageView(getContext());
        this.tnY.setBackgroundResource(a.f.unread_dot_shape);
        this.tnY.setVisibility(4);
        addView(this.tnY);
        this.tlf = new TextView(getContext());
        this.tlf.setTextColor(getResources().getColor(a.d.white));
        this.tlf.setTextSize(1, 11.0F);
        this.tlf.setBackgroundResource(r.hd(getContext()));
        this.tlf.setTypeface(Typeface.DEFAULT_BOLD);
        this.tlf.setGravity(17);
        this.tlf.setVisibility(4);
        addView(this.tlf);
        setBackgroundResource(a.f.list_thicklinecell_bg);
        return;
        if (bool2) {
          this.eCm.setTypeface(null, 1);
        }
      }
    }
  }
  
  public final void cqw()
  {
    x.d("MicroMsg.MMTabView", "jacks build : %d desc, unread: %s", new Object[] { Integer.valueOf(this.index), getUnread() });
    com.tencent.mm.ui.a.a locala = a.a.cqX();
    String str1 = getText();
    String str2 = getUnread();
    int j = this.index;
    if ((!locala.cqW()) || (this == null) || (bi.oW(str1)) || (locala.rc == null)) {
      return;
    }
    b localb = new b();
    localb.ZU(str1);
    if (!bi.oW(str2)) {}
    for (;;)
    {
      try
      {
        i = bi.getInt(str2, 0);
        if (i > 0)
        {
          if (i > 0) {
            localb.ZU(locala.rc.getResources().getQuantityString(a.i.tab_desc_unread, 1, new Object[] { Integer.valueOf(i) }));
          }
          localb.ZU(locala.rc.getResources().getQuantityString(a.i.tab_name_site_desc, 5, new Object[] { Integer.valueOf(3), Integer.valueOf(j + 1) }));
          localb.dl(this);
          return;
        }
      }
      catch (Exception localException) {}
      int i = 0;
    }
  }
  
  public String getText()
  {
    return this.eCm.getText().toString();
  }
  
  public String getUnread()
  {
    return this.tlf.getText().toString();
  }
  
  public final void lF(boolean paramBoolean)
  {
    ImageView localImageView = this.tnY;
    if (paramBoolean) {}
    for (int i = 0;; i = 4)
    {
      localImageView.setVisibility(i);
      return;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 -= paramInt1;
    paramInt1 = paramInt4 - paramInt2;
    paramInt2 = (paramInt3 - this.eCm.getMeasuredWidth()) / 2;
    paramInt4 = this.eCm.getMeasuredWidth() + paramInt2;
    int i = (paramInt1 - this.eCm.getMeasuredHeight()) / 2;
    int j = this.eCm.getMeasuredHeight();
    this.eCm.layout(paramInt2, i, paramInt4, j + i);
    i = this.padding + paramInt4;
    j = this.tnY.getMeasuredWidth();
    int k = (paramInt1 - this.tnY.getMeasuredHeight()) / 2;
    int m = this.tnY.getMeasuredHeight();
    this.tnY.layout(i, k, j + i, m + k);
    if (paramInt2 - this.padding < this.tlf.getMeasuredWidth())
    {
      paramInt2 = paramInt3 - this.tlf.getMeasuredWidth();
      paramInt3 = this.tlf.getMeasuredWidth();
      paramInt1 = (paramInt1 - this.tlf.getMeasuredHeight()) / 2;
      paramInt4 = this.tlf.getMeasuredHeight();
      this.tlf.layout(paramInt2, paramInt1, paramInt3 + paramInt2, paramInt4 + paramInt1);
      return;
    }
    paramInt2 = this.padding + paramInt4;
    paramInt3 = this.tlf.getMeasuredWidth();
    paramInt1 = (paramInt1 - this.tlf.getMeasuredHeight()) / 2;
    paramInt4 = this.tlf.getMeasuredHeight();
    this.tlf.layout(paramInt2, paramInt1, paramInt3 + paramInt2, paramInt4 + paramInt1);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int j = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) {}
    for (paramInt1 = View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE);; paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      this.eCm.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), paramInt1);
      this.tnY.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), paramInt1);
      this.tlf.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), paramInt1);
      setMeasuredDimension(i, j);
      return;
    }
  }
  
  public void setText(int paramInt)
  {
    this.eCm.setText(paramInt);
  }
  
  public void setText(String paramString)
  {
    this.eCm.setText(paramString);
  }
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.eCm.setTextColor(paramColorStateList);
  }
  
  public void setUnread(String paramString)
  {
    if (bi.oW(paramString))
    {
      this.tlf.setVisibility(4);
      return;
    }
    this.tlf.setVisibility(0);
    this.tlf.post(new MMTabView.1(this, paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/MMTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */