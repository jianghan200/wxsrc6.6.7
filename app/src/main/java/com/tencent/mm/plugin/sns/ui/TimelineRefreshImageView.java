package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;

public class TimelineRefreshImageView
  extends ImageView
{
  public TimelineRefreshImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public TimelineRefreshImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void buildDrawingCache(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean) {
      localObject = "mDrawingCache";
    }
    for (;;)
    {
      try
      {
        localObject = View.class.getDeclaredField((String)localObject);
        ((Field)localObject).setAccessible(true);
        localObject = (Bitmap)((Field)localObject).get(this);
        if (localObject != null) {
          continue;
        }
        localObject = "cache is null";
        x.d("MicroMsg.TimelineRefreshImageView", (String)localObject);
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.TimelineRefreshImageView", localException, "", new Object[0]);
        x.e("MicroMsg.TimelineRefreshImageView", "checkIfCanReuseDrawingCache error: %s", new Object[] { localException.getMessage() });
        continue;
      }
      x.d("MicroMsg.TimelineRefreshImageView", "buildDrawingCache, autoScale: %s, width: %s, height: %s, hash: %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(hashCode()) });
      super.buildDrawingCache(paramBoolean);
      return;
      localObject = "mUnscaledDrawingCache";
      continue;
      localObject = String.format("cache.width: %s, cache.height: %s, width: %s, height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()) });
    }
  }
  
  public void destroyDrawingCache()
  {
    super.destroyDrawingCache();
    x.d("MicroMsg.TimelineRefreshImageView", "destroyDrawingCache, width: %s, height: %s, hash: %s", new Object[] { Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(hashCode()) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/TimelineRefreshImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */