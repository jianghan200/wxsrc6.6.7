package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.y;

public final class b
{
  private final String TAG = "MicroMsg.emoji.BaseEmojiStoreItemViewHolder";
  public TextView hEx;
  public View ido;
  public String idw;
  public ImageView idx;
  public ImageView idy;
  public Context mContext;
  
  public b(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    this.ido = y.gq(this.mContext).inflate(paramInt, null);
    aDx();
  }
  
  public b(Context paramContext, View paramView)
  {
    this.mContext = paramContext;
    this.ido = paramView;
    aDx();
  }
  
  private void aDx()
  {
    if (this.ido == null)
    {
      x.w("MicroMsg.emoji.BaseEmojiStoreItemViewHolder", "initView failed. root is null.");
      return;
    }
    this.idx = ((ImageView)this.ido.findViewById(R.h.item_icon));
    this.hEx = ((TextView)this.ido.findViewById(R.h.item_title));
    this.idy = ((ImageView)this.ido.findViewById(R.h.item_fg));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */