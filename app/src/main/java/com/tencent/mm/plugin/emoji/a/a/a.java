package com.tencent.mm.plugin.emoji.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.tencent.mm.plugin.emoji.model.h.a;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ao;
import java.util.HashMap;

public abstract class a
  extends BaseAdapter
{
  private final String TAG = "MicroMsg.BaseEmojiListAdapter";
  private final String dgc = "lock";
  private HashMap<String, com.tencent.mm.plugin.emoji.a.a> idY;
  public AbsListView iem;
  public c ien;
  public h.a ieo;
  protected volatile boolean iep = false;
  private int ieq = 0;
  private int ier = 0;
  public Context mContext;
  
  public a(Context paramContext)
  {
    this.mContext = paramContext;
    if (this.mContext != null) {
      this.idY = new HashMap();
    }
  }
  
  public static String a(f paramf)
  {
    if (paramf == null) {
      return null;
    }
    if (paramf.iey == f.a.ieH) {
      return paramf.ieA.bzI + "_cell";
    }
    return paramf.iez.rem;
  }
  
  public c a(com.tencent.mm.plugin.emoji.model.f paramf)
  {
    return new c(paramf);
  }
  
  public final void a(c paramc)
  {
    if ((paramc == null) || (this.ien == paramc)) {
      return;
    }
    this.ien = paramc.aDE();
    notifyDataSetChanged();
  }
  
  public final void a(f paramf, String paramString, int paramInt)
  {
    if ((paramf == null) || (paramString == null)) {}
    do
    {
      return;
      paramf.setStatus(paramInt);
      paramf = (ao)this.ien.ieu.get(paramString);
    } while (paramf == null);
    paramf.Dl(paramInt);
  }
  
  public abstract int aDA();
  
  public abstract int aDB();
  
  public void aDy()
  {
    if (this.idY != null) {
      this.idY.clear();
    }
    super.notifyDataSetChanged();
    this.iep = true;
  }
  
  public abstract int aDz();
  
  public final void aoV()
  {
    if (!this.iep) {
      return;
    }
    super.notifyDataSetChanged();
  }
  
  public abstract View b(int paramInt, View paramView, ViewGroup paramViewGroup);
  
  public final void b(com.tencent.mm.plugin.emoji.model.f paramf)
  {
    ah.A(new a.1(this, paramf));
  }
  
  public void be(String paramString, int paramInt)
  {
    if ((this.idY == null) || (this.ien == null) || (paramString == null)) {}
    for (;;)
    {
      return;
      Object localObject = this.ien.za(paramString);
      if (localObject != null) {
        a((f)localObject, paramString, paramInt);
      }
      if ((localObject != null) && (this.ien != null) && (((f)localObject).mStatus == -1))
      {
        x.i("MicroMsg.BaseEmojiListAdapter", "force refresh status");
        ((f)localObject).a(this.ien.iew, this.ien.ze(paramString), this.ien.zc(paramString));
      }
      com.tencent.mm.plugin.emoji.a.a locala = yZ(paramString);
      if (locala != null)
      {
        if (locala.getProductId() == null) {}
        for (localObject = null; (localObject != null) && (((String)localObject).equals(paramString)); localObject = locala.getProductId())
        {
          locala.aDu();
          return;
        }
      }
    }
  }
  
  public final void bf(String paramString, int paramInt)
  {
    if ((this.idY == null) || (this.ien == null) || (paramString == null)) {}
    for (;;)
    {
      return;
      Object localObject = this.ien.za(paramString);
      if (localObject != null)
      {
        if ((paramInt >= 0) && (paramInt < 100))
        {
          a((f)localObject, paramString, 6);
          ((f)localObject).pF = paramInt;
        }
        if (paramInt >= 100) {
          a((f)localObject, paramString, 7);
        }
      }
      com.tencent.mm.plugin.emoji.a.a locala = yZ(paramString);
      if (locala != null)
      {
        if (locala.getProductId() == null) {}
        for (localObject = null; (localObject != null) && (((String)localObject).equals(paramString)); localObject = locala.getProductId())
        {
          locala.aDu();
          return;
        }
      }
    }
  }
  
  public abstract com.tencent.mm.plugin.emoji.a.a c(Context paramContext, View paramView);
  
  public void clear()
  {
    if (this.idY != null)
    {
      this.idY.clear();
      this.idY = null;
    }
    if (this.ien != null)
    {
      this.ien.clear();
      this.ien = null;
    }
    this.iep = false;
  }
  
  public int getCount()
  {
    if (this.ien == null) {
      return 0;
    }
    return this.ien.size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.tencent.mm.plugin.emoji.a.a locala1 = null;
    if (paramView != null) {
      locala1 = (com.tencent.mm.plugin.emoji.a.a)paramView.getTag();
    }
    f localf = oG(paramInt);
    com.tencent.mm.plugin.emoji.a.a locala2;
    View localView;
    if (locala1 == null)
    {
      locala2 = c(this.mContext, paramView);
      localView = locala2.aDv();
      this.idY.put(a(localf), locala2);
    }
    for (;;)
    {
      locala2.mPosition = paramInt;
      locala2.icY = localf;
      paramView = b(paramInt, localView, paramViewGroup);
      locala2.aDu();
      return paramView;
      locala2 = locala1;
      localView = paramView;
      if (!bi.oW(a(localf)))
      {
        if (this.idY.containsValue(locala1)) {
          this.idY.remove(locala1.getProductId());
        }
        this.idY.put(a(localf), locala1);
        locala2 = locala1;
        localView = paramView;
      }
    }
  }
  
  public void notifyDataSetChanged()
  {
    this.iep = false;
    if (this.ien != null)
    {
      this.ien.notifyDataSetChanged();
      i = this.ieq;
      this.ieq = (i + 1);
      x.d("MicroMsg.BaseEmojiListAdapter", "xxx data Notify: %d", new Object[] { Integer.valueOf(i) });
    }
    int i = this.ier;
    this.ier = (i + 1);
    x.v("MicroMsg.BaseEmojiListAdapter", "xxx ui Notify: %d", new Object[] { Integer.valueOf(i) });
    aDy();
  }
  
  public abstract void oD(int paramInt);
  
  public abstract void oE(int paramInt);
  
  public abstract void oF(int paramInt);
  
  public f oG(int paramInt)
  {
    if (this.ien == null) {
      return null;
    }
    return this.ien.oJ(paramInt);
  }
  
  public final com.tencent.mm.plugin.emoji.a.a yZ(String paramString)
  {
    if (this.idY == null) {
      return null;
    }
    return (com.tencent.mm.plugin.emoji.a.a)this.idY.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */