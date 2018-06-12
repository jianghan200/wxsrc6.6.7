package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.tools.i;

public class SnsTranslateResultView
  extends LinearLayout
{
  private static final int ofA = Color.parseColor("#19000000");
  private Drawable dXQ;
  private TextView mLa;
  private int ofB = -1;
  private float ofC = -1.0F;
  private int ofD = -1;
  private TextView ofy;
  private View ofz;
  
  public SnsTranslateResultView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(getContext()).inflate(i.g.translate_result_layout, this);
    this.ofy = ((TextView)findViewById(i.f.sns_translate_brand_tv));
    this.mLa = ((TextView)findViewById(i.f.sns_translate_result_tv));
    this.ofz = findViewById(i.f.translate_split);
    this.dXQ = getResources().getDrawable(i.e.sns_translate_loading_icon);
    this.dXQ.setBounds(0, 0, (int)(this.mLa.getTextSize() * 0.8F), (int)(this.mLa.getTextSize() * 0.8F));
    this.dXQ.setColorFilter(ofA, PorterDuff.Mode.SRC_IN);
  }
  
  @TargetApi(11)
  public final void a(ap.b paramb, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.ofB = paramInt;
    if ((this.ofC == -1.0F) && (this.ofD == -1)) {
      if (this.ofB == 2)
      {
        this.mLa.setTextSize(1, 14.0F * a.fe(getContext()));
        if (this.ofB != 2) {
          break label214;
        }
        this.mLa.setTextColor(getContext().getResources().getColor(i.c.sns_translate_comment_result_color));
        label77:
        if (bi.oW(paramString1)) {
          break label245;
        }
        this.mLa.setText(paramString1);
        j.g(this.mLa, 2);
        label101:
        this.mLa.setCompoundDrawables(null, null, null, null);
        if ((paramBoolean) && (d.fR(11))) {
          i.a(this.mLa, new SnsTranslateResultView.1(this, paramb));
        }
        if (bi.oW(paramString2)) {
          break label258;
        }
        this.ofy.setText(paramString2);
      }
    }
    for (;;)
    {
      this.ofy.setVisibility(0);
      return;
      if (this.ofB != 1) {
        break;
      }
      this.mLa.setTextSize(1, 15.0F * a.fe(getContext()));
      break;
      this.mLa.setTextSize(this.ofD, this.ofC);
      break;
      label214:
      if (this.ofB != 1) {
        break label77;
      }
      this.mLa.setTextColor(getContext().getResources().getColor(i.c.sns_translate_post_result_color));
      break label77;
      label245:
      this.mLa.setText(i.j.sns_translate_failed);
      break label101;
      label258:
      this.ofy.setText(i.j.chatting_translate_status_got);
    }
  }
  
  public TextView getResultTextView()
  {
    return this.mLa;
  }
  
  public View getSplitlineView()
  {
    return this.ofz;
  }
  
  public void setResultTextSize(float paramFloat)
  {
    this.mLa.setTextSize(0, paramFloat);
    this.ofC = paramFloat;
    this.ofD = 0;
  }
  
  public final void setResultTextSize$255e752(float paramFloat)
  {
    this.mLa.setTextSize(1, paramFloat);
    this.ofC = paramFloat;
    this.ofD = 1;
  }
  
  public final void xD(int paramInt)
  {
    this.mLa.setCompoundDrawables(this.dXQ, null, null, null);
    this.mLa.setCompoundDrawablePadding(a.fromDPToPix(getContext(), 3));
    this.mLa.setText(i.j.sns_translating);
    i.a(this.mLa, null);
    this.ofy.setVisibility(4);
    this.ofB = paramInt;
    this.mLa.setTextSize(0, this.ofy.getTextSize());
    this.mLa.setTextColor(getContext().getResources().getColor(i.c.sns_translate_loading_text_color));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsTranslateResultView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */