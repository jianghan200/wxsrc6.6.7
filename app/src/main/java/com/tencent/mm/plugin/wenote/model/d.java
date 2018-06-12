package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.g.a.kp.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.m;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.a.o;
import com.tencent.mm.plugin.wenote.model.a.q;
import com.tencent.mm.plugin.wenote.model.a.r;
import com.tencent.mm.plugin.wenote.model.a.s;
import com.tencent.mm.plugin.wenote.model.a.t;
import com.tencent.mm.plugin.wenote.model.a.u;
import com.tencent.mm.plugin.wenote.model.a.v;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

public abstract class d
{
  public static String qnL = "";
  public static HashMap<String, JSONArray> qnM = new HashMap();
  public static boolean qnP = false;
  public static String qnQ = an.aLQ() + "/fav_fileicon_recording.png";
  private static String qnR = an.aLQ() + "/ofm_file_icon.png";
  private static String qnS = an.aLQ() + "/app_attach_file_icon_pic.png";
  public static String qnT = an.aLQ() + "/location_msg.png";
  public static String qnU = an.aLQ() + "/note_fav_not_support.png";
  public l qnE = null;
  public com.tencent.mm.plugin.fav.a.g qnF;
  public HashMap<String, v> qnG = new HashMap();
  public HashMap<String, String> qnH = new HashMap();
  public HashMap<String, n> qnI = new HashMap();
  public String qnJ = "WeNote_0";
  public String qnK = "";
  public boolean qnN = false;
  public wl qnO = new wl();
  
  public static wl a(String paramString, List<n> paramList, vx paramvx)
  {
    LinkedList localLinkedList = new LinkedList();
    wl localwl = new wl();
    if (paramvx != null) {
      localLinkedList.add(paramvx);
    }
    for (;;)
    {
      paramString = paramList.iterator();
      for (;;)
      {
        if (!paramString.hasNext()) {
          break label914;
        }
        paramvx = (n)paramString.next();
        if (paramvx != null)
        {
          if (paramvx.qpb == null) {
            break;
          }
          localLinkedList.add(paramvx.qpb);
        }
      }
      if ((!bi.oW(paramString)) && (paramString.length() > 0))
      {
        paramString = an.aLT();
        paramvx = new vx();
        paramvx.CF(8);
        paramvx.UY("WeNoteHtmlFile");
        paramvx.kY(true);
        paramvx.fO(com.tencent.mm.a.e.cm(paramString));
        paramvx.UL(".htm");
        localLinkedList.add(paramvx);
        localObject1 = f.o(paramvx);
        if (!FileOp.cn((String)localObject1)) {
          FileOp.y(paramString, (String)localObject1);
        }
        paramvx.UP((String)localObject1);
      }
    }
    Object localObject1 = new vx();
    Object localObject2 = new vy();
    Object localObject3 = new vz();
    ((vz)localObject3).CJ(6);
    ((vy)localObject2).c((vz)localObject3);
    ((vx)localObject1).a((vy)localObject2);
    switch (paramvx.type)
    {
    }
    for (;;)
    {
      ((vx)localObject1).UY(paramvx.qpc);
      localLinkedList.add(localObject1);
      break;
      ((vx)localObject1).CF(2);
      localObject2 = (o)paramvx;
      localObject3 = ((o)localObject2).qpe;
      ((vx)localObject1).UP((String)localObject3);
      if (!bi.oW(((o)paramvx).jdM))
      {
        ((vx)localObject1).UO(paramvx.jdM);
        ((vx)localObject1).UQ(((o)localObject2).bVd);
      }
      for (;;)
      {
        ((vx)localObject1).CF(2);
        break;
        ((vx)localObject1).UO(f.Sf(localObject2.toString()));
        com.tencent.mm.sdk.platformtools.c.c((String)localObject3, 150, 150, Bitmap.CompressFormat.JPEG, 90, f.c((vx)localObject1));
        ((vx)localObject1).UQ(f.c((vx)localObject1));
      }
      ((vx)localObject1).CF(6);
      localObject2 = (r)paramvx;
      ((vx)localObject1).UO(paramvx.jdM);
      localObject3 = new we();
      ((we)localObject3).Vn(((r)localObject2).dRH);
      ((we)localObject3).z(((r)localObject2).lat);
      ((we)localObject3).y(((r)localObject2).lng);
      ((we)localObject3).CK((int)((r)localObject2).qpq);
      ((we)localObject3).Vo(((r)localObject2).kFa);
      ((vx)localObject1).kX(true);
      ((vx)localObject1).kY(true);
      ((vx)localObject1).rAi.a((we)localObject3);
      continue;
      ((vx)localObject1).CF(8);
      localObject2 = (t)paramvx;
      ((vx)localObject1).UO(paramvx.jdM);
      ((vx)localObject1).UP(((t)localObject2).bVd);
      ((vx)localObject1).kY(true);
      ((vx)localObject1).UB(((t)localObject2).title);
      ((vx)localObject1).UC(((t)localObject2).content);
      ((vx)localObject1).UL(((t)localObject2).qoT);
      continue;
      ((vx)localObject1).CF(3);
      localObject2 = (u)paramvx;
      ((vx)localObject1).UO(paramvx.jdM);
      localObject3 = ((u)localObject2).bVd;
      if ((bi.oW((String)localObject3)) || (((String)localObject3).length() == 0)) {
        break;
      }
      ((vx)localObject1).UP((String)localObject3);
      ((vx)localObject1).CE(((u)localObject2).length);
      ((vx)localObject1).kY(true);
      ((vx)localObject1).UL(((u)localObject2).qoT);
      continue;
      ((vx)localObject1).CF(4);
      localObject2 = (j)paramvx;
      ((vx)localObject1).UO(paramvx.jdM);
      ((vx)localObject1).UP(((j)localObject2).bVd);
      ((vx)localObject1).UQ(((j)localObject2).bOX);
      localObject3 = com.tencent.mm.plugin.sight.base.d.Lo(((j)localObject2).bVd);
      if (localObject3 != null) {
        ((vx)localObject1).CE(((com.tencent.mm.plugin.sight.base.a)localObject3).bvB());
      }
      for (;;)
      {
        ((vx)localObject1).UL(((j)localObject2).qoT);
        break;
        ((vx)localObject1).CE(1);
      }
      if (!qnP)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(14547, new Object[] { Integer.valueOf(6) });
        qnP = true;
      }
      ((vx)localObject1).CF(1);
      ((vx)localObject1).kX(true);
      ((vx)localObject1).kY(true);
      localObject2 = (com.tencent.mm.plugin.wenote.model.a.h)paramvx;
      ((vx)localObject1).UO(paramvx.jdM);
      ((vx)localObject1).UC(com.tencent.mm.plugin.wenote.b.b.Sp(((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content));
      if ((!bi.oW(((vx)localObject1).desc)) && (((vx)localObject1).desc.length() > 1000)) {
        ((vx)localObject1).UC(((vx)localObject1).desc.substring(0, 1000));
      }
    }
    label914:
    a(localLinkedList, paramList);
    localwl.ar(localLinkedList);
    return localwl;
  }
  
  private static void a(LinkedList<vx> paramLinkedList, List<n> paramList)
  {
    x.i("MicroMsg.WNNoteBase", "do WNNoteBase.setExtraInfo");
    if (paramLinkedList.size() > 0)
    {
      int j = paramLinkedList.size();
      int i = 0;
      if (i < j)
      {
        vx localvx = (vx)paramLinkedList.get(i);
        String str1;
        Object localObject;
        if ((i > 0) && (bi.oW(localvx.rzo)))
        {
          localvx.UO(f.Sf(localvx.toString()));
          str1 = null;
          localObject = str1;
          if (i - 1 >= 0)
          {
            localObject = str1;
            if (i - 1 < paramList.size())
            {
              localObject = str1;
              if (paramList.size() > 0) {
                localObject = (n)paramList.get(i - 1);
              }
            }
          }
          if ((localObject != null) && (((n)localObject).qpc != null) && (((n)localObject).qpc.equals(localvx.rAq))) {
            ((n)localObject).jdM = localvx.jdM;
          }
        }
        if ((i > 0) && (!bi.oW(localvx.rzo)) && (!bi.oW(localvx.rzq)))
        {
          localvx.kX(true);
          localvx.kY(true);
        }
        for (;;)
        {
          i += 1;
          break;
          x.i("MicroMsg.WNNoteBase", "datalist.get[%d].type = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(localvx.bjS) });
          localObject = localvx.rzM;
          String str2;
          if (FileOp.cn((String)localObject))
          {
            x.i("MicroMsg.WNNoteBase", "datapath exist,pathname:%s", new Object[] { localObject });
            str1 = com.tencent.mm.a.g.cu((String)localObject);
            str2 = com.tencent.mm.a.g.cv((String)localObject);
            localvx.UM(str1);
            localvx.UN(str2);
            localvx.fO(new File((String)localObject).length());
            str1 = f.o(localvx);
            boolean bool = FileOp.cn(str1);
            if ((!((String)localObject).equals(str1)) && (!bool) && (!localvx.rAq.equals("WeNoteHtmlFile"))) {
              FileOp.y((String)localObject, str1);
            }
          }
          for (;;)
          {
            localObject = localvx.rzO;
            if (!FileOp.cn((String)localObject)) {
              break label509;
            }
            x.i("MicroMsg.WNNoteBase", "thumbPath exist,pathname:%s", new Object[] { localObject });
            str1 = com.tencent.mm.a.g.cu((String)localObject);
            str2 = com.tencent.mm.a.g.cv((String)localObject);
            localvx.UR(str1);
            localvx.US(str2);
            localvx.fP(new File((String)localObject).length());
            str1 = f.c(localvx);
            if ((((String)localObject).equals(str1)) || (FileOp.cn(str1))) {
              break;
            }
            FileOp.y((String)localObject, str1);
            break;
            x.e("MicroMsg.WNNoteBase", "datapath not exist, %s not exist!", new Object[] { localObject });
          }
          label509:
          x.e("MicroMsg.WNNoteBase", "thumbPath not exist, pathname:%s", new Object[] { localObject });
        }
      }
    }
  }
  
  public void Sd(String paramString) {}
  
  public final vx Se(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, dataId is null");
      return null;
    }
    String str = (String)this.qnH.get(paramString);
    if (bi.oW(str))
    {
      x.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find editorId by dataId: %s", new Object[] { paramString });
      return null;
    }
    paramString = (n)this.qnI.get(str);
    if (paramString == null)
    {
      x.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find item by editorId: %s", new Object[] { str });
      return null;
    }
    return paramString.qpb;
  }
  
  public abstract void a(vx paramvx, String paramString);
  
  public abstract void aX(Context paramContext, String paramString);
  
  public abstract void aY(Context paramContext, String paramString);
  
  public abstract void aZ(Context paramContext, String paramString);
  
  public abstract String b(vx paramvx);
  
  public final void b(kp paramkp)
  {
    if (paramkp.bUP == null) {
      x.e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, opertionevent.data is null, retutn");
    }
    Object localObject1;
    do
    {
      return;
      localObject1 = paramkp.bUP.bUR;
      localObject2 = (n)this.qnI.get(localObject1);
      if (localObject2 == null)
      {
        x.e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is null, retutn");
        return;
      }
      x.i("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is %d", new Object[] { Integer.valueOf(((n)localObject2).type) });
      switch (((n)localObject2).type)
      {
      case 4: 
      default: 
        return;
      case 2: 
        aZ(paramkp.bUP.context, (String)localObject1);
        return;
      case 5: 
        aX(paramkp.bUP.context, (String)localObject1);
        return;
      case 3: 
        aY(paramkp.bUP.context, (String)localObject1);
        return;
      }
      paramkp = paramkp.bUP.context;
      localObject1 = (j)this.qnI.get(localObject1);
    } while (bi.oW(((j)localObject1).bVd));
    if (!com.tencent.mm.a.e.cn(((j)localObject1).bVd))
    {
      localObject2 = Se(((j)localObject1).jdM);
      if (localObject2 == null)
      {
        x.e("MicroMsg.WNNoteBase", "goToVideoPlay, favData is null");
        return;
      }
      n((vx)localObject2);
    }
    Object localObject2 = new Intent();
    if (this.qnF == null) {
      ((Intent)localObject2).putExtra("key_detail_info_id", 0);
    }
    for (;;)
    {
      ((Intent)localObject2).putExtra("key_detail_fav_path", ((j)localObject1).bVd);
      ((Intent)localObject2).putExtra("key_detail_fav_thumb_path", ((j)localObject1).bOX);
      ((Intent)localObject2).putExtra("key_detail_fav_video_duration", ((j)localObject1).duration);
      ((Intent)localObject2).putExtra("key_detail_data_id", ((j)localObject1).jdM);
      ((Intent)localObject2).putExtra("key_detail_statExtStr", "");
      ((Intent)localObject2).putExtra("key_detail_fav_video_show_download_status", true);
      com.tencent.mm.plugin.fav.a.b.a(paramkp, ".ui.detail.FavoriteVideoPlayUI", (Intent)localObject2, 1);
      return;
      ((Intent)localObject2).putExtra("key_detail_info_id", this.qnF.field_localId);
    }
  }
  
  public String bZc()
  {
    return "";
  }
  
  public abstract String c(vx paramvx);
  
  public final void cR(List<vx> paramList)
  {
    v localv = new v();
    Object localObject1 = null;
    Iterator localIterator = paramList.iterator();
    paramList = (List<vx>)localObject1;
    label23:
    while (localIterator.hasNext())
    {
      Object localObject3 = (vx)localIterator.next();
      n localn = new n();
      localn.qpc = ((vx)localObject3).rAq;
      if (((vx)localObject3).bjS == 1) {
        localn.qpc = "-1";
      }
      if (bi.oW(localn.qpc))
      {
        x.e("MicroMsg.WNNoteBase", "Note: DataItem.htmlid is null");
        paramList = b((vx)localObject3);
        if ((!bi.oW(paramList)) && (com.tencent.mm.a.e.cn(paramList)))
        {
          f.t(this.qnE.bVe, paramList);
          return;
        }
        n((vx)localObject3);
        return;
      }
      if (localn.qpc.equals("WeNoteHtmlFile"))
      {
        localObject1 = b((vx)localObject3);
        if ((!bi.oW((String)localObject1)) && (com.tencent.mm.a.e.cn((String)localObject1))) {}
        for (;;)
        {
          try
          {
            localv.qpu = com.tencent.mm.plugin.wenote.b.c.Sv((String)localObject1);
            localObject1 = com.tencent.mm.plugin.wenote.b.b.So(localv.qpu);
            paramList = (List<vx>)localObject1;
            try
            {
              x.i("MicroMsg.WNNoteBase", "local html file exist,dataid: %s", new Object[] { ((vx)localObject3).jdM });
              qnM.containsKey(localv.qpu);
              x.i("MicroMsg.WNNoteBase", "dealWNNoteInfo,WeNoteHtmlFile, cdnurl is null :%B, cdnkey is null : %B ", new Object[] { Boolean.valueOf(bi.oW(((vx)localObject3).rzo)), Boolean.valueOf(bi.oW(((vx)localObject3).rzq)) });
            }
            catch (Exception localException1) {}
          }
          catch (Exception localException2)
          {
            int i;
            int j;
            Object localObject4;
            Object localObject2;
            Object localObject5;
            String str;
            continue;
          }
          x.printErrStackTrace("MicroMsg.WNNoteBase", localException1, "", new Object[0]);
          continue;
          n((vx)localObject3);
          localv.qpw = true;
          x.i("MicroMsg.WNNoteBase", "local html file not exist,download htmlfile,dataid: %s", new Object[] { ((vx)localObject3).jdM });
          this.qnH.put(((vx)localObject3).jdM, localn.qpc);
        }
      }
      if (!localn.qpc.equals("-1"))
      {
        i = bi.getInt(localn.qpc.substring(7), 0);
        j = bi.getInt(this.qnJ.substring(7), 0);
        localObject4 = new StringBuilder("WeNote_");
        if (j <= i) {
          break label634;
        }
      }
      label634:
      for (localObject2 = String.valueOf(j);; localObject2 = String.valueOf(i))
      {
        this.qnJ = ((String)localObject2);
        localn.jdM = ((vx)localObject3).jdM;
        switch (((vx)localObject3).bjS)
        {
        case 5: 
        case 7: 
        default: 
          if (((vx)localObject3).bjS <= 0) {
            break label23;
          }
          localObject2 = new i();
          ((m)localObject2).qpc = localn.qpc;
          ((m)localObject2).type = 0;
          ((m)localObject2).jdM = localn.jdM;
          ((m)localObject2).qpb = ((vx)localObject3);
          localObject3 = b((vx)localObject3);
          ((m)localObject2).qpd = true;
          ((m)localObject2).bVd = ((String)localObject3);
          ((m)localObject2).fTs = qnU;
          ((m)localObject2).title = ad.getContext().getResources().getString(R.l.favorite_record_no_support_type);
          ((m)localObject2).content = ad.getContext().getResources().getString(R.l.favorite_oldversion_content);
          localv.qpv.add(localObject2);
          this.qnI.put(localn.qpc, localObject2);
          break label23;
        }
      }
      if (!bi.oW(((vx)localObject3).desc)) {
        if ((localv.qpv.size() > 0) && (localv.qpv.get(localv.qpv.size() - 1) != null) && (((n)localv.qpv.get(localv.qpv.size() - 1)).qpc.equals("-1")))
        {
          localObject2 = (s)localv.qpv.get(localv.qpv.size() - 1);
          ((s)localObject2).content += ((vx)localObject3).desc;
        }
        else
        {
          localObject2 = new com.tencent.mm.plugin.wenote.model.a.h();
          ((s)localObject2).qpc = localn.qpc;
          ((s)localObject2).content = ((vx)localObject3).desc;
          localv.qpv.add(localObject2);
          continue;
          localObject2 = new com.tencent.mm.plugin.wenote.model.a.e();
          ((o)localObject2).qpc = localn.qpc;
          ((o)localObject2).type = 2;
          ((o)localObject2).jdM = localn.jdM;
          ((o)localObject2).qpb = ((vx)localObject3);
          localObject4 = b((vx)localObject3);
          if (!bi.oW((String)localObject4))
          {
            localObject5 = (String)localObject4 + "_bigthumb";
            str = c((vx)localObject3);
            if (!com.tencent.mm.a.e.cn(str)) {
              a((vx)localObject3, str);
            }
            if (com.tencent.mm.a.e.cn((String)localObject4))
            {
              ((o)localObject2).qpd = true;
              com.tencent.mm.plugin.wenote.b.c.fx((String)localObject4, (String)localObject5);
            }
            for (;;)
            {
              ((o)localObject2).bVd = ((String)localObject5);
              ((o)localObject2).qpe = ((String)localObject4);
              localv.qpv.add(localObject2);
              this.qnI.put(localn.qpc, localObject2);
              break;
              n((vx)localObject3);
              ((o)localObject2).qpd = false;
              this.qnH.put(((vx)localObject3).jdM, localn.qpc);
            }
            localObject2 = new k();
            ((u)localObject2).qpc = localn.qpc;
            ((u)localObject2).type = 4;
            ((u)localObject2).jdM = localn.jdM;
            ((u)localObject2).qpb = ((vx)localObject3);
            localObject4 = b((vx)localObject3);
            if ((!bi.oW((String)localObject4)) && (com.tencent.mm.a.e.cn((String)localObject4)))
            {
              ((u)localObject2).qpd = true;
              ((u)localObject2).fTs = qnQ;
              ((u)localObject2).length = ((vx)localObject3).duration;
            }
            for (;;)
            {
              ((u)localObject2).bVd = ((String)localObject4);
              ((u)localObject2).qps = f.C(ad.getContext(), (int)f.bD(((vx)localObject3).duration));
              ((u)localObject2).bOT = ((vx)localObject3).duration;
              localObject4 = new fz();
              ((fz)localObject4).bOL.type = 17;
              ((fz)localObject4).bOL.bON = ((vx)localObject3);
              com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject4);
              ((u)localObject2).bOS = ((fz)localObject4).bOM.ret;
              ((u)localObject2).qoT = ((vx)localObject3).rzD;
              localv.qpv.add(localObject2);
              this.qnI.put(localn.qpc, localObject2);
              break;
              n((vx)localObject3);
              ((u)localObject2).qpd = false;
              ((u)localObject2).qpt = ad.getContext().getString(R.l.favorite_wenote_voice_downloading);
              this.qnH.put(((vx)localObject3).jdM, localn.qpc);
            }
            localObject2 = new q();
            ((q)localObject2).bSx = ((float)((vx)localObject3).rAi.rAL.lat);
            ((q)localObject2).dVI = ((float)((vx)localObject3).rAi.rAL.lng);
            ((q)localObject2).bSz = ((vx)localObject3).rAi.rAL.bSz;
            ((q)localObject2).qpn = ((vx)localObject3).rAi.rAL.label;
            ((q)localObject2).qpo = ((vx)localObject3).rAi.rAL.bWB;
            ((q)localObject2).qpp = ((vx)localObject3).rAq;
            localObject4 = new com.tencent.mm.plugin.wenote.model.a.f();
            ((r)localObject4).qpc = localn.qpc;
            ((r)localObject4).type = 3;
            ((r)localObject4).jdM = localn.jdM;
            ((r)localObject4).qpb = ((vx)localObject3);
            ((r)localObject4).qpd = true;
            ((r)localObject4).kFa = ((q)localObject2).qpo;
            ((r)localObject4).dRH = ((q)localObject2).qpn;
            ((r)localObject4).lat = ((q)localObject2).bSx;
            ((r)localObject4).lng = ((q)localObject2).dVI;
            ((r)localObject4).qpq = ((q)localObject2).bSz;
            ((r)localObject4).bVd = "";
            localv.qpv.add(localObject4);
            this.qnI.put(localn.qpc, localObject4);
            continue;
            localObject2 = new com.tencent.mm.plugin.wenote.model.a.c();
            ((t)localObject2).qpc = localn.qpc;
            ((t)localObject2).type = 5;
            ((t)localObject2).jdM = localn.jdM;
            ((t)localObject2).qpb = ((vx)localObject3);
            localObject4 = b((vx)localObject3);
            if ((!bi.oW((String)localObject4)) && (com.tencent.mm.a.e.cn((String)localObject4)))
            {
              ((t)localObject2).qpd = true;
              ((t)localObject2).bVd = ((String)localObject4);
            }
            for (;;)
            {
              ((t)localObject2).fTs = h.Sj(((vx)localObject3).rzD);
              ((t)localObject2).title = ((vx)localObject3).title;
              ((t)localObject2).content = ((vx)localObject3).desc;
              ((t)localObject2).qoT = ((vx)localObject3).rzD;
              if (bi.oW(((t)localObject2).content)) {
                ((t)localObject2).content = f.aj((float)((vx)localObject3).rzJ);
              }
              localv.qpv.add(localObject2);
              this.qnI.put(localn.qpc, localObject2);
              break;
              ((t)localObject2).qpd = false;
              this.qnH.put(((vx)localObject3).jdM, localn.qpc);
            }
            localObject2 = new j();
            ((j)localObject2).qpc = localn.qpc;
            ((j)localObject2).type = 6;
            ((j)localObject2).jdM = localn.jdM;
            ((j)localObject2).qpb = ((vx)localObject3);
            if (localObject3 != null) {
              ((j)localObject2).duration = ((vx)localObject3).duration;
            }
            ((j)localObject2).bOX = c((vx)localObject3);
            localObject4 = b((vx)localObject3);
            ((j)localObject2).bVd = ((String)localObject4);
            if ((!bi.oW(((j)localObject2).bOX)) && (!com.tencent.mm.a.e.cn(((j)localObject2).bOX)))
            {
              if (!com.tencent.mm.a.e.cn((String)localObject4)) {
                break label1946;
              }
              localObject5 = com.tencent.mm.plugin.fav.ui.c.By((String)localObject4);
              if (localObject5 == null) {}
            }
            for (;;)
            {
              try
              {
                x.i("MicroMsg.WNNoteBase", "add fav service: create thumbpath bitmap, saveBitmapToImage ");
                com.tencent.mm.pluginsdk.i.e.a((Bitmap)localObject5, Bitmap.CompressFormat.JPEG, ((j)localObject2).bOX);
                if ((bi.oW((String)localObject4)) || (!com.tencent.mm.a.e.cn((String)localObject4))) {
                  break label1997;
                }
                ((j)localObject2).qpd = true;
                localv.qpv.add(localObject2);
                this.qnI.put(localn.qpc, localObject2);
              }
              catch (Exception localException3)
              {
                x.printErrStackTrace("MicroMsg.WNNoteBase", localException3, "", new Object[0]);
                continue;
              }
              label1946:
              a((vx)localObject3, ((j)localObject2).bOX);
              this.qnH.put(((vx)localObject3).jdM + "_t", localn.qpc);
              continue;
              label1997:
              ((j)localObject2).qpd = false;
              this.qnH.put(((vx)localObject3).jdM, localn.qpc);
            }
          }
        }
      }
    }
    if ((paramList != null) && (paramList.size() > 0)) {
      h.a(localv.qpv, paramList, true);
    }
    if (this.qnE.bJC == -1L)
    {
      this.qnG.put(Long.toString(this.qnE.bVe), localv);
      return;
    }
    this.qnG.put(Long.toString(this.qnE.bJC), localv);
  }
  
  public abstract void n(vx paramvx);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */