package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.R.f;
import com.tencent.mm.ak.o;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.protocal.c.tp;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.LinkedList;

public class DonorsAvatarView
  extends LinearLayout
{
  private int ioM;
  private int ioN;
  private int ioO;
  private int ioP;
  private LinearLayout.LayoutParams ioQ;
  private int mMaxCount;
  
  public DonorsAvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public DonorsAvatarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    setOrientation(0);
    this.ioM = com.tencent.mm.bp.a.fk(getContext());
    this.ioN = com.tencent.mm.bp.a.ad(getContext(), R.f.emoji_donors_avatar_size);
    this.ioO = com.tencent.mm.bp.a.ad(getContext(), R.f.BasicPaddingSize);
    this.ioP = com.tencent.mm.bp.a.ad(getContext(), R.f.NormalPadding);
    this.ioQ = new LinearLayout.LayoutParams(this.ioN, this.ioN);
    this.ioQ.leftMargin = this.ioO;
    this.ioQ.rightMargin = this.ioO;
    this.mMaxCount = ((this.ioM - this.ioP * 2) / (this.ioN + this.ioO * 2));
    x.i("MicroMsg.emoji.DonorsAvatarView", "max count:%d", new Object[] { Integer.valueOf(this.mMaxCount) });
  }
  
  public final void b(String paramString, LinkedList<tp> paramLinkedList)
  {
    removeAllViews();
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      int i;
      int j;
      label34:
      ImageView localImageView;
      if (paramLinkedList.size() > this.mMaxCount)
      {
        i = this.mMaxCount;
        j = 0;
        if (j >= i) {
          return;
        }
        tp localtp = (tp)paramLinkedList.get(j);
        if (localtp != null)
        {
          localImageView = new ImageView(getContext());
          localImageView.setLayoutParams(this.ioQ);
          if (bi.oW(localtp.rxm)) {
            break label138;
          }
          o.Pj().a(localtp.rxm, localImageView, f.j(paramString, localtp.rxm, new Object[0]));
        }
      }
      for (;;)
      {
        addView(localImageView);
        j += 1;
        break label34;
        i = paramLinkedList.size();
        break;
        try
        {
          label138:
          localImageView.setImageBitmap(BackwardSupportUtil.b.a(ad.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bp.a.getDensity(null)));
        }
        catch (IOException localIOException)
        {
          x.printErrStackTrace("MicroMsg.emoji.DonorsAvatarView", localIOException, "", new Object[0]);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/DonorsAvatarView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */