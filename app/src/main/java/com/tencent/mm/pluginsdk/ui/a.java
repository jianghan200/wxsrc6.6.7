package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class a
  extends i
  implements f.c
{
  private a(String paramString)
  {
    super(b.lZs, paramString);
  }
  
  private a(String paramString, byte paramByte)
  {
    super(b.lZs, paramString, (byte)0);
  }
  
  public final void jX(String paramString)
  {
    super.jX(paramString);
  }
  
  public static abstract interface a
  {
    public abstract void doInvalidate();
    
    public abstract Drawable getDrawable();
    
    public abstract void setImageDrawable(Drawable paramDrawable);
  }
  
  public static final class b
  {
    public static i.a lZs;
    
    public static void a(ImageView paramImageView, String paramString)
    {
      if (paramImageView == null)
      {
        x.e("MicroMsg.AvatarDrawable", "imageView is null");
        return;
      }
      Object localObject = paramImageView.getDrawable();
      if ((localObject != null) && ((localObject instanceof a))) {}
      for (localObject = (a)localObject;; localObject = new a(paramString, '\000'))
      {
        ((a)localObject).Tw(paramString);
        paramImageView.setImageDrawable((Drawable)localObject);
        paramImageView.invalidate();
        return;
      }
    }
    
    public static void a(ImageView paramImageView, String paramString, float paramFloat, boolean paramBoolean)
    {
      Object localObject = paramImageView.getDrawable();
      if ((localObject != null) && ((localObject instanceof b))) {
        localObject = (b)localObject;
      }
      for (;;)
      {
        ((b)localObject).Tw(paramString);
        paramImageView.setImageDrawable((Drawable)localObject);
        paramImageView.invalidate();
        return;
        localObject = new b(paramString, paramFloat);
        ((b)localObject).kD(paramBoolean);
      }
    }
    
    public static void a(a.a parama, String paramString)
    {
      Object localObject = parama.getDrawable();
      if ((localObject != null) && ((localObject instanceof a))) {}
      for (localObject = (a)localObject;; localObject = new a(paramString, '\000'))
      {
        ((a)localObject).Tw(paramString);
        parama.setImageDrawable((Drawable)localObject);
        parama.doInvalidate();
        return;
      }
    }
    
    public static i.a ccZ()
    {
      if (lZs != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        return lZs;
      }
    }
    
    public static void g(ImageView paramImageView, String paramString, int paramInt)
    {
      if (paramImageView == null) {
        return;
      }
      Object localObject = paramImageView.getDrawable();
      if ((localObject != null) && ((localObject instanceof c))) {}
      for (localObject = (c)localObject;; localObject = new c(paramString))
      {
        if ((((c)localObject).qEL != paramInt) || (((c)localObject).qEK == null) || (((c)localObject).qEK.hqv == null) || (((c)localObject).qEK.hqv.isRecycled()))
        {
          ((c)localObject).qEL = paramInt;
          Bitmap localBitmap = com.tencent.mm.sdk.platformtools.c.CV(paramInt);
          if (((c)localObject).qEK != null) {
            ((c)localObject).qEK.hqv = localBitmap;
          }
        }
        ((c)localObject).Tw(paramString);
        paramImageView.setImageDrawable((Drawable)localObject);
        paramImageView.invalidate();
        return;
      }
    }
    
    public static void n(ImageView paramImageView, String paramString)
    {
      a(paramImageView, paramString, 0.5F, false);
    }
    
    public static void o(ImageView paramImageView, String paramString)
    {
      a(paramImageView, paramString, 0.5F, true);
    }
    
    public static void p(ImageView paramImageView, String paramString)
    {
      Object localObject = paramImageView.getDrawable();
      if ((localObject != null) && ((localObject instanceof a))) {}
      for (localObject = (a)localObject;; localObject = new a(paramString, (short)0))
      {
        ((a)localObject).Tw(paramString);
        paramImageView.setImageDrawable((Drawable)localObject);
        paramImageView.invalidate();
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */