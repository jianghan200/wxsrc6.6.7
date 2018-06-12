package com.tencent.mm.plugin.record.b;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.util.SparseIntArray;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.model.app.an.a;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.protocal.c.vv;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wf;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.y.g.a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class h
{
  private static final com.tencent.mm.a.f<Integer, com.tencent.mm.protocal.b.a.c> dzj = new com.tencent.mm.a.f(32);
  
  public static String Ba(String paramString)
  {
    return paramString + "_t";
  }
  
  public static com.tencent.mm.protocal.b.a.c Ks(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.RecordMsgLogic", "xml is null");
      return null;
    }
    int i = paramString.hashCode();
    Object localObject = (com.tencent.mm.protocal.b.a.c)dzj.get(Integer.valueOf(i));
    if (localObject != null)
    {
      x.d("MicroMsg.RecordMsgLogic", "get record msg data from cache");
      return (com.tencent.mm.protocal.b.a.c)localObject;
    }
    if (paramString.trim().contains("<recordinfo>")) {}
    for (localObject = bl.z(paramString, "recordinfo"); localObject == null; localObject = bl.z("<recordinfo>" + paramString + "</recordinfo>", "recordinfo"))
    {
      x.e("MicroMsg.RecordMsgLogic", "values is null: %s", new Object[] { paramString });
      return null;
    }
    com.tencent.mm.protocal.b.a.c localc = new com.tencent.mm.protocal.b.a.c();
    localc.title = ((String)((Map)localObject).get(".recordinfo.title"));
    localc.desc = ((String)((Map)localObject).get(".recordinfo.desc"));
    localc.qXZ = ((String)((Map)localObject).get(".recordinfo.favusername"));
    if (((Map)localObject).get(".recordinfo.noteinfo") != null)
    {
      wf localwf = new wf();
      localwf.rBA = ((String)((Map)localObject).get(".recordinfo.noteinfo.noteeditor"));
      localwf.rBz = ((String)((Map)localObject).get(".recordinfo.noteinfo.noteauthor"));
      localc.qYa = localwf;
      localc.qYb = bi.getLong((String)((Map)localObject).get(".recordinfo.edittime"), 0L);
    }
    a(paramString, localc);
    dzj.put(Integer.valueOf(i), localc);
    return localc;
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2, List<com.tencent.mm.storage.bd> paramList, ch paramch, com.tencent.mm.protocal.b.a.d paramd)
  {
    if (bi.oW(paramString1))
    {
      x.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
      return -1;
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      x.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
      return -1;
    }
    com.tencent.mm.protocal.b.a.d locald;
    if (paramch != null)
    {
      locald = paramd;
      if (paramd != null) {}
    }
    else
    {
      paramch = new ch();
      if (!com.tencent.mm.pluginsdk.model.g.a(paramContext, paramch, paramString2, paramList, true, true)) {
        return -1;
      }
      locald = a(paramContext, paramch, paramString2);
    }
    paramList = a(locald.title, locald.desc, paramch.bJF.bJH);
    paramd = new com.tencent.mm.storage.bd();
    paramString2 = null;
    if (!bi.oW(locald.bOX))
    {
      paramContext = bi.readFromFile(locald.bOX);
      if (paramContext != null) {
        if (paramContext.length <= 32768) {
          break label397;
        }
      }
    }
    long l;
    label397:
    for (paramContext = com.tencent.mm.ak.o.Pf().a(paramContext, false, Bitmap.CompressFormat.JPEG);; paramContext = com.tencent.mm.ak.o.Pf().g(8, paramContext))
    {
      x.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " thumbData MsgInfo path:" + paramContext);
      if (!bi.oW(paramContext)) {
        paramd.eq(paramContext);
      }
      paramd.setContent(g.a.a(paramList, null, null));
      paramd.setStatus(1);
      paramd.ep(paramString1);
      paramd.ay(com.tencent.mm.model.bd.iD(paramString1));
      paramd.eX(1);
      paramd.setType(49);
      if (com.tencent.mm.ac.f.eZ(paramString1)) {
        paramd.dt(com.tencent.mm.ac.a.e.Ir());
      }
      au.HU();
      l = com.tencent.mm.model.c.FT().T(paramd);
      x.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " msginfo insert id: " + l);
      if (l >= 0L) {
        break label410;
      }
      x.e("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Ac() + "insert msg failed :" + l);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
      paramContext = paramString2;
      if (locald.bXP != 0) {
        break;
      }
      paramContext = paramString2;
      if (bi.oW(locald.jap)) {
        break;
      }
      paramContext = com.tencent.mm.sdk.platformtools.c.Q(com.tencent.mm.aa.c.a(locald.jap, false, -1));
      break;
    }
    label410:
    x.i("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
    paramd.setMsgId(l);
    paramContext = new com.tencent.mm.y.g();
    paramContext.field_xml = paramd.field_content;
    paramContext.field_title = paramList.title;
    paramContext.field_type = paramList.type;
    paramContext.field_description = paramList.description;
    paramContext.field_msgId = l;
    ao.cbY().b(paramContext);
    paramContext = paramch.bJF.bJH.rBI.iterator();
    for (boolean bool = false; paramContext.hasNext(); bool = true)
    {
      label522:
      paramString2 = (vx)paramContext.next();
      paramd = paramString2.toString();
      int i = paramString2.bjS;
      paramString2.UO(com.tencent.mm.a.g.u((paramd + i + System.currentTimeMillis()).getBytes()));
      if ((!bool) && (!com.tencent.mm.a.e.cn(paramString2.rzM)) && (!com.tencent.mm.a.e.cn(paramString2.rzO)) && (bi.oW(paramString2.rzo)) && (bi.oW(paramString2.dwE)) && (bi.oW(paramString2.rAG)) && (bi.oW(paramString2.dwv))) {
        break label522;
      }
    }
    x.d("MicroMsg.RecordMsgLogic", "summerrecord needNetScene:%b", new Object[] { Boolean.valueOf(bool) });
    if (bool)
    {
      paramContext = new com.tencent.mm.plugin.record.a.g();
      paramContext.field_msgId = l;
      paramContext.field_title = paramList.title;
      paramContext.field_desc = paramList.description;
      paramContext.field_toUser = paramString1;
      paramContext.field_dataProto = paramch.bJF.bJH;
      paramContext.field_type = 3;
      paramContext.field_localId = (new Random().nextInt(2147483645) + 1);
      x.i("MicroMsg.RecordMsgLogic", "summerrecord needNetScene insert ret:%b, id:%d, localid:%d", new Object[] { Boolean.valueOf(n.bqv().b(paramContext)), Long.valueOf(l), Integer.valueOf(paramContext.field_localId) });
      n.bqw().a(paramContext);
    }
    for (;;)
    {
      return 0;
      x.d("MicroMsg.RecordMsgLogic", "summerrecord do not trans cdn, directly send msg id:%d", new Object[] { Long.valueOf(l) });
      ao.cca();
      an.a.fM(l);
    }
  }
  
  public static int a(String paramString1, wl paramwl, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5)
  {
    if (bi.oW(paramString1))
    {
      x.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
      return -1;
    }
    if ((paramwl == null) || (paramwl.rBI.isEmpty()))
    {
      x.w("MicroMsg.RecordMsgLogic", "send record msg error, favprotoitem error");
      return -1;
    }
    paramString3 = a(paramString2, paramString3, paramwl);
    com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
    paramString2 = null;
    if (!bi.oW(paramString4))
    {
      paramString2 = bi.readFromFile(paramString4);
      if (paramString2 != null) {
        if (paramString2.length <= 32768) {
          break label330;
        }
      }
    }
    long l;
    label330:
    for (paramString2 = com.tencent.mm.ak.o.Pf().a(paramString2, false, Bitmap.CompressFormat.JPEG);; paramString2 = com.tencent.mm.ak.o.Pf().g(8, paramString2))
    {
      x.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " thumbData MsgInfo path:" + paramString2);
      if (!bi.oW(paramString2)) {
        localbd.eq(paramString2);
      }
      localbd.setContent(g.a.a(paramString3, null, null));
      localbd.setStatus(1);
      localbd.ep(paramString1);
      localbd.ay(com.tencent.mm.model.bd.iD(paramString1));
      localbd.eX(1);
      localbd.setType(49);
      if (com.tencent.mm.ac.f.eZ(paramString1)) {
        localbd.dt(com.tencent.mm.ac.a.e.Ir());
      }
      au.HU();
      l = com.tencent.mm.model.c.FT().T(localbd);
      x.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " msginfo insert id: " + l);
      if (l >= 0L) {
        break label343;
      }
      x.e("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Ac() + "insert msg failed :" + l);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
      if (paramInt != 0)
      {
        paramString2 = com.tencent.mm.sdk.platformtools.c.Q(com.tencent.mm.sdk.platformtools.c.CV(paramInt));
        break;
      }
      if (bi.oW(paramString5)) {
        break;
      }
      paramString2 = com.tencent.mm.sdk.platformtools.c.Q(com.tencent.mm.aa.c.a(paramString5, false, -1));
      break;
    }
    label343:
    x.i("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
    localbd.setMsgId(l);
    paramString2 = new com.tencent.mm.y.g();
    paramString2.field_xml = localbd.field_content;
    paramString2.field_title = paramString3.title;
    paramString2.field_type = paramString3.type;
    paramString2.field_description = paramString3.description;
    paramString2.field_msgId = l;
    ao.cbY().b(paramString2);
    paramString2 = paramwl.rBI.iterator();
    do
    {
      if (!paramString2.hasNext()) {
        break;
      }
      paramString4 = (vx)paramString2.next();
    } while ((bi.oW(paramString4.rzo)) && (bi.oW(paramString4.dwE)));
    paramString2 = new com.tencent.mm.plugin.record.a.g();
    paramString2.field_msgId = l;
    paramString2.field_title = paramString3.title;
    paramString2.field_desc = paramString3.description;
    paramString2.field_toUser = paramString1;
    paramString2.field_dataProto = paramwl;
    paramString2.field_type = 1;
    paramString2.field_localId = (new Random().nextInt(2147483645) + 1);
    n.bqv().b(paramString2);
    n.bqw().a(paramString2);
    return 0;
  }
  
  public static int a(String paramString1, String paramString2, com.tencent.mm.storage.bd parambd)
  {
    if (bi.oW(paramString1))
    {
      x.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
      return -1;
    }
    if ((parambd == null) || (bi.oW(parambd.field_content)))
    {
      x.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
      return -1;
    }
    if (1 == parambd.field_status)
    {
      x.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo is sending");
      return -1;
    }
    paramString1 = bi.F(paramString1.split(",")).iterator();
    String str;
    Object localObject2;
    g.a locala;
    com.tencent.mm.protocal.b.a.c localc;
    Object localObject1;
    long l;
    if (paramString1.hasNext())
    {
      str = (String)paramString1.next();
      x.i("MicroMsg.RecordMsgLogic", "send recordMsg, toUser[%s] msgId[%d], msgType[%d]", new Object[] { str, Long.valueOf(parambd.field_msgId), Integer.valueOf(parambd.field_status) });
      localObject2 = com.tencent.mm.model.bd.iC(parambd.field_content);
      locala = g.a.gp((String)localObject2);
      if (locala == null)
      {
        x.w("MicroMsg.RecordMsgLogic", "send record msg error, parse appmsg error");
        return -1;
      }
      localc = Ks(locala.dwW);
      if (localc == null)
      {
        x.w("MicroMsg.RecordMsgLogic", "send record msg error, parse record data error");
        return -1;
      }
      localObject1 = new com.tencent.mm.storage.bd();
      if (!bi.oW(parambd.field_imgPath))
      {
        Object localObject3 = bi.readFromFile(com.tencent.mm.ak.o.Pf().E(parambd.field_imgPath, true));
        localObject3 = com.tencent.mm.ak.o.Pf().g(8, (byte[])localObject3);
        x.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " thumbData from msg MsgInfo path:" + (String)localObject3);
        if (!bi.oW((String)localObject3)) {
          ((com.tencent.mm.storage.bd)localObject1).eq((String)localObject3);
        }
      }
      ((com.tencent.mm.storage.bd)localObject1).setContent((String)localObject2);
      ((com.tencent.mm.storage.bd)localObject1).setStatus(1);
      ((com.tencent.mm.storage.bd)localObject1).ep(str);
      ((com.tencent.mm.storage.bd)localObject1).ay(com.tencent.mm.model.bd.iD(str));
      ((com.tencent.mm.storage.bd)localObject1).eX(1);
      ((com.tencent.mm.storage.bd)localObject1).setType(49);
      au.HU();
      l = com.tencent.mm.model.c.FT().T((com.tencent.mm.storage.bd)localObject1);
      x.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " msginfo insert id: " + l);
      if (l < 0L)
      {
        x.e("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Ac() + "insert msg failed :" + l);
        return 0 - com.tencent.mm.compatible.util.g.getLine();
      }
      x.i("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
      ((com.tencent.mm.storage.bd)localObject1).setMsgId(l);
      localObject2 = new sc();
      ((sc)localObject2).ccT.ccU = parambd.field_msgId;
      ((sc)localObject2).ccT.ccV = l;
      a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
      localObject2 = new com.tencent.mm.y.g();
      ((com.tencent.mm.y.g)localObject2).field_xml = ((cm)localObject1).field_content;
      ((com.tencent.mm.y.g)localObject2).field_title = locala.title;
      ((com.tencent.mm.y.g)localObject2).field_type = locala.type;
      ((com.tencent.mm.y.g)localObject2).field_description = locala.description;
      ((com.tencent.mm.y.g)localObject2).field_msgId = l;
      ao.cbY().b((com.tencent.mm.sdk.e.c)localObject2);
      localObject1 = localc.dzs.iterator();
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (vx)((Iterator)localObject1).next();
      } while ((bi.oW(((vx)localObject2).rzo)) && (bi.oW(((vx)localObject2).dwE)) && (bi.oW(((vx)localObject2).rAG)) && (bi.oW(((vx)localObject2).dwv)));
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localObject1 = new com.tencent.mm.plugin.record.a.g();
        localObject2 = new wl();
        ((wl)localObject2).rBI.addAll(localc.dzs);
        ((com.tencent.mm.plugin.record.a.g)localObject1).field_msgId = l;
        ((com.tencent.mm.plugin.record.a.g)localObject1).field_oriMsgId = parambd.field_msgId;
        ((com.tencent.mm.plugin.record.a.g)localObject1).field_toUser = str;
        ((com.tencent.mm.plugin.record.a.g)localObject1).field_title = locala.title;
        ((com.tencent.mm.plugin.record.a.g)localObject1).field_desc = bi.aG(localc.desc, locala.description);
        ((com.tencent.mm.plugin.record.a.g)localObject1).field_dataProto = ((wl)localObject2);
        ((com.tencent.mm.plugin.record.a.g)localObject1).field_type = 0;
        ((com.tencent.mm.plugin.record.a.g)localObject1).field_favFrom = localc.qXZ;
        ((com.tencent.mm.plugin.record.a.g)localObject1).field_localId = (new Random().nextInt(2147483645) + 1);
        n.bqv().b((com.tencent.mm.sdk.e.c)localObject1);
        n.bqw().a((com.tencent.mm.plugin.record.a.g)localObject1);
      }
      for (;;)
      {
        if (bi.oW(paramString2)) {
          break label831;
        }
        com.tencent.mm.plugin.messenger.a.g.bcT().D(str, paramString2, s.hQ(str));
        break;
        x.d("MicroMsg.RecordMsgLogic", "do not check upload, directly send msg");
        ao.cca();
        an.a.fM(l);
      }
      label831:
      break;
      return 0;
    }
  }
  
  public static com.tencent.mm.protocal.b.a.d a(Context paramContext, ch paramch, String paramString)
  {
    int i = 0;
    com.tencent.mm.protocal.b.a.d locald = new com.tencent.mm.protocal.b.a.d();
    Object localObject1 = new SparseIntArray();
    Object localObject2;
    if (com.tencent.mm.ac.f.eZ(paramString))
    {
      locald.title = paramch.bJF.bJH.title;
      x.d("MicroMsg.RecordMsgLogic", "msgInfo title %s", new Object[] { locald.title });
      paramString = new LinkedList();
      if (paramch.bJF.bJH == null) {
        break label398;
      }
      paramch = paramch.bJF.bJH.rBI;
      localObject2 = paramch.iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject2).hasNext()) {
        break label1465;
      }
      Object localObject3 = (vx)((Iterator)localObject2).next();
      int j = ((SparseIntArray)localObject1).get(((vx)localObject3).bjS);
      ((SparseIntArray)localObject1).put(((vx)localObject3).bjS, j + 1);
      switch (((vx)localObject3).bjS)
      {
      case 9: 
      case 12: 
      case 13: 
      case 18: 
      default: 
        break;
      case 1: 
        if (paramString.size() < 5)
        {
          paramString.add(((vx)localObject3).rAk + ":" + ((vx)localObject3).desc + "\n");
          continue;
          if (s.fq(paramString))
          {
            locald.title = paramContext.getString(R.l.record_chatroom_title);
            break;
          }
          localObject2 = q.GH();
          paramString = r.gS(paramString);
          if (((String)localObject2).equals(paramString))
          {
            locald.title = paramContext.getString(R.l.favorite_record_chatroom_title, new Object[] { localObject2 });
            break;
          }
          locald.title = paramContext.getString(R.l.favorite_record_chat_title, new Object[] { localObject2, paramString });
          break;
          paramch = new LinkedList();
        }
        break;
      case 3: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_voice) + "\n");
        }
        break;
      case 2: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_pic) + "\n");
        }
        if (i == 0)
        {
          a(locald, (vx)localObject3, R.g.app_attach_file_icon_pic);
          i = 1;
        }
        break;
      case 5: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_url) + ((vx)localObject3).title + "\n");
        }
        if (i == 0)
        {
          a(locald, (vx)localObject3, R.k.app_attach_file_icon_webpage);
          i = 1;
        }
        break;
      case 15: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_video) + "\n");
        }
        if (i == 0)
        {
          a(locald, (vx)localObject3, R.k.app_attach_file_icon_video);
          i = 1;
        }
        break;
      case 4: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_video) + "\n");
        }
        if (i == 0)
        {
          a(locald, (vx)localObject3, R.k.app_attach_file_icon_video);
          i = 1;
        }
        break;
      case 6: 
        if (paramString.size() < 5)
        {
          paramch = ((vx)localObject3).rAi.rAL;
          localObject3 = new StringBuilder().append(((vx)localObject3).rAk).append(":").append(paramContext.getString(R.l.app_location));
          if ((!bi.oW(paramch.bWB)) && (!paramch.bWB.equals(paramContext.getString(R.l.location_selected)))) {
            break label904;
          }
        }
        for (paramch = paramch.label;; paramch = paramch.bWB)
        {
          paramString.add(paramch + "\n");
          if (i != 0) {
            break;
          }
          locald.bXP = R.k.app_attach_file_icon_location;
          i = 1;
          break;
        }
      case 7: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_music) + ((vx)localObject3).title + "\n");
        }
        if (i == 0)
        {
          a(locald, (vx)localObject3, R.k.app_attach_file_icon_music);
          i = 1;
        }
        break;
      case 8: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_file) + ((vx)localObject3).title + "\n");
        }
        if (i == 0)
        {
          a(locald, (vx)localObject3, R.k.app_attach_file_icon_unknow);
          i = 1;
        }
        break;
      case 10: 
      case 11: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_product) + ((vx)localObject3).rAi.rAP.title + "\n");
        }
        if (i == 0)
        {
          a(locald, (vx)localObject3, R.k.app_attach_file_icon_unknow);
          i = 1;
        }
        break;
      case 14: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_app) + "\n");
        }
        if (i == 0)
        {
          a(locald, (vx)localObject3, R.k.app_attach_file_icon_unknow);
          i = 1;
        }
        break;
      case 16: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_friend_card) + "\n");
        }
        if (i == 0)
        {
          au.HU();
          locald.jap = com.tencent.mm.model.c.FT().GR(((vx)localObject3).desc).otZ;
          i = 1;
        }
        break;
      case 17: 
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_record) + "\n");
        }
        break;
      case 19: 
        label398:
        label904:
        if (paramString.size() < 5) {
          paramString.add(((vx)localObject3).rAk + ":" + paramContext.getString(R.l.app_app_brand) + ((vx)localObject3).title + "\n");
        }
        break;
      }
    }
    label1465:
    locald.desc = "";
    paramch = paramString.iterator();
    for (paramContext = ""; paramch.hasNext(); paramContext = paramContext + (String)localObject1) {
      localObject1 = (String)paramch.next();
    }
    paramch = paramContext.trim();
    paramContext = paramch;
    if (paramString.size() >= 5) {
      paramContext = paramch + "...";
    }
    locald.desc = paramContext;
    return locald;
  }
  
  public static g.a a(String paramString1, String paramString2, wl paramwl)
  {
    LinkedList localLinkedList = paramwl.rBI;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<recordinfo>");
    localStringBuilder.append("<title>").append(bi.WS(paramString1)).append("</title>");
    localStringBuilder.append("<desc>").append(bi.WS(paramString2)).append("</desc>");
    a(localStringBuilder, paramwl);
    localStringBuilder.append(i.bc(localLinkedList));
    localStringBuilder.append("<favusername>").append(bi.WS(q.GF())).append("</favusername>");
    localStringBuilder.append("</recordinfo>");
    paramwl = new g.a();
    paramwl.title = paramString1;
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (paramString2.length() > 200) {
        paramString1 = paramString2.substring(0, 200);
      }
    }
    paramwl.description = paramString1;
    if ((!bi.cX(localLinkedList)) && (!bi.oW(((vx)localLinkedList.get(0)).rzD)) && (((vx)localLinkedList.get(0)).rzD.equals(".htm"))) {
      paramwl.type = 24;
    }
    for (paramwl.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";; paramwl.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0")
    {
      paramwl.action = "view";
      paramwl.dwW = localStringBuilder.toString();
      return paramwl;
      paramwl.type = 19;
    }
  }
  
  public static String a(String paramString1, String paramString2, wl paramwl, String paramString3)
  {
    if ((paramwl == null) || (paramwl.rBI == null))
    {
      x.e("MicroMsg.RecordMsgLogic", "buildRecordAppMsgXML error: protoItem or datalist is null");
      return "";
    }
    LinkedList localLinkedList = paramwl.rBI;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<recordinfo>");
    localStringBuilder.append("<title>").append(bi.WS(paramString1)).append("</title>");
    localStringBuilder.append("<desc>").append(bi.WS(paramString2)).append("</desc>");
    a(localStringBuilder, paramwl);
    localStringBuilder.append(i.bc(localLinkedList));
    localStringBuilder.append("<favusername>").append(bi.WS(paramString3)).append("</favusername>");
    localStringBuilder.append("</recordinfo>");
    paramwl = new g.a();
    paramwl.title = paramString1;
    paramwl.description = paramString2;
    if ((!bi.oW(((vx)localLinkedList.get(0)).rzD)) && (((vx)localLinkedList.get(0)).rzD.equals(".htm"))) {
      paramwl.type = 24;
    }
    for (paramwl.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";; paramwl.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0")
    {
      paramwl.action = "view";
      paramwl.dwW = localStringBuilder.toString();
      return g.a.a(paramwl, null, null);
      paramwl.type = 19;
    }
  }
  
  private static void a(com.tencent.mm.protocal.b.a.d paramd, vx paramvx, int paramInt)
  {
    paramvx = paramvx.rzO;
    if (com.tencent.mm.a.e.cn(paramvx))
    {
      paramd.bOX = paramvx;
      return;
    }
    paramd.bXP = paramInt;
  }
  
  private static void a(String paramString, com.tencent.mm.protocal.b.a.c paramc)
  {
    paramc.dzs.clear();
    paramString = paramString.replaceAll("\\n\\t*", "");
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      Object localObject2;
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("datalist");
        if (paramString != null)
        {
          NodeList localNodeList = paramString.item(0).getChildNodes();
          if ((localNodeList != null) && (localNodeList.getLength() > 0))
          {
            int j = localNodeList.getLength();
            i = 0;
            if (i < j)
            {
              localObject1 = localNodeList.item(i);
              paramString = bl.b((Node)localObject1);
              localObject1 = ((Element)localObject1).getElementsByTagName("recordxml");
              if ((localObject1 == null) || (((NodeList)localObject1).getLength() <= 0)) {
                break label3563;
              }
              localObject1 = bl.b(((NodeList)localObject1).item(0).getFirstChild());
              if (!paramString.trim().startsWith("<dataitem")) {
                break label3558;
              }
              paramString = bl.z(paramString, "dataitem");
              if (paramString == null) {
                paramString = null;
              }
              try
              {
                paramc.dzs.add(paramString);
              }
              catch (Exception paramString)
              {
                vx localvx;
                String str;
                x.e("MicroMsg.RecordMsgLogic", "get record msg data from xml error: %s", new Object[] { paramString.getMessage() });
                x.printErrStackTrace("MicroMsg.RecordMsgLogic", paramString, "", new Object[0]);
                paramc.dzs.clear();
              }
              localvx = new vx();
              localvx.CF(bi.getInt((String)paramString.get(".dataitem" + ".$datatype"), 0));
              localvx.UT((String)paramString.get(".dataitem" + ".$datasourceid"));
              localvx.CG(bi.getInt((String)paramString.get(".dataitem" + ".$datastatus"), 0));
              localvx.UL((String)paramString.get(".dataitem" + ".datafmt"));
              localvx.UB((String)paramString.get(".dataitem" + ".datatitle"));
              localvx.UC((String)paramString.get(".dataitem" + ".datadesc"));
              localvx.UD((String)paramString.get(".dataitem" + ".cdnthumburl"));
              localvx.UE((String)paramString.get(".dataitem" + ".cdnthumbkey"));
              localvx.CC(bi.getInt((String)paramString.get(".dataitem" + ".thumbwidth"), 0));
              localvx.CD(bi.getInt((String)paramString.get(".dataitem" + ".thumbheight"), 0));
              localvx.UF((String)paramString.get(".dataitem" + ".cdndataurl"));
              localvx.UG((String)paramString.get(".dataitem" + ".cdndatakey"));
              localvx.dwv = ((String)paramString.get(".dataitem" + ".tpthumburl"));
              localvx.rAC = true;
              localvx.Vc((String)paramString.get(".dataitem" + ".tpaeskey"));
              localvx.Vd((String)paramString.get(".dataitem" + ".tpauthkey"));
              localvx.Ve((String)paramString.get(".dataitem" + ".tpdataurl"));
              localvx.dwB = ((String)paramString.get(".dataitem" + ".tpthumbaeskey"));
              localvx.rAI = true;
              localObject2 = (String)paramString.get(".dataitem" + ".duration");
              if ((localObject2 != null) && (((String)localObject2).length() > 0)) {
                localvx.CE(bi.getInt((String)localObject2, 0));
              }
              localvx.UI((String)paramString.get(".dataitem" + ".streamdataurl"));
              localvx.UJ((String)paramString.get(".dataitem" + ".streamlowbandurl"));
              localvx.UH((String)paramString.get(".dataitem" + ".streamweburl"));
              localvx.UM((String)paramString.get(".dataitem" + ".fullmd5"));
              localvx.UN((String)paramString.get(".dataitem" + ".head256md5"));
              localObject2 = (String)paramString.get(".dataitem" + ".datasize");
              if (!bi.oW((String)localObject2)) {
                localvx.fO(bi.getInt((String)localObject2, 0));
              }
              localvx.UK((String)paramString.get(".dataitem" + ".dataext"));
              localvx.UR((String)paramString.get(".dataitem" + ".thumbfullmd5"));
              localvx.US((String)paramString.get(".dataitem" + ".thumbhead256md5"));
              localObject2 = (String)paramString.get(".dataitem" + ".thumbsize");
              if (!bi.oW((String)localObject2)) {
                localvx.fP(bi.getInt((String)localObject2, 0));
              }
              localvx.UU((String)paramString.get(".dataitem" + ".streamvideoid"));
              localObject3 = (String)paramString.get(".dataitem" + ".$dataid");
              localObject2 = localObject3;
              if (bi.oW((String)localObject3)) {
                localObject2 = String.valueOf(i);
              }
              localvx.UO((String)localObject2);
              localObject2 = (String)paramString.get(".dataitem" + ".$htmlid");
              if (!bi.oW((String)localObject2)) {
                localvx.UY((String)localObject2);
              }
              localvx.CH(bi.getInt((String)paramString.get(".dataitem" + ".$dataillegaltype"), 0));
              localvx.UV((String)paramString.get(".dataitem" + ".sourcetitle"));
              localvx.UW((String)paramString.get(".dataitem" + ".sourcename"));
              localvx.UX((String)paramString.get(".dataitem" + ".sourcetime"));
              localvx.UZ((String)paramString.get(".dataitem" + ".statextstr"));
              if (localObject1 != null) {
                localvx.Vb((String)localObject1);
              }
              localObject1 = new vy();
              localObject2 = new vz();
              ((vz)localObject2).CJ(bi.getInt((String)paramString.get(".dataitem" + ".$sourcetype"), 0));
              localObject3 = (String)paramString.get(".dataitem" + ".dataitemsource.fromusr");
              if (!bi.oW((String)localObject3))
              {
                ((vz)localObject2).Vf((String)localObject3);
                x.d("MicroMsg.RecordMsgParser", "fromusr %s", new Object[] { ((vz)localObject2).bSS });
              }
              localObject3 = (String)paramString.get(".dataitem" + ".dataitemsource.realchatname");
              if (!bi.oW((String)localObject3))
              {
                ((vz)localObject2).Vi((String)localObject3);
                x.d("MicroMsg.RecordMsgParser", "realChatname %s", new Object[] { ((vz)localObject2).rBh });
              }
              ((vz)localObject2).Vk((String)paramString.get(".dataitem" + ".appid"));
              ((vz)localObject2).Vl((String)paramString.get(".dataitem" + ".link"));
              ((vz)localObject2).Vm((String)paramString.get(".dataitem" + ".brandid"));
              ((vy)localObject1).c((vz)localObject2);
              localObject3 = ".dataitem" + ".locitem";
              if (!paramString.containsKey(localObject3))
              {
                x.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject3 });
                localObject2 = ".dataitem" + ".weburlitem";
                if (paramString.containsKey(localObject2)) {
                  break label2713;
                }
                x.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
                localObject2 = ".dataitem" + ".productitem";
                if (paramString.containsKey(localObject2)) {
                  break label2917;
                }
                x.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
                localObject2 = ".dataitem" + ".tvitem";
                if (paramString.containsKey(localObject2)) {
                  break label3121;
                }
                x.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
                localObject2 = ".dataitem" + ".appbranditem";
                if (paramString.containsKey(localObject2)) {
                  break label3285;
                }
                x.v("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
                localvx.a((vy)localObject1);
                paramString = localvx;
                continue;
              }
              localObject2 = new we();
              if (!bi.oW((String)paramString.get((String)localObject3 + ".label"))) {
                ((we)localObject2).Vn((String)paramString.get((String)localObject3 + ".label"));
              }
              if (!bi.oW((String)paramString.get((String)localObject3 + ".poiname"))) {
                ((we)localObject2).Vo((String)paramString.get((String)localObject3 + ".poiname"));
              }
              str = (String)paramString.get((String)localObject3 + ".lng");
              if (!bi.oW(str)) {
                ((we)localObject2).y(bi.getDouble(str, 0.0D));
              }
              str = (String)paramString.get((String)localObject3 + ".lat");
              if (!bi.oW(str)) {
                ((we)localObject2).z(bi.getDouble(str, 0.0D));
              }
              localObject3 = (String)paramString.get((String)localObject3 + ".scale");
              if (!bi.oW((String)localObject3))
              {
                if (((String)localObject3).indexOf('.') == -1) {
                  break label2698;
                }
                ((we)localObject2).CK(bi.getInt(((String)localObject3).substring(0, ((String)localObject3).indexOf('.')), -1));
              }
              ((vy)localObject1).a((we)localObject2);
              continue;
            }
          }
        }
        return;
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.RecordMsgLogic", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
      }
      label2698:
      ((we)localObject2).CK(bi.getInt((String)localObject3, -1));
      continue;
      label2713:
      Object localObject3 = new xa();
      ((xa)localObject3).VJ((String)paramString.get((String)localObject2 + ".title"));
      ((xa)localObject3).VK((String)paramString.get((String)localObject2 + ".desc"));
      ((xa)localObject3).VM((String)paramString.get((String)localObject2 + ".thumburl"));
      ((xa)localObject3).VL((String)paramString.get((String)localObject2 + ".link"));
      ((xa)localObject3).CP(bi.getInt((String)paramString.get((String)localObject2 + ".opencache"), 0));
      ((vy)localObject1).a((xa)localObject3);
      continue;
      label2917:
      localObject3 = new wk();
      ((wk)localObject3).Vp((String)paramString.get((String)localObject2 + ".title"));
      ((wk)localObject3).Vq((String)paramString.get((String)localObject2 + ".desc"));
      ((wk)localObject3).Vr((String)paramString.get((String)localObject2 + ".thumburl"));
      ((wk)localObject3).Vs((String)paramString.get((String)localObject2 + ".productinfo"));
      ((wk)localObject3).CL(bi.getInt((String)paramString.get((String)localObject2 + ".$type"), 0));
      ((vy)localObject1).a((wk)localObject3);
      continue;
      label3121:
      localObject3 = new wu();
      ((wu)localObject3).VF((String)paramString.get((String)localObject2 + ".title"));
      ((wu)localObject3).VG((String)paramString.get((String)localObject2 + ".desc"));
      ((wu)localObject3).VH((String)paramString.get((String)localObject2 + ".thumburl"));
      ((wu)localObject3).VI((String)paramString.get((String)localObject2 + ".tvinfo"));
      ((vy)localObject1).a((wu)localObject3);
      continue;
      label3285:
      localObject3 = new vv();
      ((vv)localObject3).username = ((String)paramString.get((String)localObject2 + ".username"));
      ((vv)localObject3).appId = ((String)paramString.get((String)localObject2 + ".appid"));
      ((vv)localObject3).bPh = bi.getInt((String)paramString.get((String)localObject2 + ".pkgtype"), 0);
      ((vv)localObject3).iconUrl = ((String)paramString.get((String)localObject2 + ".iconurl"));
      ((vv)localObject3).type = bi.getInt((String)paramString.get((String)localObject2 + ".type"), 0);
      ((vv)localObject3).bGH = ((String)paramString.get((String)localObject2 + ".pagepath"));
      ((vv)localObject3).rzd = ((String)paramString.get((String)localObject2 + ".sourcedisplayname"));
      ((vy)localObject1).a((vv)localObject3);
      continue;
      label3558:
      paramString = null;
      continue;
      label3563:
      localObject1 = null;
      continue;
      i += 1;
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, wl paramwl)
  {
    if (paramwl.qYa != null)
    {
      paramStringBuilder.append("<noteinfo>");
      paramStringBuilder.append("<noteauthor>").append(bi.WS(paramwl.qYa.rBz)).append("</noteauthor>");
      paramStringBuilder.append("<noteeditor>").append(bi.WS(paramwl.qYa.rBA)).append("</noteeditor>");
      paramStringBuilder.append("</noteinfo>");
      paramStringBuilder.append("<edittime>").append(paramwl.qYb).append("</edittime>");
    }
  }
  
  public static boolean b(vx paramvx, long paramLong, boolean paramBoolean)
  {
    if (paramvx == null)
    {
      x.w("MicroMsg.RecordMsgLogic", "try download data fail, dataitem is null");
      return false;
    }
    String str = e(paramvx.jdM, paramLong, true);
    com.tencent.mm.plugin.record.a.f localf2 = n.getRecordMsgCDNStorage().Kr(str);
    com.tencent.mm.plugin.record.a.f localf1 = localf2;
    if (localf2 == null)
    {
      localf2 = new com.tencent.mm.plugin.record.a.f();
      localf2.field_cdnKey = paramvx.rzq;
      localf2.field_cdnUrl = paramvx.rzo;
      localf2.field_dataId = paramvx.jdM;
      localf2.field_mediaId = str;
      localf2.field_totalLen = ((int)paramvx.rzJ);
      localf2.field_localId = (new Random().nextInt(2147483645) + 1);
      localf2.field_path = c(paramvx, paramLong);
      localf2.field_type = 1;
      localf2.field_fileType = vn(paramvx.bjS);
      localf2.field_isThumb = false;
      localf2.field_tpaeskey = paramvx.rAD;
      localf2.field_tpauthkey = paramvx.dwA;
      localf2.field_tpdataurl = paramvx.rAG;
      boolean bool = n.getRecordMsgCDNStorage().b(localf2);
      x.d("MicroMsg.RecordMsgLogic", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(localf2.field_localId), Boolean.valueOf(bool) });
      localf1 = localf2;
      if (!bi.oW(paramvx.rAq))
      {
        localf1 = localf2;
        if (paramvx.rAq.equals("WeNoteHtmlFile"))
        {
          n.bqx().a(localf2, true);
          localf1 = localf2;
        }
      }
    }
    x.d("MicroMsg.RecordMsgLogic", "try download data, dump record cdninfo: %s", new Object[] { localf1 });
    if (4 == localf1.field_status)
    {
      x.w("MicroMsg.RecordMsgLogic", "try download, but cdn info out of date, code[%d]", new Object[] { Integer.valueOf(localf1.field_errCode) });
      return false;
    }
    if (3 == localf1.field_status)
    {
      x.i("MicroMsg.RecordMsgLogic", "try download, but cdn info error, code[%d], can retry[%B]", new Object[] { Integer.valueOf(localf1.field_errCode), Boolean.valueOf(paramBoolean) });
      if (paramBoolean)
      {
        localf1.field_status = 1;
        n.getRecordMsgCDNStorage().b(localf1, new String[] { "localId" });
      }
    }
    else
    {
      n.bqx().run();
      return true;
    }
    return false;
  }
  
  public static String c(vx paramvx, long paramLong)
  {
    int j = 1;
    if (paramvx == null) {
      return "";
    }
    Object localObject1 = paramvx.jdM;
    if ((bi.oW((String)localObject1)) || (!au.HX())) {
      return "";
    }
    Object localObject2 = ep(paramLong);
    Object localObject3;
    if ((paramvx.bjS == 8) && (!bi.oW(paramvx.title)))
    {
      localObject3 = paramvx.title;
      i = paramvx.jdM.hashCode();
      au.HU();
      File localFile = new File(String.format("%s/%d/%d/", new Object[] { com.tencent.mm.model.c.Gm(), Long.valueOf(paramLong), Integer.valueOf(i & 0xFF) }));
      if (localFile.exists())
      {
        i = j;
        localObject2 = localFile;
        localObject1 = localObject3;
        if (localFile.isDirectory()) {}
      }
      else
      {
        localFile.mkdirs();
        localObject1 = localObject3;
        localObject2 = localFile;
      }
    }
    for (int i = j;; i = 0)
    {
      localObject3 = localObject1;
      if (paramvx.rzD != null)
      {
        localObject3 = localObject1;
        if (paramvx.rzD.trim().length() > 0)
        {
          localObject3 = localObject1;
          if (i == 0) {
            localObject3 = (String)localObject1 + "." + paramvx.rzD;
          }
        }
      }
      return new File((File)localObject2, (String)localObject3).getAbsolutePath();
    }
  }
  
  public static boolean c(vx paramvx, long paramLong, boolean paramBoolean)
  {
    if (paramvx == null)
    {
      x.w("MicroMsg.RecordMsgLogic", "try download thumb error, dataitem is null");
      return false;
    }
    String str1 = Ba(paramvx.jdM);
    String str2 = e(str1, paramLong, true);
    com.tencent.mm.plugin.record.a.f localf2 = n.getRecordMsgCDNStorage().Kr(str2);
    com.tencent.mm.plugin.record.a.f localf1 = localf2;
    if (localf2 == null)
    {
      localf1 = new com.tencent.mm.plugin.record.a.f();
      localf1.field_cdnKey = paramvx.rzk;
      localf1.field_cdnUrl = paramvx.dwE;
      localf1.field_dataId = str1;
      localf1.field_mediaId = str2;
      localf1.field_totalLen = ((int)paramvx.rzU);
      localf1.field_localId = (new Random().nextInt(2147483645) + 1);
      localf1.field_path = f(paramvx, paramLong);
      localf1.field_type = 1;
      localf1.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
      localf1.field_isThumb = true;
      localf1.field_tpdataurl = paramvx.dwv;
      localf1.field_tpauthkey = paramvx.dwA;
      localf1.field_tpaeskey = paramvx.dwB;
      boolean bool = n.getRecordMsgCDNStorage().b(localf1);
      x.d("MicroMsg.RecordMsgLogic", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(localf1.field_localId), Boolean.valueOf(bool) });
    }
    x.v("MicroMsg.RecordMsgLogic", "try download thumb, dump record cdninfo: %s", new Object[] { localf1 });
    if (4 == localf1.field_status)
    {
      x.w("MicroMsg.RecordMsgLogic", "try download thumb, but cdn info out of date, code[%d]", new Object[] { Integer.valueOf(localf1.field_errCode) });
      return false;
    }
    if (3 == localf1.field_status)
    {
      x.i("MicroMsg.RecordMsgLogic", "try download thumb, but cdn info error, code[%d], can retry[%B]", new Object[] { Integer.valueOf(localf1.field_errCode), Boolean.valueOf(paramBoolean) });
      if (paramBoolean)
      {
        localf1.field_status = 1;
        n.getRecordMsgCDNStorage().b(localf1, new String[] { "localId" });
      }
    }
    else
    {
      n.bqx().run();
      return true;
    }
    return false;
  }
  
  public static boolean d(vx paramvx, long paramLong)
  {
    return new File(c(paramvx, paramLong)).exists();
  }
  
  public static String e(String paramString, long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramString + "@record_download@" + paramLong;
    }
    return paramString + "@record_upload@" + paramLong;
  }
  
  public static boolean e(vx paramvx, long paramLong)
  {
    return new File(f(paramvx, paramLong)).exists();
  }
  
  private static File ep(long paramLong)
  {
    au.HU();
    File localFile = new File(String.format("%s/%d/", new Object[] { com.tencent.mm.model.c.Gm(), Long.valueOf(paramLong) }));
    if ((!localFile.exists()) || (!localFile.isDirectory())) {
      localFile.mkdirs();
    }
    return localFile;
  }
  
  public static void eq(long paramLong)
  {
    File localFile = ep(paramLong);
    boolean bool = com.tencent.mm.a.e.k(localFile);
    x.i("MicroMsg.RecordMsgLogic", "do clear resource, path %s, result %B", new Object[] { localFile.getAbsolutePath(), Boolean.valueOf(bool) });
  }
  
  public static String f(vx paramvx, long paramLong)
  {
    if ((paramvx == null) || (bi.oW(paramvx.jdM))) {
      return "";
    }
    paramvx = Ba(paramvx.jdM);
    return new File(ep(paramLong), paramvx).getAbsolutePath();
  }
  
  public static boolean g(vx paramvx, long paramLong)
  {
    if (paramvx == null)
    {
      x.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate fail, dataitem is null");
      return true;
    }
    paramvx = e(paramvx.jdM, paramLong, true);
    paramvx = n.getRecordMsgCDNStorage().Kr(paramvx);
    if (paramvx == null)
    {
      x.d("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, not find cdn info");
      return false;
    }
    if (4 == paramvx.field_status)
    {
      x.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, status err, code %d", new Object[] { Integer.valueOf(paramvx.field_errCode) });
      return true;
    }
    x.d("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, find cdn info, status %d", new Object[] { Integer.valueOf(paramvx.field_status) });
    return false;
  }
  
  public static String gU(String paramString)
  {
    au.HU();
    Object localObject = com.tencent.mm.model.c.FR().Yg(paramString);
    if (localObject == null)
    {
      x.w("MicroMsg.RecordMsgLogic", "wtf get contact null, username %s", new Object[] { paramString });
      localObject = "";
    }
    String str;
    do
    {
      return (String)localObject;
      str = ((ab)localObject).BL();
      localObject = str;
    } while (!s.fq(str));
    paramString = m.gI(paramString);
    localObject = q.GF();
    if ((paramString == null) || (paramString.isEmpty()))
    {
      x.w("MicroMsg.RecordMsgLogic", "get members from username error, content empty");
      return str;
    }
    paramString.remove(localObject);
    paramString.add(0, localObject);
    return m.c(paramString, 3);
  }
  
  public static boolean h(vx paramvx, long paramLong)
  {
    return com.tencent.mm.sdk.platformtools.o.Wf(c(paramvx, paramLong));
  }
  
  public static int vn(int paramInt)
  {
    if (2 == paramInt) {
      return com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
    }
    if (4 == paramInt) {
      return com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
    }
    return com.tencent.mm.modelcdntran.b.MediaType_FILE;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/record/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */