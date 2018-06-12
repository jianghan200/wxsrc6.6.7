package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.gif.MMGIFException;
import com.tencent.mm.plugin.gif.b;
import com.tencent.mm.plugin.gif.f;
import com.tencent.mm.plugin.n.a.c;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.IOException;

public class MMEmojiView
  extends MMAnimateView
{
  private EmojiInfo ild;
  private int mScreenWidth;
  private int qNU;
  private int qNV;
  private boolean qNW = false;
  public boolean qNX = false;
  
  public MMEmojiView(Context paramContext)
  {
    this(paramContext, null);
    init(paramContext);
  }
  
  public MMEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    init(paramContext);
  }
  
  public MMEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.qNU = paramContext.getResources().getDimensionPixelSize(a.c.emoji_view_image_size);
    this.qNV = paramContext.getResources().getDimensionPixelSize(a.c.emoji_view_image_min_size);
    this.mScreenWidth = com.tencent.mm.bp.a.fk(paramContext);
  }
  
  public final void a(EmojiInfo paramEmojiInfo, String paramString)
  {
    this.ild = paramEmojiInfo;
    String str = paramEmojiInfo.cnF();
    if ((paramEmojiInfo.field_reserved4 & EmojiInfo.tcW) == EmojiInfo.tcW)
    {
      if (b.aVQ().EA(paramString) != null)
      {
        setImageDrawable(b.aVQ().EA(paramString));
        return;
      }
      a(this.ild, ((PluginEmoji)g.n(PluginEmoji.class)).getProvider().a(this.ild), paramString);
      return;
    }
    dk(str, paramString);
  }
  
  public final void a(EmojiInfo paramEmojiInfo, byte[] paramArrayOfByte, String paramString)
  {
    this.ild = paramEmojiInfo;
    for (;;)
    {
      try
      {
        if (bi.bC(paramArrayOfByte)) {
          continue;
        }
        if (!bi.oW(paramString))
        {
          setCacheKey(paramString);
          paramString = b.aVQ().q(getCacheKey(), paramArrayOfByte);
          setImageDrawable(paramString);
          return;
        }
        if ((!o.bx(paramArrayOfByte)) || (!((PluginEmoji)g.n(PluginEmoji.class)).getProvider().aEa())) {
          continue;
        }
        paramEmojiInfo = new f(paramArrayOfByte);
        this.qNX = true;
      }
      catch (MMGIFException paramEmojiInfo)
      {
        a(paramEmojiInfo);
        if (paramEmojiInfo.getErrorCode() != 103) {
          continue;
        }
        x.d("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray D_GIF_ERR_NOT_GIF_FILE");
        paramEmojiInfo = com.tencent.mm.sdk.platformtools.c.bs(paramArrayOfByte);
        if (paramEmojiInfo == null) {
          continue;
        }
        paramEmojiInfo.setDensity(getEmojiDensity());
        setImageBitmap(paramEmojiInfo);
        return;
        x.v("MicroMsg.emoji.MMEmojiView", "set with gif");
        paramEmojiInfo = new com.tencent.mm.plugin.gif.c(paramArrayOfByte);
        continue;
      }
      catch (IOException paramEmojiInfo)
      {
        x.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", new Object[] { paramEmojiInfo.toString() });
        if (this.ild == null) {
          continue;
        }
        this.ild.cnw();
        x.i("MicroMsg.emoji.MMEmojiView", "delete file.");
        init();
        return;
        x.w("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", new Object[] { paramArrayOfByte.toString() });
        if (this.ild == null) {
          continue;
        }
        this.ild.cnw();
        x.i("MicroMsg.emoji.MMEmojiView", "delete file.");
        init();
        return;
        x.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", new Object[] { paramEmojiInfo.toString() });
        if (this.ild == null) {
          continue;
        }
        this.ild.cnw();
        x.i("MicroMsg.emoji.MMEmojiView", "delete file.");
        continue;
      }
      catch (NullPointerException paramEmojiInfo)
      {
        x.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", new Object[] { paramEmojiInfo.toString() });
        continue;
      }
      paramString = paramEmojiInfo;
      if (!paramEmojiInfo.isRunning())
      {
        paramEmojiInfo.reset();
        paramString = paramEmojiInfo;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = getIntrinsicWidth();
    int j = getIntrinsicHeight();
    paramInt2 = j;
    paramInt1 = i;
    if (this.ild != null)
    {
      paramInt2 = j;
      paramInt1 = i;
      if (i == 0)
      {
        paramInt2 = j;
        paramInt1 = i;
        if (j == 0)
        {
          paramInt1 = (int)(this.ild.field_width * getEmojiDensityScale());
          paramInt2 = (int)(this.ild.field_height * getEmojiDensityScale());
        }
      }
    }
    float f;
    if (paramInt2 >= this.qNV)
    {
      i = paramInt2;
      j = paramInt1;
      if (paramInt1 >= this.qNV) {}
    }
    else
    {
      if (paramInt1 >= paramInt2) {
        break label199;
      }
      f = this.qNV / paramInt1;
      j = this.qNV;
      i = (int)(paramInt2 * f);
    }
    if (this.qNW) {
      if (j <= this.qNU)
      {
        paramInt1 = i;
        paramInt2 = j;
        if (i <= this.qNU) {}
      }
      else
      {
        if (j <= i) {
          break label244;
        }
        f = this.qNU / j;
        paramInt2 = this.qNU;
        paramInt1 = (int)(i * f);
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt2, paramInt1);
      return;
      label199:
      if (paramInt2 < paramInt1)
      {
        f = this.qNV / paramInt2;
        i = this.qNV;
        j = (int)(paramInt1 * f);
        break;
      }
      i = this.qNV;
      j = this.qNV;
      break;
      label244:
      if (i > j)
      {
        f = this.qNU / i;
        paramInt1 = this.qNU;
        paramInt2 = (int)(j * f);
      }
      else
      {
        paramInt2 = this.qNU;
        paramInt1 = this.qNU;
        continue;
        if (j <= this.mScreenWidth)
        {
          paramInt1 = i;
          paramInt2 = j;
          if (i <= this.mScreenWidth) {}
        }
        else if (j > i)
        {
          f = this.mScreenWidth / j;
          paramInt2 = this.mScreenWidth;
          paramInt1 = (int)(i * f);
        }
        else if (i > j)
        {
          f = this.mScreenWidth / i;
          paramInt1 = this.mScreenWidth;
          paramInt2 = (int)(j * f);
        }
        else
        {
          paramInt2 = this.mScreenWidth;
          paramInt1 = this.mScreenWidth;
        }
      }
    }
  }
  
  public void setIsMaxSizeLimit(boolean paramBoolean)
  {
    this.qNW = paramBoolean;
  }
  
  public void setMaxSize(int paramInt)
  {
    this.qNU = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/emoji/MMEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */