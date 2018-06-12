package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.emoji.a.a.a;

public final class g
  extends f
{
  private int idM = 0;
  private int idN = 0;
  private int idO = 0;
  
  public g(Context paramContext)
  {
    super(paramContext);
  }
  
  public final int aDA()
  {
    return this.idN;
  }
  
  public final int aDB()
  {
    return this.idO;
  }
  
  public final int aDz()
  {
    return this.idM;
  }
  
  public final View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    f.a locala = (f.a)paramView.getTag();
    if (this.idM > 0) {
      if (paramInt == 0)
      {
        locala.idl.setVisibility(0);
        locala.idl.setText(this.mContext.getString(R.l.emoji_store_hot));
      }
    }
    for (;;)
    {
      if (locala.idn != null) {
        locala.idn.postDelayed(new g.1(this, locala), 100L);
      }
      return super.b(paramInt, paramView, paramViewGroup);
      if ((this.idN > 0) && (paramInt == this.idM))
      {
        locala.idl.setVisibility(0);
        locala.idl.setText(this.mContext.getString(R.l.emoji_store_recent));
      }
      else if (paramInt == this.idM + this.idN)
      {
        locala.idl.setVisibility(0);
        locala.idl.setText(this.mContext.getString(R.l.emoji_store_all));
      }
      else
      {
        locala.idl.setVisibility(8);
        continue;
        if (this.idN > 0) {
          if (paramInt == 0)
          {
            locala.idl.setVisibility(0);
            locala.idl.setText(this.mContext.getString(R.l.emoji_store_recent));
          }
          else if (paramInt == this.idM + this.idN)
          {
            locala.idl.setVisibility(0);
            locala.idl.setText(this.mContext.getString(R.l.emoji_store_all));
          }
          else
          {
            locala.idl.setVisibility(8);
          }
        }
      }
    }
  }
  
  public final int getCount()
  {
    return super.getCount();
  }
  
  public final void oD(int paramInt)
  {
    this.idM = paramInt;
  }
  
  public final void oE(int paramInt)
  {
    this.idN = paramInt;
  }
  
  public final void oF(int paramInt)
  {
    this.idO = paramInt;
  }
  
  public final com.tencent.mm.plugin.emoji.a.a.f oG(int paramInt)
  {
    return super.oG(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/emoji/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */