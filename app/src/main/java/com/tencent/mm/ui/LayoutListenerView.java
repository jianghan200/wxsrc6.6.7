package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.tencent.mm.sdk.platformtools.x;

public class LayoutListenerView
  extends FrameLayout
{
  private String TAG = "MicroMsg.LayoutListenerView";
  private byte[] tls = new byte[0];
  private a tlt;
  private c tlu;
  private b tlv;
  
  public LayoutListenerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onDetachedFromWindow()
  {
    synchronized (this.tls)
    {
      this.tlt = null;
      this.tlu = null;
      this.tlv = null;
      super.onDetachedFromWindow();
      return;
    }
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    x.d(this.TAG, "jacks onInitializeAccessibilityEvent");
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    x.d(this.TAG, "jacks onInitializeAccessibilityNodeInfo");
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    synchronized (this.tls)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    throw ((Throwable)localObject2);
  }
  
  @TargetApi(14)
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    x.d(this.TAG, "jacks onPopulateAccessibilityEvent");
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    synchronized (this.tls)
    {
      if (this.tlu != null) {
        this.tlu.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      }
      return;
    }
  }
  
  public void setOnLayoutListener(a parama)
  {
    synchronized (this.tls)
    {
      this.tlt = parama;
      return;
    }
  }
  
  public void setOnPreLayoutListener(b paramb)
  {
    synchronized (this.tls)
    {
      this.tlv = paramb;
      return;
    }
  }
  
  public void setOnResizedListener(c paramc)
  {
    synchronized (this.tls)
    {
      this.tlu = paramc;
      return;
    }
  }
  
  public static abstract interface a {}
  
  public static abstract interface b {}
  
  public static abstract interface c
  {
    public abstract void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/LayoutListenerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */