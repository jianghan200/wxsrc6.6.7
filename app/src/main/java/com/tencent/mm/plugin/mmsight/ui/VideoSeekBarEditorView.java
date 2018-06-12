package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.mm.plugin.w.a.d;
import com.tencent.mm.plugin.w.a.e;
import com.tencent.mm.ui.y;

public class VideoSeekBarEditorView
  extends LinearLayout
{
  private Button iRz;
  RecyclerThumbSeekBar lqM;
  private Button lqN;
  private LinearLayout lqO;
  
  public VideoSeekBarEditorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public VideoSeekBarEditorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.lqO = ((LinearLayout)y.gq(paramContext).inflate(a.e.video_seek_bar_editor_view, this, true));
    this.lqM = ((RecyclerThumbSeekBar)findViewById(a.d.video_thumb_seek_bar));
    this.iRz = ((Button)findViewById(a.d.edit_text_cancel));
    this.lqN = ((Button)findViewById(a.d.edit_text_ok));
  }
  
  public final void bft()
  {
    this.lqM.release();
    ViewParent localViewParent = this.lqM.getParent();
    if ((localViewParent instanceof LinearLayout))
    {
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.lqM.getLayoutParams();
      ((LinearLayout)localViewParent).removeView(this.lqM);
      this.lqM = new RecyclerThumbSeekBar(getContext());
      ((LinearLayout)localViewParent).addView(this.lqM, 0, localLayoutParams);
    }
  }
  
  public void setCancelButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.iRz.setOnClickListener(paramOnClickListener);
  }
  
  public void setFinishButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.lqN.setOnClickListener(paramOnClickListener);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mmsight/ui/VideoSeekBarEditorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */