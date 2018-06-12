package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;

public class ShowCommentImageView
  extends ImageView
{
  private static Bitmap nRd;
  private static Bitmap nRe;
  private static Field nRf;
  private static Field nRg;
  private static boolean nRh = false;
  private boolean nRc = false;
  
  public ShowCommentImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public ShowCommentImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void D(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    for (;;)
    {
      try
      {
        Field localField = nRf;
        if (paramBoolean2)
        {
          localField.set(this, null);
          return;
          localField = nRg;
          continue;
        }
        if (paramBoolean1)
        {
          localBitmap = nRe;
          if (localBitmap != null) {
            break label108;
          }
          paramBoolean2 = true;
          x.d("MicroMsg.ShowCommentImageView", "setDrawingCache, autoScale: %s, cache==null: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
          if (localBitmap == null) {
            break;
          }
          localField.set(this, localBitmap);
          return;
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", new Object[] { localException.getMessage() });
        return;
      }
      Bitmap localBitmap = nRd;
      continue;
      label108:
      paramBoolean2 = false;
    }
  }
  
  private boolean in(boolean paramBoolean)
  {
    if (!nRh) {
      return false;
    }
    if (paramBoolean) {}
    try
    {
      for (Field localField = nRf; (Bitmap)localField.get(this) != null; localField = nRg) {
        return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.ShowCommentImageView", localException, "", new Object[0]);
      x.e("MicroMsg.ShowCommentImageView", "checkIfCanReuseDrawingCache error: %s", new Object[] { localException.getMessage() });
    }
    return false;
  }
  
  private static void init()
  {
    if ((nRf != null) && (nRg != null)) {
      return;
    }
    try
    {
      nRf = View.class.getDeclaredField("mDrawingCache");
      nRg = View.class.getDeclaredField("mUnscaledDrawingCache");
      nRf.setAccessible(true);
      nRg.setAccessible(true);
      nRh = true;
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.ShowCommentImageView", "init error: %s", new Object[] { localException.getMessage() });
      nRh = false;
    }
  }
  
  public void buildDrawingCache(boolean paramBoolean)
  {
    Object localObject;
    if (nRh) {
      if (!this.nRc) {
        if (!in(paramBoolean))
        {
          if (paramBoolean) {}
          for (localObject = nRe; (localObject != null) && (!((Bitmap)localObject).isRecycled()); localObject = nRd)
          {
            D(paramBoolean, false);
            return;
          }
          super.buildDrawingCache(paramBoolean);
          if (!paramBoolean) {}
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject = nRf;
        localObject = (Bitmap)((Field)localObject).get(this);
        if (localObject != null) {
          break label170;
        }
        bool = true;
        x.d("MicroMsg.ShowCommentImageView", "getStaticDrawingCache, autoScale: %s, cache==null: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
        if (localObject == null) {
          break;
        }
        if (!paramBoolean) {
          break label147;
        }
        nRe = (Bitmap)localObject;
        return;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.ShowCommentImageView", "getStaticDrawingCache error: %s", new Object[] { localException.getMessage() });
        return;
      }
      Field localField = nRg;
      continue;
      label147:
      nRd = localField;
      return;
      super.buildDrawingCache(paramBoolean);
      return;
      D(paramBoolean, true);
      super.buildDrawingCache(paramBoolean);
      return;
      label170:
      boolean bool = false;
    }
  }
  
  public void destroyDrawingCache()
  {
    super.destroyDrawingCache();
  }
  
  protected void onDetachedFromWindow()
  {
    try
    {
      nRf.set(this, null);
      nRg.set(this, null);
      super.onDetachedFromWindow();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1)) {
      postDelayed(new ShowCommentImageView.2(this), 100L);
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.nRc = true;
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    super.setOnClickListener(new ShowCommentImageView.1(this, paramOnClickListener));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ShowCommentImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */