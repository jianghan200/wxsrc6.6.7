package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public class GameMediaList
  extends LinearLayout
  implements View.OnClickListener
{
  String appId = "";
  int iMP = -1;
  int jYI = 0;
  private int kam;
  private LinkedList<String> kan;
  Context mContext;
  
  public GameMediaList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onClick(View paramView)
  {
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a)))
    {
      x.i("MicroMsg.GameMediaList", "Invalid tag");
      return;
    }
    paramView = (a)paramView.getTag();
    switch (paramView.type)
    {
    default: 
      return;
    case 0: 
      paramView = paramView.url;
      int j = this.kan.indexOf(paramView);
      int i = j;
      if (j < 0) {
        i = 0;
      }
      paramView = new Intent(getContext(), GameGalleryUI.class);
      String[] arrayOfString = new String[this.kan.size()];
      this.kan.toArray(arrayOfString);
      paramView.putExtra("URLS", arrayOfString);
      paramView.putExtra("CURRENT", i);
      paramView.putExtra("REPORT_APPID", this.appId);
      paramView.putExtra("REPORT_SCENE", this.iMP);
      paramView.putExtra("SOURCE_SCENE", this.jYI);
      getContext().startActivity(paramView);
      return;
    }
    c.an(getContext(), paramView.url);
    an.a(this.mContext, this.iMP, 1202, 1, 13, this.appId, this.jYI, null);
  }
  
  public void setItemLayout(int paramInt)
  {
    this.kam = paramInt;
  }
  
  public void setMediaList(LinkedList<a> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      setVisibility(8);
      return;
    }
    this.kan = new LinkedList();
    int i = 0;
    while (i < paramLinkedList.size())
    {
      localObject = (a)paramLinkedList.get(i);
      if ((!bi.oW(((a)localObject).url)) && (((a)localObject).type == 0)) {
        this.kan.add(((a)localObject).url);
      }
      i += 1;
    }
    removeAllViews();
    Object localObject = (LayoutInflater)getContext().getSystemService("layout_inflater");
    i = 0;
    while (i < paramLinkedList.size())
    {
      a locala = (a)paramLinkedList.get(i);
      if (!bi.oW(locala.kao))
      {
        View localView = ((LayoutInflater)localObject).inflate(this.kam, this, false);
        ImageView localImageView = (ImageView)localView.findViewById(f.e.media_thumb);
        a locala1 = o.Pj();
        String str = locala.kao;
        c.a locala2 = new c.a();
        locala2.dXx = true;
        locala1.a(str, localImageView, locala2.Pt());
        if (locala.type == 1) {
          localView.findViewById(f.e.media_overlay).setVisibility(0);
        }
        addView(localView);
        localImageView.setTag(locala);
        localImageView.setOnClickListener(this);
      }
      i += 1;
    }
    setVisibility(0);
  }
  
  public static final class a
  {
    public String kao;
    public int type;
    public String url;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameMediaList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */