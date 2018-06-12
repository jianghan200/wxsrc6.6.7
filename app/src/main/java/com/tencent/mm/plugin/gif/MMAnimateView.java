package com.tencent.mm.plugin.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.hy;
import com.tencent.mm.plugin.n.a.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class MMAnimateView
  extends AppCompatImageView
{
  private String idw;
  private int khA = a.d.emoji_download_icon;
  private int khB = a.d.nosdcard_pic;
  private boolean khC = true;
  private float mDensity = 0.0F;
  
  public MMAnimateView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MMAnimateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public MMAnimateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (d.fR(26)) {
      setLayerType(1, null);
    }
  }
  
  private void a(Resources paramResources, int paramInt, boolean paramBoolean)
  {
    a locala = null;
    try
    {
      Object localObject;
      if (!bi.oW(null))
      {
        setCacheKey(null);
        b localb = b.aVQ();
        if (localb.khy.get(null) != null) {
          locala = (a)((WeakReference)localb.khy.get(null)).get();
        }
        localObject = locala;
        if (locala == null)
        {
          localObject = new c(paramResources, paramInt);
          localb.khy.put(null, new WeakReference(localObject));
        }
      }
      while (paramBoolean)
      {
        setImageDrawable((Drawable)localObject);
        return;
        localObject = new c(paramResources, paramInt);
      }
      return;
    }
    catch (IOException paramResources)
    {
      x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFResource failed. %s" + paramResources.toString());
      if (paramBoolean)
      {
        super.setImageResource(paramInt);
        return;
        setBackgroundDrawable((Drawable)localObject);
        return;
      }
      super.setBackgroundResource(paramInt);
    }
  }
  
  public static void a(MMGIFException paramMMGIFException)
  {
    hy localhy = new hy();
    localhy.bRu.errorCode = paramMMGIFException.getErrorCode();
    com.tencent.mm.sdk.b.a.sFg.m(localhy);
  }
  
  private void dl(String paramString1, String paramString2)
  {
    try
    {
      if (o.Wg(paramString1))
      {
        paramString2 = new f(e.e(paramString1, 0, e.cm(paramString1)));
        paramString2.start();
        setImageDrawable(paramString2);
        return;
      }
      if (bi.oW(paramString2)) {
        break label146;
      }
      setCacheKey(paramString2);
      paramString2 = b.aVQ().dj(getCacheKey(), paramString1);
    }
    catch (MMGIFException paramString2)
    {
      for (;;)
      {
        try
        {
          a(paramString2);
          int i = paramString2.getErrorCode();
          if (i != 103) {
            return;
          }
          try
          {
            paramString2 = com.tencent.mm.sdk.platformtools.c.decodeFile(paramString1, null);
            if (paramString2 == null) {
              break;
            }
            paramString2.setDensity(getEmojiDensity());
            setImageBitmap(paramString2);
            return;
          }
          catch (OutOfMemoryError paramString2)
          {
            x.printErrStackTrace("MicroMsg.GIF.MMGIFImageView", paramString2, "setMMGIFFilePath failed, oom happened. show default. path %s", new Object[] { paramString1 });
            init();
            return;
          }
          paramString2 = new c(paramString1);
        }
        catch (Exception paramString1)
        {
          x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed1. %s", new Object[] { bi.i(paramString1) });
          return;
        }
      }
    }
    catch (IOException paramString2)
    {
      x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed3. %s", new Object[] { bi.i(paramString2) });
      e.deleteFile(paramString1);
      init();
      return;
      x.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failedbitmap is null. show default and delete file. path %s", new Object[] { paramString1 });
      init();
      e.deleteFile(paramString1);
      return;
    }
    catch (NullPointerException paramString1)
    {
      label146:
      init();
    }
    setImageDrawable(paramString2);
    return;
  }
  
  public final void a(InputStream paramInputStream, String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        if (bi.oW(paramString)) {
          continue;
        }
        setCacheKey(paramString);
        localb = b.aVQ();
        str = getCacheKey();
        if (paramInputStream != null) {
          continue;
        }
        paramString = (String)localObject1;
      }
      catch (MMGIFException paramString)
      {
        b localb;
        String str;
        a(paramString);
        if (paramString.getErrorCode() != 103) {
          break label218;
        }
        paramInputStream = com.tencent.mm.sdk.platformtools.c.decodeStream(paramInputStream);
        if (paramInputStream == null) {
          break label205;
        }
        paramInputStream.setDensity(getEmojiDensity());
        setImageBitmap(paramInputStream);
        return;
        paramString = new c(paramInputStream);
        continue;
      }
      catch (IOException paramInputStream)
      {
        x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", new Object[] { paramInputStream.toString() });
      }
      setImageDrawable(paramString);
      return;
      x.d("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "stream key:%s", new Object[] { str });
      localObject1 = localObject2;
      if (localb.khy.get(str) != null) {
        localObject1 = (a)((WeakReference)localb.khy.get(str)).get();
      }
      paramString = (String)localObject1;
      if (localObject1 == null)
      {
        paramString = new c(paramInputStream);
        localb.khy.put(str, new WeakReference(paramString));
      }
    }
    for (;;)
    {
      init();
      return;
      label205:
      x.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failedbitmap is null. bytes %s");
      init();
      return;
      label218:
      x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", new Object[] { paramString.toString() });
    }
  }
  
  public final void a(String paramString, h paramh)
  {
    try
    {
      localObject = new c(paramString);
      setImageDrawable((Drawable)localObject);
      ((c)localObject).khV = Integer.MAX_VALUE;
      ((c)localObject).khX = paramh;
      return;
    }
    catch (MMGIFException paramh)
    {
      try
      {
        Object localObject;
        a(paramh);
        if (paramh.getErrorCode() == 103)
        {
          localObject = com.tencent.mm.sdk.platformtools.c.decodeStream(new FileInputStream(paramString));
          if (localObject == null) {
            break label127;
          }
          ((Bitmap)localObject).setDensity(getEmojiDensity());
          setImageBitmap((Bitmap)localObject);
          return;
        }
      }
      catch (FileNotFoundException paramString)
      {
        x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + paramString.toString());
        x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + paramh.toString());
      }
      init();
      return;
      x.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed bitmap is null. show default and delete file. path:%s", new Object[] { paramString });
      init();
      e.deleteFile(paramString);
      return;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        label127:
        x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + paramString.toString());
      }
    }
  }
  
  public final void dk(String paramString1, String paramString2)
  {
    dl(paramString1, paramString2);
  }
  
  public final void g(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte == null) {}
    try
    {
      x.e("MicroMsg.GIF.MMGIFImageView", "[setMMGIFFileByteArray] bytes is null! src:%s cacheKey:%s", new Object[] { Boolean.valueOf(true), paramString });
      return;
    }
    catch (MMGIFException paramString)
    {
      for (;;)
      {
        a(paramString);
        if (paramString.getErrorCode() != 103) {
          break label179;
        }
        paramString = com.tencent.mm.sdk.platformtools.c.bs(paramArrayOfByte);
        if (paramString == null) {
          break label155;
        }
        paramString.setDensity(getEmojiDensity());
        setImageBitmap(paramString);
        return;
        if (!o.bx(paramArrayOfByte)) {
          break;
        }
        paramString = new f(paramArrayOfByte);
        paramString.start();
      }
    }
    catch (IOException paramArrayOfByte)
    {
      x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", new Object[] { paramArrayOfByte.toString() });
    }
    if (!bi.oW(paramString))
    {
      setCacheKey(paramString);
      paramString = b.aVQ().q(getCacheKey(), paramArrayOfByte);
      setImageDrawable(paramString);
      return;
    }
    for (;;)
    {
      init();
      return;
      paramString = new c(paramArrayOfByte);
      continue;
      label155:
      x.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", new Object[] { paramArrayOfByte.toString() });
      init();
      return;
      label179:
      x.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", new Object[] { paramString.toString() });
    }
  }
  
  public String getCacheKey()
  {
    return this.idw;
  }
  
  public int getEmojiDensity()
  {
    return 320;
  }
  
  public float getEmojiDensityScale()
  {
    if (this.mDensity == 0.0F)
    {
      this.mDensity = (com.tencent.mm.bp.a.getDensity(ad.getContext()) / 2.0F);
      if (this.mDensity >= 1.0F) {
        break label40;
      }
      this.mDensity = 1.0F;
    }
    for (;;)
    {
      return this.mDensity;
      label40:
      if (this.mDensity > 2.0F) {
        this.mDensity = 2.0F;
      }
    }
  }
  
  public int getIntrinsicHeight()
  {
    if (getDrawable() == null) {
      return 0;
    }
    return getDrawable().getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    if (getDrawable() == null) {
      return 0;
    }
    return getDrawable().getIntrinsicWidth();
  }
  
  public final void init()
  {
    this.khC = com.tencent.mm.compatible.util.f.zZ();
    if (this.khC) {
      if (this.khA > 0) {
        super.setImageResource(this.khA);
      }
    }
    while (this.khB <= 0) {
      return;
    }
    super.setImageResource(this.khB);
  }
  
  public final void recycle()
  {
    if ((getDrawable() != null) && ((getDrawable() instanceof c))) {
      ((c)getDrawable()).recycle();
    }
  }
  
  public final void resume()
  {
    if ((getDrawable() != null) && ((getDrawable() instanceof c)))
    {
      c localc = (c)getDrawable();
      if (!localc.khD)
      {
        localc.mIsRunning = true;
        localc.f(localc.khZ, 0L);
      }
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    a(getResources(), paramInt, false);
  }
  
  public void setCacheKey(String paramString)
  {
    this.idw = paramString;
  }
  
  public void setDefaultBackgroundResource(int paramInt)
  {
    this.khA = paramInt;
  }
  
  public void setDefaultImageResource(int paramInt)
  {
    this.khA = paramInt;
  }
  
  public void setImageFilePath(String paramString)
  {
    dl(paramString, null);
  }
  
  public void setImageResource(int paramInt)
  {
    a(getResources(), paramInt, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gif/MMAnimateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */