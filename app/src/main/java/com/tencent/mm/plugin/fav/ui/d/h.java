package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.c;
import com.tencent.mm.plugin.fav.ui.k;
import com.tencent.mm.plugin.fav.ui.m.c;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.plugin.fav.ui.m.h;
import com.tencent.mm.plugin.fav.ui.m.i;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class h
  extends a
{
  private static int jeu;
  
  public h(k paramk)
  {
    super(paramk);
    jeu = com.tencent.mm.bp.a.ad(paramk.context, m.c.FavImageSize);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    paramViewGroup = paramViewGroup.getContext();
    a locala;
    View localView;
    if (paramView == null)
    {
      locala = new a();
      localView = a(View.inflate(paramViewGroup, m.f.fav_listitem_wenote, null), locala, paramg);
      locala.jeA = localView.findViewById(m.e.record_layout);
      locala.jeB = localView.findViewById(m.e.common_card_layout);
      locala.jeC = localView.findViewById(m.e.voice_layout);
      locala.jeD = localView.findViewById(m.e.fav_record_icon_ll);
      locala.jeE = ((ImageView)localView.findViewById(m.e.fav_record_card_icon));
      locala.jeG = localView.findViewById(m.e.fav_icon_info_bg);
      locala.jeF = ((ImageView)localView.findViewById(m.e.fav_icon_video_mask));
      locala.jeH = ((TextView)localView.findViewById(m.e.fav_icon_info_tv));
      locala.jeI = ((TextView)localView.findViewById(m.e.fav_record_title));
      locala.jeJ = ((TextView)localView.findViewById(m.e.fav_record_desc));
      locala.jeK = ((ImageView)localView.findViewById(m.e.fav_common_card_icon));
      locala.jeL = ((TextView)localView.findViewById(m.e.fav_card_title));
      locala.jeM = ((TextView)localView.findViewById(m.e.fav_card_desc));
      locala.jeN = ((TextView)localView.findViewById(m.e.fav_voice_title));
      localView.setTag(locala);
    }
    Object localObject2;
    for (;;)
    {
      a(locala, paramg);
      localObject2 = paramg.field_favProto.rBI;
      if (((List)localObject2).size() >= 2) {
        break;
      }
      x.e("MicroMsg.Fav.FavNoteListItem", "no other item");
      return localView;
      locala = (a)paramView.getTag();
      localView = paramView;
    }
    int m = -1;
    int i3 = ((List)localObject2).size();
    int j = 0;
    int i2 = -1;
    int i4 = 1;
    int k = 0;
    int i = 0;
    if (k < ((List)localObject2).size())
    {
      paramViewGroup = (vx)((List)localObject2).get(k);
      if (k == 0)
      {
        paramView = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.b(paramViewGroup));
        if (!paramView.exists()) {
          k.b(paramg, paramViewGroup);
        }
      }
      for (;;)
      {
        k += 1;
        break;
        if (paramViewGroup.rAq == null)
        {
          paramViewGroup = new kp();
          paramViewGroup.bUP.type = 10;
          paramViewGroup.bUP.field_localId = paramg.field_localId;
          paramViewGroup.bUP.path = paramView.cBX().toString();
          com.tencent.mm.sdk.b.a.sFg.m(paramViewGroup);
        }
        continue;
        int i1;
        if ((paramViewGroup.bjS != 2) && (paramViewGroup.bjS != 4))
        {
          i1 = j;
          n = m;
          j = i;
          if (paramViewGroup.bjS != 15) {}
        }
        else
        {
          i += 1;
          int i5 = 1;
          i1 = i5;
          n = m;
          j = i;
          if (m == -1)
          {
            n = k;
            j = i;
            i1 = i5;
          }
        }
        switch (paramViewGroup.bjS)
        {
        }
        do
        {
          i4 = 0;
          i = j;
          j = i1;
          m = n;
          break;
          i2 = k;
          i = j;
          j = i1;
          m = n;
          break;
        } while (bi.aG(paramViewGroup.desc, "").trim().length() > 0);
        i3 -= 1;
        i = j;
        j = i1;
        m = n;
      }
    }
    if ((i4 != 0) && (i3 == 2)) {
      k = 1;
    }
    while ((k != 0) && (i2 > 0))
    {
      localObject2 = (vx)((List)localObject2).get(i2);
      if (((vx)localObject2).bjS == 3)
      {
        locala.jeA.setVisibility(8);
        locala.jeB.setVisibility(8);
        locala.jeC.setVisibility(0);
        locala.jeN.setText(com.tencent.mm.plugin.fav.ui.j.C(this.iYh.context, ((vx)localObject2).duration));
        return localView;
        k = 0;
      }
      else
      {
        paramView = null;
        if (((vx)localObject2).bjS == 6)
        {
          i = m.h.app_attach_file_icon_location;
          paramg = ((vx)localObject2).rAi.rAL;
          paramViewGroup = ((vx)localObject2).rAi.fky;
          if (bi.oW(paramViewGroup)) {
            if (com.tencent.mm.plugin.fav.ui.j.BC(paramg.bWB))
            {
              paramView = paramg.bWB;
              paramg = paramg.label;
              paramViewGroup = paramView;
              paramView = paramg;
            }
          }
        }
        for (;;)
        {
          locala.jeC.setVisibility(8);
          locala.jeA.setVisibility(8);
          locala.jeB.setVisibility(0);
          locala.jeK.setImageResource(i);
          locala.jeL.setText(paramViewGroup);
          if (bi.oW(paramView)) {
            break label1026;
          }
          locala.jeM.setText(paramView);
          locala.jeM.setVisibility(0);
          return localView;
          paramViewGroup = paramg.label;
          continue;
          paramView = paramViewGroup;
          if (!com.tencent.mm.plugin.fav.ui.j.BC(paramg.bWB)) {
            break;
          }
          paramView = paramg.bWB;
          continue;
          j = c.Bx(((vx)localObject2).rzD);
          paramg = ((vx)localObject2).title;
          localObject1 = ((vx)localObject2).desc;
          i = j;
          paramView = (View)localObject1;
          paramViewGroup = paramg;
          if (bi.oW((String)localObject1))
          {
            paramView = com.tencent.mm.plugin.fav.a.b.aj((float)((vx)localObject2).rzJ);
            i = j;
            paramViewGroup = paramg;
          }
        }
        label1026:
        locala.jeM.setVisibility(8);
        return localView;
      }
    }
    locala.jeA.setVisibility(0);
    locala.jeB.setVisibility(8);
    locala.jeC.setVisibility(8);
    ArrayList localArrayList1 = new ArrayList();
    paramViewGroup = null;
    int n = 1;
    if (n < ((List)localObject2).size())
    {
      localObject1 = (vx)((List)localObject2).get(n);
      if (((vx)localObject1).bjS == 1)
      {
        localObject1 = ((vx)localObject1).desc;
        if (bi.oW((String)localObject1)) {
          break label2274;
        }
        paramView = (View)localObject1;
        if (((String)localObject1).length() > 1000) {
          paramView = ((String)localObject1).substring(0, 1000);
        }
        paramView = paramView.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&amp;", "&").replace(" ", " ").split("\n");
        label1200:
        localObject1 = paramViewGroup;
        if (paramView != null)
        {
          localObject1 = paramViewGroup;
          if (paramView.length > 0)
          {
            ArrayList localArrayList2 = new ArrayList();
            k = 0;
            for (;;)
            {
              if (k >= paramView.length) {
                break label2268;
              }
              if (!bi.oW(paramView[k].trim()))
              {
                localArrayList2.add(paramView[k]);
                label1257:
                k += 1;
                localObject1 = "";
                while (k < paramView.length)
                {
                  localObject1 = (String)localObject1 + paramView[k] + " ";
                  k += 1;
                }
              }
              k += 1;
            }
            paramView = ((String)localObject1).trim();
            if (paramView.length() > 0) {
              localArrayList2.add(paramView);
            }
            k = 0;
            if ((localArrayList2.size() <= 0) || (!bi.oW(paramViewGroup))) {
              break label2263;
            }
            paramView = (String)localArrayList2.get(0);
            k = 1;
            label1374:
            while (k < localArrayList2.size())
            {
              localArrayList1.add(localArrayList2.get(k));
              k += 1;
            }
          }
        }
      }
      else
      {
        paramView = localView.getContext();
        switch (((vx)localObject1).bjS)
        {
        case 4: 
        case 9: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        default: 
          paramView = "";
          label1492:
          localObject1 = paramViewGroup;
          if (!bi.oW(paramView)) {
            localArrayList1.add(paramView);
          }
          break;
        }
      }
    }
    for (Object localObject1 = paramViewGroup;; localObject1 = paramView)
    {
      n += 1;
      paramViewGroup = (ViewGroup)localObject1;
      break;
      paramView = com.tencent.mm.plugin.fav.ui.j.D(paramView, m.i.favorite_sub_title_voice) + " " + com.tencent.mm.plugin.fav.ui.j.C(paramView, ((vx)localObject1).duration);
      break label1492;
      paramView = com.tencent.mm.plugin.fav.ui.j.D(paramView, m.i.favorite_sub_title_url) + " " + ((vx)localObject1).title;
      break label1492;
      paramView = com.tencent.mm.plugin.fav.ui.j.D(paramView, m.i.favorite_sub_title_music) + " " + ((vx)localObject1).title;
      break label1492;
      localObject1 = ((vx)localObject1).rAi.rAL;
      if (com.tencent.mm.plugin.fav.ui.j.BC(((we)localObject1).bWB))
      {
        paramView = com.tencent.mm.plugin.fav.ui.j.D(paramView, m.i.favorite_sub_title_location) + " " + ((we)localObject1).bWB;
        break label1492;
      }
      paramView = com.tencent.mm.plugin.fav.ui.j.D(paramView, m.i.favorite_sub_title_location) + " " + ((we)localObject1).label;
      break label1492;
      paramView = com.tencent.mm.plugin.fav.ui.j.D(paramView, m.i.favorite_sub_title_file) + " " + ((vx)localObject1).title;
      break label1492;
      paramView = com.tencent.mm.plugin.fav.ui.j.D(paramView, m.i.favorite_mall_product) + " " + ((vx)localObject1).rAi.rAP.title;
      break label1492;
      paramView = com.tencent.mm.plugin.fav.ui.j.D(paramView, m.i.favorite_friend_card);
      break label1492;
      if (!bi.oW(paramViewGroup))
      {
        locala.jeI.setText(com.tencent.mm.pluginsdk.ui.d.j.a(locala.jeI.getContext(), paramViewGroup, locala.jeI.getTextSize()));
        locala.jeI.setVisibility(0);
        if (localArrayList1.size() > 0) {
          locala.jeI.setMaxLines(1);
        }
      }
      for (;;)
      {
        paramView = new StringBuffer();
        k = 0;
        while ((k < localArrayList1.size()) && (k < 2))
        {
          paramView.append((String)localArrayList1.get(k));
          paramView.append("\n");
          k += 1;
        }
        locala.jeI.setMaxLines(3);
        continue;
        locala.jeI.setVisibility(8);
      }
      if (paramView.length() != 0)
      {
        paramView = paramView.substring(0, paramView.length() - 1);
        locala.jeJ.setText(com.tencent.mm.pluginsdk.ui.d.j.a(locala.jeJ.getContext(), paramView, locala.jeJ.getTextSize()));
        locala.jeJ.setVisibility(0);
        if (j == 0) {
          break label2250;
        }
        locala.jeD.setVisibility(0);
        paramView = (vx)((List)localObject2).get(m);
        if (((vx)((List)localObject2).get(m)).bjS != 2) {
          break label2188;
        }
        k.a(locala.jeE, m.h.fav_list_img_default, paramView, paramg, true, jeu, jeu);
        locala.jeF.setVisibility(8);
      }
      for (;;)
      {
        if (i <= 1) {
          break label2227;
        }
        locala.jeH.setText(localView.getContext().getString(m.i.favorite_img_count, new Object[] { Integer.valueOf(i) }));
        locala.jeH.setVisibility(0);
        locala.jeG.setVisibility(0);
        return localView;
        locala.jeJ.setVisibility(8);
        break;
        label2188:
        locala.jeF.setVisibility(0);
        this.iYh.a(locala.jeE, paramView, paramg, paramView.bJv, m.h.app_attach_file_icon_video, jeu, jeu);
      }
      label2227:
      locala.jeH.setVisibility(8);
      locala.jeG.setVisibility(8);
      return localView;
      label2250:
      locala.jeD.setVisibility(8);
      return localView;
      label2263:
      paramView = paramViewGroup;
      break label1374;
      label2268:
      k = 0;
      break label1257;
      label2274:
      paramView = null;
      break label1200;
    }
  }
  
  public final void a(View paramView, wn paramwn)
  {
    a locala = (a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.l(y.class)).a(paramView, locala.iWQ, paramwn);
  }
  
  public static final class a
    extends a.b
  {
    View jeA;
    View jeB;
    View jeC;
    View jeD;
    ImageView jeE;
    ImageView jeF;
    View jeG;
    TextView jeH;
    TextView jeI;
    TextView jeJ;
    ImageView jeK;
    TextView jeL;
    TextView jeM;
    TextView jeN;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */