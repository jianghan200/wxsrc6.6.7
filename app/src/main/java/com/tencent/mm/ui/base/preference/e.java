package com.tencent.mm.ui.base.preference;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.mm.bp.a;

public final class e
{
  Bitmap bitmap = null;
  int jxE = -1;
  
  public final void e(ImageView paramImageView)
  {
    if (paramImageView == null) {}
    do
    {
      return;
      if (this.jxE != -1) {
        paramImageView.setImageDrawable(a.f(paramImageView.getContext(), this.jxE));
      }
    } while (this.bitmap == null);
    paramImageView.setImageBitmap(this.bitmap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/base/preference/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */