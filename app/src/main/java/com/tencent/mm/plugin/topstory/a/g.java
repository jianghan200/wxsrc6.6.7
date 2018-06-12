package com.tencent.mm.plugin.topstory.a;

import android.content.Context;
import com.tencent.mm.plugin.websearch.api.ae;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.bnq;
import com.tencent.mm.protocal.c.bth;
import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.protocal.c.cfn;
import com.tencent.mm.protocal.c.ps;
import com.tencent.mm.protocal.c.xe;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
{
  public static final bth O(Map<String, Object> paramMap)
  {
    int j = 0;
    bth localbth = new bth();
    localbth.bHt = p.t(paramMap, "query");
    localbth.scene = p.c(paramMap, "scene", 21);
    localbth.sqA = p.zK(localbth.scene);
    localbth.fuu = p.t(paramMap, "searchId");
    localbth.sqP = true;
    Object localObject2 = p.t(paramMap, "videoId");
    Object localObject1 = new ArrayList();
    int i;
    try
    {
      JSONArray localJSONArray = new JSONArray(p.t(paramMap, "videoUrls"));
      if (localJSONArray.length() > 0)
      {
        i = 0;
        while (i < localJSONArray.length())
        {
          ((ArrayList)localObject1).add(localJSONArray.getString(i));
          i += 1;
        }
      }
      if (bi.oW((String)localObject2)) {
        break label888;
      }
    }
    catch (JSONException localJSONException2) {}
    Object localObject3 = "http://shp.qpic.cn/qqvideo_ori/0/" + (String)localObject2 + String.format("_%s_%s/0", new Object[] { Integer.valueOf(496), Integer.valueOf(280) });
    localbth.sqM = new bti();
    localbth.sqM.title = p.t(paramMap, "title");
    localbth.sqM.sqQ = ((String)localObject3);
    localbth.sqM.sqR = p.c(paramMap, "mediaDuration", 0);
    localbth.sqM.sqS = ((String)localObject2);
    localbth.sqM.dwJ = 496;
    localbth.sqM.dwI = 280;
    localbth.sqM.pLz = p.t(paramMap, "strPlayCount");
    localbth.sqM.ixy = p.t(paramMap, "shareUrl");
    localbth.sqM.ixz = p.t(paramMap, "shareTitle");
    localbth.sqM.pLA = p.t(paramMap, "titleUrl");
    localbth.sqM.nzH = p.t(paramMap, "shareDesc");
    localbth.sqM.pLw = p.t(paramMap, "shareImgUrl");
    localbth.sqM.pLx = p.t(paramMap, "shareString");
    localbth.sqM.pLy = p.t(paramMap, "shareStringUrl");
    localbth.sqM.bhd = p.t(paramMap, "source");
    localbth.sqM.lRt = p.t(paramMap, "sourceUrl");
    localbth.sqM.sqT = p.a(paramMap, "relevant_category", -1L);
    localbth.sqM.sqU = p.t(paramMap, "shareOpenId");
    localbth.sqM.sqZ = p.t(paramMap, "docID");
    localbth.sqM.srb = p.a(paramMap, "videoSize", 0L);
    localbth.sqM.timestamp = bi.VG();
    localbth.sqM.sqW = p.c(paramMap, "itemType", 0);
    try
    {
      localObject2 = new JSONObject(p.t(paramMap, "block"));
      localbth.sqM.sra = ((JSONObject)localObject2).optLong("resultType");
      localbth.sqM.bHu = ((JSONObject)localObject2).optLong("type");
      localbth.sqM.sqV = p.t(paramMap, "expand");
      localbth.sqM.srd.addAll((Collection)localObject1);
      localbth.sqM.videoUrl = cz((List)localObject1);
      localObject1 = p.t(paramMap, "tagList");
      if (!bi.oW((String)localObject1)) {
        try
        {
          localObject1 = new JSONArray((String)localObject1);
          i = 0;
          while (i < ((JSONArray)localObject1).length())
          {
            localObject2 = ((JSONArray)localObject1).getJSONObject(i);
            localObject3 = new bnq();
            ((bnq)localObject3).id = ((JSONObject)localObject2).optString("id");
            ((bnq)localObject3).bSc = ((JSONObject)localObject2).optString("wording");
            ((bnq)localObject3).slJ = ((JSONObject)localObject2).optLong("category");
            ((bnq)localObject3).actionType = ((JSONObject)localObject2).optInt("actionType");
            ((bnq)localObject3).url = ((JSONObject)localObject2).optString("url");
            ((bnq)localObject3).title = ((JSONObject)localObject2).optString("title");
            ((bnq)localObject3).hwC = ((JSONObject)localObject2).optString("subTitle");
            localbth.sqM.rBV.add(localObject3);
            i += 1;
          }
          localbth.sqL = localbth.sqM.sqT;
        }
        catch (Exception localException) {}
      }
      localbth.sqO = localbth.sqM.sqT;
      localbth.sqI = p.t(paramMap, "expand");
      localbth.sqJ = localbth.fuu;
      localbth.sqH = localbth.sqM.sqS;
      paramMap = p.t(paramMap, "extReqParams");
      if (!bi.oW(paramMap)) {
        try
        {
          paramMap = new JSONArray(paramMap);
          i = j;
          while (i < paramMap.length())
          {
            JSONObject localJSONObject = paramMap.getJSONObject(i);
            localObject2 = new ps();
            ((ps)localObject2).aAL = localJSONObject.optString("key", "");
            ((ps)localObject2).rtU = localJSONObject.optInt("uintValue", 0);
            ((ps)localObject2).rtV = localJSONObject.optString("textValue", "");
            localbth.pKZ.add(localObject2);
            i += 1;
          }
          return localbth;
        }
        catch (Exception paramMap) {}
      }
    }
    catch (JSONException localJSONException1)
    {
      label888:
      for (;;) {}
    }
  }
  
  public static String Os(String paramString)
  {
    return ad.getContext().getCacheDir() + "topstory/" + paramString + "/";
  }
  
  public static final bth a(bth parambth)
  {
    bth localbth = new bth();
    localbth.sqA = parambth.sqA;
    localbth.scene = parambth.scene;
    localbth.bHt = parambth.bHt;
    localbth.fuu = parambth.fuu;
    localbth.sqM = parambth.sqM;
    localbth.sqL = parambth.sqL;
    localbth.sqI = parambth.sqI;
    localbth.sqJ = parambth.sqJ;
    localbth.sqK = parambth.sqK;
    localbth.sqH = parambth.sqH;
    localbth.sqO = parambth.sqO;
    return localbth;
  }
  
  public static final bth a(cfn paramcfn, int paramInt, String paramString)
  {
    int j = 0;
    bth localbth = new bth();
    localbth.sqA = p.zK(paramInt);
    localbth.sqM = new bti();
    localbth.sqM.title = paramcfn.ixz;
    localbth.sqM.sqZ = ("video-" + paramcfn.pLr);
    localbth.sqM.sqS = paramcfn.pLr;
    localbth.sqM.sqQ = ("http://shp.qpic.cn/qqvideo_ori/0/" + paramcfn.pLr + String.format("_%s_%s/0", new Object[] { Integer.valueOf(496), Integer.valueOf(280) }));
    localbth.sqM.pLz = paramcfn.pLz;
    localbth.sqM.bhd = paramcfn.bhd;
    localbth.sqM.lRt = paramcfn.lRt;
    localbth.sqM.sqV = paramcfn.pLs;
    localbth.sqM.sqX = paramcfn.pLs;
    localbth.sqM.pLx = paramcfn.pLx;
    localbth.sqM.dwJ = 496;
    localbth.sqM.dwI = 280;
    localbth.sqM.timestamp = System.currentTimeMillis();
    int i;
    Object localObject;
    if (!bi.oW(paramcfn.pLC)) {
      try
      {
        JSONArray localJSONArray = new JSONArray(paramcfn.pLC);
        i = 0;
        while (i < localJSONArray.length())
        {
          localObject = localJSONArray.getJSONObject(i);
          bnq localbnq = new bnq();
          localbnq.id = ((JSONObject)localObject).optString("id");
          localbnq.bSc = ((JSONObject)localObject).optString("wording");
          localbnq.slJ = ((JSONObject)localObject).optLong("category");
          localbnq.actionType = ((JSONObject)localObject).optInt("actionType");
          localbnq.url = ((JSONObject)localObject).optString("url");
          localbnq.title = ((JSONObject)localObject).optString("title");
          localbnq.hwC = ((JSONObject)localObject).optString("subTitle");
          localbth.sqM.rBV.add(localbnq);
          i += 1;
        }
        localbth.sqH = paramcfn.pLr;
      }
      catch (Exception localException) {}
    }
    localbth.sqI = paramcfn.pLs;
    localbth.sqJ = paramcfn.pLt;
    localbth.sqK = paramcfn.pLu;
    localbth.sqL = paramcfn.pLv;
    localbth.sqO = paramcfn.pLv;
    localbth.sqP = false;
    if (!bi.oW(paramcfn.pLB)) {
      try
      {
        paramcfn = new JSONArray(paramcfn.pLB);
        i = j;
        while (i < paramcfn.length())
        {
          JSONObject localJSONObject = paramcfn.getJSONObject(i);
          localObject = new ps();
          ((ps)localObject).aAL = localJSONObject.optString("key", "");
          ((ps)localObject).rtU = localJSONObject.optInt("uintValue", 0);
          ((ps)localObject).rtV = localJSONObject.optString("textValue", "");
          localbth.pKZ.add(localObject);
          i += 1;
        }
        localbth.fuu = "";
      }
      catch (Exception paramcfn) {}
    }
    localbth.scene = paramInt;
    localbth.bHt = paramString;
    return localbth;
  }
  
  public static final bth ab(JSONObject paramJSONObject)
  {
    int j = 0;
    bth localbth = new bth();
    localbth.bHt = paramJSONObject.optString("query", "");
    localbth.scene = paramJSONObject.optInt("scene", 21);
    localbth.sqA = p.zK(localbth.scene);
    localbth.fuu = paramJSONObject.optString("searchId", "");
    localbth.sqP = true;
    Object localObject3 = paramJSONObject.optString("videoId", "");
    Object localObject1 = new ArrayList();
    int i;
    try
    {
      JSONArray localJSONArray = new JSONArray(paramJSONObject.optString("videoUrls", ""));
      if (localJSONArray.length() > 0)
      {
        i = 0;
        while (i < localJSONArray.length())
        {
          ((ArrayList)localObject1).add(localJSONArray.getString(i));
          i += 1;
        }
      }
      if (bi.oW((String)localObject3)) {
        break label1067;
      }
    }
    catch (JSONException localJSONException3) {}
    Object localObject4 = "http://shp.qpic.cn/qqvideo_ori/0/" + (String)localObject3 + String.format("_%s_%s/0", new Object[] { Integer.valueOf(496), Integer.valueOf(280) });
    localbth.sqM = new bti();
    localbth.sqM.title = paramJSONObject.optString("title", "");
    localbth.sqM.sqQ = ((String)localObject4);
    localbth.sqM.sqR = paramJSONObject.optInt("mediaDuration", 0);
    localbth.sqM.sqS = ((String)localObject3);
    localbth.sqM.dwJ = 496;
    localbth.sqM.dwI = 280;
    localbth.sqM.pLz = paramJSONObject.optString("strPlayCount", "");
    localbth.sqM.ixy = paramJSONObject.optString("shareUrl", "");
    localbth.sqM.ixz = paramJSONObject.optString("shareTitle", "");
    localbth.sqM.pLA = paramJSONObject.optString("titleUrl", "");
    localbth.sqM.nzH = paramJSONObject.optString("shareDesc", "");
    localbth.sqM.pLw = paramJSONObject.optString("shareImgUrl", "");
    localbth.sqM.pLx = paramJSONObject.optString("shareString", "");
    localbth.sqM.pLy = paramJSONObject.optString("shareStringUrl", "");
    localbth.sqM.bhd = paramJSONObject.optString("source", "");
    localbth.sqM.lRt = paramJSONObject.optString("sourceUrl", "");
    localbth.sqM.sqT = paramJSONObject.optInt("relevant_category", -1);
    localbth.sqM.sqU = paramJSONObject.optString("shareOpenId", "");
    localbth.sqM.sqZ = paramJSONObject.optString("docID", "");
    localbth.sqM.srb = paramJSONObject.optInt("videoSize", 0);
    localbth.sqM.timestamp = bi.VG();
    localbth.sqM.sqW = paramJSONObject.optInt("itemType", 0);
    try
    {
      localObject3 = new JSONObject(paramJSONObject.optString("block", ""));
      localbth.sqM.sra = ((JSONObject)localObject3).optLong("resultType");
      localbth.sqM.bHu = ((JSONObject)localObject3).optLong("type");
      localbth.sqM.sqV = paramJSONObject.optString("expand", "");
      localbth.sqM.srd.addAll((Collection)localObject1);
      localbth.sqM.videoUrl = cz((List)localObject1);
      localObject1 = paramJSONObject.optString("tagList", "");
      if (!bi.oW((String)localObject1)) {
        try
        {
          localObject1 = new JSONArray((String)localObject1);
          i = 0;
          while (i < ((JSONArray)localObject1).length())
          {
            localObject3 = ((JSONArray)localObject1).getJSONObject(i);
            localObject4 = new bnq();
            ((bnq)localObject4).id = ((JSONObject)localObject3).optString("id");
            ((bnq)localObject4).bSc = ((JSONObject)localObject3).optString("wording");
            ((bnq)localObject4).slJ = ((JSONObject)localObject3).optLong("category");
            ((bnq)localObject4).actionType = ((JSONObject)localObject3).optInt("actionType");
            ((bnq)localObject4).url = ((JSONObject)localObject3).optString("url");
            ((bnq)localObject4).title = ((JSONObject)localObject3).optString("title");
            ((bnq)localObject4).hwC = ((JSONObject)localObject3).optString("subTitle");
            localbth.sqM.rBV.add(localObject4);
            i += 1;
          }
          localObject2 = paramJSONObject.optString("feedback", "");
        }
        catch (Exception localException) {}
      }
      Object localObject2;
      if (!bi.oW((String)localObject2)) {
        try
        {
          localObject2 = new JSONArray((String)localObject2);
          i = 0;
          while (i < ((JSONArray)localObject2).length())
          {
            localObject3 = new xe();
            ((xe)localObject3).id = ((JSONArray)localObject2).optJSONObject(i).optString("id", "");
            ((xe)localObject3).bSc = ((JSONArray)localObject2).optJSONObject(i).optString("wording", "");
            localbth.sqM.sre.add(localObject3);
            i += 1;
          }
          localbth.sqL = localbth.sqM.sqT;
        }
        catch (JSONException localJSONException1) {}
      }
      localbth.sqO = localbth.sqM.sqT;
      localbth.sqI = paramJSONObject.optString("expand", "");
      localbth.sqJ = localbth.fuu;
      localbth.sqH = localbth.sqM.sqS;
      paramJSONObject = paramJSONObject.optString("extReqParams", "");
      if (!bi.oW(paramJSONObject)) {
        try
        {
          paramJSONObject = new JSONArray(paramJSONObject);
          i = j;
          while (i < paramJSONObject.length())
          {
            JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
            localObject3 = new ps();
            ((ps)localObject3).aAL = localJSONObject.optString("key", "");
            ((ps)localObject3).rtU = localJSONObject.optInt("uintValue", 0);
            ((ps)localObject3).rtV = localJSONObject.optString("textValue", "");
            localbth.pKZ.add(localObject3);
            i += 1;
          }
          return localbth;
        }
        catch (Exception paramJSONObject) {}
      }
    }
    catch (JSONException localJSONException2)
    {
      label1067:
      for (;;) {}
    }
  }
  
  public static String bHB()
  {
    return ad.getContext().getCacheDir() + "topstory/";
  }
  
  public static boolean bHC()
  {
    return 1 >= x.getLogLevel();
  }
  
  public static JSONArray cA(List<bnq> paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    for (;;)
    {
      if (i < paramList.size()) {}
      try
      {
        JSONObject localJSONObject = new JSONObject();
        bnq localbnq = (bnq)paramList.get(i);
        localJSONObject.put("id", localbnq.id);
        localJSONObject.put("wording", localbnq.bSc);
        localJSONObject.put("category", localbnq.slJ);
        localJSONObject.put("actionType", localbnq.actionType);
        localJSONObject.put("url", localbnq.url);
        localJSONObject.put("title", localbnq.title);
        localJSONObject.put("subTitle", localbnq.hwC);
        localJSONArray.put(localJSONObject);
        i += 1;
        continue;
        return localJSONArray;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public static final String cz(List<String> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!bi.oW(str)) {
        return str;
      }
    }
    return null;
  }
  
  public static String n(HashMap<String, String> paramHashMap)
  {
    paramHashMap.put("lang", w.fD(ad.getContext()));
    paramHashMap.put("platform", "android");
    paramHashMap.put("version", String.valueOf(p.zL(1).Oe()));
    paramHashMap.put("netType", p.bjC());
    paramHashMap.put("isClientLoading", "1");
    paramHashMap.put("wechatVersion", d.CLIENT_VERSION);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("file://");
    localStringBuffer.append(p.zL(1).adP());
    localStringBuffer.append("/");
    localStringBuffer.append("app.html");
    localStringBuffer.append("?");
    localStringBuffer.append(p.U(paramHashMap));
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/topstory/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */