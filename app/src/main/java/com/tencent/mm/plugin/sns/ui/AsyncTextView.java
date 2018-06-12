package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.plugin.sns.data.a;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.pluginsdk.ui.d.o;
import com.tencent.mm.pluginsdk.ui.d.o.a;

public class AsyncTextView
  extends TextView
  implements Runnable
{
  private Context context;
  public int hER;
  public String nLu;
  public boolean nLv;
  public String nLw;
  public o.a nLx;
  public boolean nLy;
  public String userName;
  
  public AsyncTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }
  
  public AsyncTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }
  
  public int getBaseline()
  {
    try
    {
      int i = super.getBaseline();
      return i;
    }
    catch (Throwable localThrowable) {}
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      return;
    }
    catch (Throwable paramCanvas) {}
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean onPreDraw()
  {
    try
    {
      boolean bool = super.onPreDraw();
      return bool;
    }
    catch (Throwable localThrowable) {}
    return true;
  }
  
  public void run()
  {
    Object localObject1;
    if ((getTag() instanceof String))
    {
      localObject1 = (String)getTag();
      if ((localObject1 != null) && (((String)localObject1).equals(this.userName))) {
        return;
      }
    }
    if (this.hER == 11) {}
    for (int i = 3;; i = 2)
    {
      localObject1 = new o(new a(this.nLv, this.userName, this.nLw, 1), this.nLx, i);
      Object localObject2 = getContext();
      String str = this.nLu;
      getTextSize();
      localObject2 = new k(j.b((Context)localObject2, str, i));
      ((k)localObject2).a(localObject1, this.nLu, 0);
      setText((CharSequence)localObject2, TextView.BufferType.SPANNABLE);
      setTag(this.userName);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/AsyncTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */