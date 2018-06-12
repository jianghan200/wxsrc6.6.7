package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.cp;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.gif.b;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.n.a.b;
import com.tencent.mm.plugin.n.a.c;
import com.tencent.mm.plugin.n.a.d;
import com.tencent.mm.plugin.n.a.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.lang.ref.WeakReference;

public class RTChattingEmojiView
  extends FrameLayout
{
  private EmojiInfo ild;
  private int mStatus = -1;
  private TextView oFV;
  private int qOe;
  private int qOf;
  private int qOg;
  private int qOh;
  private int qOi;
  public ChattingEmojiView qOj;
  private ProgressBar qOk;
  private FrameLayout.LayoutParams qOl;
  FrameLayout.LayoutParams qOm;
  
  public RTChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public RTChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void Cr(int paramInt)
  {
    this.mStatus = paramInt;
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.qOk.setVisibility(0);
      this.oFV.setVisibility(4);
      this.qOj.setVisibility(4);
      setBackgroundResource(a.d.transparent_background);
      return;
    case 1: 
      this.qOk.setVisibility(0);
      this.oFV.setVisibility(4);
      this.qOj.setVisibility(4);
      setBackgroundResource(a.d.chatting_item_emoji_bg);
      return;
    case 3: 
      Drawable localDrawable = getResources().getDrawable(a.d.emoji_download_icon_samll);
      localDrawable.setBounds(0, 0, this.qOg, this.qOg);
      x.d("MicroMsg.emoji.RTChattingEmojiView", "iconSize:%d hashcode:%d", new Object[] { Integer.valueOf(this.qOg), Integer.valueOf(hashCode()) });
      this.oFV.setCompoundDrawables(null, localDrawable, null, null);
      this.oFV.setText(a.h.emoji_retry_download);
      this.oFV.setVisibility(0);
      this.qOk.setVisibility(4);
      this.qOj.setVisibility(4);
      setBackgroundResource(a.d.chatting_item_emoji_bg);
      return;
    }
    this.qOj.setVisibility(0);
    this.qOk.setVisibility(4);
    this.oFV.setVisibility(4);
    setBackgroundResource(a.d.transparent_background);
  }
  
  private void ceZ()
  {
    cp localcp = new cp();
    localcp.bKa.bKb = this.ild;
    localcp.bKa.scene = 0;
    a.sFg.m(localcp);
  }
  
  public final void a(EmojiInfo paramEmojiInfo, long paramLong)
  {
    a(paramEmojiInfo, paramLong, new an(""));
  }
  
  public final void a(EmojiInfo paramEmojiInfo, long paramLong, an paraman)
  {
    x.d("MicroMsg.emoji.RTChattingEmojiView", "setEmojiInfo");
    this.ild = paramEmojiInfo;
    Object localObject;
    boolean bool1;
    boolean bool2;
    int i;
    int[] arrayOfInt;
    String str1;
    String str2;
    b localb;
    Context localContext;
    if (this.ild.aaq())
    {
      Cr(2);
      localObject = ((i)g.l(i.class)).bcY().dW(paramLong);
      if ((((cm)localObject).field_status == 2) || (((cm)localObject).field_status == 3) || (((cm)localObject).field_status == 5))
      {
        bool1 = true;
        localObject = this.qOj;
        if (paraman.enG) {
          break label238;
        }
      }
      label225:
      label238:
      for (bool2 = true;; bool2 = false)
      {
        i = ((PluginEmoji)g.n(PluginEmoji.class)).getEmojiMgr().e(paramEmojiInfo);
        arrayOfInt = ((PluginEmoji)g.n(PluginEmoji.class)).getEmojiMgr().f(paramEmojiInfo);
        str1 = paramEmojiInfo.getName();
        str2 = String.valueOf(paramLong + paramEmojiInfo.getName());
        if (bi.oW(str2)) {
          break label379;
        }
        ((MMAnimateView)localObject).setCacheKey(str2);
        localb = b.aVQ();
        localContext = ((MMAnimateView)localObject).getContext();
        if (!TextUtils.isEmpty(str1)) {
          break label244;
        }
        paramEmojiInfo = null;
        if (paramEmojiInfo == null) {
          break label369;
        }
        paramEmojiInfo.kil = bool1;
        if (bool2 != paramEmojiInfo.mIsPlaying) {
          break label347;
        }
        paramEmojiInfo.start();
        ((MMAnimateView)localObject).setImageDrawable(paramEmojiInfo);
        return;
        bool1 = false;
        break;
      }
      label244:
      if ((localb.khx.get(str2) == null) || (((WeakReference)localb.khx.get(str2)).get() == null)) {
        break label608;
      }
    }
    label347:
    label369:
    label379:
    label608:
    for (paraman = (com.tencent.mm.plugin.gif.d)((WeakReference)localb.khx.get(str2)).get();; paraman = null)
    {
      paramEmojiInfo = paraman;
      if (paraman != null) {
        break;
      }
      paramEmojiInfo = new com.tencent.mm.plugin.gif.d(localContext, bool2, bool1, i, arrayOfInt, str1);
      localb.khx.put(str2, new WeakReference(paramEmojiInfo));
      break;
      paramEmojiInfo.irJ = 0;
      paramEmojiInfo.kin = 0;
      paramEmojiInfo.mIsPlaying = true;
      paramEmojiInfo.start();
      break label225;
      x.e("MicroMsg.GIF.MMGIFImageView", "can not get drawable.");
      return;
      paramEmojiInfo = new com.tencent.mm.plugin.gif.d(((MMAnimateView)localObject).getContext(), bool2, bool1, i, arrayOfInt, str1);
      paramEmojiInfo.start();
      ((MMAnimateView)localObject).setImageDrawable(paramEmojiInfo);
      return;
      if (this.ild.cny())
      {
        Cr(2);
        this.qOj.a(EmojiInfo.bt(getContext(), paramEmojiInfo.getName()), String.valueOf(paramLong));
        return;
      }
      paraman = this.ild.cnF();
      if (e.cm(paraman) > 0)
      {
        Cr(2);
        paramEmojiInfo = e.e(paraman, 0, 10);
        if ((paramEmojiInfo != null) && (!o.bw(paramEmojiInfo)))
        {
          this.qOj.a(this.ild, ((PluginEmoji)g.n(PluginEmoji.class)).getEmojiMgr().a(this.ild), String.valueOf(paramLong));
          return;
        }
        this.qOj.dk(paraman, String.valueOf(paramLong));
        return;
      }
      x.d("MicroMsg.emoji.RTChattingEmojiView", "try download emoji %s, state %d", new Object[] { paramEmojiInfo.Xh(), Integer.valueOf(paramEmojiInfo.field_state) });
      if (paramEmojiInfo.field_state == EmojiInfo.tcR)
      {
        Cr(0);
        ceZ();
      }
      for (;;)
      {
        this.qOj.setImageBitmap(null);
        return;
        Cr(3);
      }
    }
  }
  
  public void initView()
  {
    this.qOe = getContext().getResources().getDimensionPixelSize(a.c.emoji_view_image_size);
    this.qOf = getContext().getResources().getDimensionPixelSize(a.c.emoji_view_chatting_min_size);
    this.qOh = getContext().getResources().getDimensionPixelSize(a.c.emoji_view_refresh_size);
    this.qOi = getContext().getResources().getDimensionPixelSize(a.c.emoji_view_refresh_min_size);
    this.qOj = new ChattingEmojiView(getContext());
    this.qOk = new ProgressBar(getContext());
    this.qOk.setIndeterminateDrawable(getResources().getDrawable(a.d.progress_small_holo));
    this.oFV = new TextView(getContext());
    this.oFV.setText(a.h.emoji_retry_download);
    this.oFV.setTextColor(getResources().getColor(a.b.emoji_load_text_color));
    this.qOl = new FrameLayout.LayoutParams(-2, -2);
    this.qOm = new FrameLayout.LayoutParams(-2, -2);
    this.qOl.gravity = 17;
    addView(this.qOk, this.qOl);
    addView(this.oFV, this.qOl);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.mStatus == 0) || (this.mStatus == 1) || (this.mStatus == 3))
    {
      if ((this.ild != null) && (this.ild.field_height != 0))
      {
        paramInt1 = (int)(this.ild.field_height * this.qOj.getEmojiDensityScale());
        if (paramInt1 < this.qOf) {}
      }
      for (;;)
      {
        paramInt2 = paramInt1;
        if (paramInt1 > this.qOe) {
          paramInt2 = this.qOe;
        }
        this.qOg = this.qOh;
        if ((paramInt2 >= this.qOf) && (paramInt2 < this.qOf + (this.qOh - this.qOi))) {
          this.qOg = (this.qOi + (paramInt2 - this.qOf));
        }
        paramInt1 = this.qOe;
        setMeasuredDimension(paramInt1, paramInt2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
        Cr(this.mStatus);
        return;
        paramInt1 = this.qOf;
        continue;
        paramInt1 = this.qOf;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean performClick()
  {
    if (this.mStatus == 3)
    {
      Cr(1);
      ceZ();
      return true;
    }
    if (this.mStatus == 2) {
      return super.performClick();
    }
    x.d("MicroMsg.emoji.RTChattingEmojiView", "do nothing when loading");
    return true;
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    Cr(2);
    if ((this.qOj != null) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      paramBitmap.setDensity(this.qOj.getEmojiDensity());
      this.qOj.setImageBitmap(paramBitmap);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */