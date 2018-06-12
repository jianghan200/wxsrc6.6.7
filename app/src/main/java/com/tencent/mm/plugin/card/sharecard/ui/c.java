package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.r;

public final class c
  extends r<ShareCardInfo>
{
  private final String TAG = "MicroMsg.ShareCardAdatper";
  long beginTime = 0L;
  long endTime = 0L;
  private int hzH = 0;
  com.tencent.mm.plugin.card.base.c hzI;
  int hzJ = -1;
  
  public c(Context paramContext)
  {
    super(paramContext, new ShareCardInfo());
    lB(true);
    this.hzI = new j(paramContext, this);
  }
  
  protected final void WS()
  {
    aYc();
    WT();
  }
  
  public final void WT()
  {
    this.beginTime = System.currentTimeMillis();
    Object localObject1;
    int i;
    Object localObject2;
    if (this.hzJ == -1)
    {
      localObject1 = am.axq();
      i = n.a.hwN;
      localObject2 = new StringBuilder();
      switch (com.tencent.mm.plugin.card.sharecard.model.k.1.hwe[(i - 1)])
      {
      default: 
        localObject2 = "select * from ShareCardInfo" + ((StringBuilder)localObject2).toString() + " order by status asc , share_time desc";
        localObject1 = ((k)localObject1).diF.rawQuery((String)localObject2, null);
        if (localObject1 != null)
        {
          this.hzH = ((Cursor)localObject1).getCount();
          x.i("MicroMsg.ShareCardAdatper", "resetCursor showType %s, card count:%s", new Object[] { Integer.valueOf(this.hzJ), Integer.valueOf(this.hzH) });
        }
        break;
      }
    }
    for (;;)
    {
      setCursor((Cursor)localObject1);
      this.endTime = System.currentTimeMillis();
      notifyDataSetChanged();
      return;
      ((StringBuilder)localObject2).append(" where (status=0 OR status=5)");
      break;
      ((StringBuilder)localObject2).append(" where (status=1 OR status=2 OR status=3 OR status=4 OR status=6)");
      break;
      ((StringBuilder)localObject2).append(" where (status=0 OR status=5) and (block_mask= '1' OR block_mask= '0' )");
      break;
      k localk = am.axq();
      i = this.hzJ;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(" where ( status=0) ");
      localObject2 = "";
      localObject1 = localObject2;
      switch (i)
      {
      default: 
        localObject1 = localObject2;
      }
      for (;;)
      {
        localObject1 = "select * from ShareCardInfo" + localStringBuilder.toString() + (String)localObject1;
        localObject1 = localk.diF.rawQuery((String)localObject1, null);
        break;
        localStringBuilder.append(" AND (");
        localStringBuilder.append(" (");
        localStringBuilder.append(k.nM(1));
        localStringBuilder.append(" categoryType= '10' ");
        localStringBuilder.append(") ");
        localStringBuilder.append(" OR (");
        localStringBuilder.append(k.nM(2));
        localStringBuilder.append(" categoryType= '0' ");
        localStringBuilder.append(") ");
        localStringBuilder.append(" )");
        localObject1 = " order by categoryType desc , itemIndex asc";
        continue;
        localStringBuilder.append(" AND ");
        localStringBuilder.append(" (");
        localStringBuilder.append(k.nM(1));
        localStringBuilder.append(" categoryType= '10' ");
        localStringBuilder.append(") ");
        localObject1 = " order by categoryType desc , itemIndex asc";
        continue;
        localStringBuilder.append(" AND ");
        localStringBuilder.append(" (");
        localStringBuilder.append(k.nM(2));
        localStringBuilder.append(" categoryType= '0' ");
        localStringBuilder.append(") ");
        localObject1 = " order by categoryType desc , itemIndex asc";
        continue;
        localStringBuilder.append(" AND 1 != 1 ");
        localObject1 = localObject2;
      }
      x.e("MicroMsg.ShareCardAdatper", "resetCursor cursor is null, showType %s", new Object[] { Integer.valueOf(this.hzJ) });
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = (ShareCardInfo)getItem(paramInt);
    return this.hzI.a(paramInt, paramView, paramViewGroup);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */