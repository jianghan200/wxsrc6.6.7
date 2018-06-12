package com.tencent.mm.plugin.wenote.model;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.kq;
import com.tencent.mm.g.a.qs;
import com.tencent.mm.g.a.qs.b;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wj;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  private static Map<String, String> iYH;
  public static String qoh = an.aLQ() + "/fav_fileicon_video.png";
  public static String qoi = an.aLQ() + "/fav_fileicon_music.png";
  public static String qoj = an.aLQ() + "/fav_list_img_default.png";
  public static String qok = an.aLQ() + "/fav_fileicon_zip.png";
  public static String qol = an.aLQ() + "/fav_fileicon_word.png";
  public static String qom = an.aLQ() + "/fav_fileicon_ppt.png";
  public static String qon = an.aLQ() + "/fav_fileicon_xls.png";
  public static String qoo = an.aLQ() + "/fav_fileicon_txt.png";
  public static String qop = an.aLQ() + "/fav_fileicon_pdf.png";
  public static String qoq = an.aLQ() + "/fav_fileicon_unknow.png";
  private static String[] qor = { "<div>", "<div/>", "<object", "<br", "</" };
  private static String[] qos = { "＜div>", "＜div/>", "＜object", "＜br", "＜/" };
  private static LinkedList<wj> qot = null;
  private static String qou = "";
  
  static
  {
    iYH = new HashMap();
    HashMap localHashMap = new HashMap();
    iYH = localHashMap;
    localHashMap.put("avi", qoh);
    iYH.put("m4v", qoh);
    iYH.put("vob", qoh);
    iYH.put("mpeg", qoh);
    iYH.put("mpe", qoh);
    iYH.put("asx", qoh);
    iYH.put("asf", qoh);
    iYH.put("f4v", qoh);
    iYH.put("flv", qoh);
    iYH.put("mkv", qoh);
    iYH.put("wmv", qoh);
    iYH.put("wm", qoh);
    iYH.put("3gp", qoh);
    iYH.put("mp4", qoh);
    iYH.put("rmvb", qoh);
    iYH.put("rm", qoh);
    iYH.put("ra", qoh);
    iYH.put("ram", qoh);
    iYH.put("mp3pro", qoi);
    iYH.put("vqf", qoi);
    iYH.put("cd", qoi);
    iYH.put("md", qoi);
    iYH.put("mod", qoi);
    iYH.put("vorbis", qoi);
    iYH.put("au", qoi);
    iYH.put("amr", qoi);
    iYH.put("silk", qoi);
    iYH.put("wma", qoi);
    iYH.put("mmf", qoi);
    iYH.put("mid", qoi);
    iYH.put("midi", qoi);
    iYH.put("mp3", qoi);
    iYH.put("aac", qoi);
    iYH.put("ape", qoi);
    iYH.put("aiff", qoi);
    iYH.put("aif", qoi);
    iYH.put("jfif", qoj);
    iYH.put("tiff", qoj);
    iYH.put("tif", qoj);
    iYH.put("jpe", qoj);
    iYH.put("dib", qoj);
    iYH.put("jpeg", qoj);
    iYH.put("jpg", qoj);
    iYH.put("png", qoj);
    iYH.put("bmp", qoj);
    iYH.put("gif", qoj);
    iYH.put("rar", qok);
    iYH.put("zip", qok);
    iYH.put("7z", qok);
    iYH.put("iso", qok);
    iYH.put("cab", qok);
    iYH.put("doc", qol);
    iYH.put("docx", qol);
    iYH.put("ppt", qom);
    iYH.put("pptx", qom);
    iYH.put("xls", qon);
    iYH.put("xlsx", qon);
    iYH.put("txt", qoo);
    iYH.put("rtf", qoo);
    iYH.put("pdf", qop);
    iYH.put("unknown", qoq);
  }
  
  public static void Bn(int paramInt)
  {
    qot = null;
    qou = "";
    Object localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().bZK();
    qou = (String)localObject2;
    Object localObject1 = new LinkedList();
    localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Sm((String)localObject2);
    if ((localObject2 == null) || (((wl)localObject2).rBI.size() <= 1)) {
      localObject1 = null;
    }
    for (;;)
    {
      qot = (LinkedList)localObject1;
      localObject1 = new b(paramInt, 1, qou, qot, null);
      au.DF().a((l)localObject1, 0);
      return;
      localObject2 = ((wl)localObject2).rBI.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        vx localvx = (vx)((Iterator)localObject2).next();
        Object localObject3 = f.o(localvx);
        if ((!bi.oW((String)localObject3)) && (localvx.bjS == 2) && (e.cn((String)localObject3)))
        {
          localObject3 = new wj();
          ((wj)localObject3).rwk = localvx.rzF;
          ((wj)localObject3).rwn = localvx.rzq;
          ((wj)localObject3).rBC = localvx.rzo;
          ((LinkedList)localObject1).add(localObject3);
        }
      }
    }
  }
  
  public static void Sh(String paramString)
  {
    if (bi.oW(paramString)) {}
    File localFile;
    do
    {
      return;
      localFile = new File(paramString);
    } while (!localFile.exists());
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", 5);
      localJSONObject.put("downloaded", true);
      localJSONObject.put("title", localFile.getName());
      localJSONObject.put("content", f.aj(e.cm(paramString)));
      localJSONObject.put("iconPath", Sj(e.cp(paramString)));
      localJSONObject.put("localPath", paramString);
      ap(localJSONObject);
      return;
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.WNNoteLogic", paramString, "", new Object[0]);
    }
  }
  
  public static void Si(String paramString)
  {
    x.i("MicroMsg.WNNoteLogic", "insert location run");
    JSONObject localJSONObject = new JSONObject(paramString);
    x.i("MicroMsg.WNNoteLogic", "insert location run :after invoke");
    paramString = new com.tencent.mm.pluginsdk.location.b(-1L, (float)localJSONObject.getDouble("lat"), (float)localJSONObject.getDouble("lng"), localJSONObject.getInt("scale"), 1);
    paramString = com.tencent.mm.a.g.u(paramString.toString().getBytes());
    paramString = an.aLS() + "/" + paramString + ".png";
    x.i("MicroMsg.WNNoteLogic", "insert location run :filepath:%s", new Object[] { paramString });
    if (FileOp.cn(paramString)) {
      x.i("MicroMsg.WNNoteLogic", "insert location run :filepath:is exsit");
    }
    if (e.cn(paramString)) {
      x.i("MicroMsg.WNNoteLogic", "fileExist suc, use getimagelocalpath");
    }
    for (;;)
    {
      localJSONObject.put("localPath", paramString);
      ap(localJSONObject);
      return;
      x.e("MicroMsg.WNNoteLogic", "Temp file fileExist fail:%s ,use default file", new Object[] { paramString });
      paramString = d.qnT;
    }
  }
  
  public static String Sj(String paramString)
  {
    String str = (String)iYH.get(paramString);
    paramString = str;
    if (str == null) {
      paramString = (String)iYH.get("unknown");
    }
    return paramString;
  }
  
  public static void X(ArrayList<String> paramArrayList)
  {
    JSONObject localJSONObject = new JSONObject();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str2 = (String)paramArrayList.next();
      try
      {
        localJSONObject.put("type", 2);
        localJSONObject.put("downloaded", true);
        String str1 = com.tencent.mm.plugin.wenote.b.c.fw(str2, "");
        str2 = com.tencent.mm.plugin.wenote.b.c.fx(str2, "");
        if (bi.oW(str1)) {
          break;
        }
        if (bi.oW(str2)) {
          return;
        }
        localJSONObject.put("bigImagePath", str1);
        localJSONObject.put("localPath", str2);
        ap(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        x.printErrStackTrace("MicroMsg.WNNoteLogic", localJSONException, "", new Object[0]);
      }
    }
  }
  
  public static ArrayList<com.tencent.mm.plugin.wenote.model.a.b> a(Object paramObject, List<String> paramList, boolean paramBoolean)
  {
    if (paramObject == null) {
      return null;
    }
    paramObject = (ArrayList)paramObject;
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = ((ArrayList)paramObject).iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.tencent.mm.plugin.wenote.model.a.b)((Iterator)localObject1).next();
      if (((com.tencent.mm.plugin.wenote.model.a.b)localObject2).getType() != 1) {
        localArrayList.add(localObject2);
      }
    }
    int i = 0;
    if (i < paramList.size())
    {
      localObject1 = (String)paramList.get(i);
      if (((String)localObject1).trim().equals("<ThisisNoteNodeHrObj>"))
      {
        localObject1 = new com.tencent.mm.plugin.wenote.model.a.g();
        ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).qoH = false;
        ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).qoN = false;
        localArrayList.add(i, localObject1);
      }
      for (;;)
      {
        i += 1;
        break;
        if (!((String)localObject1).trim().equals("<ThisisNoteNodeObj>"))
        {
          localObject2 = new com.tencent.mm.plugin.wenote.model.a.h();
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content = ((String)localObject1);
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).qoH = false;
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).qoN = false;
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).jdM = f.Sf(localObject2.toString());
          if (i < localArrayList.size()) {
            localArrayList.add(i, localObject2);
          } else {
            localArrayList.add(localObject2);
          }
        }
      }
    }
    if (paramBoolean)
    {
      ((ArrayList)paramObject).clear();
      ((ArrayList)paramObject).addAll(localArrayList);
    }
    return localArrayList;
  }
  
  public static void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    String str = r.oN("jpg");
    if (paramBitmap != null) {}
    for (;;)
    {
      try
      {
        com.tencent.mm.sdk.platformtools.c.a(paramBitmap, 100, Bitmap.CompressFormat.JPEG, str, true);
        if (!bi.oW(str)) {
          r.a(str, paramContext);
        }
        paramContext = new File(str);
        if (paramContext.exists())
        {
          long l = paramContext.length() / 1024L;
          int j = 0;
          i = 0;
          if (paramBitmap != null)
          {
            j = paramBitmap.getWidth();
            i = paramBitmap.getHeight();
            paramBitmap.recycle();
          }
          paramContext = new wj();
          paramContext.rwk = com.tencent.mm.a.g.cu(str);
          paramContext = new b(0, 2, qou, qot, paramContext);
          au.DF().a(paramContext, 0);
          paramContext = com.tencent.mm.plugin.report.service.h.mEJ;
          if (!paramBoolean) {
            break label366;
          }
          k = 1;
          paramContext.h(14811, new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l), Integer.valueOf(0), Integer.valueOf(k) });
        }
        return;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.WNNoteLogic", localException, "", new Object[0]);
        x.e("MicroMsg.WNNoteLogic", "save image fail, saveBitmapToImage is null");
        localObject = com.tencent.mm.plugin.report.service.h.mEJ;
        if (!paramBoolean) {}
      }
      for (int i = 1;; i = 0)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject).h(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3), Integer.valueOf(i) });
        localObject = "";
        break;
      }
      x.e("MicroMsg.WNNoteLogic", "save image fail, bigBitmap is null");
      Object localObject = com.tencent.mm.plugin.report.service.h.mEJ;
      if (paramBoolean) {}
      for (i = 1;; i = 0)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject).h(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i) });
        localObject = "";
        break;
      }
      label366:
      int k = 0;
    }
  }
  
  private static void ap(JSONObject paramJSONObject)
  {
    kq localkq = new kq();
    localkq.bVa.type = 6;
    localkq.bVa.bVc = paramJSONObject.toString();
    localkq.bVa.bUR = "";
    a.sFg.m(localkq);
  }
  
  public static void ba(Context paramContext, String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    int i;
    int j;
    if (!bi.oW(paramString))
    {
      i = (int)k.bZe().duration;
      j = (int)f.bD(i);
    }
    try
    {
      localJSONObject.put("downloaded", true);
      localJSONObject.put("length", i);
      localJSONObject.put("lengthStr", f.C(paramContext, j));
      localJSONObject.put("iconPath", an.aLQ() + "/fav_fileicon_recording.png");
      localJSONObject.put("localPath", paramString);
    }
    catch (JSONException paramContext)
    {
      try
      {
        for (;;)
        {
          localJSONObject.put("type", 4);
          i = k.bZe().qoC;
          paramContext = new kq();
          paramContext.bVa.type = 6;
          paramContext.bVa.bVc = localJSONObject.toString();
          paramContext.bVa.bUR = Integer.toString(i);
          a.sFg.m(paramContext);
          return;
          paramContext = paramContext;
          x.printErrStackTrace("MicroMsg.WNNoteLogic", paramContext, "", new Object[0]);
        }
      }
      catch (JSONException paramContext)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.WNNoteLogic", paramContext, "", new Object[0]);
        }
      }
    }
  }
  
  public static void bb(Context paramContext, String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.WNNoteLogic", "dofavnotelink , but localid is null or nil");
      return;
    }
    ch localch = new ch();
    qs localqs = new qs();
    localqs.cbk.cbn = paramString;
    localqs.cbk.cbo = localch;
    localqs.cbk.url = "";
    a.sFg.m(localqs);
    if (!localqs.cbl.bJm)
    {
      if (localch.bJF.bJL == 0) {
        localch.bJF.bJL = R.l.favorite_fail_nonsupport;
      }
      com.tencent.mm.ui.base.h.i(paramContext, localch.bJF.bJL, 0);
      return;
    }
    localch.bJF.activity = ((Activity)paramContext);
    localch.bJF.bJM = 28;
    a.sFg.m(localch);
  }
  
  public static void l(Context paramContext, String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {}
    while (!new File(paramString).exists()) {
      return;
    }
    paramString = new JSONObject();
    long l = paramInt;
    try
    {
      paramInt = (int)f.bD(l);
      paramString.put("type", 4);
      paramString.put("downloaded", true);
      paramString.put("length", paramInt);
      paramString.put("lengthStr", f.C(paramContext, paramInt));
      paramString.put("iconPath", an.aLQ() + "/fav_fileicon_recording.png");
      ap(paramString);
      return;
    }
    catch (JSONException paramContext)
    {
      x.printErrStackTrace("MicroMsg.WNNoteLogic", paramContext, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */