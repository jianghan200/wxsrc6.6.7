package com.tencent.mm.ak;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.s;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Map;

public final class h
  extends com.tencent.mm.model.e
{
  public static int a(int paramInt1, keep_SceneResult paramkeep_SceneResult, bd parambd, String paramString1, long paramLong1, String paramString2, String paramString3, int paramInt2, long paramLong2, String paramString4)
  {
    if (paramInt1 != 0)
    {
      x.e("MicroMsg.ImgMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), paramString1, paramString3, paramString2 });
      parambd.setStatus(5);
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().b(parambd.field_msgSvrId, parambd);
      com.tencent.mm.plugin.report.service.h.mEJ.h(10421, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(b.MediaType_THUMBIMAGE), Integer.valueOf(paramInt2), "" });
      com.tencent.mm.plugin.report.service.h.mEJ.h(13937, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(bi.VF()), Integer.valueOf(d.bL(ad.getContext())), Integer.valueOf(b.MediaType_THUMBIMAGE), Integer.valueOf(paramInt2), "" });
      o.Pf().doNotify();
      return 0;
    }
    if (paramkeep_SceneResult == null) {
      return 0;
    }
    int i;
    label348:
    int j;
    if (paramkeep_SceneResult.field_retCode != 0)
    {
      x.e("MicroMsg.ImgMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramkeep_SceneResult.field_retCode), Long.valueOf(paramLong1), paramString1, paramString3, paramString2 });
      parambd.setStatus(5);
      if (!bi.oW(parambd.field_talker)) {
        ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().b(parambd.field_msgSvrId, parambd);
      }
      paramString2 = com.tencent.mm.plugin.report.service.h.mEJ;
      if (paramkeep_SceneResult != null) {
        break label922;
      }
      i = paramInt1;
      paramLong1 = bi.VF();
      j = d.bL(ad.getContext());
      int k = b.MediaType_THUMBIMAGE;
      if (paramkeep_SceneResult != null) {
        break label931;
      }
      parambd = "";
      label373:
      if (paramkeep_SceneResult != null) {
        break label939;
      }
      paramString1 = "";
      label380:
      paramString2.h(10421, new Object[] { Integer.valueOf(i), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt2), parambd, "", "", "", "", "", "", "", paramString1 });
      if ((paramkeep_SceneResult != null) && (paramkeep_SceneResult.field_retCode != 0))
      {
        paramString1 = com.tencent.mm.plugin.report.service.h.mEJ;
        if (paramkeep_SceneResult != null) {
          break label947;
        }
        label520:
        paramLong1 = bi.VF();
        i = d.bL(ad.getContext());
        j = b.MediaType_THUMBIMAGE;
        if (paramkeep_SceneResult != null) {
          break label955;
        }
        parambd = "";
        label545:
        if (paramkeep_SceneResult != null) {
          break label963;
        }
      }
    }
    label922:
    label931:
    label939:
    label947:
    label955:
    label963:
    for (paramkeep_SceneResult = "";; paramkeep_SceneResult = paramkeep_SceneResult.report_Part2)
    {
      paramString1.h(13937, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt2), parambd, "", "", "", "", "", "", "", paramkeep_SceneResult });
      o.Pf().doNotify();
      return 0;
      Object localObject = new File(paramString2);
      new File(paramString4).renameTo((File)localObject);
      parambd.setStatus(6);
      paramString4 = new PInt();
      localObject = new PInt();
      com.tencent.mm.sdk.platformtools.c.c(paramString2, paramString4, (PInt)localObject);
      parambd.fh(paramString4.value);
      parambd.fi(((PInt)localObject).value);
      x.i("MicroMsg.ImgMsgExtension", "getThumbByCdn succ. sceneResult.field_retCode:%d msgSvrId:%d fromUser:%s thumb[%d,%d] thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramkeep_SceneResult.field_retCode), Long.valueOf(paramLong1), paramString1, Integer.valueOf(paramString4.value), Integer.valueOf(((PInt)localObject).value), paramString3, paramString2 });
      if (!bi.oW(parambd.field_talker)) {
        ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().b(parambd.field_msgSvrId, parambd);
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(198L, 1L, paramInt2, false);
      com.tencent.mm.plugin.report.service.h.mEJ.a(198L, 2L, 1L, false);
      parambd = com.tencent.mm.plugin.report.service.h.mEJ;
      if (s.fq(paramString1)) {}
      for (paramLong1 = 4L;; paramLong1 = 3L)
      {
        parambd.a(198L, paramLong1, 1L, false);
        break;
      }
      i = paramkeep_SceneResult.field_retCode;
      break label348;
      parambd = paramkeep_SceneResult.field_transInfo;
      break label373;
      paramString1 = paramkeep_SceneResult.report_Part2;
      break label380;
      paramInt1 = paramkeep_SceneResult.field_retCode;
      break label520;
      parambd = paramkeep_SceneResult.field_transInfo;
      break label545;
    }
  }
  
  protected final bd a(by paramby, final String paramString1, final String paramString2, final String paramString3)
  {
    Object localObject1 = o.Pf();
    paramString3 = super.a(paramby, paramString1, paramString2, paramString3);
    if (paramString3.field_msgId != 0L) {
      return paramString3;
    }
    final long l1 = paramby.rcq;
    paramString2 = ((g)localObject1).bq(l1);
    if (paramString2.bYu == l1)
    {
      FileOp.deleteFile(((g)localObject1).o(paramString2.dTL, "", ""));
      FileOp.deleteFile(((g)localObject1).o(paramString2.dTN, "", ""));
      FileOp.deleteFile(((g)localObject1).o(paramString2.dTN, "", "") + "hd");
      ((g)localObject1).dCZ.delete("ImgInfo2", "msgSvrId=?", new String[] { String.valueOf(l1) });
      if (paramString2.ON())
      {
        paramString2 = ((g)localObject1).hQ(paramString2.dTU);
        if (paramString2 != null)
        {
          FileOp.deleteFile(((g)localObject1).o(paramString2.dTL, "", ""));
          FileOp.deleteFile(((g)localObject1).o(paramString2.dTN, "", ""));
          FileOp.deleteFile(((g)localObject1).o(paramString2.dTN, "", "") + "hd");
          ((g)localObject1).dCZ.delete("ImgInfo2", "id=?", new String[] { paramString2.dTK });
        }
      }
    }
    if (paramby.rcm != 2)
    {
      x.e("MicroMsg.ImgMsgExtension", "data type img, but has no imgstatus_hasimg ?!");
      return paramString3;
    }
    paramString2 = ab.a(paramby.rcn);
    if (af.exs)
    {
      x.w("MicroMsg.ImgMsgExtension", "Test.useCdnDownThumb  set img buf null !!!!!!!");
      paramString2 = null;
    }
    for (;;)
    {
      Object localObject3 = bl.z(paramString3.field_content, "msg");
      l1 = -1L;
      int i;
      final int j;
      if (!bi.oW(paramString3.field_content))
      {
        x.i("MicroMsg.ImgMsgExtension", "cdntra content:[%s]", new Object[] { paramString3.field_content });
        if (localObject3 == null) {
          com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 190L, 1L, false);
        }
        if (localObject3 == null) {
          break label1454;
        }
        i = bi.getInt((String)((Map)localObject3).get(".msg.img.$hdlength"), 0);
        j = bi.getInt((String)((Map)localObject3).get(".msg.img.$tphdlength"), 0);
        if (i <= 0) {
          break label1066;
        }
        i = paramby.rcm;
        l1 = ((g)localObject1).a(paramString2, paramby.rcq, true, paramString3.field_content, new PString(), new PInt(), new PInt());
      }
      for (;;)
      {
        final Object localObject2 = bl.z(paramString3.field_content, "msgoperation");
        if (localObject2 != null)
        {
          paramString3.ew((String)((Map)localObject2).get(".msgoperation.expinfo.expidstr"));
          paramString3.fk(bi.getInt((String)((Map)localObject2).get(".msgoperation.imagemsg.downloadcontroltype"), 0));
          x.i("MicroMsg.ImgMsgExtension", "[chatting_exp] expidstr:%s, downloadcontroltype:%d", new Object[] { paramString3.cGK, Integer.valueOf(paramString3.cGL) });
        }
        localObject2 = (String)((Map)localObject3).get(".msg.img.$tpthumburl");
        Object localObject4 = new PString();
        PInt localPInt1 = new PInt();
        PInt localPInt2 = new PInt();
        i = paramby.rcm;
        final long l2 = ((g)localObject1).a(paramString2, paramby.rcq, false, paramString3.field_content, (PString)localObject4, localPInt1, localPInt2);
        if ((bi.bC(paramString2)) && (localObject3 != null) && (!bi.oW((String)localObject2)))
        {
          localPInt1.value = bi.getInt((String)((Map)localObject3).get(".msg.img.$tpthumbwidth"), 0);
          localPInt2.value = bi.getInt((String)((Map)localObject3).get(".msg.img.$tpthumbheight"), 0);
        }
        if (l2 > 0L)
        {
          paramString3.eq(((PString)localObject4).value);
          paramString3.fh(localPInt1.value);
          paramString3.fi(localPInt2.value);
          if (l1 > 0L)
          {
            paramby = o.Pf().b(Long.valueOf(l2));
            paramby.hM((int)l1);
            o.Pf().a(Long.valueOf(l2), paramby);
          }
        }
        if ((bi.bC(paramString2)) && (localObject3 != null) && (!bi.oW((String)localObject2)))
        {
          paramby = (String)((Map)localObject3).get(".msg.img.$tpthumbaeskey");
          i = bi.getInt((String)((Map)localObject3).get(".msg.img.tpthumblength"), 0);
          paramString2 = (String)((Map)localObject3).get(".msg.img.$tpauthkey");
          localObject1 = ((g)localObject1).o(com.tencent.mm.a.g.u(("SERVERID://" + paramString3.field_msgSvrId).getBytes()), "th_", "");
          l1 = paramString3.field_msgSvrId;
          x.i("MicroMsg.ImgMsgExtension", "getThumbByCdn msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l1), paramString1, localObject2, localObject1 });
          l2 = bi.VF();
          localObject3 = (String)localObject1 + ".tmp";
          localObject4 = new com.tencent.mm.modelcdntran.i();
          ((com.tencent.mm.modelcdntran.i)localObject4).field_mediaId = d.a("downimgthumb", paramString3.field_createTime, paramString1, String.valueOf(l1));
          ((com.tencent.mm.modelcdntran.i)localObject4).field_fullpath = ((String)localObject3);
          ((com.tencent.mm.modelcdntran.i)localObject4).field_fileType = 19;
          ((com.tencent.mm.modelcdntran.i)localObject4).field_aesKey = paramby;
          ((com.tencent.mm.modelcdntran.i)localObject4).field_authKey = paramString2;
          ((com.tencent.mm.modelcdntran.i)localObject4).dPW = ((String)localObject2);
          ((com.tencent.mm.modelcdntran.i)localObject4).dPV = new h.1(this, paramString3, paramString1, l1, (String)localObject1, (String)localObject2, i, l2, (String)localObject3);
          paramString3.setStatus(4);
          com.tencent.mm.modelcdntran.g.ND().b((com.tencent.mm.modelcdntran.i)localObject4, -1);
        }
        label1066:
        while ((!bi.bC(paramString2)) || (localObject3 == null))
        {
          return paramString3;
          if (j <= 0) {
            break label1454;
          }
          i = paramby.rcm;
          l1 = ((g)localObject1).a(paramString2, paramby.rcq, true, paramString3.field_content, new PString(), new PInt(), new PInt());
          break;
        }
        paramby = (String)((Map)localObject3).get(".msg.img.$cdnthumbaeskey");
        paramString2 = (String)((Map)localObject3).get(".msg.img.$cdnthumburl");
        j = bi.getInt((String)((Map)localObject3).get(".msg.img.$cdnthumblength"), 0);
        localObject1 = ((g)localObject1).o(com.tencent.mm.a.g.u(("SERVERID://" + paramString3.field_msgSvrId).getBytes()), "th_", "");
        l1 = paramString3.field_msgSvrId;
        x.i("MicroMsg.ImgMsgExtension", "getThumbByCdn msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l1), paramString1, paramString2, localObject1 });
        l2 = bi.VF();
        localObject2 = (String)localObject1 + ".tmp";
        localObject3 = new com.tencent.mm.modelcdntran.i();
        ((com.tencent.mm.modelcdntran.i)localObject3).field_mediaId = d.a("downimgthumb", paramString3.field_createTime, paramString1, String.valueOf(l1));
        ((com.tencent.mm.modelcdntran.i)localObject3).field_fullpath = ((String)localObject2);
        ((com.tencent.mm.modelcdntran.i)localObject3).field_fileType = b.MediaType_THUMBIMAGE;
        ((com.tencent.mm.modelcdntran.i)localObject3).field_totalLen = j;
        ((com.tencent.mm.modelcdntran.i)localObject3).field_aesKey = paramby;
        ((com.tencent.mm.modelcdntran.i)localObject3).field_fileId = paramString2;
        ((com.tencent.mm.modelcdntran.i)localObject3).field_priority = b.dOl;
        if (s.fq(paramString1)) {}
        for (i = 1;; i = 0)
        {
          ((com.tencent.mm.modelcdntran.i)localObject3).field_chattype = i;
          x.d("MicroMsg.ImgMsgExtension", "get thumb by cdn [image] chatType[%d] fromUser[%s] ", new Object[] { Integer.valueOf(((com.tencent.mm.modelcdntran.i)localObject3).field_chattype), paramString1 });
          ((com.tencent.mm.modelcdntran.i)localObject3).dPV = new i.a()
          {
            public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
            {
              h.a(paramAnonymousInt, paramAnonymouskeep_SceneResult, paramString3, paramString1, l1, paramString2, j, l2, localObject2, this.dUR);
              return 0;
            }
            
            public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream) {}
            
            public final byte[] i(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
            {
              return null;
            }
          };
          paramString3.setStatus(4);
          com.tencent.mm.modelcdntran.g.ND().b((com.tencent.mm.modelcdntran.i)localObject3, -1);
          break;
        }
        label1454:
        l1 = -1L;
      }
    }
  }
  
  public final void h(bd parambd)
  {
    o.Pf().r(parambd);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ak/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */