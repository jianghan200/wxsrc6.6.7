package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.ui.b.b;
import com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.y;
import java.util.HashMap;

public class CollapsibleTextView
  extends LinearLayout
{
  private String bNH;
  private String bSZ;
  private Context context;
  private ag handler = new ag(Looper.getMainLooper());
  private boolean hasCheck = true;
  private int nLs = 0;
  protected SnsPostDescPreloadTextView nMn;
  protected SnsTextView nMo;
  protected TextView nMp;
  private String nMq;
  private String nMr;
  private HashMap<String, Integer> nMs;
  private Runnable nMt = new CollapsibleTextView.1(this);
  private boolean nkG = false;
  private CharSequence text;
  
  public CollapsibleTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    this.nMq = this.context.getString(i.j.sns_desc_spread);
    this.nMr = this.context.getString(i.j.sns_desc_shrinkup);
    paramContext = y.gq(this.context).inflate(i.g.collapsible_textview, this);
    paramContext.setPadding(0, -3, 0, 0);
    this.nMn = ((SnsPostDescPreloadTextView)paramContext.findViewById(i.f.desc_tv));
    this.nMp = ((TextView)paramContext.findViewById(i.f.desc_op_tv));
    this.nMo = ((SnsTextView)paramContext.findViewById(i.f.desc_tv_single));
  }
  
  public final void a(int paramInt, CharSequence paramCharSequence, TextView.BufferType paramBufferType, HashMap<String, Integer> paramHashMap, String paramString1, String paramString2, av paramav, String paramString3, boolean paramBoolean)
  {
    this.context = paramav.bGc;
    this.nMs = paramHashMap;
    this.text = paramCharSequence;
    this.nkG = paramBoolean;
    this.bNH = paramString1;
    this.bSZ = paramString2;
    this.nLs = paramInt;
    this.nMq = this.context.getString(i.j.sns_desc_spread);
    this.nMr = this.context.getString(i.j.sns_desc_shrinkup);
    this.nMo.setOriginText(paramString3);
    paramString2 = new as(this.bSZ, this.bNH, false, false, 1);
    if (paramInt == 0)
    {
      this.nMn.setText(paramString3);
      this.nMo.setVisibility(8);
      this.nMp.setVisibility(0);
      this.nMn.setVisibility(0);
      paramCharSequence = new m(this.context);
      this.nMn.setOnTouchListener(paramCharSequence);
      this.nMn.setTag(paramString2);
      if (paramHashMap.get(paramString1) == null)
      {
        this.hasCheck = false;
        this.nMp.setVisibility(8);
        this.nMn.setMaxLines(7);
        return;
      }
      this.hasCheck = true;
      switch (((Integer)paramHashMap.get(paramString1)).intValue())
      {
      default: 
        return;
      case 0: 
        this.nMp.setVisibility(8);
        return;
      case 1: 
        this.nMn.setMaxLines(6);
        this.nMp.setVisibility(0);
        this.nMp.setText(this.nMq);
        return;
      }
      this.nMn.setMaxLines(Integer.MAX_VALUE);
      this.nMp.setVisibility(0);
      this.nMp.setText(this.nMr);
      return;
    }
    this.nMo.setText(paramCharSequence, paramBufferType);
    this.nMo.setTag(paramString2);
    this.nMo.setVisibility(0);
    this.nMp.setVisibility(8);
    this.nMn.setVisibility(8);
    this.nMo.setOnClickListener(paramav.ntw.okQ);
  }
  
  public int getSpreadHeight()
  {
    x.i("MicroMsg.CollapsibleTextView", "count:" + this.nMn.getLineCount() + "  height:" + this.nMn.getLineHeight());
    return (this.nMn.getLineCount() - 6) * this.nMn.getLineHeight();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.nLs != 0) || (this.nkG) || (this.hasCheck)) {
      return;
    }
    this.hasCheck = true;
    if (this.nMn.getLineCount() <= 6)
    {
      this.nMs.put(this.bNH, Integer.valueOf(0));
      return;
    }
    this.nMs.put(this.bNH, Integer.valueOf(1));
    this.handler.post(this.nMt);
  }
  
  public void setClickable(boolean paramBoolean)
  {
    this.nMp.setClickable(paramBoolean);
    this.nMo.setClickable(paramBoolean);
    this.nMn.setClickable(paramBoolean);
    super.setClickable(paramBoolean);
  }
  
  public void setLongClickable(boolean paramBoolean)
  {
    this.nMp.setLongClickable(paramBoolean);
    this.nMo.setLongClickable(paramBoolean);
    this.nMn.setLongClickable(paramBoolean);
    super.setLongClickable(paramBoolean);
  }
  
  public void setOpClickListener(View.OnClickListener paramOnClickListener)
  {
    if (this.nMp != null) {
      this.nMp.setOnClickListener(paramOnClickListener);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/CollapsibleTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */