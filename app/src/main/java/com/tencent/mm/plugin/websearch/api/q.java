package com.tencent.mm.plugin.websearch.api;

import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.y.d;
import com.tencent.mm.y.g.a;
import java.util.Map;

public class q
  extends d
{
  public String bhd;
  public String ixy;
  public String ixz;
  public String lRt;
  public String nzH;
  public String pLA;
  public String pLB;
  public String pLC;
  public String pLr;
  public String pLs;
  public String pLt;
  public String pLu;
  public long pLv;
  public String pLw;
  public String pLx;
  public String pLy;
  public String pLz;
  
  public final void a(StringBuilder paramStringBuilder, g.a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2)
  {
    paramStringBuilder.append("<websearch>");
    if (!bi.oW(this.pLr))
    {
      paramStringBuilder.append("<relevant_vid>");
      paramStringBuilder.append(g.a.gq(this.pLr));
      paramStringBuilder.append("</relevant_vid>");
    }
    if (!bi.oW(this.pLs))
    {
      paramStringBuilder.append("<relevant_expand>");
      paramStringBuilder.append(g.a.gq(this.pLs));
      paramStringBuilder.append("</relevant_expand>");
    }
    if (!bi.oW(this.pLs))
    {
      paramStringBuilder.append("<relevant_expand>");
      paramStringBuilder.append(g.a.gq(this.pLs));
      paramStringBuilder.append("</relevant_expand>");
    }
    if (!bi.oW(this.pLt))
    {
      paramStringBuilder.append("<relevant_pre_searchid>");
      paramStringBuilder.append(g.a.gq(this.pLt));
      paramStringBuilder.append("</relevant_pre_searchid>");
    }
    if (!bi.oW(this.pLu))
    {
      paramStringBuilder.append("<relevant_shared_openid>");
      paramStringBuilder.append(g.a.gq(this.pLu));
      paramStringBuilder.append("</relevant_shared_openid>");
    }
    if (this.pLv >= 0L)
    {
      paramStringBuilder.append("<rec_category>");
      paramStringBuilder.append(this.pLv);
      paramStringBuilder.append("</rec_category>");
    }
    if (!bi.oW(this.ixy))
    {
      paramStringBuilder.append("<shareUrl>");
      paramStringBuilder.append(g.a.gq(this.ixy));
      paramStringBuilder.append("</shareUrl>");
    }
    if (!bi.oW(this.ixz))
    {
      paramStringBuilder.append("<shareTitle>");
      paramStringBuilder.append(g.a.gq(this.ixz));
      paramStringBuilder.append("</shareTitle>");
    }
    if (!bi.oW(this.nzH))
    {
      paramStringBuilder.append("<shareDesc>");
      paramStringBuilder.append(g.a.gq(this.nzH));
      paramStringBuilder.append("</shareDesc>");
    }
    if (!bi.oW(this.pLw))
    {
      paramStringBuilder.append("<shareImgUrl>");
      paramStringBuilder.append(g.a.gq(this.pLw));
      paramStringBuilder.append("</shareImgUrl>");
    }
    if (!bi.oW(this.pLx))
    {
      paramStringBuilder.append("<shareString>");
      paramStringBuilder.append(g.a.gq(this.pLx));
      paramStringBuilder.append("</shareString>");
    }
    if (!bi.oW(this.pLy))
    {
      paramStringBuilder.append("<shareStringUrl>");
      paramStringBuilder.append(g.a.gq(this.pLy));
      paramStringBuilder.append("</shareStringUrl>");
    }
    if (!bi.oW(this.bhd))
    {
      paramStringBuilder.append("<source>");
      paramStringBuilder.append(g.a.gq(this.bhd));
      paramStringBuilder.append("</source>");
    }
    if (!bi.oW(this.lRt))
    {
      paramStringBuilder.append("<sourceUrl>");
      paramStringBuilder.append(g.a.gq(this.lRt));
      paramStringBuilder.append("</sourceUrl>");
    }
    if (!bi.oW(this.pLz))
    {
      paramStringBuilder.append("<strPlayCount>");
      paramStringBuilder.append(g.a.gq(this.pLz));
      paramStringBuilder.append("</strPlayCount>");
    }
    if (!bi.oW(this.pLA))
    {
      paramStringBuilder.append("<titleUrl>");
      paramStringBuilder.append(g.a.gq(this.pLA));
      paramStringBuilder.append("</titleUrl>");
    }
    if (!bi.oW(this.pLB))
    {
      paramStringBuilder.append("<extReqParams>");
      paramStringBuilder.append(g.a.gq(this.pLB));
      paramStringBuilder.append("</extReqParams>");
    }
    if (!bi.oW(this.pLC))
    {
      paramStringBuilder.append("<tagList>");
      paramStringBuilder.append(g.a.gq(this.pLC));
      paramStringBuilder.append("</tagList>");
    }
    paramStringBuilder.append("</websearch>");
  }
  
  public final void a(Map<String, String> paramMap, g.a parama)
  {
    this.pLr = ((String)paramMap.get(".msg.appmsg.websearch.relevant_vid"));
    this.pLs = ((String)paramMap.get(".msg.appmsg.websearch.relevant_expand"));
    this.pLt = ((String)paramMap.get(".msg.appmsg.websearch.relevant_pre_searchid"));
    this.pLu = ((String)paramMap.get(".msg.appmsg.websearch.relevant_shared_openid"));
    this.pLv = bi.getInt((String)paramMap.get(".msg.appmsg.websearch.rec_category"), -1);
    this.ixy = ((String)paramMap.get(".msg.appmsg.websearch.shareUrl"));
    this.ixz = ((String)paramMap.get(".msg.appmsg.websearch.shareTitle"));
    this.nzH = ((String)paramMap.get(".msg.appmsg.websearch.shareDesc"));
    this.pLw = ((String)paramMap.get(".msg.appmsg.websearch.shareImgUrl"));
    this.pLx = ((String)paramMap.get(".msg.appmsg.websearch.shareString"));
    this.pLy = ((String)paramMap.get(".msg.appmsg.websearch.shareStringUrl"));
    this.bhd = ((String)paramMap.get(".msg.appmsg.websearch.source"));
    this.lRt = ((String)paramMap.get(".msg.appmsg.websearch.sourceUrl"));
    this.pLz = ((String)paramMap.get(".msg.appmsg.websearch.strPlayCount"));
    this.pLA = ((String)paramMap.get(".msg.appmsg.websearch.titleUrl"));
    this.pLB = ((String)paramMap.get(".msg.appmsg.websearch.extReqParams"));
    this.pLC = ((String)paramMap.get(".msg.appmsg.websearch.tagList"));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */