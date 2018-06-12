package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.game.e.e;
import com.tencent.mm.plugin.game.e.e.a.a;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.plugin.game.model.s.h;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.t.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public class GameMessageListUserIconView
  extends LinearLayout
{
  private t kaw;
  private f<String, Bitmap> kax;
  private Context mContext;
  
  public GameMessageListUserIconView(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    init();
  }
  
  public GameMessageListUserIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  private void d(ImageView paramImageView, String paramString)
  {
    paramImageView = e.aVj().h(paramImageView, paramString);
    if (paramImageView != null) {
      this.kax.put(paramString, paramImageView);
    }
  }
  
  private void f(ImageView paramImageView, String paramString)
  {
    e.a.a locala = new e.a.a();
    locala.dXw = false;
    e.aVj().a(paramImageView, paramString, locala.aVk(), new GameMessageListUserIconView.1(this, paramString));
  }
  
  private void init()
  {
    if (this.kaw == null) {
      this.kaw = new t(this.mContext);
    }
  }
  
  public final void a(s params, LinkedList<s.h> paramLinkedList, f<String, Bitmap> paramf)
  {
    if ((params == null) || (bi.cX(paramLinkedList)))
    {
      setVisibility(8);
      return;
    }
    this.kax = paramf;
    setVisibility(0);
    int i = this.mContext.getResources().getDimensionPixelSize(f.c.GameUserIconSize);
    int j = this.mContext.getResources().getDimensionPixelSize(f.c.BasicPaddingSize);
    paramf = new LinearLayout.LayoutParams(i, i);
    paramf.rightMargin = j;
    Object localObject;
    while (getChildCount() < paramLinkedList.size())
    {
      localObject = new ImageView(this.mContext);
      ((ImageView)localObject).setLayoutParams(paramf);
      ((ImageView)localObject).setScaleType(ImageView.ScaleType.FIT_XY);
      ((ImageView)localObject).setOnClickListener(this.kaw);
      addView((View)localObject);
    }
    i = 0;
    label135:
    String str;
    Bitmap localBitmap;
    if (i < getChildCount())
    {
      paramf = (ImageView)getChildAt(i);
      if (i >= paramLinkedList.size()) {
        break label406;
      }
      paramf.setVisibility(0);
      localObject = (s.h)paramLinkedList.get(i);
      if (bi.oW(((s.h)localObject).jNp)) {
        break label306;
      }
      str = ((s.h)localObject).jNp;
      if (!this.kax.bb(str)) {
        break label296;
      }
      localBitmap = (Bitmap)this.kax.get(str);
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {
        break label287;
      }
      f(paramf, str);
      label243:
      if (bi.oW(((s.h)localObject).jNs)) {
        break label398;
      }
      paramf.setTag(new t.a(params, ((s.h)localObject).jNs, 6));
      paramf.setEnabled(true);
    }
    for (;;)
    {
      i += 1;
      break label135;
      break;
      label287:
      paramf.setImageBitmap(localBitmap);
      break label243;
      label296:
      f(paramf, str);
      break label243;
      label306:
      str = ((s.h)localObject).userName;
      if (bi.oW(str))
      {
        a.b.a(paramf, str);
        break label243;
      }
      if (!this.kax.bb(str))
      {
        d(paramf, str);
        break label243;
      }
      localBitmap = (Bitmap)this.kax.get(str);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        d(paramf, str);
        break label243;
      }
      paramf.setImageBitmap(localBitmap);
      break label243;
      label398:
      paramf.setEnabled(false);
      continue;
      label406:
      paramf.setVisibility(8);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    init();
  }
  
  public void setSourceScene(int paramInt)
  {
    if (this.kaw != null)
    {
      this.kaw.jNv = paramInt;
      return;
    }
    this.kaw = new t(this.mContext, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameMessageListUserIconView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */