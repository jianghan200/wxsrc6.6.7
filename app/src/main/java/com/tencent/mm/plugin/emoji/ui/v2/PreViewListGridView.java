package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.mm.R.f;
import com.tencent.mm.pluginsdk.ui.emoji.PopEmojiView;
import com.tencent.mm.sdk.platformtools.ag;

public class PreViewListGridView
  extends ListView
{
  private int OT;
  private WindowManager inU;
  private boolean isd = true;
  private WindowManager.LayoutParams isj;
  private int isk;
  private int isl;
  private int ism;
  private boolean isn;
  private volatile int iso = -1;
  private String isp;
  private PopEmojiView isq;
  private d isr;
  private ag mHandler = new ag();
  
  public PreViewListGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public PreViewListGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.isq = new PopEmojiView(getContext());
    this.isk = paramContext.getResources().getDimensionPixelSize(R.f.emoji_preview_image_size);
    this.inU = ((WindowManager)paramContext.getSystemService("window"));
    this.isj = new WindowManager.LayoutParams(-1, -1, 2, 8, 1);
    this.isj.width = this.isk;
    this.isj.height = this.isk;
    this.isj.gravity = 17;
    this.OT = getResources().getConfiguration().orientation;
    if (this.OT == 2)
    {
      this.isl = this.inU.getDefaultDisplay().getHeight();
      this.ism = this.inU.getDefaultDisplay().getWidth();
      return;
    }
    this.isl = this.inU.getDefaultDisplay().getWidth();
    this.ism = this.inU.getDefaultDisplay().getHeight();
  }
  
  public final void aGu()
  {
    if (this.isn)
    {
      this.inU.removeView(this.isq);
      this.isn = false;
    }
    this.isp = "";
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      return super.onInterceptTouchEvent(paramMotionEvent);
    } while (!this.isn);
    aGu();
    return true;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    super.setAdapter(paramListAdapter);
    this.isr = ((d)paramListAdapter);
  }
  
  public void setEnablePreView(boolean paramBoolean)
  {
    this.isd = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/PreViewListGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */