package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.x;

public class MovingImageButton
  extends ImageView
{
  private int god;
  private int goe;
  private int hmV;
  private int hmW;
  private int jVn;
  private Context mContext;
  private int qld;
  private int qle;
  private int qlf = 0;
  private int qlg = 0;
  private ViewGroup.MarginLayoutParams qlh;
  private final int qli = 100;
  private int qlj;
  private boolean qlk = false;
  private boolean qll = true;
  private int x;
  private int y;
  
  public MovingImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  public MovingImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.qlj = a.fromDPToPix(this.mContext, 100);
    this.hmV = a.fk(this.mContext);
    this.hmW = a.fl(this.mContext);
    this.jVn = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.qll) {
      return super.onTouchEvent(paramMotionEvent);
    }
    if ((this.qlf == 0) || (this.qlg == 0))
    {
      Rect localRect = new Rect();
      getWindowVisibleDisplayFrame(localRect);
      this.qlf = (localRect.right - localRect.left);
      this.qlg = (localRect.bottom - localRect.top);
      x.d("MicroMsg.MovingImageButton", "right = %d, top = %d, left = %d, bottom = %d, screenX = %d, screenY = %d", new Object[] { Integer.valueOf(localRect.right), Integer.valueOf(localRect.top), Integer.valueOf(localRect.left), Integer.valueOf(localRect.bottom), Integer.valueOf(this.qlf), Integer.valueOf(this.qlg) });
    }
    this.x = ((int)paramMotionEvent.getRawX());
    this.y = ((int)paramMotionEvent.getRawY());
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      this.god = this.x;
      this.goe = this.y;
      return true;
      this.qld = this.x;
      this.qle = this.y;
      continue;
      int i = this.x - this.god;
      int j = this.y - this.goe;
      if ((i != 0) || (j != 0))
      {
        this.qlh = ((ViewGroup.MarginLayoutParams)getLayoutParams());
        paramMotionEvent = this.qlh;
        int k = paramMotionEvent.rightMargin;
        paramMotionEvent.rightMargin = (-i + k);
        paramMotionEvent = this.qlh;
        paramMotionEvent.topMargin += j;
        if (this.qlh.rightMargin < 0)
        {
          this.qlh.rightMargin = 0;
          label325:
          if (this.qlh.topMargin >= 0) {
            break label388;
          }
          this.qlh.topMargin = 0;
        }
        for (;;)
        {
          requestLayout();
          break;
          if (this.qlh.rightMargin <= this.qlf - getWidth()) {
            break label325;
          }
          this.qlh.rightMargin = (this.qlf - getWidth());
          break label325;
          label388:
          if (this.qlh.topMargin > this.qlg - getHeight()) {
            this.qlh.topMargin = (this.qlg - getHeight());
          }
        }
        if (Math.abs(this.qld - this.x) + Math.abs(this.qle - this.y) > this.jVn)
        {
          if (this.y < this.qlj) {
            this.qlh.topMargin = 0;
          }
          for (;;)
          {
            requestLayout();
            break;
            if (this.y > this.qlg - this.qlj) {
              this.qlh.topMargin = (this.qlg - getHeight());
            } else if (this.x > this.qlf / 2) {
              this.qlh.rightMargin = 0;
            } else {
              this.qlh.rightMargin = (this.qlf - getWidth());
            }
          }
        }
        performClick();
      }
    }
  }
  
  public void setCanMove(boolean paramBoolean)
  {
    this.qll = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/MovingImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */