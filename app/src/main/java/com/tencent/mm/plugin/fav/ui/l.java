package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.a;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.al;
import com.tencent.mm.plugin.fav.a.ao;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.plugin.fav.a.o;
import com.tencent.mm.plugin.fav.a.r;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wd;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wo;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.protocal.c.xf;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.vfs.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class l
  extends c<fz>
{
  public l()
  {
    this.sFo = fz.class.getName().hashCode();
  }
  
  private static boolean c(fz paramfz)
  {
    switch (paramfz.bOL.type)
    {
    }
    for (;;)
    {
      return false;
      Object localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
      if ((localObject1 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_tagProto.rBX != null))
      {
        paramfz.bOM.auX = new ArrayList();
        paramfz.bOM.auX.addAll(((com.tencent.mm.plugin.fav.a.g)localObject1).field_tagProto.rBX);
        continue;
        if (paramfz.bOL.bON != null)
        {
          localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.b(paramfz.bOL.bON));
          if (((com.tencent.mm.vfs.b)localObject1).exists()) {
            paramfz.bOM.path = ((com.tencent.mm.vfs.b)localObject1).cBX().toString();
          }
          localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(paramfz.bOL.bON));
          if (((com.tencent.mm.vfs.b)localObject1).exists())
          {
            paramfz.bOM.bOX = ((com.tencent.mm.vfs.b)localObject1).cBX().toString();
            continue;
            ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().c(paramfz.bOL.bOP);
            paramfz.bOM.ret = 0;
            continue;
            ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().d(paramfz.bOL.bOP);
            paramfz.bOM.ret = 0;
            continue;
            paramfz.bOM.bOZ = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().aLz();
            paramfz.bOM.ret = 0;
            continue;
            localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
            paramfz.bOM.bOY = com.tencent.mm.plugin.fav.a.b.a(((com.tencent.mm.plugin.fav.a.g)localObject1).field_type, ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto, ((com.tencent.mm.plugin.fav.a.g)localObject1).field_tagProto);
            paramfz.bOM.ret = 0;
            continue;
            localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
            ((y)com.tencent.mm.kernel.g.l(y.class)).a(paramfz.bOL.context, (com.tencent.mm.plugin.fav.a.g)localObject1, paramfz.bOL.bOW);
            paramfz.bOM.ret = 0;
            continue;
            localObject1 = com.tencent.mm.plugin.fav.a.b.a(((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA), paramfz.bOL.handler);
            paramfz.bOM.bOX = localObject1[0];
            paramfz.bOM.thumbUrl = localObject1[1];
            paramfz.bOM.ret = 0;
            continue;
            com.tencent.mm.plugin.fav.a.b.a(paramfz.bOL.bJA, paramfz.bOL.bOQ);
            continue;
            Object localObject2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
            com.tencent.mm.plugin.fav.a.b.q((com.tencent.mm.plugin.fav.a.g)localObject2);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = localObject2;
              if (paramfz.bOL.bJH != null) {
                localObject1 = com.tencent.mm.plugin.fav.a.b.a(paramfz.bOL.bJH);
              }
            }
            h.a(paramfz.bOL.context, paramfz.bOL.toUser, paramfz.bOL.bOR, (com.tencent.mm.plugin.fav.a.g)localObject1, paramfz.bOL.bOQ);
            continue;
            if (com.tencent.mm.plugin.fav.a.b.f(paramfz.bOL.bON))
            {
              paramfz.bOM.ret = 1;
            }
            else
            {
              paramfz.bOM.ret = 0;
              continue;
              com.tencent.mm.plugin.fav.a.b.l(((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA));
              continue;
              com.tencent.mm.plugin.fav.a.b.m(((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA));
              continue;
              paramfz.bOM.ret = com.tencent.mm.plugin.fav.a.b.Be(paramfz.bOL.bON.rzD);
              continue;
              localObject1 = new ArrayList();
              ((List)localObject1).add(Integer.valueOf(7));
              localObject2 = com.tencent.mm.plugin.fav.a.b.a(null, null, (List)localObject1, null, null, null);
              localObject1 = new ArrayList();
              localObject2 = ((List)localObject2).iterator();
              Object localObject5;
              Object localObject4;
              Object localObject6;
              while (((Iterator)localObject2).hasNext())
              {
                localObject5 = (com.tencent.mm.plugin.fav.a.g)((Iterator)localObject2).next();
                localObject4 = ((com.tencent.mm.plugin.fav.a.g)localObject5).field_favProto.rBG;
                if (((com.tencent.mm.plugin.fav.a.g)localObject5).field_type == 7)
                {
                  localObject5 = com.tencent.mm.plugin.fav.a.b.c((com.tencent.mm.plugin.fav.a.g)localObject5);
                  localObject6 = k((vx)localObject5);
                  ((List)localObject1).add(((com.tencent.mm.an.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.an.a.b.class)).a(6, null, ((vx)localObject5).title, ((vx)localObject5).desc, ((vx)localObject5).rzv, ((vx)localObject5).rzz, ((vx)localObject5).rzx, ((vx)localObject5).jdM, com.tencent.mm.plugin.fav.a.b.aKV(), (String)localObject6, "", ((wr)localObject4).appId));
                }
                else if ((((com.tencent.mm.plugin.fav.a.g)localObject5).field_type == 14) && (((com.tencent.mm.plugin.fav.a.g)localObject5).field_favProto.rBI != null))
                {
                  localObject5 = ((com.tencent.mm.plugin.fav.a.g)localObject5).field_favProto.rBI.iterator();
                  while (((Iterator)localObject5).hasNext())
                  {
                    localObject6 = (vx)((Iterator)localObject5).next();
                    if (((vx)localObject6).bjS == 7)
                    {
                      String str = k((vx)localObject6);
                      ((List)localObject1).add(((com.tencent.mm.an.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.an.a.b.class)).a(6, null, ((vx)localObject6).title, ((vx)localObject6).desc, ((vx)localObject6).rzv, ((vx)localObject6).rzz, ((vx)localObject6).rzx, ((vx)localObject6).jdM, com.tencent.mm.plugin.fav.a.b.aKV(), str, "", ((wr)localObject4).appId));
                    }
                  }
                }
              }
              paramfz.bOM.bPa = ((List)localObject1);
              continue;
              if (paramfz.bOL.bJA == -1L)
              {
                g.a(paramfz.bOL.title, paramfz.bOL.bJH.rBI, -1L);
              }
              else if (paramfz.bOL.bOS == -1)
              {
                localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
                if ((localObject1 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.rBI.size() > 1))
                {
                  localObject1 = (vx)((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.rBI.get(0);
                  paramfz.bOM.bPd = bi.oW(((vx)localObject1).rzo);
                }
              }
              else if ((paramfz.bOL.bOS == -3) && (paramfz.bOL.bJA > 0L))
              {
                localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
                if (localObject1 != null)
                {
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).field_itemStatus = paramfz.bOL.bOO.getIntExtra("fav_note_item_status", ((com.tencent.mm.plugin.fav.a.g)localObject1).field_itemStatus);
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).field_updateTime = paramfz.bOL.bOO.getLongExtra("fav_note_item_updatetime", ((com.tencent.mm.plugin.fav.a.g)localObject1).field_updateTime);
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).Bh(paramfz.bOL.bOO.getStringExtra("fav_note_xml"));
                  ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject1, new String[] { "localId" });
                }
              }
              else
              {
                if ((paramfz.bOL.bOS == -2) && (paramfz.bOL.bJA > 0L))
                {
                  localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
                  if ((localObject1 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_itemStatus == 10) && (!bi.oW(((com.tencent.mm.plugin.fav.a.g)localObject1).field_xml)))
                  {
                    ((com.tencent.mm.plugin.fav.a.g)localObject1).Bh(((com.tencent.mm.plugin.fav.a.g)localObject1).field_xml);
                    if ((((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.rBI.size() > 1))
                    {
                      localObject2 = (vx)((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.rBI.get(0);
                      if ((!bi.oW(((vx)localObject2).rzo)) && (!bi.oW(((vx)localObject2).rzq)))
                      {
                        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject1, new String[] { "localId" });
                        continue;
                      }
                    }
                  }
                }
                localObject1 = new Intent();
                if ((paramfz.bOL.bJA > 0L) && (!bi.oW(paramfz.bOL.desc)) && (paramfz.bOL.bOS > 0))
                {
                  localObject2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
                  if (localObject2 != null)
                  {
                    ((Intent)localObject1).putExtra("fav_note_xml", com.tencent.mm.plugin.fav.a.g.s((com.tencent.mm.plugin.fav.a.g)localObject2));
                    ((Intent)localObject1).putExtra("fav_note_item_updatetime", ((com.tencent.mm.plugin.fav.a.g)localObject2).field_updateTime);
                  }
                }
                localObject2 = g.a(paramfz.bOL.bJH.rBI, paramfz.bOL.bJA);
                if (!bi.oW(paramfz.bOL.desc))
                {
                  if (paramfz.bOL.bOS > 0)
                  {
                    ((Intent)localObject1).putExtra("fav_note_item_status", ((com.tencent.mm.plugin.fav.a.g)localObject2).field_itemStatus);
                    paramfz.bOL.bOO = ((Intent)localObject1);
                    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.CN(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 1);
                  }
                  ((com.tencent.mm.plugin.fav.a.g)localObject2).field_itemStatus = 1;
                  com.tencent.mm.plugin.fav.a.b.q((com.tencent.mm.plugin.fav.a.g)localObject2);
                  ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject2, new String[] { "localId" });
                  if (paramfz.bOL.desc.equals("fav_add_new_note"))
                  {
                    if (((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version != 0) {
                      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.CN(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 1);
                    }
                    for (;;)
                    {
                      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject2, new String[] { "localId" });
                      g.a(paramfz.bOL.title, paramfz.bOL.bJH.rBI, paramfz.bOL.bJA);
                      break;
                      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.CN(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 2);
                    }
                  }
                }
                else
                {
                  if (((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version != 0) {
                    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.CN(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 1);
                  }
                  for (;;)
                  {
                    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_itemStatus = 1;
                    com.tencent.mm.plugin.fav.a.b.q((com.tencent.mm.plugin.fav.a.g)localObject2);
                    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject2, new String[] { "localId" });
                    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getCheckCdnService().run();
                    break;
                    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.CN(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 2);
                  }
                  ao.aLW().aLX();
                  localObject1 = ao.aLW();
                  localObject2 = paramfz.bOL.title;
                  int i = paramfz.bOL.bOS;
                  int j = paramfz.bOL.bOT;
                  ((ao)localObject1).path = bi.aG((String)localObject2, "");
                  ((ao)localObject1).bOS = i;
                  ((ao)localObject1).duration = j;
                  continue;
                  paramfz.bOM.path = i.v(paramfz.bOL.context, paramfz.bOL.bOT).toString();
                  continue;
                  ao.aLW();
                  ao.aLY().destroy();
                  continue;
                  ao.aLW();
                  ao.aLY().aLs();
                  continue;
                  localObject1 = paramfz.bOM;
                  ao.aLW();
                  ((fz.b)localObject1).bPb = ao.aLY().O(paramfz.bOL.path, paramfz.bOL.bOS, paramfz.bOL.bOT);
                  continue;
                  ao.aLW();
                  ao.aLY().stopPlay();
                  continue;
                  localObject1 = paramfz.bOM;
                  ao.aLW();
                  ((fz.b)localObject1).path = ao.aLY().path;
                  localObject1 = paramfz.bOM;
                  ao.aLW();
                  ((fz.b)localObject1).bPb = ao.aLY().aLq();
                  localObject1 = paramfz.bOM;
                  ao.aLW();
                  ((fz.b)localObject1).bPc = ao.aLY().aLr();
                  localObject1 = paramfz.bOM;
                  ao.aLW();
                  ((fz.b)localObject1).bPd = ao.aLY().wc();
                  paramfz = paramfz.bOM;
                  ao.aLW();
                  paramfz.bPe = ao.aLY().wb();
                  continue;
                  if (paramfz.bOL.bON != null)
                  {
                    localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.b(paramfz.bOL.bON));
                    paramfz.bOM.path = ((com.tencent.mm.vfs.b)localObject1).cBX().toString();
                    localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(paramfz.bOL.bON));
                    paramfz.bOM.bOX = ((com.tencent.mm.vfs.b)localObject1).cBX().toString();
                    continue;
                    localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
                    if (localObject1 == null)
                    {
                      com.tencent.mm.plugin.fav.a.b.b(paramfz.bOL.bON, paramfz.bOL.bOS);
                      com.tencent.mm.plugin.fav.a.b.a(paramfz.bOL.bON, paramfz.bOL.bOS);
                    }
                    else if (bi.oW(paramfz.bOL.path))
                    {
                      com.tencent.mm.plugin.fav.a.b.a((com.tencent.mm.plugin.fav.a.g)localObject1, paramfz.bOL.bON, true);
                    }
                    else
                    {
                      com.tencent.mm.plugin.fav.a.b.a((com.tencent.mm.plugin.fav.a.g)localObject1, paramfz.bOL.bON);
                      continue;
                      com.tencent.mm.plugin.fav.a.b.b(paramfz);
                      continue;
                      localObject1 = (al)paramfz.bOL.bKq;
                      paramfz.bOM.path = ((al)localObject1).iXf;
                      if ((((com.tencent.mm.ab.l)localObject1).dJd != null) && (((com.tencent.mm.ab.l)localObject1).dJd.Id() != null) && (((com.tencent.mm.ab.l)localObject1).dJd.Id().qWB == 65101))
                      {
                        paramfz = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dz(((al)localObject1).iXb);
                        if ((paramfz != null) && (paramfz.field_favProto != null) && (paramfz.field_favProto.rBI != null))
                        {
                          paramfz.field_favProto.CN(paramfz.field_favProto.version + 2);
                          paramfz.field_itemStatus = 1;
                          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramfz, new String[] { "localId" });
                          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getCheckCdnService().run();
                          continue;
                          localObject2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
                          localObject1 = localObject2;
                          if (localObject2 == null)
                          {
                            localObject1 = localObject2;
                            if (paramfz.bOL.bJH != null) {
                              localObject1 = com.tencent.mm.plugin.fav.a.b.a(paramfz.bOL.bJH);
                            }
                          }
                          localObject2 = new k();
                          localObject4 = paramfz.bOM;
                          if (((k)localObject2).t((com.tencent.mm.plugin.fav.a.g)localObject1)) {}
                          for (i = 1;; i = 0)
                          {
                            ((fz.b)localObject4).ret = i;
                            paramfz.bOM.bPd = k.u((com.tencent.mm.plugin.fav.a.g)localObject1);
                            paramfz.bOM.path = "";
                            if (localObject1 != null) {
                              break;
                            }
                            paramfz.bOM.bPd = true;
                            paramfz.bOM.path = null;
                            break;
                          }
                          localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
                          if (localObject1 != null)
                          {
                            ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.ar(paramfz.bOL.bJH.rBI);
                            ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().b((com.tencent.mm.plugin.fav.a.g)localObject1, new String[] { "localId" });
                            continue;
                            localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
                            if ((localObject1 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_type == 18))
                            {
                              paramfz.bOL.bJH = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto;
                              continue;
                              com.tencent.mm.plugin.fav.a.b.aKQ();
                              continue;
                              paramfz = paramfz.bOM;
                              if (com.tencent.mm.plugin.fav.a.b.aKZ()) {}
                              for (i = 1;; i = 0)
                              {
                                paramfz.ret = i;
                                break;
                              }
                              com.tencent.mm.plugin.fav.a.b.g(paramfz.bOL.context, paramfz.bOL.desc, paramfz.bOL.title, paramfz.bOL.path);
                              continue;
                              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_UPLOAD_FAV_ITEM %s", new Object[] { paramfz.bOL.bOU });
                              if (!bi.oW(paramfz.bOL.bOU))
                              {
                                paramfz = paramfz.bOL.bOU.split(";");
                                localObject1 = new LinkedList();
                                ((List)localObject1).addAll(Arrays.asList(paramfz));
                                if (((List)localObject1).size() > 0)
                                {
                                  paramfz = new ArrayList();
                                  localObject1 = ((List)localObject1).iterator();
                                  while (((Iterator)localObject1).hasNext())
                                  {
                                    localObject2 = (String)((Iterator)localObject1).next();
                                    try
                                    {
                                      i = Integer.valueOf((String)localObject2).intValue();
                                      if (i > 0)
                                      {
                                        localObject2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dz(i);
                                        localObject4 = new wd();
                                        ((wd)localObject4).rbY = i;
                                        if ((localObject2 != null) && (!bi.oW(((com.tencent.mm.plugin.fav.a.g)localObject2).field_xml))) {
                                          ((wd)localObject4).rcf = ((com.tencent.mm.plugin.fav.a.g)localObject2).field_xml;
                                        }
                                        paramfz.add(localObject4);
                                      }
                                    }
                                    catch (Exception localException1) {}
                                  }
                                  ((ae)com.tencent.mm.kernel.g.n(ae.class)).checkFavItem(paramfz);
                                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavoriteOperationListener", "do scene NetSceneCheckFavItem");
                                  continue;
                                  Object localObject3;
                                  try
                                  {
                                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_RESEND_FAV_ITEM %s %s", new Object[] { paramfz.bOL.bOU, paramfz.bOL.bOV });
                                    i = bi.getInt(paramfz.bOL.bOU, -1);
                                    paramfz = bi.F(paramfz.bOL.bOV.split(";"));
                                    localObject3 = new HashSet();
                                    ((HashSet)localObject3).addAll(paramfz);
                                    paramfz = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dz(i);
                                    if (paramfz != null) {
                                      break label3503;
                                    }
                                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavoriteOperationListener", "NotFound %d", new Object[] { Integer.valueOf(i) });
                                    com.tencent.mm.plugin.fav.a.h.pH(8);
                                  }
                                  catch (Exception paramfz)
                                  {
                                    com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Fav.FavoriteOperationListener", paramfz, "TYPE_NEW_XML_RESEND_FAV_ITEM", new Object[0]);
                                  }
                                  continue;
                                  label3503:
                                  localObject1 = new wo();
                                  ((wo)localObject1).rbY = i;
                                  localObject4 = paramfz.field_favProto.rBI.iterator();
                                  i = 0;
                                  while (((Iterator)localObject4).hasNext())
                                  {
                                    localObject5 = (vx)((Iterator)localObject4).next();
                                    j = i;
                                    if (((HashSet)localObject3).remove(((vx)localObject5).jdM + "#0"))
                                    {
                                      if (bi.oW(((vx)localObject5).rzq))
                                      {
                                        com.tencent.mm.modelcdntran.g.NE();
                                        ((vx)localObject5).UG(com.tencent.mm.modelcdntran.b.Nw());
                                        com.tencent.mm.plugin.fav.a.h.pH(2);
                                      }
                                      if (!d.cn(com.tencent.mm.plugin.fav.a.b.b((vx)localObject5))) {
                                        break label3744;
                                      }
                                      ((vx)localObject5).CI(1);
                                      com.tencent.mm.plugin.fav.a.b.a((vx)localObject5, paramfz, 0, false);
                                      com.tencent.mm.plugin.fav.a.h.pH(3);
                                    }
                                    for (j = 1;; j = i)
                                    {
                                      i = j;
                                      if (!((HashSet)localObject3).remove(((vx)localObject5).jdM + "#1")) {
                                        break;
                                      }
                                      if (bi.oW(((vx)localObject5).rzq))
                                      {
                                        com.tencent.mm.modelcdntran.g.NE();
                                        ((vx)localObject5).UG(com.tencent.mm.modelcdntran.b.Nw());
                                        com.tencent.mm.plugin.fav.a.h.pH(2);
                                      }
                                      if (!d.cn(com.tencent.mm.plugin.fav.a.b.c((vx)localObject5))) {
                                        break label3794;
                                      }
                                      ((vx)localObject5).CI(-1);
                                      com.tencent.mm.plugin.fav.a.b.a((vx)localObject5, paramfz, 0);
                                      com.tencent.mm.plugin.fav.a.h.pH(3);
                                      i = 1;
                                      break;
                                      label3744:
                                      com.tencent.mm.plugin.fav.a.h.pH(5);
                                      localObject6 = new xf();
                                      ((xf)localObject6).rro = ((vx)localObject5).jdM;
                                      ((xf)localObject6).rru = 0;
                                      ((xf)localObject6).hcd = 4;
                                      ((wo)localObject1).rBL.add(localObject6);
                                    }
                                    label3794:
                                    com.tencent.mm.plugin.fav.a.h.pH(5);
                                    localObject6 = new xf();
                                    ((xf)localObject6).rro = ((vx)localObject5).jdM;
                                    ((xf)localObject6).rru = 1;
                                    ((xf)localObject6).hcd = 4;
                                    ((wo)localObject1).rBL.add(localObject6);
                                    i = j;
                                  }
                                  if (((HashSet)localObject3).size() > 0)
                                  {
                                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavoriteOperationListener", "not found url data item %s", new Object[] { ((HashSet)localObject3).toString() });
                                    com.tencent.mm.plugin.fav.a.h.pI(((HashSet)localObject3).size());
                                    localObject3 = ((HashSet)localObject3).iterator();
                                    while (((Iterator)localObject3).hasNext())
                                    {
                                      localObject4 = (String)((Iterator)localObject3).next();
                                      try
                                      {
                                        localObject4 = ((String)localObject4).split("#");
                                        localObject5 = new xf();
                                        ((xf)localObject5).rro = localObject4[0];
                                        ((xf)localObject5).rru = Integer.valueOf(localObject4[1]).intValue();
                                        ((xf)localObject5).hcd = 3;
                                        ((wo)localObject1).rBL.add(localObject5);
                                      }
                                      catch (Exception localException2) {}
                                    }
                                  }
                                  if (((wo)localObject1).rBL.size() > 0) {
                                    ((ae)com.tencent.mm.kernel.g.n(ae.class)).checkFavItem((wo)localObject1);
                                  }
                                  if (i != 0)
                                  {
                                    if (paramfz.field_type == 18) {
                                      paramfz.field_favProto.CN(paramfz.field_favProto.version + 1);
                                    }
                                    paramfz.field_itemStatus = 15;
                                    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramfz, new String[] { "localId" });
                                    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
                                    com.tencent.mm.plugin.fav.a.h.pH(6);
                                  }
                                  else
                                  {
                                    com.tencent.mm.plugin.fav.a.h.pH(7);
                                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavoriteOperationListener", "do not has upload data item");
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private static String k(vx paramvx)
  {
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(paramvx));
    if (!localb.exists())
    {
      if (paramvx.bJv == null) {
        return "";
      }
      paramvx = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.aKO() + com.tencent.mm.a.g.u(paramvx.bJv.getBytes()));
      if (paramvx.exists()) {
        return paramvx.cBX().toString();
      }
      return "";
    }
    return localb.cBX().toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */