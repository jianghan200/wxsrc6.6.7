package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public class RichTextImageView
  extends LinearLayout
{
  private Activity bOb;
  private TextView eBO;
  private ImageView kYV;
  private TextView nMC;
  private TextView nQW;
  private boolean nQX = false;
  private String nQY;
  
  public RichTextImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bOb = ((Activity)paramContext);
    paramContext = inflate(this.bOb, i.g.sns_rich_text_image_view, this);
    this.nMC = ((TextView)paramContext.findViewById(i.f.righttext));
    this.eBO = ((TextView)paramContext.findViewById(i.f.titletext));
    this.nQW = ((TextView)paramContext.findViewById(i.f.bottomtext));
    this.kYV = ((ImageView)paramContext.findViewById(i.f.image_left));
  }
  
  public ImageView getImageView()
  {
    return this.kYV;
  }
  
  public TextView getTitle()
  {
    return this.eBO;
  }
  
  protected void onLayout(boolean paramBoolean, final int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.nQX) {}
    int i;
    do
    {
      do
      {
        return;
      } while (this.nQY == null);
      x.d("MicroMsg.RichTextImageView", "onLayout  Heighth:" + this.nMC.getHeight() + " LineHeight:" + this.nMC.getLineHeight());
      paramInt3 = this.nMC.getHeight() / this.nMC.getLineHeight();
      i = this.nMC.getLineCount();
      Rect localRect = new Rect();
      paramInt1 = 0;
      paramInt2 = 0;
      for (;;)
      {
        if (paramInt1 < paramInt3) {
          try
          {
            this.nMC.getLineBounds(paramInt1, localRect);
            paramInt2 += localRect.height();
            if (paramInt2 <= this.nMC.getHeight()) {
              paramInt1 += 1;
            }
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
        }
      }
    } while ((i < paramInt1) || (!this.nQX));
    paramInt2 = paramInt1;
    if (paramInt1 <= 0) {
      paramInt2 = 1;
    }
    paramInt1 = this.nMC.getLayout().getLineVisibleEnd(paramInt2 - 1);
    x.e("test", "bottomH:" + this.nQW.getHeight() + "length" + this.nQY.substring(paramInt1, this.nQY.length()).length());
    x.e("test", "bottomH:" + this.nQW.getHeight());
    if (this.nQW.getText().length() > 0)
    {
      this.nQW.setVisibility(0);
      this.nQX = false;
      new ag().post(new Runnable()
      {
        public final void run()
        {
          RichTextImageView.b(RichTextImageView.this).setText(RichTextImageView.a(RichTextImageView.this).substring(0, paramInt1));
          RichTextImageView.c(RichTextImageView.this).setText(RichTextImageView.a(RichTextImageView.this).substring(paramInt1, RichTextImageView.a(RichTextImageView.this).length()));
          RichTextImageView.c(RichTextImageView.this).invalidate();
          RichTextImageView.d(RichTextImageView.this);
          x.e("test", "bottomH:" + RichTextImageView.c(RichTextImageView.this).getHeight());
        }
      });
    }
    x.e("test", "bottom:" + paramInt4 + "   mesH:" + this.nQW.getMeasuredHeight());
  }
  
  public void setImage(int paramInt)
  {
    this.kYV.setImageResource(paramInt);
  }
  
  public void setImage(Bitmap paramBitmap)
  {
    this.kYV.setImageBitmap(paramBitmap);
  }
  
  public void setText(String paramString)
  {
    this.nQX = true;
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.nQY = str;
    this.nMC.setText(this.nQY);
    requestLayout();
  }
  
  public void setTitle(String paramString)
  {
    this.eBO.setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/RichTextImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */