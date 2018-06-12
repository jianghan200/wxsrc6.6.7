package com.tencent.mm.modelvideo;

import android.database.Cursor;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.model.bf;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.protocal.c.bwq;
import com.tencent.mm.protocal.c.bwr;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.ay;
import java.util.Map;
import java.util.Vector;
import junit.framework.Assert;

public final class g
  extends l
  implements k
{
  private static int emr = 32000;
  private final int MAX_TIMES;
  private String cas = "";
  al dHa = new al(new g.2(this), true);
  private boolean dVC = true;
  private String dVk = "";
  private i.a dVu = new g.1(this);
  g.a dYW = null;
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private r elW;
  private int elY = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
  private boolean elZ = false;
  private final long ems = 1800000L;
  boolean emt = false;
  private int emu = -1;
  private boolean emv = false;
  private boolean emw = false;
  private int emx = 0;
  private int emy = 0;
  int emz = 0;
  String fileName;
  int retCode = 0;
  private long startTime = 0L;
  
  public g(String paramString)
  {
    boolean bool;
    if (paramString != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "NetSceneUploadVideo:  file:" + paramString);
      this.fileName = paramString;
      this.elW = t.nW(paramString);
      if (this.elW == null) {
        break label250;
      }
    }
    label250:
    for (this.MAX_TIMES = 2500;; this.MAX_TIMES = 0)
    {
      this.dYW = new g.a();
      if ((this.elW != null) && (3 == this.elW.enT)) {
        this.elY = com.tencent.mm.modelcdntran.b.MediaType_TinyVideo;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "%s NetSceneUploadVideo:  videoType:[%d]", new Object[] { SR(), Integer.valueOf(this.elY) });
      return;
      bool = false;
      break;
    }
  }
  
  private boolean SQ()
  {
    if (com.tencent.mm.model.s.hP(this.elW.Tj()))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneUploadVideo", "%s cdntra not use cdn user:%s", new Object[] { SR(), this.elW.Tj() });
      return false;
    }
    com.tencent.mm.modelcdntran.g.ND();
    if ((!com.tencent.mm.modelcdntran.c.hz(2)) && (this.elW.enR != 1))
    {
      localObject1 = SR();
      com.tencent.mm.modelcdntran.g.ND();
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneUploadVideo", "%s cdntra not use cdn flag:%b getCdnInfo:%d", new Object[] { localObject1, Boolean.valueOf(com.tencent.mm.modelcdntran.c.hz(2)), Integer.valueOf(this.elW.enR) });
      return false;
    }
    this.dVk = com.tencent.mm.modelcdntran.d.a("upvideo", this.elW.createTime, this.elW.Tj(), this.elW.getFileName());
    if (bi.oW(this.dVk))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneUploadVideo", "%s cdntra genClientId failed not use cdn file:%s", new Object[] { SR(), this.elW.getFileName() });
      return false;
    }
    o.Ta();
    Object localObject1 = s.nL(this.fileName);
    o.Ta();
    String str2 = s.nK(this.fileName);
    com.tencent.mm.modelcdntran.i locali = new com.tencent.mm.modelcdntran.i();
    locali.dPV = this.dVu;
    locali.field_mediaId = this.dVk;
    locali.field_fullpath = str2;
    locali.field_thumbpath = nA((String)localObject1);
    locali.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
    locali.field_enable_hitcheck = this.dVC;
    boolean bool1;
    label336:
    String str1;
    Object localObject3;
    if (com.tencent.mm.modelcontrol.d.NP().lB(str2))
    {
      i = 1;
      locali.field_largesvideo = i;
      if ((this.elW != null) && (3 == this.elW.enT)) {
        locali.field_smallVideoFlag = 1;
      }
      localObject1 = SR();
      if (this.elW.enW != null) {
        break label690;
      }
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "%s upload video MMSightExtInfo is null? %b %s", new Object[] { localObject1, Boolean.valueOf(bool1), this.fileName });
      if ((this.elW.enW != null) && (this.elW.enW.rUP))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "%s local capture video, mark use large video", new Object[] { SR() });
        localObject1 = n.SY();
        o.Ta();
        ((n)localObject1).a("", s.nK(this.fileName), this.elW.Tj(), "", "", 2, 2);
        com.tencent.mm.modelcontrol.d.NP();
        locali.field_largesvideo = com.tencent.mm.modelcontrol.d.a(com.tencent.mm.modelcontrol.d.NP().NQ());
      }
      str1 = SR();
      localObject3 = this.elW.getFileName();
      if (this.elW.enV != null) {
        break label696;
      }
      localObject1 = "null";
      label494:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "%s checkAD file:%s adinfo:%s", new Object[] { str1, localObject3, localObject1 });
      if ((this.elW.enV != null) && (!bi.oW(this.elW.enV.dyP))) {
        locali.field_advideoflag = 1;
      }
      locali.field_talker = this.elW.Tj();
      if (!com.tencent.mm.model.s.fq(this.elW.Tj())) {
        break label711;
      }
    }
    label690:
    label696:
    label711:
    for (int i = 1;; i = 0)
    {
      locali.field_chattype = i;
      locali.field_priority = com.tencent.mm.modelcdntran.b.dOk;
      locali.field_needStorage = false;
      locali.field_isStreamMedia = false;
      locali.field_trysafecdn = true;
      this.emy = com.tencent.mm.a.e.cm(locali.field_fullpath);
      this.emx = com.tencent.mm.a.e.cm(locali.field_thumbpath);
      if (this.emx < com.tencent.mm.modelcdntran.b.dOG) {
        break label716;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneUploadVideo", "%s cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", new Object[] { SR(), locali.field_thumbpath, Integer.valueOf(this.emx) });
      return false;
      i = 0;
      break;
      bool1 = false;
      break label336;
      localObject1 = this.elW.enV.dyP;
      break label494;
    }
    label716:
    localObject1 = bl.z(this.elW.Tm(), "msg");
    boolean bool2;
    label1146:
    int m;
    long l1;
    label1233:
    label1251:
    label1406:
    label1412:
    label1418:
    label1424:
    label1430:
    label1436:
    label1442:
    Object localObject2;
    Object localObject5;
    Object localObject4;
    label1859:
    int k;
    int j;
    label1922:
    int i2;
    if (localObject1 != null)
    {
      locali.field_fileId = ((String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl"));
      locali.field_aesKey = ((String)((Map)localObject1).get(".msg.videomsg.$aeskey"));
      this.emw = true;
      localObject1 = com.tencent.mm.plugin.report.service.h.mEJ;
      if (this.emv)
      {
        i = 1;
        ((com.tencent.mm.plugin.report.service.h)localObject1).h(12696, new Object[] { Integer.valueOf(i + 700), Integer.valueOf(this.elW.dHI) });
        if ((bi.oW(locali.field_aesKey)) || (bi.oW(locali.field_aesKey)))
        {
          locali.field_aesKey = "";
          locali.field_fileId = "";
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn check hit cache VideoHash :%s %s %s %b %d", new Object[] { SR(), locali.field_mediaId, locali.field_fileId, locali.field_aesKey, Boolean.valueOf(this.dVC), Integer.valueOf(locali.field_largesvideo) });
        if (com.tencent.mm.modelcdntran.g.ND().c(locali)) {
          break label2848;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 226L, 1L, false);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "%s cdntra addSendTask failed.", new Object[] { SR() });
        this.dVk = "";
        return false;
      }
    }
    else
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "%s cdntra parse video recv xml failed", new Object[] { SR() });
      int n;
      int i1;
      Vector localVector2;
      for (;;)
      {
        try
        {
          str1 = bi.oV(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("UseVideoHash"));
          localObject1 = str1.split(",");
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Eg();
          i = com.tencent.mm.a.h.aM(com.tencent.mm.kernel.a.Df(), 100);
          if ((localObject1 == null) || (localObject1.length <= 0)) {
            break label1412;
          }
          if (bi.getInt(localObject1[0], 0) < i) {
            break label1406;
          }
          bool1 = true;
          if ((localObject1 == null) || (localObject1.length < 2)) {
            break label1424;
          }
          if (bi.getInt(localObject1[1], 0) < i) {
            break label1418;
          }
          bool2 = true;
          if ((localObject1 == null) || (localObject1.length < 3)) {
            break label1436;
          }
          if (bi.getInt(localObject1[2], 0) < i) {
            break label1430;
          }
          bool3 = true;
          if (!com.tencent.mm.sdk.a.b.chp()) {
            break label2916;
          }
          bool1 = true;
          bool2 = true;
          bool3 = true;
          if (!bool2) {
            break label2825;
          }
          localObject3 = o.Ta();
          m = bi.getInt(localObject1[2], 0);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoInfoStorage", "checkVideoHash in fullCheckRatio:%s path:%s stack:%s", new Object[] { Integer.valueOf(m), str2, bi.cjd() });
          l1 = bi.VF();
          if (!bi.oW(str2)) {
            break label1442;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoInfoStorage", "checkVideoHash failed , path:%s ", new Object[] { str2 });
          localObject1 = "";
          if (bi.oW((String)localObject1)) {
            break label2825;
          }
          localObject1 = ((String)localObject1).split("##");
          if ((bool1) && (localObject1 != null) && (localObject1.length == 2))
          {
            locali.field_fileId = localObject1[0];
            locali.field_aesKey = localObject1[1];
            this.emv = true;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "%s CheckUseVideoHash debug:%s str:%s [%s,%s,%s] hasHash:%s [%s,%s]", new Object[] { SR(), Boolean.valueOf(com.tencent.mm.sdk.a.b.chp()), str1, Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(bool3), Boolean.valueOf(this.emv), locali.field_fileId, locali.field_aesKey });
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "Check use videohash :%s", new Object[] { bi.i(localException) });
        }
        break;
        bool1 = false;
        continue;
        bool1 = false;
        continue;
        bool2 = false;
        continue;
        bool2 = false;
        continue;
        boolean bool3 = false;
        continue;
        bool3 = false;
        continue;
        localObject2 = s.nN(str2);
        if ((localObject2 == null) || (localObject2.length < 33))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoInfoStorage", "checkVideoHash  readHash failed :%s", new Object[] { str2 });
          localObject2 = "";
        }
        else
        {
          ((s)localObject3).dCZ.fV("VideoHash", "delete from VideoHash where CreateTime < " + (bi.VE() - 432000L));
          n = localObject2[32];
          StringBuffer localStringBuffer = new StringBuffer();
          i = 0;
          while (i < 32)
          {
            localStringBuffer.append(Integer.toHexString(localObject2[i]));
            i += 1;
          }
          i1 = localStringBuffer.length();
          localObject5 = new Vector();
          localObject4 = new Vector();
          Vector localVector1 = new Vector();
          localVector2 = new Vector();
          i = -1;
          Cursor localCursor = ((s)localObject3).dCZ.b("select size, CreateTime, hash, cdnxml, orgpath from VideoHash where size = " + n, null, 0);
          while (localCursor.moveToNext())
          {
            l2 = localCursor.getLong(1);
            String str3 = localCursor.getString(2);
            String str4 = localCursor.getString(3);
            String str5 = localCursor.getString(4);
            com.tencent.mm.sdk.platformtools.x.v("MicroMsg.VideoInfoStorage", "checkVideoHash select [%s][%s]", new Object[] { str3, str4 });
            if ((bi.oW(str3)) || (bi.oW(str4)))
            {
              com.tencent.mm.plugin.report.service.h.mEJ.h(12696, new Object[] { Integer.valueOf(104), Integer.valueOf(n) });
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoInfoStorage", "checkVideoHash select error [%s][%s]", new Object[] { str3, str4 });
            }
            else
            {
              if (i1 == str3.length()) {
                break label2931;
              }
              com.tencent.mm.plugin.report.service.h.mEJ.h(12696, new Object[] { Integer.valueOf(105), Integer.valueOf(n) });
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoInfoStorage", "checkVideoHash err length file:%d cursor:%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(str3.length()) });
              continue;
              if (k < i1)
              {
                if (localStringBuffer.charAt(k) != str3.charAt(k)) {
                  break label2913;
                }
                j += 1;
                break label2938;
              }
              if ((i >= 0) && (localVector1.size() > i) && (((Integer)localVector1.get(i)).intValue() >= j)) {
                break label2910;
              }
              i = localVector1.size();
              localVector1.add(Integer.valueOf(j));
              ((Vector)localObject5).add(str4);
              ((Vector)localObject4).add(str5);
              localVector2.add(Long.valueOf(l2));
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoInfoStorage", "checkVideoHash cursor hitCount:%d/%d ,max:%d vector:%d/%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i1), localVector1.get(i), Integer.valueOf(i), Integer.valueOf(localVector1.size()) });
            }
          }
          localCursor.close();
          if ((i < 0) || (localVector1.size() <= 0))
          {
            com.tencent.mm.plugin.report.service.h.mEJ.h(12696, new Object[] { Integer.valueOf(201), Integer.valueOf(n) });
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoInfoStorage", "checkVideoHash cursor empty maxHitIndex:%d vector:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(localVector1.size()) });
            localObject2 = "";
          }
          else
          {
            i1 = ((Integer)localVector1.get(i)).intValue();
            i2 = i1 * 100 / 256;
            if (i2 < 77)
            {
              com.tencent.mm.plugin.report.service.h.mEJ.h(12696, new Object[] { Integer.valueOf(202), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(0), Integer.valueOf(localVector2.size()) });
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoInfoStorage", "checkVideoHash NotEnoughHit. time:%d hit:%d percentMatch:%s arr:%d path:%s", new Object[] { Long.valueOf(bi.bH(l1)), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(localObject2.length - 1), str2 });
              localObject2 = "";
            }
            else
            {
              localObject2 = bi.oV((String)((Vector)localObject5).get(i));
              j = 0;
              k = 0;
              label2273:
              if (k < localVector1.size())
              {
                if ((k == i) || (((Integer)localVector1.get(k)).intValue() < i1) || (((String)localObject2).hashCode() == ((String)((Vector)localObject5).get(k)).hashCode())) {
                  break label2907;
                }
                j += 1;
                break label2945;
              }
              if (j <= 0) {
                break label2487;
              }
              ((s)localObject3).dCZ.fV("VideoHash", "delete from VideoHash where size = " + n);
              com.tencent.mm.plugin.report.service.h.mEJ.h(12696, new Object[] { Integer.valueOf(203), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(0), Integer.valueOf(localVector2.size()), Integer.valueOf(0), "", "", "", Integer.valueOf(j) });
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoInfoStorage", "checkVideoHash Not ONE hash hit this path, give up duplicate:%s path:%s", new Object[] { Integer.valueOf(j), str2 });
              localObject2 = "";
            }
          }
        }
      }
      label2487:
      l1 = bi.bH(l1);
      long l2 = bi.a((Long)localVector2.get(i), 0L);
      localObject5 = String.format("%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(n), Integer.valueOf(i1), Long.valueOf(l2), Integer.valueOf(localVector2.size()), Long.valueOf(l1) });
      com.tencent.mm.plugin.report.service.h.mEJ.h(12696, new Object[] { Integer.valueOf(300), localObject5 });
      com.tencent.mm.plugin.report.service.h.mEJ.h(12696, new Object[] { Integer.valueOf(i2 + 3000), localObject5 });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoInfoStorage", "checkVideoHash Succ time:%s hit:%s match:%s%% savetime:%s path:%s xml:%s orgpath:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(i1), Integer.valueOf(i2), Long.valueOf(l2), str2, localObject2, ((Vector)localObject4).get(i) });
      localObject4 = (String)((Vector)localObject4).get(i);
      l1 = bi.VF() % 1000L;
      if (l1 < m * 10) {
        break label2952;
      }
      if (i2 < 90) {
        break label2952;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoInfoStorage", "checkVideoHashByteDiff should:%s now:%s ratio:%s percentMatch:%s debuger:%s", new Object[] { Boolean.valueOf(bool4), Long.valueOf(l1), Integer.valueOf(m), Integer.valueOf(i2), Boolean.valueOf(com.tencent.mm.sdk.a.b.chp()) });
      if ((bool4) || (com.tencent.mm.sdk.a.b.chp())) {
        com.tencent.mm.sdk.f.e.b(new s.2((s)localObject3, str2, (String)localObject4, (String)localObject5), "checkVideoHashByteDiff", 1);
      }
      break label1233;
      boolean bool4 = false;
      continue;
      label2825:
      localObject2 = null;
      break label1251;
      if (this.emw)
      {
        i = 2;
        break;
      }
      i = 0;
      break;
      label2848:
      if (this.elW.enR != 1)
      {
        this.elW.enR = 1;
        this.elW.status = 104;
        this.elW.clientId = this.dVk;
        this.elW.bWA = 524544;
        t.e(this.elW);
      }
      return true;
      label2907:
      break label2945;
      label2910:
      break label1922;
      label2913:
      break label2938;
      label2916:
      bool4 = bool1;
      bool1 = bool2;
      bool2 = bool4;
      break label1146;
      label2931:
      j = 0;
      k = 0;
      break label1859;
      label2938:
      k += 1;
      break label1859;
      label2945:
      k += 1;
      break label2273;
      label2952:
      bool4 = true;
    }
  }
  
  private String SR()
  {
    return this.fileName + "_" + hashCode();
  }
  
  /* Error */
  private String nA(String paramString)
  {
    // Byte code:
    //   0: new 735	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 736	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore 9
    //   10: new 735	java/io/File
    //   13: dup
    //   14: aload 9
    //   16: invokevirtual 740	java/io/File:getParentFile	()Ljava/io/File;
    //   19: new 117	java/lang/StringBuilder
    //   22: dup
    //   23: ldc_w 742
    //   26: invokespecial 121	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: aload 9
    //   31: invokevirtual 745	java/io/File:getName	()Ljava/lang/String;
    //   34: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokespecial 748	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   43: astore 10
    //   45: aconst_null
    //   46: astore 7
    //   48: aconst_null
    //   49: astore 8
    //   51: aconst_null
    //   52: astore 6
    //   54: aconst_null
    //   55: astore 5
    //   57: ldc 115
    //   59: ldc_w 750
    //   62: iconst_1
    //   63: anewarray 162	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: aload 9
    //   70: invokevirtual 752	java/io/File:length	()J
    //   73: invokestatic 610	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   76: aastore
    //   77: invokestatic 614	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: aload 9
    //   82: invokevirtual 752	java/io/File:length	()J
    //   85: ldc2_w 753
    //   88: lcmp
    //   89: ifle +543 -> 632
    //   92: aload 10
    //   94: invokevirtual 757	java/io/File:exists	()Z
    //   97: ifeq +101 -> 198
    //   100: ldc 115
    //   102: ldc_w 759
    //   105: iconst_1
    //   106: anewarray 162	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: aload 10
    //   113: invokevirtual 762	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   116: aastore
    //   117: invokestatic 614	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: iconst_1
    //   121: istore_2
    //   122: aload 8
    //   124: astore 4
    //   126: aload 4
    //   128: ifnull +8 -> 136
    //   131: aload 4
    //   133: invokevirtual 765	java/io/InputStream:close	()V
    //   136: iload_2
    //   137: istore_3
    //   138: aload 5
    //   140: ifnull +10 -> 150
    //   143: aload 5
    //   145: invokevirtual 768	java/io/OutputStream:close	()V
    //   148: iload_2
    //   149: istore_3
    //   150: iload_3
    //   151: ifeq +371 -> 522
    //   154: ldc 115
    //   156: ldc_w 770
    //   159: iconst_3
    //   160: anewarray 162	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_0
    //   166: invokespecial 165	com/tencent/mm/modelvideo/g:SR	()Ljava/lang/String;
    //   169: aastore
    //   170: dup
    //   171: iconst_1
    //   172: aload 10
    //   174: invokevirtual 752	java/io/File:length	()J
    //   177: invokestatic 610	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   180: aastore
    //   181: dup
    //   182: iconst_2
    //   183: aload 10
    //   185: invokevirtual 762	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   188: aastore
    //   189: invokestatic 175	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: aload 10
    //   194: invokevirtual 762	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   197: areturn
    //   198: aload 9
    //   200: invokevirtual 762	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   203: invokestatic 776	com/tencent/mm/sdk/platformtools/c:VZ	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   206: astore 11
    //   208: aload 11
    //   210: ifnonnull +111 -> 321
    //   213: ldc_w 325
    //   216: astore 4
    //   218: ldc 115
    //   220: ldc_w 778
    //   223: iconst_1
    //   224: anewarray 162	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload 4
    //   231: aastore
    //   232: invokestatic 175	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   235: aload 11
    //   237: ifnull +121 -> 358
    //   240: aload 11
    //   242: getfield 783	android/graphics/BitmapFactory$Options:outWidth	I
    //   245: sipush 288
    //   248: if_icmpgt +14 -> 262
    //   251: aload 11
    //   253: getfield 786	android/graphics/BitmapFactory$Options:outHeight	I
    //   256: sipush 288
    //   259: if_icmple +99 -> 358
    //   262: aload 9
    //   264: invokevirtual 762	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   267: sipush 288
    //   270: sipush 288
    //   273: getstatic 792	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   276: bipush 60
    //   278: new 117	java/lang/StringBuilder
    //   281: dup
    //   282: invokespecial 673	java/lang/StringBuilder:<init>	()V
    //   285: aload 10
    //   287: invokevirtual 740	java/io/File:getParentFile	()Ljava/io/File;
    //   290: invokevirtual 762	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   293: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: ldc_w 794
    //   299: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   305: aload 10
    //   307: invokevirtual 745	java/io/File:getName	()Ljava/lang/String;
    //   310: invokestatic 797	com/tencent/mm/sdk/platformtools/c:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;)Z
    //   313: istore_2
    //   314: aload 8
    //   316: astore 4
    //   318: goto -192 -> 126
    //   321: new 117	java/lang/StringBuilder
    //   324: dup
    //   325: invokespecial 673	java/lang/StringBuilder:<init>	()V
    //   328: aload 11
    //   330: getfield 783	android/graphics/BitmapFactory$Options:outWidth	I
    //   333: invokevirtual 561	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   336: ldc_w 799
    //   339: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: aload 11
    //   344: getfield 786	android/graphics/BitmapFactory$Options:outHeight	I
    //   347: invokevirtual 561	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   350: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: astore 4
    //   355: goto -137 -> 218
    //   358: new 801	java/io/FileInputStream
    //   361: dup
    //   362: aload 9
    //   364: invokespecial 804	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   367: astore 4
    //   369: aload 4
    //   371: fconst_0
    //   372: sipush 288
    //   375: sipush 288
    //   378: invokestatic 807	com/tencent/mm/sdk/platformtools/c:a	(Ljava/io/InputStream;FII)Landroid/graphics/Bitmap;
    //   381: astore 8
    //   383: aload 8
    //   385: ifnull +242 -> 627
    //   388: new 809	java/io/FileOutputStream
    //   391: dup
    //   392: aload 10
    //   394: invokespecial 810	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   397: astore 5
    //   399: aload 5
    //   401: astore 7
    //   403: aload 4
    //   405: astore 6
    //   407: aload 8
    //   409: getstatic 792	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   412: bipush 60
    //   414: aload 5
    //   416: invokevirtual 816	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   419: istore_2
    //   420: goto -294 -> 126
    //   423: astore 8
    //   425: aconst_null
    //   426: astore 5
    //   428: aconst_null
    //   429: astore 4
    //   431: aload 5
    //   433: astore 7
    //   435: aload 4
    //   437: astore 6
    //   439: ldc 115
    //   441: ldc_w 818
    //   444: iconst_1
    //   445: anewarray 162	java/lang/Object
    //   448: dup
    //   449: iconst_0
    //   450: aload 8
    //   452: invokestatic 512	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   455: aastore
    //   456: invokestatic 430	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   459: aload 4
    //   461: ifnull +8 -> 469
    //   464: aload 4
    //   466: invokevirtual 765	java/io/InputStream:close	()V
    //   469: aload 5
    //   471: ifnull +151 -> 622
    //   474: aload 5
    //   476: invokevirtual 768	java/io/OutputStream:close	()V
    //   479: iconst_0
    //   480: istore_3
    //   481: goto -331 -> 150
    //   484: astore 4
    //   486: iconst_0
    //   487: istore_3
    //   488: goto -338 -> 150
    //   491: astore_1
    //   492: aload 7
    //   494: astore 4
    //   496: aload 6
    //   498: astore 5
    //   500: aload 4
    //   502: ifnull +8 -> 510
    //   505: aload 4
    //   507: invokevirtual 765	java/io/InputStream:close	()V
    //   510: aload 5
    //   512: ifnull +8 -> 520
    //   515: aload 5
    //   517: invokevirtual 768	java/io/OutputStream:close	()V
    //   520: aload_1
    //   521: athrow
    //   522: ldc 115
    //   524: ldc_w 820
    //   527: iconst_3
    //   528: anewarray 162	java/lang/Object
    //   531: dup
    //   532: iconst_0
    //   533: aload_0
    //   534: invokespecial 165	com/tencent/mm/modelvideo/g:SR	()Ljava/lang/String;
    //   537: aastore
    //   538: dup
    //   539: iconst_1
    //   540: aload 9
    //   542: invokevirtual 752	java/io/File:length	()J
    //   545: invokestatic 610	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   548: aastore
    //   549: dup
    //   550: iconst_2
    //   551: aload 9
    //   553: invokevirtual 762	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   556: aastore
    //   557: invokestatic 175	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   560: aload_1
    //   561: areturn
    //   562: astore 4
    //   564: goto -428 -> 136
    //   567: astore 4
    //   569: iload_2
    //   570: istore_3
    //   571: goto -421 -> 150
    //   574: astore 4
    //   576: goto -107 -> 469
    //   579: astore 4
    //   581: goto -71 -> 510
    //   584: astore 4
    //   586: goto -66 -> 520
    //   589: astore_1
    //   590: aload 6
    //   592: astore 5
    //   594: goto -94 -> 500
    //   597: astore_1
    //   598: aload 7
    //   600: astore 5
    //   602: aload 6
    //   604: astore 4
    //   606: goto -106 -> 500
    //   609: astore 8
    //   611: aconst_null
    //   612: astore 5
    //   614: goto -183 -> 431
    //   617: astore 8
    //   619: goto -188 -> 431
    //   622: iconst_0
    //   623: istore_3
    //   624: goto -474 -> 150
    //   627: iconst_0
    //   628: istore_2
    //   629: goto -503 -> 126
    //   632: iconst_0
    //   633: istore_2
    //   634: aload 8
    //   636: astore 4
    //   638: goto -512 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	641	0	this	g
    //   0	641	1	paramString	String
    //   121	513	2	bool1	boolean
    //   137	487	3	bool2	boolean
    //   124	341	4	localObject1	Object
    //   484	1	4	localIOException1	java.io.IOException
    //   494	12	4	localObject2	Object
    //   562	1	4	localIOException2	java.io.IOException
    //   567	1	4	localIOException3	java.io.IOException
    //   574	1	4	localIOException4	java.io.IOException
    //   579	1	4	localIOException5	java.io.IOException
    //   584	1	4	localIOException6	java.io.IOException
    //   604	33	4	localObject3	Object
    //   55	558	5	localObject4	Object
    //   52	551	6	localObject5	Object
    //   46	553	7	localObject6	Object
    //   49	359	8	localBitmap	android.graphics.Bitmap
    //   423	28	8	localException1	Exception
    //   609	1	8	localException2	Exception
    //   617	18	8	localException3	Exception
    //   8	544	9	localFile1	java.io.File
    //   43	350	10	localFile2	java.io.File
    //   206	137	11	localOptions	android.graphics.BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   80	120	423	java/lang/Exception
    //   198	208	423	java/lang/Exception
    //   218	235	423	java/lang/Exception
    //   240	262	423	java/lang/Exception
    //   262	314	423	java/lang/Exception
    //   321	355	423	java/lang/Exception
    //   358	369	423	java/lang/Exception
    //   474	479	484	java/io/IOException
    //   80	120	491	finally
    //   198	208	491	finally
    //   218	235	491	finally
    //   240	262	491	finally
    //   262	314	491	finally
    //   321	355	491	finally
    //   358	369	491	finally
    //   131	136	562	java/io/IOException
    //   143	148	567	java/io/IOException
    //   464	469	574	java/io/IOException
    //   505	510	579	java/io/IOException
    //   515	520	584	java/io/IOException
    //   369	383	589	finally
    //   388	399	589	finally
    //   407	420	597	finally
    //   439	459	597	finally
    //   369	383	609	java/lang/Exception
    //   388	399	609	java/lang/Exception
    //   407	420	617	java/lang/Exception
  }
  
  protected final int Cc()
  {
    return this.MAX_TIMES;
  }
  
  public final boolean KY()
  {
    boolean bool = super.KY();
    if (bool) {
      com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 210L, 1L, false);
    }
    return bool;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    this.elW = t.nW(this.fileName);
    if ((this.elW == null) || ((this.elW.status != 104) && (this.elW.status != 103)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "%s Get info Failed file:", new Object[] { SR(), this.fileName });
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
      return -1;
    }
    parame1 = new StringBuilder("doscene file:").append(this.fileName).append(" stat:").append(this.elW.status).append(" [").append(this.elW.enI).append(",").append(this.elW.enJ).append("] [").append(this.elW.emu).append(",").append(this.elW.dHI).append("]  netTimes:").append(this.elW.enO).append(" times:");
    int i = this.emz;
    this.emz = (i + 1);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", i);
    if (this.startTime == 0L)
    {
      this.startTime = bi.VF();
      this.emu = this.elW.emu;
    }
    o.Ta();
    if (q.nE(s.nK(this.fileName)))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneUploadVideo", "%s it is mm h265 video xml[%s]", new Object[] { SR(), this.elW.Tm() });
      com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 139L, 1L, false);
    }
    if (SQ())
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "cdntra use cdn return -1 for onGYNetEnd clientid:%s", new Object[] { this.fileName });
      return 0;
    }
    bwq localbwq;
    if (this.elW.enQ == 1)
    {
      this.emt = true;
      parame1 = new b.a();
      parame1.dIG = new bwq();
      parame1.dIH = new bwr();
      parame1.uri = "/cgi-bin/micromsg-bin/uploadvideo";
      parame1.dIF = 149;
      parame1.dII = 39;
      parame1.dIJ = 1000000039;
      this.diG = parame1.KT();
      localbwq = (bwq)this.diG.dID.dIL;
      localbwq.jTv = ((String)com.tencent.mm.kernel.g.Ei().DT().get(2, ""));
      localbwq.jTu = this.elW.Tj();
      localbwq.rdo = this.fileName;
      if (this.emt) {
        localbwq.ssT = 2;
      }
      if (this.elW.enT == 3) {
        localbwq.ssT = 3;
      }
      localbwq.slf = this.elW.enM;
      localbwq.rVp = this.elW.enJ;
      localbwq.ssQ = this.elW.dHI;
      if (!com.tencent.mm.network.ab.bU(ad.getContext())) {
        break label1154;
      }
      i = 1;
      label565:
      localbwq.rvT = i;
      localbwq.rVs = 2;
      localbwq.ssR = 0;
      localbwq.ssS = new bhy().bq(new byte[0]);
      localbwq.rVr = new bhy().bq(new byte[0]);
      if (!bi.oW(this.cas)) {
        break label1159;
      }
      o.Ta();
      parame1 = com.tencent.mm.a.g.cu(s.nK(this.fileName));
      this.cas = parame1;
      label649:
      localbwq.ssW = parame1;
      localbwq.rco = bf.Ir();
      localbwq.stf = this.elW.bZN;
      parame1 = this.elW.enV;
      if ((parame1 == null) || (bi.oW(parame1.dyJ))) {
        break label1167;
      }
      localbwq.ssX = bi.aG(parame1.dyJ, "");
      localbwq.ssY = parame1.rBq;
      localbwq.ssZ = bi.aG(parame1.dyL, "");
      localbwq.stb = bi.aG(parame1.dyN, "");
      localbwq.sta = bi.aG(parame1.dyM, "");
      localbwq.stc = bi.aG(parame1.dyO, "");
    }
    for (;;)
    {
      if (parame1 != null)
      {
        localbwq.ste = bi.aG(parame1.dyP, "");
        localbwq.std = bi.aG(parame1.dyQ, "");
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "upload video: play length %d, thumb totalLen %d, video totalLen %d, funcFlag %d, videoMd5: %s stream %s streamtime: %d title %s thumburl %s", new Object[] { Integer.valueOf(localbwq.slf), Integer.valueOf(localbwq.rVq), Integer.valueOf(localbwq.ssQ), Integer.valueOf(localbwq.ssT), localbwq.ssW, localbwq.ssX, Integer.valueOf(localbwq.ssY), localbwq.ssZ, localbwq.stc });
      if (this.elW.status != 103) {
        break label1446;
      }
      o.Ta();
      parame1 = s.k(s.nL(this.fileName), this.elW.enI, emr);
      if ((parame1.ret >= 0) && (parame1.bEG != 0)) {
        break label1212;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 225L, 1L, false);
      t.nP(this.fileName);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "doScene READ THUMB[" + this.fileName + "]  Error ");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
      return -1;
      if (this.elW.createTime + 600L < bi.VE())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "create time check error:" + this.fileName);
        t.nP(this.fileName);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      if (t.nO(this.fileName)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "checkVoiceNetTimes Failed file:" + this.fileName);
      t.nP(this.fileName);
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
      return -1;
      label1154:
      i = 2;
      break label565;
      label1159:
      parame1 = this.cas;
      break label649;
      label1167:
      if ((parame1 != null) && (!bi.oW(parame1.dyN)) && (!bi.oW(parame1.dyM)))
      {
        localbwq.stb = parame1.dyN;
        localbwq.sta = parame1.dyM;
      }
    }
    label1212:
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "doScene READ THUMB[" + this.fileName + "] read ret:" + parame1.ret + " readlen:" + parame1.bEG + " newOff:" + parame1.eon + " netOff:" + this.elW.enI);
    if (parame1.eon < this.elW.enI)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "Err doScene READ THUMB[" + this.fileName + "] newOff:" + parame1.eon + " OldtOff:" + this.elW.enI);
      t.nP(this.fileName);
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
      return -1;
    }
    byte[] arrayOfByte = new byte[parame1.bEG];
    System.arraycopy(parame1.buf, 0, arrayOfByte, 0, parame1.bEG);
    localbwq.rVq = this.elW.enI;
    localbwq.rVr = new bhy().bq(arrayOfByte);
    for (;;)
    {
      return a(parame, this.diG, this);
      label1446:
      o.Ta();
      parame1 = s.k(s.nK(this.fileName), this.elW.emu, emr);
      if ((parame1.ret < 0) || (parame1.bEG == 0))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 224L, 1L, false);
        t.nP(this.fileName);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "doScene READ VIDEO[" + this.fileName + "]  Error ");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "doScene READ VIDEO[" + this.fileName + "] read ret:" + parame1.ret + " readlen:" + parame1.bEG + " newOff:" + parame1.eon + " netOff:" + this.elW.emu);
      if (parame1.eon < this.elW.emu)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "Err doScene READ VIDEO[" + this.fileName + "] newOff:" + parame1.eon + " OldtOff:" + this.elW.emu);
        t.nP(this.fileName);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      if (parame1.eon >= c.els)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 222L, 1L, false);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "Err doScene READ VIDEO[" + this.fileName + "] maxsize:" + c.els);
        t.nP(this.fileName);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      arrayOfByte = new byte[parame1.bEG];
      System.arraycopy(parame1.buf, 0, arrayOfByte, 0, parame1.bEG);
      localbwq.ssR = this.elW.emu;
      localbwq.rVq = this.elW.enI;
      localbwq.ssS = new bhy().bq(arrayOfByte);
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    paramq = (bwq)((com.tencent.mm.ab.b)paramq).dID.dIL;
    if ((bi.oW(paramq.rdo)) || (paramq.rVs <= 0) || (bi.oW(paramq.jTv)) || (bi.oW(paramq.jTu)) || (paramq.rvT <= 0) || (paramq.rVq > paramq.rVp) || (paramq.rVq < 0) || (paramq.ssR > paramq.ssQ) || (paramq.ssR < 0) || ((paramq.ssR == paramq.ssQ) && (paramq.rVq == paramq.rVp)) || (paramq.rVp <= 0) || (paramq.ssQ <= 0) || ((paramq.ssS.siI <= 0) && (paramq.rVr.siI <= 0)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "ERR: Security Check Failed file:" + this.fileName + " user:" + paramq.jTu);
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.dVk);
    if (this.elZ)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "onGYNetEnd Call Stop by Service   file:" + this.fileName + " user:" + this.elW.Tj());
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bi.oW(this.dVk)))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneUploadVideo", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.dVk });
      return;
    }
    paramArrayOfByte = (bwr)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    paramq = (bwq)((com.tencent.mm.ab.b)paramq).dID.dIL;
    this.elW = t.nW(this.fileName);
    if (this.elW == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd Get INFO FAILED :" + this.fileName);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.elW.status == 105)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneUploadVideo", "onGYNetEnd STATUS PAUSE [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((this.elW.status != 104) && (this.elW.status != 103))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd STATUS ERR: status:" + this.elW.status + " [" + this.fileName + "," + this.elW.bYu + "," + this.elW.Tk() + "," + this.elW.Tj() + "] ");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd BLACK  errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + this.elW.Tj());
      t.nQ(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 220L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + this.elW.Tj());
      t.nP(this.fileName);
      com.tencent.mm.plugin.report.service.h.mEJ.h(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bL(ad.getContext())), Integer.valueOf(this.elY), Integer.valueOf(0) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 219L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.fileName + " user:" + this.elW.Tj());
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((!bi.bC(paramq.rVr.siK.lR)) && (paramq.rVq != paramArrayOfByte.rVq - paramq.rVr.siI))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "onGYNetEnd Err Thumb Pos:[" + paramq.rVq + "," + paramq.rVr.siI + "," + paramArrayOfByte.rVq + "] file:" + this.fileName + " user:" + paramq.jTu);
      t.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((!bi.bC(paramq.ssS.siK.lR)) && (paramq.ssR != paramArrayOfByte.ssR - paramq.ssS.siI))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "onGYNetEnd Err Thumb Pos:[" + paramq.ssR + "," + paramq.ssS.siI + "," + paramArrayOfByte.ssR + "] file:" + this.fileName + " user:" + paramq.jTu);
      t.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.elW.enK = bi.VE();
    this.elW.bYu = paramArrayOfByte.rcq;
    this.elW.bWA = 1028;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(this.elW.bYu), Integer.valueOf(af.exn) });
    if ((10007 == af.exm) && (af.exn != 0) && (this.elW.bYu != 0L))
    {
      this.elW.bYu = af.exn;
      af.exn = 0;
    }
    int i = 0;
    paramInt1 = this.elW.status;
    if (paramInt1 == 103)
    {
      paramArrayOfByte = this.elW;
      paramInt1 = paramq.rVq;
      paramArrayOfByte.enI = (paramq.rVr.siI + paramInt1);
      this.elW.bWA |= 0x40;
      paramInt1 = i;
      if (this.elW.enI >= this.elW.enJ)
      {
        this.elW.status = 104;
        this.elW.bWA |= 0x100;
        paramInt1 = i;
      }
    }
    for (;;)
    {
      t.e(this.elW);
      if (!this.elZ) {
        break label1591;
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      if (paramInt1 != 104) {
        break;
      }
      paramArrayOfByte = this.elW;
      paramInt1 = paramq.ssR;
      paramArrayOfByte.emu = (paramq.ssS.siI + paramInt1);
      this.elW.bWA |= 0x8;
      paramInt1 = i;
      if (this.elW.emu >= this.elW.dHI)
      {
        this.elW.status = 199;
        this.elW.bWA |= 0x100;
        t.c(this.elW);
        paramInt1 = 1;
      }
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "onGYNetEnd ERROR STATUS:" + paramInt1 + " file:" + this.fileName + " user:" + paramq.jTu);
    t.nP(this.fileName);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    return;
    label1591:
    if (paramInt1 == 0)
    {
      this.dHa.J(10L, 10L);
      return;
    }
    paramq = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(this.elW.enN);
    com.tencent.mm.modelstat.b.ehL.f(paramq);
    com.tencent.mm.plugin.report.service.h.mEJ.h(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bi.VF()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bL(ad.getContext())), Integer.valueOf(this.elY), Integer.valueOf(this.elW.dHI - this.emu) });
    boolean bool;
    if (this.elW == null)
    {
      bool = false;
      if ((!bool) && (!com.tencent.mm.model.s.hr(this.elW.Tj()))) {
        break label2122;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "upload to biz :%s", new Object[] { this.elW.Tj() });
      if (this.elW.bYu < 0L)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "ERR: finish video invaild MSGSVRID :" + this.elW.bYu + " file:" + this.fileName + " toUser:" + this.elW.Tj());
        t.nP(this.fileName);
      }
      label1861:
      if (this.dYW == null) {
        break label2210;
      }
    }
    label2122:
    label2210:
    for (long l = this.dYW.Ad();; l = 0L)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "!!!FIN: file:" + this.fileName + " toUser:" + this.elW.Tj() + " msgsvrid:" + this.elW.bYu + " thumbsize:" + this.elW.enJ + " videosize:" + this.elW.dHI + " useTime:" + l);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadVideo", "FinishLogForTime file:" + this.fileName + " packSize:" + emr + " filesize:" + this.elW.dHI + " useTime:" + l);
      a.a(this.elW, 0);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      paramq = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(this.elW.Tj());
      if ((paramq == null) || ((int)paramq.dhP <= 0))
      {
        bool = false;
        break;
      }
      bool = paramq.ckW();
      break;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "not upload to biz");
      if (this.elW.bYu > 0L) {
        break label1861;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadVideo", "ERR: finish video invaild MSGSVRID :" + this.elW.bYu + " file:" + this.fileName + " toUser:" + this.elW.Tj());
      t.nP(this.fileName);
      break label1861;
    }
  }
  
  protected final void a(l.a parama)
  {
    com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 221L, 1L, false);
    t.nP(this.fileName);
  }
  
  protected final void cancel()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadVideo", "%s stop %s", new Object[] { SR(), this.dVk });
    if (!bi.oW(this.dVk)) {
      com.tencent.mm.modelcdntran.g.ND().lw(this.dVk);
    }
    this.elZ = true;
    super.cancel();
  }
  
  public final int getType()
  {
    return 149;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelvideo/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */