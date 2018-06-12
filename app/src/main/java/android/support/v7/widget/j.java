package android.support.v7.widget;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.v4.b.a.c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class j
{
  private static final int[] HN = { 16843067, 16843068 };
  private final ProgressBar MJ;
  Bitmap MK;
  final h Mb;
  
  j(ProgressBar paramProgressBar, h paramh)
  {
    this.MJ = paramProgressBar;
    this.Mb = paramh;
  }
  
  private Drawable b(Drawable paramDrawable, boolean paramBoolean)
  {
    int j = 0;
    if ((paramDrawable instanceof c))
    {
      localObject1 = ((c)paramDrawable).bD();
      if (localObject1 != null)
      {
        localObject1 = b((Drawable)localObject1, paramBoolean);
        ((c)paramDrawable).j((Drawable)localObject1);
      }
    }
    do
    {
      return paramDrawable;
      if ((paramDrawable instanceof LayerDrawable))
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int k = paramDrawable.getNumberOfLayers();
        localObject1 = new Drawable[k];
        int i = 0;
        if (i < k)
        {
          int m = paramDrawable.getId(i);
          localObject2 = paramDrawable.getDrawable(i);
          if ((m == 16908301) || (m == 16908303)) {}
          for (paramBoolean = true;; paramBoolean = false)
          {
            localObject1[i] = b((Drawable)localObject2, paramBoolean);
            i += 1;
            break;
          }
        }
        localObject1 = new LayerDrawable((Drawable[])localObject1);
        i = j;
        while (i < k)
        {
          ((LayerDrawable)localObject1).setId(i, paramDrawable.getId(i));
          i += 1;
        }
        return (Drawable)localObject1;
      }
    } while (!(paramDrawable instanceof BitmapDrawable));
    paramDrawable = (BitmapDrawable)paramDrawable;
    Object localObject2 = paramDrawable.getBitmap();
    if (this.MK == null) {
      this.MK = ((Bitmap)localObject2);
    }
    Object localObject1 = new ShapeDrawable(new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null));
    localObject2 = new BitmapShader((Bitmap)localObject2, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
    ((ShapeDrawable)localObject1).getPaint().setShader((Shader)localObject2);
    ((ShapeDrawable)localObject1).getPaint().setColorFilter(paramDrawable.getPaint().getColorFilter());
    if (paramBoolean) {
      return new ClipDrawable((Drawable)localObject1, 3, 1);
    }
    return (Drawable)localObject1;
  }
  
  void b(AttributeSet paramAttributeSet, int paramInt)
  {
    ap localap = ap.a(this.MJ.getContext(), paramAttributeSet, HN, paramInt);
    Object localObject = localap.bP(0);
    if (localObject != null)
    {
      ProgressBar localProgressBar = this.MJ;
      paramAttributeSet = (AttributeSet)localObject;
      if ((localObject instanceof AnimationDrawable))
      {
        localObject = (AnimationDrawable)localObject;
        int i = ((AnimationDrawable)localObject).getNumberOfFrames();
        paramAttributeSet = new AnimationDrawable();
        paramAttributeSet.setOneShot(((AnimationDrawable)localObject).isOneShot());
        paramInt = 0;
        while (paramInt < i)
        {
          Drawable localDrawable = b(((AnimationDrawable)localObject).getFrame(paramInt), true);
          localDrawable.setLevel(10000);
          paramAttributeSet.addFrame(localDrawable, ((AnimationDrawable)localObject).getDuration(paramInt));
          paramInt += 1;
        }
        paramAttributeSet.setLevel(10000);
      }
      localProgressBar.setIndeterminateDrawable(paramAttributeSet);
    }
    paramAttributeSet = localap.bP(1);
    if (paramAttributeSet != null) {
      this.MJ.setProgressDrawable(b(paramAttributeSet, false));
    }
    localap.Ww.recycle();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */