package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.List;

public class FavTagEntrance
  extends LinearLayout
  implements j.a
{
  private long bVe = -1L;
  private TextView jfC;
  private String jfD = String.valueOf(this.bVe);
  
  public FavTagEntrance(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void a(String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavTagEntrence", "on notify change event %s, favIDStr %s", new Object[] { paramString, this.jfD });
    if (this.jfD.equals(paramString))
    {
      paramString = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(this.bVe);
      if (paramString == null) {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavTagEntrence", "id[%d] info is null, return", new Object[] { Long.valueOf(this.bVe) });
      }
    }
    else
    {
      return;
    }
    setTagContent(paramString.field_tagProto.rBX);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.jfC = ((TextView)findViewById(m.e.tag_content));
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("key_fav_scene", 1);
        paramAnonymousView.putExtra("key_fav_item_id", FavTagEntrance.a(FavTagEntrance.this));
        b.a(FavTagEntrance.this.getContext(), ".ui.FavTagEditUI", paramAnonymousView);
      }
    });
  }
  
  public void setFavItemID(long paramLong)
  {
    this.bVe = paramLong;
    this.jfD = String.valueOf(paramLong);
  }
  
  public void setTagContent(List<String> paramList)
  {
    if (this.jfC == null) {
      return;
    }
    Object localObject = getContext();
    if ((localObject == null) || (paramList == null) || (paramList.isEmpty()))
    {
      localObject = "";
      if (bi.oW((String)localObject))
      {
        this.jfC.setText("");
        this.jfC.setHint(m.i.favorite_entrance_add_tag_tips);
      }
    }
    else
    {
      String str1 = (String)paramList.get(0);
      String str2 = ((Context)localObject).getResources().getString(m.i.favorite_tag_delimiter);
      int i = 1;
      for (;;)
      {
        localObject = str1;
        if (i >= paramList.size()) {
          break;
        }
        str1 = str1 + str2 + (String)paramList.get(i);
        i += 1;
      }
    }
    this.jfC.setText(j.a(getContext(), (CharSequence)localObject, this.jfC.getTextSize()));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/widget/FavTagEntrance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */