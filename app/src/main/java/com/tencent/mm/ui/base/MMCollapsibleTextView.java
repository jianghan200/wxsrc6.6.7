package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.k;

public class MMCollapsibleTextView
  extends LinearLayout
{
  private Context context;
  private TextView eZj;
  private boolean hasCheck = true;
  private Runnable iYm = new MMCollapsibleTextView.2(this);
  private TextView nMp;
  private String nMq;
  private String nMr;
  private int nkZ;
  private SparseIntArray ttW = new SparseIntArray();
  
  public MMCollapsibleTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    this.nMq = this.context.getString(a.k.spread);
    this.nMr = this.context.getString(a.k.shrinkup);
    paramContext = inflate(this.context, a.h.mm_collapsible_textview, this);
    paramContext.setPadding(0, -3, 0, 0);
    this.eZj = ((TextView)paramContext.findViewById(a.g.desc_tv));
    this.nMp = ((TextView)paramContext.findViewById(a.g.desc_op_tv));
    this.nMp.setOnClickListener(new MMCollapsibleTextView.1(this));
  }
  
  public int getSpreadHeight()
  {
    x.e("MicroMsg.CollapsibleTextView", "count:" + this.eZj.getLineCount() + "  height:" + this.eZj.getLineHeight());
    return (this.eZj.getLineCount() - 10) * this.eZj.getLineHeight();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.hasCheck) {
      return;
    }
    this.hasCheck = true;
    if (this.eZj.getLineCount() <= 10)
    {
      this.ttW.put(this.nkZ, 0);
      return;
    }
    this.ttW.put(this.nkZ, 1);
    post(this.iYm);
  }
  
  public void setOpClickListener(View.OnClickListener paramOnClickListener)
  {
    this.nMp.setOnClickListener(paramOnClickListener);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/MMCollapsibleTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */