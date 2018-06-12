package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.az.d;
import com.tencent.mm.g.a.fs;
import com.tencent.mm.g.a.fs.b;
import com.tencent.mm.g.c.ch;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.bd.d;
import com.tencent.mm.storage.bo;
import com.tencent.mm.storage.bp;
import junit.framework.Assert;

public final class b
{
  public boolean ceW;
  public String dzA;
  public String eHT;
  public long id;
  public int mZZ;
  public String nickname;
  public String qOI;
  public String username;
  
  public static b a(Context paramContext, long paramLong, boolean paramBoolean, String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, int paramInt2)
  {
    b localb = new b();
    localb.id = paramLong;
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      localb.ceW = bool;
      x.d("MicroMsg.FMessageProvider", "build, fmsgInfo.type:%d, fmsgInfo.talker:%s, scene:%d  ", new Object[] { Integer.valueOf(paramInt1), paramString1, Integer.valueOf(paramInt2) });
      if (paramInt1 != 0) {
        break label353;
      }
      if (paramString2 != null) {
        break;
      }
      x.e("MicroMsg.FMessageProvider", "build fail, fmsgInfo msgContent is null, fmsgInfo.talker = " + paramString1);
      return null;
    }
    localb.username = paramString3;
    localb.nickname = paramString4;
    switch (paramInt2)
    {
    default: 
      localb.dzA = paramContext.getString(R.l.chatting_from_possible_friends_content);
    }
    for (;;)
    {
      return localb;
      localb.dzA = paramContext.getString(R.l.chatting_from_QQ_friends_content);
      continue;
      paramString1 = new fs();
      paramString1.bOn.bOk = paramString5;
      paramString1.bOn.bOl = paramString6;
      a.sFg.m(paramString1);
      localb.dzA = paramContext.getString(R.l.chatting_from_mobile_friends_content, new Object[] { bi.aG(paramString1.bOo.bOp, "") });
      continue;
      localb.dzA = paramContext.getString(R.l.chatting_from_verify_facebook_content);
      continue;
      localb.dzA = paramContext.getString(R.l.chatting_from_sns_add_now);
      continue;
      localb.eHT = bd.a.YV(paramString2).eHT;
      localb.dzA = paramContext.getString(R.l.chatting_from_google_contact);
      continue;
      label353:
      if (!paramBoolean)
      {
        localb.username = paramString1;
        localb.dzA = paramString2;
      }
      else
      {
        localb.username = paramString3;
        localb.nickname = paramString4;
        if ((paramString7 != null) && (!paramString7.trim().equals(""))) {
          localb.dzA = paramString7;
        } else {
          localb.dzA = paramContext.getString(R.l.fmessage_from_verify_digest_tip);
        }
      }
    }
  }
  
  public static b a(Context paramContext, ch paramch)
  {
    x.d("MicroMsg.FMessageProvider", "build lbs, talker = " + paramch.field_sayhiuser + ", scene = " + paramch.field_scene);
    b localb = new b();
    localb.id = paramch.sKx;
    if (paramch.field_isSend == 1) {}
    for (boolean bool = true;; bool = false)
    {
      localb.ceW = bool;
      localb.username = paramch.field_sayhiuser;
      localb.mZZ = paramch.field_scene;
      if (paramch.field_isSend != 1) {
        break;
      }
      localb.dzA = paramch.field_content;
      return localb;
    }
    paramch = bd.d.YY(paramch.field_content);
    if ((paramch.content != null) && (!paramch.content.trim().equals(""))) {}
    for (localb.dzA = paramch.content;; localb.dzA = paramContext.getString(R.l.chatting_from_verify_lbs_tip))
    {
      localb.nickname = paramch.nickname;
      return localb;
    }
  }
  
  public static b a(Context paramContext, at paramat)
  {
    long l = paramat.sKx;
    boolean bool = paramat.clS();
    String str6 = paramat.field_talker;
    String str7 = paramat.field_msgContent;
    int j = paramat.field_type;
    int i = 0;
    String str3;
    String str4;
    String str1;
    String str2;
    String str5;
    if (j == 0)
    {
      paramat = bd.a.YV(str7);
      str3 = paramat.otZ;
      str4 = paramat.nickname;
      str1 = paramat.tbE;
      str2 = paramat.tbF;
      i = paramat.scene;
      paramat = null;
      str5 = null;
    }
    for (;;)
    {
      paramContext = a(paramContext, l, bool, str6, str7, j, str3, str4, str1, str2, str5, i);
      paramContext.qOI = paramat;
      return paramContext;
      if (bool)
      {
        paramat = bd.d.YY(str7);
        str3 = paramat.otZ;
        str4 = paramat.nickname;
        str5 = paramat.content;
        if (paramat.tbU == 1)
        {
          paramat = paramat.tbW;
          str2 = null;
          str1 = null;
        }
        else
        {
          paramat = null;
          str2 = null;
          str1 = null;
        }
      }
      else
      {
        paramat = null;
        str5 = null;
        str2 = null;
        str1 = null;
        str4 = null;
        str3 = null;
      }
    }
  }
  
  public static b a(Context paramContext, bo parambo)
  {
    x.d("MicroMsg.FMessageProvider", "build shake, talker = " + parambo.field_talker + ", scene = " + parambo.field_scene);
    b localb = new b();
    localb.id = parambo.sKx;
    if (parambo.field_isSend == 1) {}
    for (boolean bool = true;; bool = false)
    {
      localb.ceW = bool;
      localb.username = parambo.field_sayhiuser;
      localb.mZZ = parambo.field_scene;
      if (parambo.field_isSend != 1) {
        break;
      }
      localb.dzA = parambo.field_content;
      return localb;
    }
    parambo = bd.d.YY(parambo.field_content);
    if ((parambo.content != null) && (!parambo.content.trim().equals(""))) {}
    for (localb.dzA = parambo.content;; localb.dzA = paramContext.getString(R.l.chatting_from_verify_lbs_tip))
    {
      localb.nickname = parambo.nickname;
      return localb;
    }
  }
  
  public static ab a(at paramat)
  {
    ab localab = new ab();
    if (paramat == null) {
      return localab;
    }
    if (paramat.field_type == 0)
    {
      paramat = bd.a.YV(paramat.field_msgContent);
      localab = new ab();
      localab.setUsername(paramat.otZ);
      localab.du(paramat.cCR);
      localab.dx(paramat.getDisplayName());
      localab.dy(paramat.eLz);
      localab.dz(paramat.eLA);
      localab.eJ(paramat.sex);
      localab.dN(paramat.getProvince());
      localab.dO(paramat.getCity());
      localab.dM(paramat.signature);
      localab.eF(paramat.pOR);
      localab.dR(paramat.csP);
      localab.ea(paramat.qOy);
      return localab;
    }
    paramat = bd.d.YY(paramat.field_msgContent);
    localab = new ab();
    localab.setUsername(paramat.otZ);
    localab.du(paramat.cCR);
    localab.dx(paramat.nickname);
    localab.dy(paramat.eLz);
    localab.dz(paramat.eLA);
    localab.eJ(paramat.sex);
    localab.dM(paramat.signature);
    localab.dN(paramat.getProvince());
    localab.dO(paramat.getCity());
    return localab;
  }
  
  public static b[] a(Context paramContext, ch[] paramArrayOfch)
  {
    StringBuilder localStringBuilder = new StringBuilder("convert lbsList, talker = ");
    if ((paramArrayOfch == null) || (paramArrayOfch.length == 0) || (paramArrayOfch[0] == null)) {}
    for (Object localObject = "null";; localObject = paramArrayOfch[0].field_sayhiuser)
    {
      x.d("MicroMsg.FMessageProvider", (String)localObject);
      if ((paramArrayOfch != null) && (paramArrayOfch.length != 0)) {
        break;
      }
      x.e("MicroMsg.FMessageProvider", "convert lbs fail, lbsList is null");
      return null;
    }
    localObject = new b[paramArrayOfch.length];
    int i = 0;
    while (i < localObject.length)
    {
      localObject[i] = a(paramContext, paramArrayOfch[i]);
      i += 1;
    }
    return (b[])localObject;
  }
  
  public static b[] a(Context paramContext, at[] paramArrayOfat)
  {
    StringBuilder localStringBuilder = new StringBuilder("convert fmsgList, talker = ");
    if ((paramArrayOfat == null) || (paramArrayOfat.length == 0) || (paramArrayOfat[0] == null)) {}
    for (Object localObject = "null";; localObject = paramArrayOfat[0].field_talker)
    {
      x.d("MicroMsg.FMessageProvider", (String)localObject);
      if ((paramArrayOfat != null) && (paramArrayOfat.length != 0)) {
        break;
      }
      x.e("MicroMsg.FMessageProvider", "convert fmsg fail, fmsgList is null");
      return null;
    }
    localObject = new b[paramArrayOfat.length];
    int i = 0;
    while (i < localObject.length)
    {
      localObject[i] = a(paramContext, paramArrayOfat[i]);
      i += 1;
    }
    return (b[])localObject;
  }
  
  public static b[] a(Context paramContext, bo[] paramArrayOfbo)
  {
    StringBuilder localStringBuilder = new StringBuilder("convert shakeList, talker = ");
    if ((paramArrayOfbo == null) || (paramArrayOfbo.length == 0) || (paramArrayOfbo[0] == null)) {}
    for (Object localObject = "null";; localObject = paramArrayOfbo[0].field_sayhiuser)
    {
      x.d("MicroMsg.FMessageProvider", (String)localObject);
      if ((paramArrayOfbo != null) && (paramArrayOfbo.length != 0)) {
        break;
      }
      x.e("MicroMsg.FMessageProvider", "convert shake fail, shakeList is null");
      return null;
    }
    localObject = new b[paramArrayOfbo.length];
    int i = 0;
    while (i < localObject.length)
    {
      localObject[i] = a(paramContext, paramArrayOfbo[i]);
      i += 1;
    }
    return (b[])localObject;
  }
  
  public static void aU(String paramString, int paramInt)
  {
    bo[] arrayOfbo;
    Object localObject1;
    at[] arrayOfat;
    ba[] arrayOfba;
    if ((paramInt == 26) || (paramInt == 27) || (paramInt == 28) || (paramInt == 29))
    {
      x.d("MicroMsg.FMessageProvider", "initAddContent, scene is shake");
      arrayOfbo = d.SH().Zp(paramString);
      localObject1 = a(ad.getContext(), arrayOfbo);
      arrayOfat = null;
      arrayOfba = null;
    }
    while (localObject1 == null)
    {
      return;
      if (paramInt == 18)
      {
        x.d("MicroMsg.FMessageProvider", "initAddContent, scene is lbs");
        arrayOfba = d.SG().YR(paramString);
        localObject1 = a(ad.getContext(), arrayOfba);
        arrayOfbo = null;
        arrayOfat = null;
      }
      else
      {
        arrayOfat = d.SE().YM(paramString);
        localObject1 = a(ad.getContext(), arrayOfat);
        arrayOfbo = null;
        arrayOfba = null;
      }
    }
    paramInt = 0;
    int k = localObject1.length;
    int i = 0;
    Object localObject2;
    bd localbd;
    int m;
    int j;
    if (i < k)
    {
      localObject2 = localObject1[i];
      localbd = new bd();
      localbd.setContent(((b)localObject2).dzA);
      m = s.hQ(((b)localObject2).username);
      if (arrayOfat != null)
      {
        j = paramInt + 1;
        localbd.ay(arrayOfat[paramInt].field_createTime);
        paramInt = j;
      }
    }
    label206:
    label243:
    label382:
    label561:
    for (;;)
    {
      localbd.ep(((b)localObject2).username);
      localbd.setType(m);
      long l;
      if (((b)localObject2).ceW)
      {
        localbd.setStatus(2);
        localbd.eX(1);
        com.tencent.mm.model.au.HU();
        l = c.FT().T(localbd);
        if (l == -1L) {
          break label382;
        }
      }
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        x.i("MicroMsg.FMessageProvider", "new msg inserted to db , local id = " + l);
        i += 1;
        break;
        if (arrayOfba != null)
        {
          j = paramInt + 1;
          localbd.ay(arrayOfba[paramInt].field_createtime * 1000L);
          paramInt = j;
          break label206;
        }
        if (arrayOfbo == null) {
          break label561;
        }
        j = paramInt + 1;
        localbd.ay(arrayOfbo[paramInt].field_createtime * 1000L);
        paramInt = j;
        break label206;
        localbd.setStatus(6);
        localbd.eX(0);
        break label243;
      }
      localObject1 = new bd();
      if (arrayOfat != null) {
        ((bd)localObject1).ay(arrayOfat[(arrayOfat.length - 1)].field_createTime + 1L);
      }
      for (;;)
      {
        ((bd)localObject1).ep(paramString);
        ((bd)localObject1).setContent(ad.getContext().getString(R.l.transfer_greet_msg_tip));
        ((bd)localObject1).setType(10000);
        ((bd)localObject1).setStatus(6);
        ((bd)localObject1).eX(0);
        com.tencent.mm.model.au.HU();
        l = c.FT().T((bd)localObject1);
        x.i("MicroMsg.FMessageProvider", "new msg inserted to db , local id = " + l);
        return;
        if (arrayOfba != null) {
          ((bd)localObject1).ay(arrayOfba[(arrayOfba.length - 1)].field_createtime * 1000L + 1L);
        } else if (arrayOfbo != null) {
          ((bd)localObject1).ay(arrayOfbo[(arrayOfbo.length - 1)].field_createtime * 1000L + 1L);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/preference/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */