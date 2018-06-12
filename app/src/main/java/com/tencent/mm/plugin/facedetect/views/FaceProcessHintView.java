package com.tencent.mm.plugin.facedetect.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.facedetect.a.a;
import com.tencent.mm.plugin.facedetect.a.b;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.model.h;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.x;

public class FaceProcessHintView
  extends LinearLayout
{
  private h iUx = null;
  private int iUy = 0;
  private Animation iUz = null;
  
  public FaceProcessHintView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FaceProcessHintView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(0);
    setMinimumHeight(BackwardSupportUtil.b.b(getContext(), 36.0F));
    this.iUz = AnimationUtils.loadAnimation(paramContext, a.a.face_zoom_out_from_left);
    this.iUz.setInterpolator(new AccelerateDecelerateInterpolator());
  }
  
  private void setCurrentProcessing(int paramInt)
  {
    TextView localTextView = (TextView)getChildAt(paramInt).findViewById(a.e.current_process_number);
    localTextView.setTextColor(getResources().getColor(a.b.white));
    localTextView.setBackgroundResource(a.d.face_prefix_number_bg);
  }
  
  @SuppressLint({"SetTextI18n"})
  public void setDataAndInvalidate(h paramh)
  {
    this.iUx = paramh;
    if ((this.iUx == null) || (this.iUx.iNA <= 0))
    {
      x.e("MicroMsg.FaceProcessHintView", "hy: model invalid");
      return;
    }
    removeAllViews();
    int i = 0;
    while (i < this.iUx.iNA)
    {
      paramh = LayoutInflater.from(getContext()).inflate(a.g.face_process_hint_item, null, false);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
      ((TextView)paramh.findViewById(a.e.current_process_number)).setText(String.valueOf(i + 1));
      addView(paramh, localLayoutParams);
      i += 1;
    }
    getChildAt(getChildCount() - 1).findViewById(a.e.face_progress_area).setVisibility(8);
    setCurrentProcessing(0);
    invalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/facedetect/views/FaceProcessHintView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */